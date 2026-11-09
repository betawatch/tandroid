package bi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class oc extends org.telegram.ui.Components.na implements ls {
    public final nc P1;
    public final FrameLayout Q1;
    public final TLRPC.User R1;
    public final wg.x0 S1;
    public m41 T1;
    public boolean U1;

    public oc(Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user, wg.x0 x0Var) {
        super(context, null, false, false, g6Var);
        this.R1 = user;
        this.S1 = x0Var;
        this.r1 = 0.2f;
        qs.f(this.a).c(this, qs.w3);
        qs.f(this.a).c(this, qs.y3);
        N();
        qj0 qj0Var = this.k1;
        int i7 = this.t0;
        final int i10 = 0;
        qj0Var.setPadding(i7, 0, i7, 0);
        this.k1.setOnItemClickListener(new ai.k(this, 2));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.l6.i5);
        nc ncVar = new nc(0, context, g6Var);
        this.P1 = ncVar;
        ((TextView) ncVar.c).setText(org.telegram.messenger.id.M0(2131749607, null));
        x70 x70Var = (x70) ncVar.d;
        final int i11 = 1;
        x70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749609, t10.k(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131749608, null).replace(' ', (char) 160), new Runnable(this) { // from class: bi.lc
            public final /* synthetic */ oc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.f2 f2Var;
                int i12 = i10;
                oc ocVar = this.b;
                switch (i12) {
                    case 0:
                        ju0 ju0Var = new ju0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.f1) && (f2Var = ocVar.f1) != null) {
                            ju0Var.a0(f2Var);
                        }
                        ju0Var.show();
                        break;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.id.M0(2131744966, null));
                        break;
                }
            }
        }), true)));
        x70Var.setMaxWidth(fi.m3.a(x70Var.getText(), x70Var.getPaint()) + 1);
        this.l1.setTitle(O0());
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        w8Var.r(user);
        ((org.telegram.ui.Components.l9) ncVar.b).e(user, w8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q1 = frameLayout;
        x70 x70Var2 = new x70(context, g6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        x70Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var2, org.telegram.ui.ActionBar.l6.B6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var2, org.telegram.ui.ActionBar.l6.Uc, g6Var);
        x70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744967, null), new Runnable(this) { // from class: bi.lc
            public final /* synthetic */ oc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.f2 f2Var;
                int i12 = i11;
                oc ocVar = this.b;
                switch (i12) {
                    case 0:
                        ju0 ju0Var = new ju0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.f1) && (f2Var = ocVar.f1) != null) {
                            ju0Var.a0(f2Var);
                        }
                        ju0Var.show();
                        break;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.id.M0(2131744966, null));
                        break;
                }
            }
        }));
        x70Var2.setGravity(17);
        x70Var2.setMaxWidth(fi.m3.a(x70Var2.getText(), x70Var2.getPaint()));
        frameLayout.addView(x70Var2, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.h5, frameLayout, g6Var);
        this.b.addView(new kz(getContext()), c8.ha.c(-1.0f, -1));
        m41 m41Var = this.T1;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    public static void d1(oc ocVar, y31 y31Var, long j3, Boolean bool, String str) {
        wg.x0 x0Var;
        if (ocVar.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (x0Var = ocVar.S1) != null) {
            x0Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        t80 t80Var = LaunchActivity.G1.v0;
        if (T == null) {
            return;
        }
        int i7 = 1;
        if (!bool.booleanValue()) {
            if (str != null) {
                org.telegram.ui.Components.hc.a0(T).Q(R.raw.error, 36, org.telegram.messenger.id.a0(null, null, 2131743878, str)).j();
            }
        } else {
            org.telegram.ui.Components.cc L = org.telegram.ui.Components.hc.a0(T).L(R.raw.stars_send, org.telegram.messenger.id.M0(2131745100, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) y31Var.B, "StarsGiftSentPopupInfo", t10.k(ocVar.R1))), org.telegram.messenger.id.M0(2131743552, null), new k4(j3, i7));
            L.j = 5000;
            L.k(true);
            if (t80Var != null) {
                t80Var.c(true);
            }
            ea.y(ocVar.a, false).S(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        qs.f(this.a).n(this, qs.w3);
        qs.f(this.a).n(this, qs.y3);
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.k1, getContext(), this.a, 0, true, new ai.e(this, 9), this.I0);
        this.T1 = m41Var;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        nc ncVar = this.P1;
        if (ncVar == null) {
            return null;
        }
        return ((TextView) ncVar.c).getText();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if ((i7 == qs.w3 || i7 == qs.y3) && (m41Var = this.T1) != null) {
            m41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        sj sjVar;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof cn) {
            cn cnVar = (cn) Q;
            if (cnVar.U9() && (sjVar = cnVar.Z) != null) {
                sjVar.L();
            }
        }
        super.show();
    }
}
