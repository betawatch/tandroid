package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ dc0 c;

    public /* synthetic */ cc0(dc0 dc0Var, float f10, int i10) {
        this.a = i10;
        this.c = dc0Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                dc0 dc0Var = this.c;
                TextView textView = dc0Var.f;
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y6, false);
                int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.n6, false);
                float f10 = this.b;
                dc0Var.s = f10;
                textView.setTextColor(i0.a.d(f10, w02, w03));
                break;
            default:
                dc0 dc0Var2 = this.c;
                TextView textView2 = dc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y6, false);
                int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.n6, false);
                float f11 = this.b;
                dc0Var2.w = f11;
                textView2.setTextColor(i0.a.d(f11, w04, w05));
                break;
        }
    }
}
