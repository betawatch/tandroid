package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ n81(z81 z81Var, int i10) {
        this.a = i10;
        this.b = z81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z81 z81Var = this.b;
                View[] viewArr = z81Var.e;
                View[] viewArr2 = z81Var.e;
                if (viewArr[1] != null) {
                    z81Var.G();
                    z81Var.h.put(z81Var.f[1], viewArr2[1]);
                    z81Var.removeView(viewArr2[1]);
                    z81Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                z81Var.R = null;
                z81Var.x(true);
                o81 o81Var = z81Var.M;
                if (o81Var != null) {
                    o81Var.v.invalidate();
                    z81Var.M.v.g1();
                    z81Var.M.invalidate();
                }
                z81Var.u();
                z81Var.J.unlock();
                break;
            case 1:
                z81 z81Var2 = this.b;
                z81Var2.w = null;
                View[] viewArr3 = z81Var2.e;
                if (viewArr3[1] != null) {
                    if (!z81Var2.F) {
                        z81Var2.G();
                    }
                    z81Var2.h.put(z81Var2.f[1], viewArr3[1]);
                    z81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                z81Var2.x = false;
                z81Var2.I = false;
                o81 o81Var2 = z81Var2.M;
                if (o81Var2 != null) {
                    o81Var2.setEnabled(true);
                }
                z81Var2.x(false);
                z81Var2.u();
                z81Var2.J.unlock();
                break;
            case 2:
                z81 z81Var3 = this.b;
                z81Var3.w = null;
                View[] viewArr4 = z81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    z81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                z81Var3.x = false;
                o81 o81Var3 = z81Var3.M;
                if (o81Var3 != null) {
                    o81Var3.setEnabled(true);
                    o81 o81Var4 = z81Var3.M;
                    o81Var4.J = false;
                    o81Var4.a = 1.0f;
                    o81Var4.v.g1();
                    z81Var3.M.invalidate();
                    break;
                }
                break;
            default:
                z81 z81Var4 = this.b;
                z81Var4.w = null;
                View[] viewArr5 = z81Var4.e;
                if (viewArr5[1] != null) {
                    if (!z81Var4.F) {
                        z81Var4.G();
                    }
                    z81Var4.h.put(z81Var4.f[1], viewArr5[1]);
                    z81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                z81Var4.x = false;
                z81Var4.I = false;
                o81 o81Var5 = z81Var4.M;
                if (o81Var5 != null) {
                    o81Var5.setEnabled(true);
                }
                z81Var4.x(false);
                z81Var4.u();
                z81Var4.J.unlock();
                break;
        }
    }
}
