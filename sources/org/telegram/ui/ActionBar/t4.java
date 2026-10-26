package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ a5 e;

    public /* synthetic */ t4(a5 a5Var, float f7, float f10, int i10, int i11) {
        this.a = i11;
        this.e = a5Var;
        this.b = f7;
        this.c = f10;
        this.d = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f10 = this.b;
                float z10 = c3.h0.z(this.c, f10, f7, f10);
                a5 a5Var = this.e;
                a5Var.i.setX(z10 + (a5Var.f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                a5Var.l.setAlpha(f11);
                a5Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float z11 = c3.h0.z(this.c, f12, f7, f12);
                a5 a5Var2 = this.e;
                a5Var2.i.setX(z11 + (a5Var2.f.getWidth() - this.d));
                a5Var2.l.setAlpha(f7);
                a5Var2.j.setAlpha(f7);
                break;
        }
    }
}
