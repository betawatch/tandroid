package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class iz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.nk0 b;

    public /* synthetic */ iz0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.a = i7;
        this.b = nk0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                vp0 vp0Var = secretMediaViewer.Y;
                vp0Var.l0 = false;
                if (vp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) vp0Var.o0.getLayoutParams()).topMargin = vp0Var.m0;
                    vp0Var.m0 = -1;
                    vp0Var.requestLayout();
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
                vp0 vp0Var = ((SecretMediaViewer) this.b.b).Y;
                Method method = vp0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(vp0Var, null);
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
