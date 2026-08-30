package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ cc0 c;

    public /* synthetic */ bc0(cc0 cc0Var, float f10, int i10) {
        this.a = i10;
        this.c = cc0Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                cc0 cc0Var = this.c;
                TextView textView = cc0Var.f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f10 = this.b;
                cc0Var.s = f10;
                textView.setTextColor(i0.a.d(f10, w02, w03));
                break;
            default:
                cc0 cc0Var2 = this.c;
                TextView textView2 = cc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f11 = this.b;
                cc0Var2.w = f11;
                textView2.setTextColor(i0.a.d(f11, w04, w05));
                break;
        }
    }
}
