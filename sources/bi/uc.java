package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class uc extends org.telegram.ui.Components.na implements ls {
    public final FrameLayout P1;
    public l41 Q1;
    public boolean R1;

    public uc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        pj0 pj0Var = this.k1;
        int i7 = this.t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        int i10 = 4;
        this.k1.setOnItemClickListener(new ai.k(this, i10));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        w0(i11);
        P(i11);
        this.l1.setTitle(org.telegram.messenger.hd.M0(2131745152, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        w70 w70Var = new w70(context, f6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.B6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131744968, null), new ab(this, i10)));
        w70Var.setGravity(17);
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()));
        frameLayout.addView(w70Var, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, f6Var);
        this.b.addView(new jz(getContext()), c8.ha.c(-1.0f, -1));
        l41 l41Var = this.Q1;
        if (l41Var != null) {
            l41Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        qs.f(this.a).n(this, qs.v3);
        qs.f(this.a).n(this, qs.y3);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.k1, getContext(), this.a, 0, true, new ai.e(this, 11), this.I0);
        this.Q1 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131745152, null);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l41 l41Var;
        if ((i7 == qs.v3 || i7 == qs.y3) && (l41Var = this.Q1) != null) {
            l41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        qj qjVar;
        long j3 = ea.y(this.a, false).p().amount;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.T9() && (qjVar = anVar.Z) != null) {
                qjVar.L();
            }
        }
        super.show();
        qs.f(this.a).c(this, qs.v3);
        qs.f(this.a).c(this, qs.y3);
    }
}
