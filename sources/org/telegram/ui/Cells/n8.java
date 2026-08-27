package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ p8 c;

    public /* synthetic */ n8(p8 p8Var, int i10, int i11) {
        this.a = i11;
        this.c = p8Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p8 p8Var = this.c;
                p8Var.r = 0;
                p8Var.setBackgroundColor(this.b);
                p8Var.invalidate();
                break;
            default:
                int i10 = this.b;
                p8 p8Var2 = this.c;
                p8Var2.setBackgroundColor(i10);
                p8Var2.r = 0;
                p8Var2.invalidate();
                break;
        }
    }
}
