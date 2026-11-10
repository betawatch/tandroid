package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.nk0 b;

    public /* synthetic */ mz0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.a = i7;
        this.b = nk0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                yp0 yp0Var = secretMediaViewer.Y;
                yp0Var.l0 = false;
                if (yp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) yp0Var.o0.getLayoutParams()).topMargin = yp0Var.m0;
                    yp0Var.m0 = -1;
                    yp0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) this.b.b).X.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                yp0 yp0Var = ((SecretMediaViewer) this.b.b).Y;
                Method method = yp0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(yp0Var, null);
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
