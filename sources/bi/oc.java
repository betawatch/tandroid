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
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
import org.telegram.ui.u80;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class oc extends org.telegram.ui.Components.ma implements ls {
    public final nc S1;
    public final FrameLayout T1;
    public final TLRPC.User U1;
    public final wg.x0 V1;
    public m41 W1;
    public boolean X1;

    public oc(Context context, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.User user, wg.x0 x0Var) {
        super(context, null, false, false, h6Var);
        this.U1 = user;
        this.V1 = x0Var;
        this.u1 = 0.2f;
        qs.f(this.a).c(this, qs.w3);
        qs.f(this.a).c(this, qs.y3);
        N();
        pj0 pj0Var = this.n1;
        int i7 = this.t0;
        final int i10 = 0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.n1.setOnItemClickListener(new ai.k(this, 2));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.m6.i5);
        nc ncVar = new nc(0, context, h6Var);
        this.S1 = ncVar;
        ((TextView) ncVar.c).setText(org.telegram.messenger.id.M0(2131749607, null));
        w70 w70Var = (w70) ncVar.d;
        final int i11 = 1;
        w70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749609, t10.k(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131749608, null).replace(' ', (char) 160), new Runnable(this) { // from class: bi.lc
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
                        iu0 iu0Var = new iu0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.i1) && (f2Var = ocVar.i1) != null) {
                            iu0Var.a0(f2Var);
                        }
                        iu0Var.show();
                        break;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.id.M0(2131744966, null));
                        break;
                }
            }
        }), true)));
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()) + 1);
        this.o1.setTitle(O0());
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.r(user);
        ((org.telegram.ui.Components.k9) ncVar.b).e(user, v8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        w70 w70Var2 = new w70(context, h6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        w70Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var2, org.telegram.ui.ActionBar.m6.B6, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var2, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        w70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744967, null), new Runnable(this) { // from class: bi.lc
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
                        iu0 iu0Var = new iu0(ocVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(ocVar.i1) && (f2Var = ocVar.i1) != null) {
                            iu0Var.a0(f2Var);
                        }
                        iu0Var.show();
                        break;
                    default:
                        vf.c.t(ocVar.getContext(), org.telegram.messenger.id.M0(2131744966, null));
                        break;
                }
            }
        }));
        w70Var2.setGravity(17);
        w70Var2.setMaxWidth(fi.m3.a(w70Var2.getText(), w70Var2.getPaint()));
        frameLayout.addView(w70Var2, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout, h6Var);
        this.b.addView(new jz(getContext()), c8.ha.c(-1.0f, -1));
        m41 m41Var = this.W1;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    public static void d1(oc ocVar, x31 x31Var, long j3, Boolean bool, String str) {
        wg.x0 x0Var;
        if (ocVar.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (x0Var = ocVar.V1) != null) {
            x0Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        u80 u80Var = LaunchActivity.G1.v0;
        if (T == null) {
            return;
        }
        int i7 = 1;
        if (!bool.booleanValue()) {
            if (str != null) {
                org.telegram.ui.Components.gc.a0(T).Q(R.raw.error, 36, org.telegram.messenger.id.a0(null, null, 2131743878, str)).j();
            }
        } else {
            org.telegram.ui.Components.bc L = org.telegram.ui.Components.gc.a0(T).L(R.raw.stars_send, org.telegram.messenger.id.M0(2131745100, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) x31Var.B, "StarsGiftSentPopupInfo", t10.k(ocVar.U1))), org.telegram.messenger.id.M0(2131743552, null), new k4(j3, i7));
            L.j = 5000;
            L.k(true);
            if (u80Var != null) {
                u80Var.c(true);
            }
            ea.y(ocVar.a, false).S(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        qs.f(this.a).n(this, qs.w3);
        qs.f(this.a).n(this, qs.y3);
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.a, 0, true, new ai.e(this, 9), this.I0);
        this.W1 = m41Var;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        nc ncVar = this.S1;
        if (ncVar == null) {
            return null;
        }
        return ((TextView) ncVar.c).getText();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if ((i7 == qs.w3 || i7 == qs.y3) && (m41Var = this.W1) != null) {
            m41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
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
