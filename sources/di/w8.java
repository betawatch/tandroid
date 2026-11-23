package di;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class w8 {
    public final r8 a;
    public final gj b;
    public final bn c;
    public final org.telegram.ui.Components.gc d;
    public final org.telegram.ui.Components.ac e;
    public final x8 f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public k6 o;
    public final u8 p;
    public final /* synthetic */ y8 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public w8(y8 y8Var, r8 r8Var, gj gjVar, bn bnVar, boolean z10) {
        this.q = y8Var;
        boolean z11 = false;
        z11 = false;
        u8 u8Var = new u8(this, z11 ? 1 : 0);
        this.p = u8Var;
        this.a = r8Var;
        this.b = gjVar;
        this.c = bnVar;
        Context t6 = y8.t(bnVar);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, bnVar.Ba);
        this.e = acVar;
        acVar.c(R.raw.stars_topup, new String[0]);
        acVar.b.setText(d());
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, bnVar.Ba, true, false);
        ecVar.e(hd.N0(2131744780, null));
        ecVar.b = new u8(this, 1);
        x8 x8Var = new x8(t6, bnVar.Ba);
        this.f = x8Var;
        x8Var.b = 5000L;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        zm zmVar = bnVar.Ba;
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, zmVar);
        vVar2.d(P, x8Var);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, x8Var);
        w10.c(i7, -1, 0, 0.0f, zmVar);
        w10.n = vVar;
        w10.o = vVar2;
        w10.m = false;
        w10.g = P;
        ecVar.addView(x8Var, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(bnVar).b(acVar, -1);
        this.d = b10;
        b10.r = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.v = u8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (gjVar.k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= gjVar.k.reactions.results.size()) {
                    break;
                }
                if (gjVar.k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = gjVar.k.reactions.results.get(i10).chosen;
                    break;
                }
                i10++;
            }
        }
        this.g = z11;
    }

    public final void a() {
        y8 y8Var = this.q;
        int i7 = y8Var.a;
        org.telegram.messenger.g0.r(this.p);
        this.j = true;
        this.d.b();
        k6 k6Var = this.o;
        if (k6Var != null) {
            k6Var.c();
        }
        int i10 = (int) (-this.h);
        boolean z10 = this.g;
        long c10 = c();
        gj gjVar = this.b;
        gjVar.f(i10, c10, z10);
        y8Var.g -= this.h;
        ls.f(i7).k(ls.A3, new Object[0]);
        ls.f(i7).k(ls.o1, Long.valueOf(gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()), gjVar.k.reactions);
        if (y8Var.B == this) {
            y8Var.B = null;
        }
    }

    public final void b() {
        gj gjVar;
        String str;
        int i7 = ls.A3;
        org.telegram.messenger.g0.r(this.p);
        int i10 = 0;
        if (!this.l) {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            y8 y8Var = this.q;
            y8Var.g -= this.h;
            ls.f(y8Var.a).k(i7, new Object[0]);
        } else if (!this.i && !this.j) {
            y8 y10 = y8.y(this.q.a, false);
            np u12 = np.u1(this.q.a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
            long j3 = this.h;
            if (!y10.e || y10.q(null, false, false).amount >= j3) {
                this.i = true;
                TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                tL_messages_sendPaidReaction.peer = u12.l1(this.a.a);
                tL_messages_sendPaidReaction.msg_id = this.a.b;
                tL_messages_sendPaidReaction.random_id = (Utilities.b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                tL_messages_sendPaidReaction.count = (int) this.h;
                tL_messages_sendPaidReaction.flags |= 1;
                long c10 = c();
                if (c10 == 0 || c10 == k10.i(this.q.a).e()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c10 == 2666000) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = u12.l1(c10);
                }
                this.q.N();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new q2(this, u12, j3, 2));
            } else {
                this.j = true;
                this.b.f((int) (-this.h), c(), this.g);
                y8 y8Var2 = this.q;
                y8Var2.g = 0L;
                ls.f(y8Var2.a).k(i7, new Object[0]);
                ls.f(this.q.a).k(ls.o1, Long.valueOf(gj.B0(this.b.k)), Integer.valueOf(this.b.e1()), this.b.k.reactions);
                if (this.a.a >= 0) {
                    str = p10.l(this.c.getMessagesController().c2(Long.valueOf(this.a.a)));
                } else {
                    TLRPC.Chat O0 = this.c.getMessagesController().O0(Long.valueOf(-this.a.a));
                    str = O0 == null ? "" : O0.title;
                }
                String str2 = str;
                Context parentActivity = this.c.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                new fb(parentActivity, this.c.getResourceProvider(), j3, 5, str2, new v8(this, j3, i10), 0L).show();
            }
        }
        this.d.b();
        k6 k6Var = this.o;
        if (k6Var != null && (gjVar = this.b) != null && gjVar.e1() == k6Var.c) {
            this.o.c();
        }
        y8 y8Var3 = this.q;
        if (y8Var3.B == this) {
            y8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.n;
        return l10 != null ? l10.longValue() : this.q.B(this.b);
    }

    public final String d() {
        return c() == 2666000 ? hd.N0(2131744786, null) : (c() == 0 || c() == k10.i(this.q.a).e()) ? hd.N0(2131744782, null) : hd.a0(null, null, 2131744781, org.telegram.messenger.n5.t(c()));
    }
}
