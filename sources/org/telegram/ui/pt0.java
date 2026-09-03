package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.lm0 b;

    public /* synthetic */ pt0(org.telegram.ui.Components.lm0 lm0Var, int i10) {
        this.a = i10;
        this.b = lm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.N1.getNextView().setText((CharSequence) null);
                nt0 nt0Var = photoViewer.Q1;
                nt0Var.i0 = false;
                if (nt0Var.j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) nt0Var.l0.getLayoutParams()).topMargin = nt0Var.j0;
                    nt0Var.j0 = -1;
                    nt0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((PhotoViewer) this.b.b).N1.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                nt0 nt0Var = ((PhotoViewer) this.b.b).Q1;
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
