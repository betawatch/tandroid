package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.nm0 b;

    public /* synthetic */ kt0(org.telegram.ui.Components.nm0 nm0Var, int i10) {
        this.a = i10;
        this.b = nm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.N1.getNextView().setText((CharSequence) null);
                it0 it0Var = photoViewer.Q1;
                it0Var.i0 = false;
                if (it0Var.j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) it0Var.l0.getLayoutParams()).topMargin = it0Var.j0;
                    it0Var.j0 = -1;
                    it0Var.requestLayout();
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
                it0 it0Var = ((PhotoViewer) this.b.b).Q1;
                Method method = it0Var.c0;
                if (method != null) {
                    try {
                        method.invoke(it0Var, null);
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
