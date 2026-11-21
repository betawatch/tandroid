package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.yp b;

    public jk(org.telegram.ui.yp ypVar) {
        this.b = ypVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((lk) this.b.d).V.e();
                break;
            default:
                org.telegram.ui.yp ypVar = this.b;
                View view = ypVar.b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((lk) ypVar.d).Y.r.removeView(view);
                break;
        }
    }

    public jk(org.telegram.ui.yp ypVar, v4.p0 p0Var) {
        this.b = ypVar;
    }
}
