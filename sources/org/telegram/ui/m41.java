package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.lm0 b;

    public /* synthetic */ m41(org.telegram.ui.Components.lm0 lm0Var, int i10) {
        this.a = i10;
        this.b = lm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b.b;
                secretMediaViewer.W.getNextView().setText((CharSequence) null);
                nt0 nt0Var = secretMediaViewer.X;
                nt0Var.i0 = false;
                if (nt0Var.j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) nt0Var.l0.getLayoutParams()).topMargin = nt0Var.j0;
                    nt0Var.j0 = -1;
                    nt0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((SecretMediaViewer) this.b.b).W.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                nt0 nt0Var = ((SecretMediaViewer) this.b.b).X;
                Method method = nt0Var.c0;
                if (method != null) {
                    try {
                        method.invoke(nt0Var, null);
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
