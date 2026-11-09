package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uc extends org.telegram.ui.Components.na implements ls {
    public final FrameLayout P1;
    public m41 Q1;
    public boolean R1;

    public uc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, g6Var);
        qj0 qj0Var = this.k1;
        int i7 = this.t0;
        qj0Var.setPadding(i7, 0, i7, 0);
        int i10 = 4;
        this.k1.setOnItemClickListener(new ai.k(this, i10));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        int i11 = org.telegram.ui.ActionBar.l6.d6;
        w0(i11);
        P(i11);
        this.l1.setTitle(org.telegram.messenger.id.M0(2131745151, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        x70 x70Var = new x70(context, g6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        x70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.B6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, g6Var);
        x70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744967, null), new ab(this, i10)));
        x70Var.setGravity(17);
        x70Var.setMaxWidth(fi.m3.a(x70Var.getText(), x70Var.getPaint()));
        frameLayout.addView(x70Var, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.h5, frameLayout, g6Var);
        this.b.addView(new kz(getContext()), c8.ha.c(-1.0f, -1));
        m41 m41Var = this.Q1;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        qs.f(this.a).n(this, qs.v3);
        qs.f(this.a).n(this, qs.y3);
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.k1, getContext(), this.a, 0, true, new ai.e(this, 11), this.I0);
        this.Q1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131745151, null);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if ((i7 == qs.v3 || i7 == qs.y3) && (m41Var = this.Q1) != null) {
            m41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        sj sjVar;
        long j3 = ea.y(this.a, false).p().amount;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof cn) {
            cn cnVar = (cn) Q;
            if (cnVar.U9() && (sjVar = cnVar.Z) != null) {
                sjVar.L();
            }
        }
        super.show();
        qs.f(this.a).c(this, qs.v3);
        qs.f(this.a).c(this, qs.y3);
    }
}
