package hi;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class o3 extends w7.w5 {
    public final /* synthetic */ x3 a;
    public final /* synthetic */ z3 b;

    public o3(z3 z3Var, x3 x3Var) {
        this.b = z3Var;
        this.a = x3Var;
    }

    @Override // w7.w5
    public final void a(boolean z10) {
        this.a.s();
        z3 z3Var = this.b;
        if (z10) {
            m3 m3Var = z3Var.n3;
            z3Var.p3 = m3Var.G0;
            z3Var.q3 = m3Var.H0;
            z3Var.r3 = m3Var.I0;
            z3Var.setEditTextsLocked(true);
            z3Var.m3();
            z3Var.U2();
            return;
        }
        final int i10 = z3Var.p3;
        final int i11 = z3Var.q3;
        final int i12 = z3Var.r3;
        z3Var.p3 = -1;
        z3Var.q3 = -1;
        z3Var.r3 = 0;
        boolean z11 = z3Var.s3;
        final float f7 = z3Var.t3;
        final float f10 = z3Var.u3;
        z3Var.s3 = false;
        z3Var.setEditTextsLocked(false);
        z3Var.U2();
        if (z11) {
            z3Var.post(new Runnable() { // from class: hi.n3
                @Override // java.lang.Runnable
                public final void run() {
                    z3 z3Var2 = o3.this.b;
                    for (int i13 = 0; i13 < z3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = z3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof g6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            g6 g6Var = (g6) childAt;
                            if (z3.g4(g6Var.getEditText(), f11, f12)) {
                                return;
                            }
                            if (g6Var.n() && z3.g4(g6Var.getAuthorEditText(), f11, f12)) {
                                return;
                            }
                        } else if (childAt instanceof n0) {
                            if (z3.g4(((n0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof w0) && z3.g4(((w0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        z3.J1(z3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            z3Var.post(new bi.g0(this, i10, i12, i11, 2));
            return;
        }
        View findFocus = z3Var.findFocus();
        if (findFocus instanceof k1) {
            z3Var.post(new e1((k1) findFocus, 2));
        }
    }
}
