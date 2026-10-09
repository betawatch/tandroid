package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ kc0 c;

    public /* synthetic */ jc0(kc0 kc0Var, float f7, int i10) {
        this.a = i10;
        this.c = kc0Var;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kc0 kc0Var = this.c;
                TextView textView = kc0Var.f;
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.y6, false);
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.n6, false);
                float f7 = this.b;
                kc0Var.s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                break;
            default:
                kc0 kc0Var2 = this.c;
                TextView textView2 = kc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.y6, false);
                int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.n6, false);
                float f10 = this.b;
                kc0Var2.w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                break;
        }
    }
}
