package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ i4 e;

    public /* synthetic */ c4(i4 i4Var, float f10, float f11, int i7, int i10) {
        this.a = i10;
        this.e = i4Var;
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
                i4 i4Var = this.e;
                i4Var.i.setX(z9 + (i4Var.f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                i4Var.l.setAlpha(f12);
                i4Var.j.setAlpha(f12);
                break;
            default:
                float f13 = this.b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.c, f13, f10, f13);
                i4 i4Var2 = this.e;
                i4Var2.i.setX(z10 + (i4Var2.f.getWidth() - this.d));
                i4Var2.l.setAlpha(f10);
                i4Var2.j.setAlpha(f10);
                break;
        }
    }
}
