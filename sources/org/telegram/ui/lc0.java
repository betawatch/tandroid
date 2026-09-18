package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class lc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ mc0 c;

    public /* synthetic */ lc0(mc0 mc0Var, float f7, int i10) {
        this.a = i10;
        this.c = mc0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                mc0 mc0Var = this.c;
                TextView textView = mc0Var.f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f7 = this.b;
                mc0Var.s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                break;
            default:
                mc0 mc0Var2 = this.c;
                TextView textView2 = mc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f10 = this.b;
                mc0Var2.w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                break;
        }
    }
}
