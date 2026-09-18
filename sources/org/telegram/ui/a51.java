package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.fm0 b;

    public /* synthetic */ a51(org.telegram.ui.Components.fm0 fm0Var, int i10) {
        this.a = i10;
        this.b = fm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                du0 du0Var = secretMediaViewer.a0;
                du0Var.l0 = false;
                if (du0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) du0Var.o0.getLayoutParams()).topMargin = du0Var.m0;
                    du0Var.m0 = -1;
                    du0Var.requestLayout();
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
                du0 du0Var = ((SecretMediaViewer) this.b.b).a0;
                Method method = du0Var.f0;
                if (method != null) {
                    try {
                        method.invoke(du0Var, null);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
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
