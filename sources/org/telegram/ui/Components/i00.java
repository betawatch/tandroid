package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ i00(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j00 j00Var = (j00) this.d;
                int i10 = this.b;
                j00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                j00Var.y = 0.0f;
                j00Var.invalidate();
                break;
            case 1:
                ((org.telegram.ui.web.u1) this.d).c(this.b, this.c, false);
                break;
            default:
                yh.l8 l8Var = (yh.l8) this.d;
                l8Var.c0 = this.c;
                if (l8Var.getValue() != this.b) {
                    l8Var.e(l8Var.getValue());
                }
                l8Var.invalidate();
                break;
        }
    }

    public i00(yh.l8 l8Var, float f7, int i10) {
        this.a = 2;
        this.d = l8Var;
        this.c = f7;
        this.b = i10;
    }
}
