package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ h00(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i00 i00Var = (i00) this.d;
                int i10 = this.b;
                i00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                i00Var.y = 0.0f;
                i00Var.invalidate();
                break;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.b, this.c, false);
                break;
            default:
                yh.n8 n8Var = (yh.n8) this.d;
                n8Var.c0 = this.c;
                if (n8Var.getValue() != this.b) {
                    n8Var.e(n8Var.getValue());
                }
                n8Var.invalidate();
                break;
        }
    }

    public h00(yh.n8 n8Var, float f7, int i10) {
        this.a = 2;
        this.d = n8Var;
        this.c = f7;
        this.b = i10;
    }
}
