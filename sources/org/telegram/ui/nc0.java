package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ oc0 c;

    public /* synthetic */ nc0(oc0 oc0Var, float f7, int i10) {
        this.a = i10;
        this.c = oc0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                oc0 oc0Var = this.c;
                TextView textView = oc0Var.f;
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.y6, false);
                int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.n6, false);
                float f7 = this.b;
                oc0Var.s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                break;
            default:
                oc0 oc0Var2 = this.c;
                TextView textView2 = oc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.y6, false);
                int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.n6, false);
                float f10 = this.b;
                oc0Var2.w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                break;
        }
    }
}
