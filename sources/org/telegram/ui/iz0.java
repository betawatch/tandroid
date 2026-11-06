package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                up0 up0Var = secretMediaViewer.Y;
                up0Var.l0 = false;
                if (up0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) up0Var.o0.getLayoutParams()).topMargin = up0Var.m0;
                    up0Var.m0 = -1;
                    up0Var.requestLayout();
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
                up0 up0Var = ((SecretMediaViewer) this.b.b).Y;
                Method method = up0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(up0Var, null);
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
