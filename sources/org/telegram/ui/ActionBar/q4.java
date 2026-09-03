package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ x4 e;

    public /* synthetic */ q4(x4 x4Var, float f10, float f11, int i10, int i11) {
        this.a = i11;
        this.e = x4Var;
        this.b = f10;
        this.c = f11;
        this.d = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.a) {
            case 0:
                float f11 = this.b;
                float w10 = e2.c.w(this.c, f11, f10, f11);
                x4 x4Var = this.e;
                x4Var.i.setX(w10 + (x4Var.f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                x4Var.l.setAlpha(f12);
                x4Var.j.setAlpha(f12);
                break;
            default:
                float f13 = this.b;
                float w11 = e2.c.w(this.c, f13, f10, f13);
                x4 x4Var2 = this.e;
                x4Var2.i.setX(w11 + (x4Var2.f.getWidth() - this.d));
                x4Var2.l.setAlpha(f10);
                x4Var2.j.setAlpha(f10);
                break;
        }
    }
}
