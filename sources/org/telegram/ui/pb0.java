package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qb0 c;

    public /* synthetic */ pb0(qb0 qb0Var, float f10, int i9) {
        this.a = i9;
        this.c = qb0Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qb0 qb0Var = this.c;
                TextView textView = qb0Var.f;
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y6, false);
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n6, false);
                float f10 = this.b;
                qb0Var.s = f10;
                textView.setTextColor(i0.a.d(f10, w02, w03));
                break;
            default:
                qb0 qb0Var2 = this.c;
                TextView textView2 = qb0Var2.d;
                int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y6, false);
                int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n6, false);
                float f11 = this.b;
                qb0Var2.w = f11;
                textView2.setTextColor(i0.a.d(f11, w04, w05));
                break;
        }
    }
}
