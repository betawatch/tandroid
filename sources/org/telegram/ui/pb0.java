package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class pb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qb0 c;

    public /* synthetic */ pb0(qb0 qb0Var, float f7, int i10) {
        this.a = i10;
        this.c = qb0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qb0 qb0Var = this.c;
                TextView textView = qb0Var.f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.n6, false);
                float f7 = this.b;
                qb0Var.s = f7;
                textView.setTextColor(i0.b.f(f7, x02, x03));
                break;
            default:
                qb0 qb0Var2 = this.c;
                TextView textView2 = qb0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.n6, false);
                float f10 = this.b;
                qb0Var2.w = f10;
                textView2.setTextColor(i0.b.f(f10, x04, x05));
                break;
        }
    }
}
