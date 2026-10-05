package ii;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class m3 extends w7.j0 {
    public final /* synthetic */ v3 a;
    public final /* synthetic */ x3 b;

    public m3(x3 x3Var, v3 v3Var) {
        this.b = x3Var;
        this.a = v3Var;
    }

    @Override // w7.j0
    public final void a(boolean z10) {
        this.a.t();
        x3 x3Var = this.b;
        if (z10) {
            k3 k3Var = x3Var.u3;
            x3Var.w3 = k3Var.G0;
            x3Var.x3 = k3Var.H0;
            x3Var.y3 = k3Var.I0;
            x3Var.setEditTextsLocked(true);
            x3Var.o3();
            x3Var.W2();
            return;
        }
        final int i10 = x3Var.w3;
        final int i11 = x3Var.x3;
        final int i12 = x3Var.y3;
        x3Var.w3 = -1;
        x3Var.x3 = -1;
        x3Var.y3 = 0;
        boolean z11 = x3Var.z3;
        final float f7 = x3Var.A3;
        final float f10 = x3Var.B3;
        x3Var.z3 = false;
        x3Var.setEditTextsLocked(false);
        x3Var.W2();
        if (z11) {
            x3Var.post(new Runnable() { // from class: ii.l3
                @Override // java.lang.Runnable
                public final void run() {
                    x3 x3Var2 = m3.this.b;
                    for (int i13 = 0; i13 < x3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = x3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof f6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            f6 f6Var = (f6) childAt;
                            if (x3.i4(f6Var.getEditText(), f11, f12)) {
                                return;
                            }
                            if (f6Var.n() && x3.i4(f6Var.getAuthorEditText(), f11, f12)) {
                                return;
                            }
                        } else if (childAt instanceof m0) {
                            if (x3.i4(((m0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof u0) && x3.i4(((u0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        x3.L1(x3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            x3Var.post(new ci.b0(this, i10, i12, i11, 2));
            return;
        }
        View findFocus = x3Var.findFocus();
        if (findFocus instanceof i1) {
            x3Var.post(new c1((i1) findFocus, 2));
        }
    }
}
