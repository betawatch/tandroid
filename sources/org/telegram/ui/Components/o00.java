package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ o00(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p00 p00Var = (p00) this.d;
                int i10 = this.b;
                p00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                p00Var.y = 0.0f;
                p00Var.invalidate();
                break;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.b, this.c, false);
                break;
            default:
                xh.o8 o8Var = (xh.o8) this.d;
                o8Var.c0 = this.c;
                if (o8Var.getValue() != this.b) {
                    o8Var.e(o8Var.getValue());
                }
                o8Var.invalidate();
                break;
        }
    }

    public o00(xh.o8 o8Var, float f7, int i10) {
        this.a = 2;
        this.d = o8Var;
        this.c = f7;
        this.b = i10;
    }
}
