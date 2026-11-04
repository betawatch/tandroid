package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ i4 e;

    public /* synthetic */ a4(i4 i4Var, float f10, float f11, int i3, int i10) {
        this.a = i10;
        this.e = i4Var;
        this.b = f10;
        this.c = f11;
        this.d = i3;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f11 = this.b;
                float y9 = com.google.android.recaptcha.internal.a.y(this.c, f11, f10, f11);
                i4 i4Var = this.e;
                i4Var.i.setX(y9 + (i4Var.f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                i4Var.l.setAlpha(f12);
                i4Var.j.setAlpha(f12);
                break;
            default:
                float f13 = this.b;
                float y10 = com.google.android.recaptcha.internal.a.y(this.c, f13, f10, f13);
                i4 i4Var2 = this.e;
                i4Var2.i.setX(y10 + (i4Var2.f.getWidth() - this.d));
                i4Var2.l.setAlpha(f10);
                i4Var2.j.setAlpha(f10);
                break;
        }
    }
}
