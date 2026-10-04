package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class k00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ k00(View view, int i10, float f7, int i11) {
        this.a = i11;
        this.d = view;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l00 l00Var = (l00) this.d;
                int i10 = this.b;
                l00Var.b(i10 == 5 ? 0.0f : -this.c, i10 + 1);
                l00Var.y = 0.0f;
                l00Var.invalidate();
                break;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.b, this.c, false);
                break;
            default:
                yh.m8 m8Var = (yh.m8) this.d;
                m8Var.c0 = this.c;
                if (m8Var.getValue() != this.b) {
                    m8Var.e(m8Var.getValue());
                }
                m8Var.invalidate();
                break;
        }
    }

    public k00(yh.m8 m8Var, float f7, int i10) {
        this.a = 2;
        this.d = m8Var;
        this.c = f7;
        this.b = i10;
    }
}
