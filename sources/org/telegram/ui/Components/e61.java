package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p61 b;

    public /* synthetic */ e61(p61 p61Var, int i7) {
        this.a = i7;
        this.b = p61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p61 p61Var = this.b;
                View[] viewArr = p61Var.e;
                View[] viewArr2 = p61Var.e;
                if (viewArr[1] != null) {
                    p61Var.G();
                    p61Var.h.put(p61Var.f[1], viewArr2[1]);
                    p61Var.removeView(viewArr2[1]);
                    p61Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                p61Var.S = null;
                p61Var.x(true);
                f61 f61Var = p61Var.M;
                if (f61Var != null) {
                    f61Var.w.invalidate();
                    p61Var.M.w.g1();
                    p61Var.M.invalidate();
                }
                p61Var.u();
                p61Var.J.e();
                break;
            case 1:
                p61 p61Var2 = this.b;
                p61Var2.x = null;
                View[] viewArr3 = p61Var2.e;
                if (viewArr3[1] != null) {
                    if (!p61Var2.F) {
                        p61Var2.G();
                    }
                    p61Var2.h.put(p61Var2.f[1], viewArr3[1]);
                    p61Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                p61Var2.y = false;
                p61Var2.I = false;
                f61 f61Var2 = p61Var2.M;
                if (f61Var2 != null) {
                    f61Var2.setEnabled(true);
                }
                p61Var2.x(false);
                p61Var2.u();
                p61Var2.J.e();
                break;
            case 2:
                p61 p61Var3 = this.b;
                p61Var3.x = null;
                View[] viewArr4 = p61Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    p61Var3.removeView(view);
                    viewArr4[1] = null;
                }
                p61Var3.y = false;
                f61 f61Var3 = p61Var3.M;
                if (f61Var3 != null) {
                    f61Var3.setEnabled(true);
                    f61 f61Var4 = p61Var3.M;
                    f61Var4.J = false;
                    f61Var4.a = 1.0f;
                    f61Var4.w.g1();
                    p61Var3.M.invalidate();
                    break;
                }
                break;
            default:
                p61 p61Var4 = this.b;
                p61Var4.x = null;
                View[] viewArr5 = p61Var4.e;
                if (viewArr5[1] != null) {
                    if (!p61Var4.F) {
                        p61Var4.G();
                    }
                    p61Var4.h.put(p61Var4.f[1], viewArr5[1]);
                    p61Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                p61Var4.y = false;
                p61Var4.I = false;
                f61 f61Var5 = p61Var4.M;
                if (f61Var5 != null) {
                    f61Var5.setEnabled(true);
                }
                p61Var4.x(false);
                p61Var4.u();
                p61Var4.J.e();
                break;
        }
    }
}
