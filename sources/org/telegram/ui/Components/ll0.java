package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ll0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ml0 e;

    public ll0(ml0 ml0Var, View view, int i10, float f10, float f11) {
        this.e = ml0Var;
        this.a = view;
        this.b = i10;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.y yVar = this.e.b;
        rl0 rl0Var = (rl0) yVar.b;
        if (this == rl0Var.P1) {
            rl0Var.P1 = null;
        }
        View view = this.a;
        if (view != null) {
            rl0Var.g1(view, 0.0f, 0.0f, false);
            if (((rl0) yVar.b).O1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                rl0 rl0Var2 = (rl0) yVar.b;
                hl0 hl0Var = rl0Var2.S0;
                if (hl0Var != null) {
                    hl0Var.d(i10, view);
                    return;
                }
                il0 il0Var = rl0Var2.T0;
                if (il0Var != null) {
                    il0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
