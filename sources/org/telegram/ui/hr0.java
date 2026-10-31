package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.rl0 b;

    public /* synthetic */ hr0(org.telegram.ui.Components.rl0 rl0Var, int i10) {
        this.a = i10;
        this.b = rl0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                fr0 fr0Var = photoViewer.T1;
                fr0Var.l0 = false;
                if (fr0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) fr0Var.o0.getLayoutParams()).topMargin = fr0Var.m0;
                    fr0Var.m0 = -1;
                    fr0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((PhotoViewer) this.b.b).Q1.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                fr0 fr0Var = ((PhotoViewer) this.b.b).T1;
                Method method = fr0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(fr0Var, null);
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
