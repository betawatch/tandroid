package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cb extends org.telegram.ui.Components.ja implements is {
    public final FrameLayout T1;
    public p41 U1;
    public boolean V1;

    public cb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        uj0 uj0Var = this.o1;
        int i7 = this.u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        this.o1.setOnItemClickListener(new bi.b6(this, 5));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        w0(i10);
        Q(i10);
        this.p1.setTitle(hd.M0(2131745151, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        z70 z70Var = new z70(context, e6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        z70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.B6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(2131744967, null), new ch.w(this, 25)));
        z70Var.setGravity(17);
        z70Var.setMaxWidth(hi.l3.a(z70Var.getText(), z70Var.getPaint()));
        frameLayout.addView(z70Var, c8.ja.e(-2, -1, 17));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, frameLayout, e6Var);
        this.b.addView(new nz(getContext()), c8.ja.c(-1.0f, -1));
        p41 p41Var = this.U1;
        if (p41Var != null) {
            p41Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        ns.f(this.a).n(this, ns.v3);
        ns.f(this.a).n(this, ns.y3);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.a, 0, true, new bi.b(this, 22), this.J0);
        this.U1 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(2131745151, null);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if ((i7 == ns.v3 || i7 == ns.y3) && (p41Var = this.U1) != null) {
            p41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        qj qjVar;
        long j3 = u8.y(this.a, false).p().amount;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.V9() && (qjVar = anVar.a0) != null) {
                qjVar.S();
            }
        }
        super.show();
        ns.f(this.a).c(this, ns.v3);
        ns.f(this.a).c(this, ns.y3);
    }
}
