package bi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ca {
    public final x9 a;
    public final ij b;
    public final cn c;
    public final org.telegram.ui.Components.bc d;
    public final org.telegram.ui.Components.vb e;
    public final da f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public p7 o;
    public final aa p;
    public final /* synthetic */ ea q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public ca(ea eaVar, x9 x9Var, ij ijVar, cn cnVar, boolean z9) {
        this.q = eaVar;
        boolean z10 = false;
        z10 = false;
        aa aaVar = new aa(this, z10 ? 1 : 0);
        this.p = aaVar;
        this.a = x9Var;
        this.b = ijVar;
        this.c = cnVar;
        Context t6 = ea.t(cnVar);
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, cnVar.za);
        this.e = vbVar;
        vbVar.c(R.raw.stars_topup, new String[0]);
        vbVar.b.setText(d());
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(t6, cnVar.za, true, false);
        zbVar.e(org.telegram.messenger.id.M0(2131745023, null));
        zbVar.b = new aa(this, 1);
        da daVar = new da(t6, cnVar.za);
        this.f = daVar;
        daVar.b = 5000L;
        int i7 = org.telegram.ui.ActionBar.m6.uj;
        an anVar = cnVar.za;
        a3.l lVar = new a3.l(24);
        a3.l lVar2 = new a3.l(25);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, anVar);
        lVar2.c(P, daVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, daVar);
        w10.c(i7, -1, 0, 0.0f, anVar);
        w10.n = lVar;
        w10.o = lVar2;
        w10.m = false;
        w10.g = P;
        zbVar.addView(daVar, c8.ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        zbVar.e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        vbVar.setButton(zbVar);
        org.telegram.ui.Components.bc b10 = org.telegram.ui.Components.gc.a0(cnVar).b(vbVar, -1);
        this.d = b10;
        b10.r = false;
        if (z9) {
            b10.k(true);
            this.m = true;
        }
        b10.v = aaVar;
        this.h = 0L;
        System.currentTimeMillis();
        if (ijVar.k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= ijVar.k.reactions.results.size()) {
                    break;
                }
                if (ijVar.k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z10 = ijVar.k.reactions.results.get(i10).chosen;
                    break;
                }
                i10++;
            }
        }
        this.g = z10;
    }

    public final void a() {
        ea eaVar = this.q;
        int i7 = eaVar.a;
        org.telegram.messenger.g0.r(this.p);
        this.j = true;
        this.d.b();
        p7 p7Var = this.o;
        if (p7Var != null) {
            p7Var.c();
        }
        int i10 = (int) (-this.h);
        boolean z9 = this.g;
        long c10 = c();
        ij ijVar = this.b;
        ijVar.f(i10, c10, z9);
        eaVar.g -= this.h;
        qs.f(i7).k(qs.y3, new Object[0]);
        qs.f(i7).k(qs.o1, Long.valueOf(ij.B0(ijVar.k)), Integer.valueOf(ijVar.e1()), ijVar.k.reactions);
        if (eaVar.B == this) {
            eaVar.B = null;
        }
    }

    public final void b() {
        ij ijVar;
        String str;
        int i7 = qs.y3;
        org.telegram.messenger.g0.r(this.p);
        int i10 = 0;
        if (!this.l) {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            ea eaVar = this.q;
            eaVar.g -= this.h;
            qs.f(eaVar.a).k(i7, new Object[0]);
        } else if (!this.i && !this.j) {
            ea y10 = ea.y(this.q.a, false);
            qp s12 = qp.s1(this.q.a);
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
                if (c10 == 0 || c10 == p10.i(this.q.a).e()) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (c10 == 2666000) {
                    tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = s12.j1(c10);
                }
                this.q.O();
                connectionsManager.sendRequest(tL_messages_sendPaidReaction, new h3(this, s12, j3, 2));
            } else {
                this.j = true;
                this.b.f((int) (-this.h), c(), this.g);
                ea eaVar2 = this.q;
                eaVar2.g = 0L;
                qs.f(eaVar2.a).k(i7, new Object[0]);
                qs.f(this.q.a).k(qs.o1, Long.valueOf(ij.B0(this.b.k)), Integer.valueOf(this.b.e1()), this.b.k.reactions);
                if (this.a.a >= 0) {
                    str = t10.k(this.c.getMessagesController().a2(Long.valueOf(this.a.a)));
                } else {
                    TLRPC.Chat M0 = this.c.getMessagesController().M0(Long.valueOf(-this.a.a));
                    str = M0 == null ? "" : M0.title;
                }
                String str2 = str;
                Context parentActivity = this.c.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                new tc(parentActivity, this.c.getResourceProvider(), j3, 5, str2, new ba(this, j3, i10), 0L).show();
            }
        }
        this.d.b();
        p7 p7Var = this.o;
        if (p7Var != null && (ijVar = this.b) != null && ijVar.e1() == p7Var.c) {
            this.o.c();
        }
        ea eaVar3 = this.q;
        if (eaVar3.B == this) {
            eaVar3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.n;
        return l10 != null ? l10.longValue() : this.q.B(this.b);
    }

    public final String d() {
        return c() == 2666000 ? org.telegram.messenger.id.M0(2131745029, null) : (c() == 0 || c() == p10.i(this.q.a).e()) ? org.telegram.messenger.id.M0(2131745025, null) : org.telegram.messenger.id.a0(null, null, 2131745024, org.telegram.messenger.m5.t(c()));
    }
}
