package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ w4 e;

    public /* synthetic */ p4(w4 w4Var, float f7, float f10, int i10, int i11) {
        this.a = i11;
        this.e = w4Var;
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
                w4 w4Var = this.e;
                w4Var.i.setX(z10 + (w4Var.f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                w4Var.l.setAlpha(f11);
                w4Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.c, f12, f7, f12);
                w4 w4Var2 = this.e;
                w4Var2.i.setX(z11 + (w4Var2.f.getWidth() - this.d));
                w4Var2.l.setAlpha(f7);
                w4Var2.j.setAlpha(f7);
                break;
        }
    }
}
