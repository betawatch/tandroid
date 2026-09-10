package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ x4 e;

    public /* synthetic */ q4(x4 x4Var, float f7, float f10, int i10, int i11) {
        this.a = i11;
        this.e = x4Var;
        this.b = f7;
        this.c = f10;
        this.d = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f10 = this.b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.c, f10, f7, f10);
                x4 x4Var = this.e;
                x4Var.i.setX(z10 + (x4Var.f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                x4Var.l.setAlpha(f11);
                x4Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.c, f12, f7, f12);
                x4 x4Var2 = this.e;
                x4Var2.i.setX(z11 + (x4Var2.f.getWidth() - this.d));
                x4Var2.l.setAlpha(f7);
                x4Var2.j.setAlpha(f7);
                break;
        }
    }
}
