package ci;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.um;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c9 {
    public final x8 a;
    public final zi b;
    public final wm c;
    public final org.telegram.ui.Components.ac d;
    public final org.telegram.ui.Components.ub e;
    public final d9 f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public q6 o;
    public final a9 p;
    public final /* synthetic */ e9 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public c9(e9 e9Var, x8 x8Var, zi ziVar, wm wmVar, boolean z10) {
        this.q = e9Var;
        boolean z11 = false;
        z11 = false;
        a9 a9Var = new a9(this, z11 ? 1 : 0);
        this.p = a9Var;
        this.a = x8Var;
        this.b = ziVar;
        this.c = wmVar;
        Context t10 = e9.t(wmVar);
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(t10, wmVar.ya);
        this.e = ubVar;
        ubVar.c(R.raw.stars_topup, new String[0]);
        ubVar.b.setText(d());
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(t10, wmVar.ya, true, false);
        ybVar.e(bd.M0(2131745033, null));
        ybVar.b = new a9(this, 1);
        d9 d9Var = new d9(t10, wmVar.ya);
        this.f = d9Var;
        d9Var.b = 5000L;
        int i3 = org.telegram.ui.ActionBar.k6.uj;
        um umVar = wmVar.ya;
        a3.j jVar = new a3.j(20);
        a3.j jVar2 = new a3.j(21);
        int Q = org.telegram.ui.ActionBar.r6.Q(i3, -1, 0, 0.0f, umVar);
        jVar2.f(Q, d9Var);
        org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, d9Var);
        x10.c(i3, -1, 0, 0.0f, umVar);
        x10.n = jVar;
        x10.o = jVar2;
        x10.m = false;
        x10.g = Q;
        ybVar.addView(d9Var, mf.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ybVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        ubVar.setButton(ybVar);
        org.telegram.ui.Components.ac b10 = org.telegram.ui.Components.fc.a0(wmVar).b(ubVar, -1);
        this.d = b10;
        b10.r = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.v = a9Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (ziVar.k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= ziVar.k.reactions.results.size()) {
                    break;
                }
                if (ziVar.k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = ziVar.k.reactions.results.get(i10).chosen;
                    break;
                }
                i10++;
            }
        }
        this.g = z11;
    }

    public final void a() {
        e9 e9Var = this.q;
        int i3 = e9Var.a;
        org.telegram.messenger.g0.r(this.p);
        this.j = true;
        this.d.b();
        q6 q6Var = this.o;
        if (q6Var != null) {
            q6Var.c();
        }
        int i10 = (int) (-this.h);
        boolean z10 = this.g;
        long c2 = c();
        zi ziVar = this.b;
        ziVar.f(i10, c2, z10);
        e9Var.g -= this.h;
        hs.f(i3).k(hs.y3, new Object[0]);
        hs.f(i3).k(hs.o1, Long.valueOf(zi.B0(ziVar.k)), Integer.valueOf(ziVar.f1()), ziVar.k.reactions);
        if (e9Var.B == this) {
            e9Var.B = null;
        }
    }

    public final void b() {
        zi ziVar;
        String str;
        int i3 = hs.y3;
        org.telegram.messenger.g0.r(this.p);
        int i10 = 0;
        if (!this.l) {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            e9 e9Var = this.q;
            e9Var.g -= this.h;
            hs.f(e9Var.a).k(i3, new Object[0]);
        } else if (!this.i && !this.j) {
            e9 y9 = e9.y(this.q.a, false);
            hp s12 = hp.s1(this.q.a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
            long j10 = this.h;
            if (!y9.e || y9.q(null, false, false).amount >= j10) {
                this.i = true;
                TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                tL_messages_sendPaidReaction.peer = s12.j1(this.a.a);
                tL_messages_sendPaidReaction.msg_id = this.a.b;
                tL_messages_sendPaidReaction.random_id = (Utilities.b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                tL_messages_sendPaidReaction.count = (int) this.h;
                tL_messages_sendPaidReaction.flags |= 1;
                long c2 = c();
                if (c2 == 0 || c2 == h10.i(this.q.a).e()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c2 == 2666000) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = s12.j1(c2);
                }
                this.q.O();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new u2(this, s12, j10, 2));
            } else {
                this.j = true;
                this.b.f((int) (-this.h), c(), this.g);
                e9 e9Var2 = this.q;
                e9Var2.g = 0L;
                hs.f(e9Var2.a).k(i3, new Object[0]);
                hs.f(this.q.a).k(hs.o1, Long.valueOf(zi.B0(this.b.k)), Integer.valueOf(this.b.f1()), this.b.k.reactions);
                if (this.a.a >= 0) {
                    str = l10.k(this.c.getMessagesController().a2(Long.valueOf(this.a.a)));
                } else {
                    TLRPC.Chat M0 = this.c.getMessagesController().M0(Long.valueOf(-this.a.a));
                    str = M0 == null ? "" : M0.title;
                }
                String str2 = str;
                Context parentActivity = this.c.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.K1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                new mb(parentActivity, this.c.getResourceProvider(), j10, 5, str2, new b9(this, j10, i10), 0L).show();
            }
        }
        this.d.b();
        q6 q6Var = this.o;
        if (q6Var != null && (ziVar = this.b) != null && ziVar.f1() == q6Var.c) {
            this.o.c();
        }
        e9 e9Var3 = this.q;
        if (e9Var3.B == this) {
            e9Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.n;
        return l10 != null ? l10.longValue() : this.q.B(this.b);
    }

    public final String d() {
        return c() == 2666000 ? bd.M0(2131745039, null) : (c() == 0 || c() == h10.i(this.q.a).e()) ? bd.M0(2131745035, null) : bd.a0(null, null, 2131745034, org.telegram.messenger.m5.t(c()));
    }
}
