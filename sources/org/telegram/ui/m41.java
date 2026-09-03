package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.mm0 b;

    public /* synthetic */ m41(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.a = i10;
        this.b = mm0Var;
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
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
