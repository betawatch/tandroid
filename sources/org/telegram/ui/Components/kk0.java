package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kk0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ lk0 e;

    public kk0(lk0 lk0Var, View view, int i10, float f7, float f10) {
        this.e = lk0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mk0 mk0Var = this.e.b;
        tk0 tk0Var = (tk0) mk0Var.b;
        if (this == tk0Var.Q1) {
            tk0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            tk0Var.j1(view, 0.0f, 0.0f, false);
            if (((tk0) mk0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                tk0 tk0Var2 = (tk0) mk0Var.b;
                gk0 gk0Var = tk0Var2.T0;
                if (gk0Var != null) {
                    gk0Var.f(i10, view);
                    return;
                }
                hk0 hk0Var = tk0Var2.U0;
                if (hk0Var != null) {
                    hk0Var.b(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
