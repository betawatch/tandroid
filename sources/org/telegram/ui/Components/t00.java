package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ t00(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u00 u00Var = (u00) this.d;
                int i10 = this.b;
                u00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                u00Var.y = 0.0f;
                u00Var.invalidate();
                break;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.b, this.c, false);
                break;
            default:
                zh.e8 e8Var = (zh.e8) this.d;
                e8Var.c0 = this.c;
                if (e8Var.getValue() != this.b) {
                    e8Var.e(e8Var.getValue());
                }
                e8Var.invalidate();
                break;
        }
    }

    public t00(zh.e8 e8Var, float f7, int i10) {
        this.a = 2;
        this.d = e8Var;
        this.c = f7;
        this.b = i10;
    }
}
