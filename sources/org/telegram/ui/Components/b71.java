package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n71 b;

    public /* synthetic */ b71(n71 n71Var, int i9) {
        this.a = i9;
        this.b = n71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n71 n71Var = this.b;
                View[] viewArr = n71Var.e;
                View[] viewArr2 = n71Var.e;
                if (viewArr[1] != null) {
                    n71Var.F();
                    n71Var.h.put(n71Var.f[1], viewArr2[1]);
                    n71Var.removeView(viewArr2[1]);
                    n71Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                n71Var.M = null;
                n71Var.w(true);
                c71 c71Var = n71Var.I;
                if (c71Var != null) {
                    c71Var.v.invalidate();
                    n71Var.I.v.f1();
                    n71Var.I.invalidate();
                }
                n71Var.u();
                n71Var.F.unlock();
                break;
            case 1:
                n71 n71Var2 = this.b;
                n71Var2.w = null;
                View[] viewArr3 = n71Var2.e;
                if (viewArr3[1] != null) {
                    if (!n71Var2.B) {
                        n71Var2.F();
                    }
                    n71Var2.h.put(n71Var2.f[1], viewArr3[1]);
                    n71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                n71Var2.x = false;
                n71Var2.E = false;
                c71 c71Var2 = n71Var2.I;
                if (c71Var2 != null) {
                    c71Var2.setEnabled(true);
                }
                n71Var2.w(false);
                n71Var2.u();
                n71Var2.F.unlock();
                break;
            case 2:
                n71 n71Var3 = this.b;
                n71Var3.w = null;
                View[] viewArr4 = n71Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    n71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                n71Var3.x = false;
                c71 c71Var3 = n71Var3.I;
                if (c71Var3 != null) {
                    c71Var3.setEnabled(true);
                    c71 c71Var4 = n71Var3.I;
                    c71Var4.F = false;
                    c71Var4.a = 1.0f;
                    c71Var4.v.f1();
                    n71Var3.I.invalidate();
                    break;
                }
                break;
            default:
                n71 n71Var4 = this.b;
                n71Var4.w = null;
                View[] viewArr5 = n71Var4.e;
                if (viewArr5[1] != null) {
                    if (!n71Var4.B) {
                        n71Var4.F();
                    }
                    n71Var4.h.put(n71Var4.f[1], viewArr5[1]);
                    n71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                n71Var4.x = false;
                n71Var4.E = false;
                c71 c71Var5 = n71Var4.I;
                if (c71Var5 != null) {
                    c71Var5.setEnabled(true);
                }
                n71Var4.w(false);
                n71Var4.u();
                n71Var4.F.unlock();
                break;
        }
    }
}
