package ii;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class l3 extends w7.i0 {
    public final /* synthetic */ u3 a;
    public final /* synthetic */ w3 b;

    public l3(w3 w3Var, u3 u3Var) {
        this.b = w3Var;
        this.a = u3Var;
    }

    @Override // w7.i0
    public final void a(boolean z10) {
        this.a.l();
        w3 w3Var = this.b;
        if (z10) {
            j3 j3Var = w3Var.n3;
            w3Var.p3 = j3Var.G0;
            w3Var.q3 = j3Var.H0;
            w3Var.r3 = j3Var.I0;
            w3Var.setEditTextsLocked(true);
            w3Var.o3();
            w3Var.W2();
            return;
        }
        final int i10 = w3Var.p3;
        final int i11 = w3Var.q3;
        final int i12 = w3Var.r3;
        w3Var.p3 = -1;
        w3Var.q3 = -1;
        w3Var.r3 = 0;
        boolean z11 = w3Var.s3;
        final float f7 = w3Var.t3;
        final float f10 = w3Var.u3;
        w3Var.s3 = false;
        w3Var.setEditTextsLocked(false);
        w3Var.W2();
        if (z11) {
            w3Var.post(new Runnable() { // from class: ii.k3
                @Override // java.lang.Runnable
                public final void run() {
                    w3 w3Var2 = l3.this.b;
                    for (int i13 = 0; i13 < w3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = w3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof d6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            d6 d6Var = (d6) childAt;
                            if (w3.i4(d6Var.getEditText(), f11, f12)) {
                                return;
                            }
                            if (d6Var.n() && w3.i4(d6Var.getAuthorEditText(), f11, f12)) {
                                return;
                            }
                        } else if (childAt instanceof m0) {
                            if (w3.i4(((m0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof u0) && w3.i4(((u0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        w3.L1(w3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            w3Var.post(new ci.b0(this, i10, i12, i11, 2));
            return;
        }
        View findFocus = w3Var.findFocus();
        if (findFocus instanceof i1) {
            w3Var.post(new c1((i1) findFocus, 2));
        }
    }
}
