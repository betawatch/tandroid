package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a4 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g4 e;

    public /* synthetic */ a4(g4 g4Var, float f10, float f11, int i7, int i10) {
        this.a = i10;
        this.e = g4Var;
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
                g4 g4Var = this.e;
                g4Var.i.setX(z10 + (g4Var.f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                g4Var.l.setAlpha(f12);
                g4Var.j.setAlpha(f12);
                break;
            default:
                float f13 = this.b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.c, f13, f10, f13);
                g4 g4Var2 = this.e;
                g4Var2.i.setX(z11 + (g4Var2.f.getWidth() - this.d));
                g4Var2.l.setAlpha(f10);
                g4Var2.j.setAlpha(f10);
                break;
        }
    }
}
