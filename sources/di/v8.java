package di;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v8 {
    public final q8 a;
    public final fj b;
    public final bn c;
    public final org.telegram.ui.Components.gc d;
    public final org.telegram.ui.Components.ac e;
    public final w8 f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public k6 o;
    public final t8 p;
    public final /* synthetic */ x8 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public v8(x8 x8Var, q8 q8Var, fj fjVar, bn bnVar, boolean z10) {
        this.q = x8Var;
        boolean z11 = false;
        z11 = false;
        t8 t8Var = new t8(this, z11 ? 1 : 0);
        this.p = t8Var;
        this.a = q8Var;
        this.b = fjVar;
        this.c = bnVar;
        Context t6 = x8.t(bnVar);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, bnVar.Ba);
        this.e = acVar;
        acVar.c(R.raw.stars_topup, new String[0]);
        acVar.b.setText(d());
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, bnVar.Ba, true, false);
        ecVar.e(gd.M0(2131744788, null));
        ecVar.b = new t8(this, 1);
        w8 w8Var = new w8(t6, bnVar.Ba);
        this.f = w8Var;
        w8Var.b = 5000L;
        int i7 = org.telegram.ui.ActionBar.n6.xj;
        zm zmVar = bnVar.Ba;
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.u6.P(i7, -1, 0, 0.0f, zmVar);
        vVar2.d(P, w8Var);
        org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, w8Var);
        w10.c(i7, -1, 0, 0.0f, zmVar);
        w10.n = vVar;
        w10.o = vVar2;
        w10.m = false;
        w10.g = P;
        ecVar.addView(w8Var, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(bnVar).b(acVar, -1);
        this.d = b10;
        b10.r = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.v = t8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (fjVar.k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= fjVar.k.reactions.results.size()) {
                    break;
                }
                if (fjVar.k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = fjVar.k.reactions.results.get(i10).chosen;
                    break;
                }
                i10++;
            }
        }
        this.g = z11;
    }

    public final void a() {
        x8 x8Var = this.q;
        int i7 = x8Var.a;
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
        fj fjVar = this.b;
        fjVar.f(i10, c10, z10);
        x8Var.g -= this.h;
        ks.f(i7).k(ks.A3, new Object[0]);
        ks.f(i7).k(ks.o1, Long.valueOf(fj.B0(fjVar.k)), Integer.valueOf(fjVar.e1()), fjVar.k.reactions);
        if (x8Var.B == this) {
            x8Var.B = null;
        }
    }

    public final void b() {
        fj fjVar;
        String str;
        int i7 = ks.A3;
        org.telegram.messenger.g0.r(this.p);
        int i10 = 0;
        if (!this.l) {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            x8 x8Var = this.q;
            x8Var.g -= this.h;
            ks.f(x8Var.a).k(i7, new Object[0]);
        } else if (!this.i && !this.j) {
            x8 y10 = x8.y(this.q.a, false);
            mp u12 = mp.u1(this.q.a);
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
                if (c10 == 0 || c10 == j10.i(this.q.a).e()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c10 == 2666000) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = u12.l1(c10);
                }
                this.q.N();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new p2(this, u12, j3, 2));
            } else {
                this.j = true;
                this.b.f((int) (-this.h), c(), this.g);
                x8 x8Var2 = this.q;
                x8Var2.g = 0L;
                ks.f(x8Var2.a).k(i7, new Object[0]);
                ks.f(this.q.a).k(ks.o1, Long.valueOf(fj.B0(this.b.k)), Integer.valueOf(this.b.e1()), this.b.k.reactions);
                if (this.a.a >= 0) {
                    str = o10.l(this.c.getMessagesController().c2(Long.valueOf(this.a.a)));
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
                new fb(parentActivity, this.c.getResourceProvider(), j3, 5, str2, new u8(this, j3, i10), 0L).show();
            }
        }
        this.d.b();
        k6 k6Var = this.o;
        if (k6Var != null && (fjVar = this.b) != null && fjVar.e1() == k6Var.c) {
            this.o.c();
        }
        x8 x8Var3 = this.q;
        if (x8Var3.B == this) {
            x8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.n;
        return l10 != null ? l10.longValue() : this.q.B(this.b);
    }

    public final String d() {
        return c() == 2666000 ? gd.M0(2131744794, null) : (c() == 0 || c() == j10.i(this.q.a).e()) ? gd.M0(2131744790, null) : gd.a0(null, null, 2131744789, org.telegram.messenger.n5.t(c()));
    }
}
