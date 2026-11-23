package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.tz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gb extends org.telegram.ui.Components.ra implements fs {
    public final FrameLayout T1;
    public b51 U1;
    public boolean V1;

    public gb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, false, false, i6Var);
        ek0 ek0Var = this.o1;
        int i7 = this.u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.o1.setOnItemClickListener(new bi.n8(this, 5));
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.o1.setItemAnimator(lVar);
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        w0(i10);
        Q(i10);
        this.p1.setTitle(gd.N0(2131744910, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        j80 j80Var = new j80(context, i6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        j80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.B6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        j80Var.setText(org.telegram.messenger.g0.T2(gd.N0(2131744726, null), new ca.r(this, 28)));
        j80Var.setGravity(17);
        j80Var.setMaxWidth(hi.u3.a(j80Var.getText(), j80Var.getPaint()));
        frameLayout.addView(j80Var, c8.na.e(-2, -1, 17));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, i6Var);
        this.b.addView(new tz(getContext()), c8.na.c(-1.0f, -1));
        b51 b51Var = this.U1;
        if (b51Var != null) {
            b51Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        ks.f(this.a).n(this, ks.x3);
        ks.f(this.a).n(this, ks.A3);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.o1, getContext(), this.a, 0, true, new bi.b(this, 21), this.J0);
        this.U1 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return gd.N0(2131744910, null);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b51 b51Var;
        if ((i7 == ks.x3 || i7 == ks.A3) && (b51Var = this.U1) != null) {
            b51Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        rj rjVar;
        long j3 = y8.y(this.a, false).p().amount;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.a0) != null) {
                rjVar.U();
            }
        }
        super.show();
        ks.f(this.a).c(this, ks.x3);
        ks.f(this.a).c(this, ks.A3);
    }
}
