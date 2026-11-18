package oi;

import android.view.KeyEvent;
import android.view.View;
import c8.ha;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i3 extends ha {
    public final /* synthetic */ q3 a;
    public final /* synthetic */ s3 b;

    public i3(s3 s3Var, q3 q3Var) {
        this.b = s3Var;
        this.a = q3Var;
    }

    @Override // c8.ha
    public final void a(boolean z10) {
        this.a.G();
        s3 s3Var = this.b;
        if (z10) {
            g3 g3Var = s3Var.v3;
            s3Var.x3 = g3Var.B0;
            s3Var.y3 = g3Var.C0;
            s3Var.z3 = g3Var.D0;
            s3Var.setEditTextsLocked(true);
            s3Var.q3();
            s3Var.Y2();
            return;
        }
        final int i7 = s3Var.x3;
        final int i10 = s3Var.y3;
        final int i11 = s3Var.z3;
        s3Var.x3 = -1;
        s3Var.y3 = -1;
        s3Var.z3 = 0;
        boolean z11 = s3Var.A3;
        final float f10 = s3Var.B3;
        final float f11 = s3Var.C3;
        s3Var.A3 = false;
        s3Var.setEditTextsLocked(false);
        s3Var.Y2();
        if (z11) {
            s3Var.post(new Runnable() { // from class: oi.h3
                @Override // java.lang.Runnable
                public final void run() {
                    s3 s3Var2 = i3.this.b;
                    for (int i12 = 0; i12 < s3Var2.getChildCount(); i12++) {
                        KeyEvent.Callback childAt = s3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof z5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            z5 z5Var = (z5) childAt;
                            if (s3.k4(z5Var.getEditText(), f12, f13)) {
                                return;
                            }
                            if (z5Var.n() && s3.k4(z5Var.getAuthorEditText(), f12, f13)) {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (s3.k4(((i0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof p0) && s3.k4(((p0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i7;
                    if (i13 >= 0) {
                        s3.O1(s3Var2, i13, i11, i10);
                    }
                }
            });
            return;
        }
        if (i7 >= 0) {
            s3Var.post(new hi.c0(this, i7, i11, i10, 2));
            return;
        }
        View findFocus = s3Var.findFocus();
        if (findFocus instanceof e1) {
            s3Var.post(new x0((e1) findFocus, 2));
        }
    }
}
