package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.em0 b;

    public /* synthetic */ a51(org.telegram.ui.Components.em0 em0Var, int i10) {
        this.a = i10;
        this.b = em0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                au0 au0Var = secretMediaViewer.a0;
                au0Var.l0 = false;
                if (au0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) au0Var.o0.getLayoutParams()).topMargin = au0Var.m0;
                    au0Var.m0 = -1;
                    au0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) this.b.b).Z.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                au0 au0Var = ((SecretMediaViewer) this.b.b).a0;
                Method method = au0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(au0Var, null);
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
