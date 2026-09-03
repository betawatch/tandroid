package lh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s7 {
    public final n7 a;
    public final MessageObject b;
    public final zn c;
    public final ic d;
    public final cc e;
    public final bc f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public l5 o;
    public final q7 p;
    public final /* synthetic */ t7 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public s7(t7 t7Var, n7 n7Var, MessageObject messageObject, zn znVar, boolean z4) {
        this.q = t7Var;
        q7 q7Var = new q7(this, 0);
        this.p = q7Var;
        this.a = n7Var;
        this.b = messageObject;
        this.c = znVar;
        Context t6 = t7.t(znVar);
        cc ccVar = new cc(t6, znVar.ba);
        this.e = ccVar;
        ccVar.c(R.raw.stars_topup, new String[0]);
        ccVar.b.setText(d());
        gc gcVar = new gc(t6, znVar.ba, true, false);
        gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        gcVar.a = new q7(this, 1);
        bc bcVar = new bc(t6, znVar.ba);
        this.f = bcVar;
        bcVar.b = 5000L;
        bcVar.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, znVar.ba));
        gcVar.addView(bcVar, k7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        gcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        ccVar.setButton(gcVar);
        ic b10 = qc.a0(znVar).b(ccVar, -1);
        this.d = b10;
        b10.r = false;
        if (z4) {
            b10.k(true);
            this.m = true;
        }
        b10.v = q7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        t7 t7Var = this.q;
        int i10 = t7Var.a;
        AndroidUtilities.cancelRunOnUIThread(this.p);
        this.j = true;
        this.d.b();
        l5 l5Var = this.o;
        if (l5Var != null) {
            l5Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z4 = this.g;
        long c3 = c();
        MessageObject messageObject = this.b;
        messageObject.addPaidReactions(i11, z4, c3);
        t7Var.g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (t7Var.B == this) {
            t7Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.p);
        int i10 = 0;
        if (!this.l) {
            this.j = true;
            this.b.addPaidReactions((int) (-this.h), this.g, c());
            t7 t7Var = this.q;
            t7Var.g -= this.h;
            NotificationCenter.getInstance(t7Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (!this.i && !this.j) {
            t7 y10 = t7.y(this.q.a, false);
            MessagesController messagesController = MessagesController.getInstance(this.q.a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
            long j10 = this.h;
            if (!y10.e || y10.q(false, false, null).amount >= j10) {
                this.i = true;
                TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.a.a);
                tL_messages_sendPaidReaction.msg_id = this.a.b;
                tL_messages_sendPaidReaction.random_id = (Utilities.random.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                tL_messages_sendPaidReaction.count = (int) this.h;
                tL_messages_sendPaidReaction.flags |= 1;
                long c3 = c();
                if (c3 == 0 || c3 == UserConfig.getInstance(this.q.a).getClientUserId()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c3 == UserObject.ANONYMOUS) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = messagesController.getInputPeer(c3);
                }
                this.q.P();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new gg.c0(this, messagesController, j10));
            } else {
                this.j = true;
                this.b.addPaidReactions((int) (-this.h), this.g, c());
                t7 t7Var2 = this.q;
                t7Var2.g = 0L;
                NotificationCenter.getInstance(t7Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                NotificationCenter.getInstance(this.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(this.b.getDialogId()), Integer.valueOf(this.b.getId()), this.b.messageOwner.reactions);
                if (this.a.a >= 0) {
                    str = UserObject.getForcedFirstName(this.c.getMessagesController().getUser(Long.valueOf(this.a.a)));
                } else {
                    TLRPC.Chat chat = this.c.getMessagesController().getChat(Long.valueOf(-this.a.a));
                    str = chat == null ? "" : chat.title;
                }
                String str2 = str;
                Context parentActivity = this.c.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.D1;
                }
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                new z9(parentActivity, this.c.getResourceProvider(), j10, 5, str2, new r7(this, j10, i10), 0L).show();
            }
        }
        this.d.b();
        l5 l5Var = this.o;
        if (l5Var != null && (messageObject = this.b) != null && messageObject.getId() == l5Var.c) {
            this.o.c();
        }
        t7 t7Var3 = this.q;
        if (t7Var3.B == this) {
            t7Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.n;
        return l10 != null ? l10.longValue() : this.q.B(this.b);
    }

    public final String d() {
        return c() == UserObject.ANONYMOUS ? LocaleController.getString(R.string.StarsSentAnonymouslyTitle) : (c() == 0 || c() == UserConfig.getInstance(this.q.a).getClientUserId()) ? LocaleController.getString(R.string.StarsSentTitle) : LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
    }
}
