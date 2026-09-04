package ji;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class k3 extends w7.h0 {
    public final /* synthetic */ t3 a;
    public final /* synthetic */ v3 b;

    public k3(v3 v3Var, t3 t3Var) {
        this.b = v3Var;
        this.a = t3Var;
    }

    @Override // w7.h0
    public final void a(boolean z10) {
        this.a.f();
        v3 v3Var = this.b;
        if (z10) {
            i3 i3Var = v3Var.n3;
            v3Var.p3 = i3Var.G0;
            v3Var.q3 = i3Var.H0;
            v3Var.r3 = i3Var.I0;
            v3Var.setEditTextsLocked(true);
            v3Var.m3();
            v3Var.U2();
            return;
        }
        final int i10 = v3Var.p3;
        final int i11 = v3Var.q3;
        final int i12 = v3Var.r3;
        v3Var.p3 = -1;
        v3Var.q3 = -1;
        v3Var.r3 = 0;
        boolean z11 = v3Var.s3;
        final float f7 = v3Var.t3;
        final float f10 = v3Var.u3;
        v3Var.s3 = false;
        v3Var.setEditTextsLocked(false);
        v3Var.U2();
        if (z11) {
            v3Var.post(new Runnable() { // from class: ji.j3
                @Override // java.lang.Runnable
                public final void run() {
                    v3 v3Var2 = k3.this.b;
                    for (int i13 = 0; i13 < v3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = v3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof g6;
                        float f11 = f7;
                        float f12 = f10;
                        if (z12) {
                            g6 g6Var = (g6) childAt;
                            if (v3.g4(g6Var.getEditText(), f11, f12)) {
                                return;
                            }
                            if (g6Var.n() && v3.g4(g6Var.getAuthorEditText(), f11, f12)) {
                                return;
                            }
                        } else if (childAt instanceof l0) {
                            if (v3.g4(((l0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof t0) && v3.g4(((t0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        v3.J1(v3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            v3Var.post(new di.b0(this, i10, i12, i11, 2));
            return;
        }
        View findFocus = v3Var.findFocus();
        if (findFocus instanceof h1) {
            v3Var.post(new b1((h1) findFocus, 2));
        }
    }
}
