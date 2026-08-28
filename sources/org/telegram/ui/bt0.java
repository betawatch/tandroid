package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.pl0 b;

    public /* synthetic */ bt0(org.telegram.ui.Components.pl0 pl0Var, int i9) {
        this.a = i9;
        this.b = pl0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.M1.getNextView().setText((CharSequence) null);
                zs0 zs0Var = photoViewer.P1;
                zs0Var.h0 = false;
                if (zs0Var.i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) zs0Var.k0.getLayoutParams()).topMargin = zs0Var.i0;
                    zs0Var.i0 = -1;
                    zs0Var.requestLayout();
                    break;
                }
                break;
            default:
                ((PhotoViewer) this.b.b).M1.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                zs0 zs0Var = ((PhotoViewer) this.b.b).P1;
                Method method = zs0Var.b0;
                if (method != null) {
                    try {
                        method.invoke(zs0Var, null);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
