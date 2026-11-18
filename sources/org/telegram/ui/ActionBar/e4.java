package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ k4 e;

    public /* synthetic */ e4(k4 k4Var, float f10, float f11, int i7, int i10) {
        this.a = i10;
        this.e = k4Var;
        this.b = f10;
        this.c = f11;
        this.d = i7;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f11 = this.b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.c, f11, f10, f11);
                k4 k4Var = this.e;
                k4Var.i.setX(z10 + (k4Var.f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                k4Var.l.setAlpha(f12);
                k4Var.j.setAlpha(f12);
                break;
            default:
                float f13 = this.b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.c, f13, f10, f13);
                k4 k4Var2 = this.e;
                k4Var2.i.setX(z11 + (k4Var2.f.getWidth() - this.d));
                k4Var2.l.setAlpha(f10);
                k4Var2.j.setAlpha(f10);
                break;
        }
    }
}
