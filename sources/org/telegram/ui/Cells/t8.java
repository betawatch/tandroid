package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class t8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v8 c;

    public /* synthetic */ t8(v8 v8Var, int i10, int i11) {
        this.a = i11;
        this.c = v8Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v8 v8Var = this.c;
                v8Var.r = 0;
                v8Var.setBackgroundColor(this.b);
                v8Var.invalidate();
                break;
            default:
                int i10 = this.b;
                v8 v8Var2 = this.c;
                v8Var2.setBackgroundColor(i10);
                v8Var2.r = 0;
                v8Var2.invalidate();
                break;
        }
    }
}
