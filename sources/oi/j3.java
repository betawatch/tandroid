package oi;

import android.view.KeyEvent;
import android.view.View;
import c8.ha;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class j3 extends ha {
    public final /* synthetic */ r3 a;
    public final /* synthetic */ t3 b;

    public j3(t3 t3Var, r3 r3Var) {
        this.b = t3Var;
        this.a = r3Var;
    }

    @Override // c8.ha
    public final void a(boolean z10) {
        this.a.G();
        t3 t3Var = this.b;
        if (z10) {
            h3 h3Var = t3Var.v3;
            t3Var.x3 = h3Var.B0;
            t3Var.y3 = h3Var.C0;
            t3Var.z3 = h3Var.D0;
            t3Var.setEditTextsLocked(true);
            t3Var.q3();
            t3Var.Y2();
            return;
        }
        final int i7 = t3Var.x3;
        final int i10 = t3Var.y3;
        final int i11 = t3Var.z3;
        t3Var.x3 = -1;
        t3Var.y3 = -1;
        t3Var.z3 = 0;
        boolean z11 = t3Var.A3;
        final float f10 = t3Var.B3;
        final float f11 = t3Var.C3;
        t3Var.A3 = false;
        t3Var.setEditTextsLocked(false);
        t3Var.Y2();
        if (z11) {
            t3Var.post(new Runnable() { // from class: oi.i3
                @Override // java.lang.Runnable
                public final void run() {
                    t3 t3Var2 = j3.this.b;
                    for (int i12 = 0; i12 < t3Var2.getChildCount(); i12++) {
                        KeyEvent.Callback childAt = t3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof a6;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            a6 a6Var = (a6) childAt;
                            if (t3.k4(a6Var.getEditText(), f12, f13)) {
                                return;
                            }
                            if (a6Var.n() && t3.k4(a6Var.getAuthorEditText(), f12, f13)) {
                                return;
                            }
                        } else if (childAt instanceof j0) {
                            if (t3.k4(((j0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof q0) && t3.k4(((q0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i7;
                    if (i13 >= 0) {
                        t3.O1(t3Var2, i13, i11, i10);
                    }
                }
            });
            return;
        }
        if (i7 >= 0) {
            t3Var.post(new hi.d0(this, i7, i11, i10, 2));
            return;
        }
        View findFocus = t3Var.findFocus();
        if (findFocus instanceof f1) {
            t3Var.post(new y0((f1) findFocus, 2));
        }
    }
}
