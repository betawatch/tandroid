package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t4 e;

    public /* synthetic */ m4(t4 t4Var, float f10, float f11, int i10, int i11) {
        this.a = i11;
        this.e = t4Var;
        this.b = f10;
        this.c = f11;
        this.d = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f11 = this.b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.c, f11, f10, f11);
                t4 t4Var = this.e;
                t4Var.i.setX(z10 + (t4Var.f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                t4Var.l.setAlpha(f12);
                t4Var.j.setAlpha(f12);
                break;
            default:
                float f13 = this.b;
                float z11 = com.google.android.recaptcha.internal.a.z(this.c, f13, f10, f13);
                t4 t4Var2 = this.e;
                t4Var2.i.setX(z11 + (t4Var2.f.getWidth() - this.d));
                t4Var2.l.setAlpha(f10);
                t4Var2.j.setAlpha(f10);
                break;
        }
    }
}
