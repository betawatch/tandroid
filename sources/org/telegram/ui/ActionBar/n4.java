package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class n4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ u4 e;

    public /* synthetic */ n4(u4 u4Var, float f7, float f10, int i10, int i11) {
        this.a = i11;
        this.e = u4Var;
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
                u4 u4Var = this.e;
                u4Var.i.setX(z10 + (u4Var.f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                u4Var.l.setAlpha(f11);
                u4Var.j.setAlpha(f11);
                break;
            default:
                float f12 = this.b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.c, f12, f7, f12);
                u4 u4Var2 = this.e;
                u4Var2.i.setX(z11 + (u4Var2.f.getWidth() - this.d));
                u4Var2.l.setAlpha(f7);
                u4Var2.j.setAlpha(f7);
                break;
        }
    }
}
