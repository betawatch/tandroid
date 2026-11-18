package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.al0 b;

    public /* synthetic */ kz0(org.telegram.ui.Components.al0 al0Var, int i7) {
        this.a = i7;
        this.b = al0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                wp0 wp0Var = secretMediaViewer.Z;
                wp0Var.m0 = false;
                if (wp0Var.n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) wp0Var.p0.getLayoutParams()).topMargin = wp0Var.n0;
                    wp0Var.n0 = -1;
                    wp0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) this.b.b).Y.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                wp0 wp0Var = ((SecretMediaViewer) this.b.b).Z;
                Method method = wp0Var.g0;
                if (method != null) {
                    try {
                        method.invoke(wp0Var, null);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
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
