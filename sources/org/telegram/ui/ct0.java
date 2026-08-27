package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ct0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.sl0 b;

    public /* synthetic */ ct0(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.a = i10;
        this.b = sl0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b.b;
                photoViewer.M1.getNextView().setText((CharSequence) null);
                at0 at0Var = photoViewer.P1;
                at0Var.h0 = false;
                if (at0Var.i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) at0Var.k0.getLayoutParams()).topMargin = at0Var.i0;
                    at0Var.i0 = -1;
                    at0Var.requestLayout();
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
                at0 at0Var = ((PhotoViewer) this.b.b).P1;
                Method method = at0Var.b0;
                if (method != null) {
                    try {
                        method.invoke(at0Var, null);
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
