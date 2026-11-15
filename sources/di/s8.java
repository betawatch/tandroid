package di;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s8 {
    public final n8 a;
    public final gj b;
    public final an c;
    public final org.telegram.ui.Components.xb d;
    public final org.telegram.ui.Components.rb e;
    public final t8 f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public h6 o;
    public final q8 p;
    public final /* synthetic */ u8 q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public s8(u8 u8Var, n8 n8Var, gj gjVar, an anVar, boolean z10) {
        this.q = u8Var;
        boolean z11 = false;
        z11 = false;
        q8 q8Var = new q8(this, z11 ? 1 : 0);
        this.p = q8Var;
        this.a = n8Var;
        this.b = gjVar;
        this.c = anVar;
        Context t6 = u8.t(anVar);
        org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(t6, anVar.Aa);
        this.e = rbVar;
        rbVar.c(R.raw.stars_topup, new String[0]);
        rbVar.b.setText(d());
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, anVar.Aa, true, false);
        vbVar.e(hd.M0(2131745023, null));
        vbVar.b = new q8(this, 1);
        t8 t8Var = new t8(t6, anVar.Aa);
        this.f = t8Var;
        t8Var.b = 5000L;
        int i7 = org.telegram.ui.ActionBar.j6.xj;
        ym ymVar = anVar.Aa;
        o oVar = new o(3);
        o oVar2 = new o(4);
        int P = org.telegram.ui.ActionBar.q6.P(i7, -1, 0, 0.0f, ymVar);
        oVar2.f(P, t8Var);
        org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(101, t8Var);
        w10.c(i7, -1, 0, 0.0f, ymVar);
        w10.n = oVar;
        w10.o = oVar2;
        w10.m = false;
        w10.g = P;
        vbVar.addView(t8Var, c8.ja.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        vbVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        rbVar.setButton(vbVar);
        org.telegram.ui.Components.xb b10 = org.telegram.ui.Components.cc.a0(anVar).b(rbVar, -1);
        this.d = b10;
        b10.r = false;
        if (z10) {
            b10.k(true);
            this.m = true;
        }
        b10.v = q8Var;
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
        u8 u8Var = this.q;
        int i7 = u8Var.a;
        org.telegram.messenger.g0.r(this.p);
        this.j = true;
        this.d.b();
        h6 h6Var = this.o;
        if (h6Var != null) {
            h6Var.c();
        }
        int i10 = (int) (-this.h);
        boolean z10 = this.g;
        long c10 = c();
        gj gjVar = this.b;
        gjVar.f(i10, c10, z10);
        u8Var.g -= this.h;
        ns.f(i7).k(ns.y3, new Object[0]);
        ns.f(i7).k(ns.o1, Long.valueOf(gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()), gjVar.k.reactions);
        if (u8Var.B == this) {
            u8Var.B = null;
        }
    }

    public final void b() {
        gj gjVar;
        String str;
        int i7 = ns.y3;
        org.telegram.messenger.g0.r(this.p);
        int i10 = 0;
        if (!this.l) {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            u8 u8Var = this.q;
            u8Var.g -= this.h;
            ns.f(u8Var.a).k(i7, new Object[0]);
        } else if (!this.i && !this.j) {
            u8 y10 = u8.y(this.q.a, false);
            np s12 = np.s1(this.q.a);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
            long j3 = this.h;
            if (!y10.e || y10.q(null, false, false).amount >= j3) {
                this.i = true;
                TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                tL_messages_sendPaidReaction.peer = s12.j1(this.a.a);
                tL_messages_sendPaidReaction.msg_id = this.a.b;
                tL_messages_sendPaidReaction.random_id = (Utilities.b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                tL_messages_sendPaidReaction.count = (int) this.h;
                tL_messages_sendPaidReaction.flags |= 1;
                long c10 = c();
                if (c10 == 0 || c10 == m10.i(this.q.a).e()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c10 == 2666000) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = s12.j1(c10);
                }
                this.q.O();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new o2(this, s12, j3, 2));
            } else {
                this.j = true;
                this.b.f((int) (-this.h), c(), this.g);
                u8 u8Var2 = this.q;
                u8Var2.g = 0L;
                ns.f(u8Var2.a).k(i7, new Object[0]);
                ns.f(this.q.a).k(ns.o1, Long.valueOf(gj.B0(this.b.k)), Integer.valueOf(this.b.e1()), this.b.k.reactions);
                if (this.a.a >= 0) {
                    str = q10.k(this.c.getMessagesController().a2(Long.valueOf(this.a.a)));
                } else {
                    TLRPC.Chat M0 = this.c.getMessagesController().M0(Long.valueOf(-this.a.a));
                    str = M0 == null ? "" : M0.title;
                }
                String str2 = str;
                Context parentActivity = this.c.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                new bb(parentActivity, this.c.getResourceProvider(), j3, 5, str2, new r8(this, j3, i10), 0L).show();
            }
        }
        this.d.b();
        h6 h6Var = this.o;
        if (h6Var != null && (gjVar = this.b) != null && gjVar.e1() == h6Var.c) {
            this.o.c();
        }
        u8 u8Var3 = this.q;
        if (u8Var3.B == this) {
            u8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.n;
        return l10 != null ? l10.longValue() : this.q.B(this.b);
    }

    public final String d() {
        return c() == 2666000 ? hd.M0(2131745029, null) : (c() == 0 || c() == m10.i(this.q.a).e()) ? hd.M0(2131745025, null) : hd.a0(null, null, 2131745024, org.telegram.messenger.m5.t(c()));
    }
}
