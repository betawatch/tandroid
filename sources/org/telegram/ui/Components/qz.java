package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ qz(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rz rzVar = (rz) this.d;
                int i10 = this.b;
                rzVar.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                rzVar.D = 0.0f;
                rzVar.invalidate();
                break;
            case 1:
                ((org.telegram.ui.web.l1) this.d).c(this.b, this.c, false);
                break;
            default:
                rh.v8 v8Var = (rh.v8) this.d;
                v8Var.c0 = this.c;
                if (v8Var.getValue() != this.b) {
                    v8Var.e(v8Var.getValue());
                }
                v8Var.invalidate();
                break;
        }
    }

    public qz(rh.v8 v8Var, float f7, int i10) {
        this.a = 2;
        this.d = v8Var;
        this.c = f7;
        this.b = i10;
    }
}
