// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ne2 implements vc7, ed, d39, e39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf2 b;

    public /* synthetic */ ne2(kf2 kf2Var, byte b) {
        this.a = b;
        this.b = kf2Var;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        kf2 kf2Var = this.b;
        if (kf2Var.getParentActivity() != null) {
            w39 adapter = kf2Var.c.getAdapter();
            gf2 gf2Var = kf2Var.a;
            if (adapter == gf2Var) {
                return kf2Var.h0(gf2Var.E(i), false, view);
            }
        }
        return false;
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        this.b.r0(i, view);
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // vc7
    public final void run(long j) {
        this.b.s0(j);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        kf2 kf2Var = this.b;
        switch (b) {
            case 1:
                kf2Var.x0();
                break;
            default:
                kf2Var.finishFragment();
                break;
        }
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
