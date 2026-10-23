package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class r4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ y4 e;

    public /* synthetic */ r4(y4 y4Var, float f7, float f10, int i10, int i11) {
        this.a = i11;
        this.e = y4Var;
        this.b = f7;
        this.c = f10;
        this.d = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f10 = this.b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(this.c, f10, f7, f10);
                y4 y4Var = this.e;
                y4Var.i.setX(y3 + (y4Var.f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                y4Var.l.setAlpha(f11);
                y4Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float y10 = com.google.android.gms.internal.play_billing.k3.y(this.c, f12, f7, f12);
                y4 y4Var2 = this.e;
                y4Var2.i.setX(y10 + (y4Var2.f.getWidth() - this.d));
                y4Var2.l.setAlpha(f7);
                y4Var2.j.setAlpha(f7);
                break;
        }
    }
}
