package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class gj0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ hj0 e;

    public gj0(hj0 hj0Var, View view, int i7, float f10, float f11) {
        this.e = hj0Var;
        this.a = view;
        this.b = i7;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ij0 ij0Var = this.e.b;
        pj0 pj0Var = (pj0) ij0Var.b;
        if (this == pj0Var.Q1) {
            pj0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            pj0Var.j1(view, 0.0f, 0.0f, false);
            if (((pj0) ij0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i7 = this.b;
            if (i7 != -1) {
                pj0 pj0Var2 = (pj0) ij0Var.b;
                bj0 bj0Var = pj0Var2.T0;
                if (bj0Var != null) {
                    bj0Var.c(i7, view);
                    return;
                }
                cj0 cj0Var = pj0Var2.U0;
                if (cj0Var != null) {
                    cj0Var.f(this.c - view.getX(), this.d - view.getY(), i7, view);
                }
            }
        }
    }
}
