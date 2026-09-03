package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ec0 c;

    public /* synthetic */ dc0(ec0 ec0Var, float f10, int i10) {
        this.a = i10;
        this.c = ec0Var;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ec0 ec0Var = this.c;
                TextView textView = ec0Var.f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f10 = this.b;
                ec0Var.s = f10;
                textView.setTextColor(i0.a.d(f10, w02, w03));
                break;
            default:
                ec0 ec0Var2 = this.c;
                TextView textView2 = ec0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n6, false);
                float f11 = this.b;
                ec0Var2.w = f11;
                textView2.setTextColor(i0.a.d(f11, w04, w05));
                break;
        }
    }
}
