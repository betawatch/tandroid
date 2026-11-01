package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lk0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ mk0 e;

    public lk0(mk0 mk0Var, View view, int i10, float f7, float f10) {
        this.e = mk0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nk0 nk0Var = this.e.b;
        uk0 uk0Var = (uk0) nk0Var.b;
        if (this == uk0Var.Q1) {
            uk0Var.Q1 = null;
        }
        View view = this.a;
        if (view != null) {
            uk0Var.j1(view, 0.0f, 0.0f, false);
            if (((uk0) nk0Var.b).P1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                uk0 uk0Var2 = (uk0) nk0Var.b;
                hk0 hk0Var = uk0Var2.T0;
                if (hk0Var != null) {
                    hk0Var.f(i10, view);
                    return;
                }
                ik0 ik0Var = uk0Var2.U0;
                if (ik0Var != null) {
                    ik0Var.b(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
