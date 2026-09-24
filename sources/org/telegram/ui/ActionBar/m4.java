package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class m4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t4 e;

    public /* synthetic */ m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.a = i11;
        this.e = t4Var;
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
                t4 t4Var = this.e;
                t4Var.i.setX(z10 + (t4Var.f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.l.setAlpha(f11);
                t4Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.c, f12, f7, f12);
                t4 t4Var2 = this.e;
                t4Var2.i.setX(z11 + (t4Var2.f.getWidth() - this.d));
                t4Var2.l.setAlpha(f7);
                t4Var2.j.setAlpha(f7);
                break;
        }
    }
}
