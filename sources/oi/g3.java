package oi;

import android.view.KeyEvent;
import android.view.View;
import c8.fa;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class g3 extends fa {
    public final /* synthetic */ o3 a;
    public final /* synthetic */ q3 b;

    public g3(q3 q3Var, o3 o3Var) {
        this.b = q3Var;
        this.a = o3Var;
    }

    @Override // c8.fa
    public final void a(boolean z10) {
        this.a.v();
        q3 q3Var = this.b;
        if (z10) {
            e3 e3Var = q3Var.v3;
            q3Var.x3 = e3Var.B0;
            q3Var.y3 = e3Var.C0;
            q3Var.z3 = e3Var.D0;
            q3Var.setEditTextsLocked(true);
            q3Var.q3();
            q3Var.Y2();
            return;
        }
        final int i7 = q3Var.x3;
        final int i10 = q3Var.y3;
        final int i11 = q3Var.z3;
        q3Var.x3 = -1;
        q3Var.y3 = -1;
        q3Var.z3 = 0;
        boolean z11 = q3Var.A3;
        final float f10 = q3Var.B3;
        final float f11 = q3Var.C3;
        q3Var.A3 = false;
        q3Var.setEditTextsLocked(false);
        q3Var.Y2();
        if (z11) {
            q3Var.post(new Runnable() { // from class: oi.f3
                @Override // java.lang.Runnable
                public final void run() {
                    q3 q3Var2 = g3.this.b;
                    for (int i12 = 0; i12 < q3Var2.getChildCount(); i12++) {
                        KeyEvent.Callback childAt = q3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof y5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            y5 y5Var = (y5) childAt;
                            if (q3.k4(y5Var.getEditText(), f12, f13)) {
                                return;
                            }
                            if (y5Var.n() && q3.k4(y5Var.getAuthorEditText(), f12, f13)) {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (q3.k4(((i0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof p0) && q3.k4(((p0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i7;
                    if (i13 >= 0) {
                        q3.O1(q3Var2, i13, i11, i10);
                    }
                }
            });
            return;
        }
        if (i7 >= 0) {
            q3Var.post(new hi.b0(this, i7, i11, i10, 2));
            return;
        }
        View findFocus = q3Var.findFocus();
        if (findFocus instanceof e1) {
            q3Var.post(new x0((e1) findFocus, 2));
        }
    }
}
