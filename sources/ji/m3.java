package ji;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        this.a.o();
        x3 x3Var = this.b;
        if (z10) {
            k3 k3Var = x3Var.l3;
            x3Var.n3 = k3Var.B0;
            x3Var.o3 = k3Var.C0;
            x3Var.p3 = k3Var.D0;
            x3Var.setEditTextsLocked(true);
            x3Var.o3();
            x3Var.W2();
            return;
        }
        final int i10 = x3Var.n3;
        final int i11 = x3Var.o3;
        final int i12 = x3Var.p3;
        x3Var.n3 = -1;
        x3Var.o3 = -1;
        x3Var.p3 = 0;
        boolean z11 = x3Var.q3;
        final float f7 = x3Var.r3;
        final float f10 = x3Var.s3;
        x3Var.q3 = false;
        x3Var.setEditTextsLocked(false);
        x3Var.W2();
        if (z11) {
            x3Var.post(new Runnable() { // from class: ji.l3
                @Override // java.lang.Runnable
                public final void run() {
                    x3 x3Var2 = m3.this.b;
                    for (int i13 = 0; i13 < x3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = x3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof i6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            i6 i6Var = (i6) childAt;
                            if (x3.i4(i6Var.getEditText(), f11, f12)) {
                                return;
                            }
                            if (i6Var.n() && x3.i4(i6Var.getAuthorEditText(), f11, f12)) {
                                return;
                            }
                        } else if (childAt instanceof l0) {
                            if (x3.i4(((l0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof t0) && x3.i4(((t0) childAt).getEditText(), f11, f12)) {
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
            x3Var.post(new di.b0(this, i10, i12, i11, 2));
            return;
        }
        View findFocus = x3Var.findFocus();
        if (findFocus instanceof h1) {
            x3Var.post(new b1((h1) findFocus, 2));
        }
    }
}
