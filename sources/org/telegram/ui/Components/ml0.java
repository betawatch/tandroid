package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ml0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ nl0 e;

    public ml0(nl0 nl0Var, View view, int i10, float f10, float f11) {
        this.e = nl0Var;
        this.a = view;
        this.b = i10;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.y yVar = this.e.b;
        sl0 sl0Var = (sl0) yVar.b;
        if (this == sl0Var.P1) {
            sl0Var.P1 = null;
        }
        View view = this.a;
        if (view != null) {
            sl0Var.h1(view, 0.0f, 0.0f, false);
            if (((sl0) yVar.b).O1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                sl0 sl0Var2 = (sl0) yVar.b;
                il0 il0Var = sl0Var2.S0;
                if (il0Var != null) {
                    il0Var.f(i10, view);
                    return;
                }
                jl0 jl0Var = sl0Var2.T0;
                if (jl0Var != null) {
                    jl0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
