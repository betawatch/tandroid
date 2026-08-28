package gh;

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
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.zb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u7 {
    public final p7 a;
    public final MessageObject b;
    public final qn c;
    public final gc d;
    public final ac e;
    public final zb f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public p5 o;
    public final s7 p;
    public final /* synthetic */ v7 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public u7(v7 v7Var, p7 p7Var, MessageObject messageObject, qn qnVar, boolean z10) {
        this.q = v7Var;
        s7 s7Var = new s7(this, 0);
        this.p = s7Var;
        this.a = p7Var;
        this.b = messageObject;
        this.c = qnVar;
        Context t10 = v7.t(qnVar);
        ac acVar = new ac(t10, qnVar.aa);
        this.e = acVar;
        acVar.c(R.raw.stars_topup, new String[0]);
        acVar.b.setText(d());
        ec ecVar = new ec(t10, qnVar.aa, true, false);
        ecVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ecVar.a = new s7(this, 1);
        zb zbVar = new zb(t10, qnVar.aa);
        this.f = zbVar;
        zbVar.b = 5000L;
        zbVar.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, qnVar.aa));
        ecVar.addView(zbVar, g7.e6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        acVar.setButton(ecVar);
        gc b10 = oc.a0(qnVar).b(acVar, -1);
        this.d = b10;
        b10.r = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.v = s7Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        v7 v7Var = this.q;
        int i9 = v7Var.a;
        AndroidUtilities.cancelRunOnUIThread(this.p);
        this.j = true;
        this.d.b();
        p5 p5Var = this.o;
        if (p5Var != null) {
            p5Var.c();
        }
        int i10 = (int) (-this.h);
        boolean z10 = this.g;
        long c10 = c();
        MessageObject messageObject = this.b;
        messageObject.addPaidReactions(i10, z10, c10);
        v7Var.g -= this.h;
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (v7Var.B == this) {
            v7Var.B = null;
        }
    }

    public final void b() {
        MessageObject messageObject;
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.p);
        int i9 = 0;
        if (!this.l) {
            this.j = true;
            this.b.addPaidReactions((int) (-this.h), this.g, c());
            v7 v7Var = this.q;
            v7Var.g -= this.h;
            NotificationCenter.getInstance(v7Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (!this.i && !this.j) {
            v7 y10 = v7.y(this.q.a, false);
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
                long c10 = c();
                if (c10 == 0 || c10 == UserConfig.getInstance(this.q.a).getClientUserId()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c10 == UserObject.ANONYMOUS) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = messagesController.getInputPeer(c10);
                }
                this.q.P();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new bg.f0(this, messagesController, j10));
            } else {
                this.j = true;
                this.b.addPaidReactions((int) (-this.h), this.g, c());
                v7 v7Var2 = this.q;
                v7Var2.g = 0L;
                NotificationCenter.getInstance(v7Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
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
                new ea(parentActivity, this.c.getResourceProvider(), j10, 5, str2, new t7(this, j10, i9), 0L).show();
            }
        }
        this.d.b();
        p5 p5Var = this.o;
        if (p5Var != null && (messageObject = this.b) != null && messageObject.getId() == p5Var.c) {
            this.o.c();
        }
        v7 v7Var3 = this.q;
        if (v7Var3.B == this) {
            v7Var3.B = null;
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
