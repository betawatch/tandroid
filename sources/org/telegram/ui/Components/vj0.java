package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class vj0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ wj0 e;

    public vj0(wj0 wj0Var, View view, int i7, float f10, float f11) {
        this.e = wj0Var;
        this.a = view;
        this.b = i7;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj0 xj0Var = this.e.b;
        ek0 ek0Var = (ek0) xj0Var.b;
        if (this == ek0Var.R1) {
            ek0Var.R1 = null;
        }
        View view = this.a;
        if (view != null) {
            ek0Var.j1(view, 0.0f, 0.0f, false);
            if (((ek0) xj0Var.b).Q1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i7 = this.b;
            if (i7 != -1) {
                ek0 ek0Var2 = (ek0) xj0Var.b;
                qj0 qj0Var = ek0Var2.U0;
                if (qj0Var != null) {
                    qj0Var.c(i7, view);
                    return;
                }
                rj0 rj0Var = ek0Var2.V0;
                if (rj0Var != null) {
                    rj0Var.f(this.c - view.getX(), this.d - view.getY(), i7, view);
                }
            }
        }
    }
}
