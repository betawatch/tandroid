package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q4 e;

    public /* synthetic */ j4(q4 q4Var, float f7, float f10, int i10, int i11) {
        this.a = i11;
        this.e = q4Var;
        this.b = f7;
        this.c = f10;
        this.d = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f10 = this.b;
                float z10 = c3.i0.z(this.c, f10, f7, f10);
                q4 q4Var = this.e;
                q4Var.i.setX(z10 + (q4Var.f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                q4Var.l.setAlpha(f11);
                q4Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float z11 = c3.i0.z(this.c, f12, f7, f12);
                q4 q4Var2 = this.e;
                q4Var2.i.setX(z11 + (q4Var2.f.getWidth() - this.d));
                q4Var2.l.setAlpha(f7);
                q4Var2.j.setAlpha(f7);
                break;
        }
    }
}
