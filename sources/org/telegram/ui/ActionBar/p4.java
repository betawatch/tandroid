package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ w4 e;

    public /* synthetic */ p4(w4 w4Var, float f10, float f11, int i10, int i11) {
        this.a = i11;
        this.e = w4Var;
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
                w4 w4Var = this.e;
                w4Var.i.setX(w10 + (w4Var.f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                w4Var.l.setAlpha(f12);
                w4Var.j.setAlpha(f12);
                break;
            default:
                float f13 = this.b;
                float w11 = e2.c.w(this.c, f13, f10, f13);
                w4 w4Var2 = this.e;
                w4Var2.i.setX(w11 + (w4Var2.f.getWidth() - this.d));
                w4Var2.l.setAlpha(f10);
                w4Var2.j.setAlpha(f10);
                break;
        }
    }
}
