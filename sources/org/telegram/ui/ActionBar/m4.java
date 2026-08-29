package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t4 e;

    public /* synthetic */ m4(t4 t4Var, float f9, float f10, int i10, int i11) {
        this.a = i11;
        this.e = t4Var;
        this.b = f9;
        this.c = f10;
        this.d = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f9, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f10 = this.b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.c, f10, f9, f10);
                t4 t4Var = this.e;
                t4Var.i.setX(z10 + (t4Var.f.getWidth() - this.d));
                float f11 = 1.0f - f9;
                t4Var.l.setAlpha(f11);
                t4Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float z11 = com.google.android.recaptcha.internal.a.z(this.c, f12, f9, f12);
                t4 t4Var2 = this.e;
                t4Var2.i.setX(z11 + (t4Var2.f.getWidth() - this.d));
                t4Var2.l.setAlpha(f9);
                t4Var2.j.setAlpha(f9);
                break;
        }
    }
}
