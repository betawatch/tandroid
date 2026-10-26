package li;

import a8.ye;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l3 extends ye {
    public final /* synthetic */ t3 a;
    public final /* synthetic */ v3 b;

    public l3(v3 v3Var, t3 t3Var) {
        this.b = v3Var;
        this.a = t3Var;
    }

    @Override // a8.ye
    public final void a(boolean z10) {
        this.a.n();
        v3 v3Var = this.b;
        if (z10) {
            j3 j3Var = v3Var.v3;
            v3Var.x3 = j3Var.B0;
            v3Var.y3 = j3Var.C0;
            v3Var.z3 = j3Var.D0;
            v3Var.setEditTextsLocked(true);
            v3Var.t3();
            v3Var.b3();
            return;
        }
        final int i10 = v3Var.x3;
        final int i11 = v3Var.y3;
        final int i12 = v3Var.z3;
        v3Var.x3 = -1;
        v3Var.y3 = -1;
        v3Var.z3 = 0;
        boolean z11 = v3Var.A3;
        final float f7 = v3Var.B3;
        final float f10 = v3Var.C3;
        v3Var.A3 = false;
        v3Var.setEditTextsLocked(false);
        v3Var.b3();
        if (z11) {
            v3Var.post(new Runnable() { // from class: li.k3
                @Override // java.lang.Runnable
                public final void run() {
                    v3 v3Var2 = l3.this.b;
                    for (int i13 = 0; i13 < v3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = v3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof d6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            d6 d6Var = (d6) childAt;
                            if (v3.n4(d6Var.getEditText(), f11, f12)) {
                                return;
                            }
                            if (d6Var.m() && v3.n4(d6Var.getAuthorEditText(), f11, f12)) {
                                return;
                            }
                        } else if (childAt instanceof k0) {
                            if (v3.n4(((k0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof s0) && v3.n4(((s0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        v3.Q1(v3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            v3Var.post(new fi.b0(this, i10, i12, i11, 2));
            return;
        }
        View findFocus = v3Var.findFocus();
        if (findFocus instanceof g1) {
            v3Var.post(new a1((g1) findFocus, 2));
        }
    }
}
