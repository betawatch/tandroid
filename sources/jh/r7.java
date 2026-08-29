package jh;

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
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r7 {
    public final m7 a;
    public final MessageObject b;
    public final tn c;
    public final mc d;
    public final gc e;
    public final fc f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public m5 o;
    public final p7 p;
    public final /* synthetic */ s7 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public r7(s7 s7Var, m7 m7Var, MessageObject messageObject, tn tnVar, boolean z10) {
        this.q = s7Var;
        p7 p7Var = new p7(this, 0);
        this.p = p7Var;
        this.a = m7Var;
        this.b = messageObject;
        this.c = tnVar;
        Context t10 = s7.t(tnVar);
        gc gcVar = new gc(t10, tnVar.aa);
        this.e = gcVar;
        gcVar.c(R.raw.stars_topup, new String[0]);
        gcVar.b.setText(d());
        kc kcVar = new kc(t10, tnVar.aa, true, false);
        kcVar.e(LocaleController.getString(R.string.StarsSentUndo));
        kcVar.a = new p7(this, 1);
        fc fcVar = new fc(t10, tnVar.aa);
        this.f = fcVar;
        fcVar.b = 5000L;
        fcVar.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, tnVar.aa));
        kcVar.addView(fcVar, i7.f6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        kcVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        gcVar.setButton(kcVar);
        mc b10 = tc.a0(tnVar).b(gcVar, -1);
        this.d = b10;
        b10.r = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.v = p7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        s7 s7Var = this.q;
        int i10 = s7Var.a;
        AndroidUtilities.cancelRunOnUIThread(this.p);
        this.j = true;
        this.d.b();
        m5 m5Var = this.o;
        if (m5Var != null) {
            m5Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.g;
        long c3 = c();
        MessageObject messageObject = this.b;
        messageObject.addPaidReactions(i11, z10, c3);
        s7Var.g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (s7Var.B == this) {
            s7Var.B = null;
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
            s7 s7Var = this.q;
            s7Var.g -= this.h;
            NotificationCenter.getInstance(s7Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (!this.i && !this.j) {
            s7 y8 = s7.y(this.q.a, false);
            MessagesController messagesController = MessagesController.getInstance(this.q.a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
            long j10 = this.h;
            if (!y8.e || y8.q(false, false, null).amount >= j10) {
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
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new eg.d0(this, messagesController, j10));
            } else {
                this.j = true;
                this.b.addPaidReactions((int) (-this.h), this.g, c());
                s7 s7Var2 = this.q;
                s7Var2.g = 0L;
                NotificationCenter.getInstance(s7Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
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
                    parentActivity = LaunchActivity.C1;
                }
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                new y9(parentActivity, this.c.getResourceProvider(), j10, 5, str2, new q7(this, j10, i10), 0L).show();
            }
        }
        this.d.b();
        m5 m5Var = this.o;
        if (m5Var != null && (messageObject = this.b) != null && messageObject.getId() == m5Var.c) {
            this.o.c();
        }
        s7 s7Var3 = this.q;
        if (s7Var3.B == this) {
            s7Var3.B = null;
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
