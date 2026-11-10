package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ j4 e;

    public /* synthetic */ d4(j4 j4Var, float f10, float f11, int i7, int i10) {
        this.a = i10;
        this.e = j4Var;
        this.b = f10;
        this.c = f11;
        this.d = i7;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f11 = this.b;
                float z9 = com.google.android.recaptcha.internal.a.z(this.c, f11, f10, f11);
                j4 j4Var = this.e;
                j4Var.i.setX(z9 + (j4Var.f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                j4Var.l.setAlpha(f12);
                j4Var.j.setAlpha(f12);
                break;
            default:
                float f13 = this.b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.c, f13, f10, f13);
                j4 j4Var2 = this.e;
                j4Var2.i.setX(z10 + (j4Var2.f.getWidth() - this.d));
                j4Var2.l.setAlpha(f10);
                j4Var2.j.setAlpha(f10);
                break;
        }
    }
}
