package ki;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class l3 extends w7.j0 {
    public final /* synthetic */ u3 a;
    public final /* synthetic */ w3 b;

    public l3(w3 w3Var, u3 u3Var) {
        this.b = w3Var;
        this.a = u3Var;
    }

    @Override // w7.j0
    public final void a(boolean z10) {
        this.a.p();
        w3 w3Var = this.b;
        if (z10) {
            j3 j3Var = w3Var.o3;
            w3Var.q3 = j3Var.B0;
            w3Var.r3 = j3Var.C0;
            w3Var.s3 = j3Var.D0;
            w3Var.setEditTextsLocked(true);
            w3Var.t3();
            w3Var.b3();
            return;
        }
        final int i10 = w3Var.q3;
        final int i11 = w3Var.r3;
        final int i12 = w3Var.s3;
        w3Var.q3 = -1;
        w3Var.r3 = -1;
        w3Var.s3 = 0;
        boolean z11 = w3Var.t3;
        final float f7 = w3Var.u3;
        final float f10 = w3Var.v3;
        w3Var.t3 = false;
        w3Var.setEditTextsLocked(false);
        w3Var.b3();
        if (z11) {
            w3Var.post(new Runnable() { // from class: ki.k3
                @Override // java.lang.Runnable
                public final void run() {
                    w3 w3Var2 = l3.this.b;
                    for (int i13 = 0; i13 < w3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = w3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof c6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            c6 c6Var = (c6) childAt;
                            if (w3.n4(c6Var.getEditText(), f11, f12)) {
                                return;
                            }
                            if (c6Var.m() && w3.n4(c6Var.getAuthorEditText(), f11, f12)) {
                                return;
                            }
                        } else if (childAt instanceof l0) {
                            if (w3.n4(((l0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof t0) && w3.n4(((t0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        w3.Q1(w3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            w3Var.post(new ei.b0(this, i10, i12, i11, 2));
            return;
        }
        View findFocus = w3Var.findFocus();
        if (findFocus instanceof h1) {
            w3Var.post(new b1((h1) findFocus, 2));
        }
    }
}
