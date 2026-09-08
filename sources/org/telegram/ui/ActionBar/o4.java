package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class o4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ v4 e;

    public /* synthetic */ o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.a = i11;
        this.e = v4Var;
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
                v4 v4Var = this.e;
                v4Var.i.setX(z10 + (v4Var.f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.l.setAlpha(f11);
                v4Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.c, f12, f7, f12);
                v4 v4Var2 = this.e;
                v4Var2.i.setX(z11 + (v4Var2.f.getWidth() - this.d));
                v4Var2.l.setAlpha(f7);
                v4Var2.j.setAlpha(f7);
                break;
        }
    }
}
