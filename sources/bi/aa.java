package bi;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class aa {
    public final v9 a;
    public final MessageObject b;
    public final un c;
    public final org.telegram.ui.Components.qc d;
    public final org.telegram.ui.Components.kc e;
    public final ba f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public m7 o;
    public final y9 p;
    public final /* synthetic */ ca q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public aa(ca caVar, v9 v9Var, MessageObject messageObject, un unVar, boolean z10) {
        this.q = caVar;
        y9 y9Var = new y9(this, 0);
        this.p = y9Var;
        this.a = v9Var;
        this.b = messageObject;
        this.c = unVar;
        Context t10 = ca.t(unVar);
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(t10, unVar.qa);
        this.e = kcVar;
        kcVar.c(R.raw.stars_topup, new String[0]);
        kcVar.b.setText(d());
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(t10, unVar.qa, true, false);
        ocVar.e(LocaleController.getString(R.string.StarsSentUndo));
        ocVar.b = new y9(this, 1);
        ba baVar = new ba(t10, unVar.qa);
        this.f = baVar;
        baVar.b = 5000L;
        int i10 = org.telegram.ui.ActionBar.y6.Gi;
        sn snVar = unVar.qa;
        ag.w wVar = new ag.w(27);
        ag.w wVar2 = new ag.w(28);
        int Q = org.telegram.ui.ActionBar.f7.Q(i10, -1, 0, 0.0f, snVar);
        wVar2.d(Q, baVar);
        org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(101, baVar);
        x9.c(i10, -1, 0, 0.0f, snVar);
        x9.n = wVar;
        x9.o = wVar2;
        x9.m = false;
        x9.g = Q;
        ocVar.addView(baVar, gb1.h(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ocVar.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
        kcVar.setButton(ocVar);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.wc.b0(unVar).b(kcVar, -1);
        this.d = b10;
        b10.s = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.w = y9Var;
        this.h = 0L;
        System.currentTimeMillis();
        this.g = messageObject.isPaidReactionChosen();
    }

    public final void a() {
        ca caVar = this.q;
        int i10 = caVar.a;
        AndroidUtilities.cancelRunOnUIThread(this.p);
        this.j = true;
        this.d.b();
        m7 m7Var = this.o;
        if (m7Var != null) {
            m7Var.c();
        }
        int i11 = (int) (-this.h);
        boolean z10 = this.g;
        long c10 = c();
        MessageObject messageObject = this.b;
        messageObject.addPaidReactions(i11, z10, c10);
        caVar.g -= this.h;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), messageObject.messageOwner.reactions);
        if (caVar.B == this) {
            caVar.B = null;
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
            ca caVar = this.q;
            caVar.g -= this.h;
            NotificationCenter.getInstance(caVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (!this.i && !this.j) {
            ca y3 = ca.y(this.q.a, false);
            MessagesController messagesController = MessagesController.getInstance(this.q.a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
            long j10 = this.h;
            if (!y3.e || y3.q(false, false, null).amount >= j10) {
                this.i = true;
                TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                tL_messages_sendPaidReaction.peer = messagesController.getInputPeer(this.a.a);
                tL_messages_sendPaidReaction.msg_id = this.a.b;
                tL_messages_sendPaidReaction.random_id = (connectionsManager.getCurrentTime() << 32) | (Utilities.random.nextLong() & 4294967295L);
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
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new i3(this, messagesController, j10, 2));
            } else {
                this.j = true;
                this.b.addPaidReactions((int) (-this.h), this.g, c());
                ca caVar2 = this.q;
                caVar2.g = 0L;
                NotificationCenter.getInstance(caVar2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
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
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                new tc(parentActivity, this.c.getResourceProvider(), j10, 5, str2, new z9(this, j10, i10), 0L).show();
            }
        }
        this.d.b();
        m7 m7Var = this.o;
        if (m7Var != null && (messageObject = this.b) != null && messageObject.getId() == m7Var.c) {
            this.o.c();
        }
        ca caVar3 = this.q;
        if (caVar3.B == this) {
            caVar3.B = null;
        }
    }

    public final long c() {
        Long l4 = this.n;
        return l4 != null ? l4.longValue() : this.q.B(this.b);
    }

    public final String d() {
        return c() == UserObject.ANONYMOUS ? LocaleController.getString(R.string.StarsSentAnonymouslyTitle) : (c() == 0 || c() == UserConfig.getInstance(this.q.a).getClientUserId()) ? LocaleController.getString(R.string.StarsSentTitle) : LocaleController.formatString(R.string.StarsSentTitleChannel, DialogObject.getShortName(c()));
    }
}
