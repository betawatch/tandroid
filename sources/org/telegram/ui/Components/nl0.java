package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nl0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ol0 e;

    public nl0(ol0 ol0Var, View view, int i10, float f10, float f11) {
        this.e = ol0Var;
        this.a = view;
        this.b = i10;
        this.c = f10;
        this.d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.y yVar = this.e.b;
        tl0 tl0Var = (tl0) yVar.b;
        if (this == tl0Var.P1) {
            tl0Var.P1 = null;
        }
        View view = this.a;
        if (view != null) {
            tl0Var.h1(view, 0.0f, 0.0f, false);
            if (((tl0) yVar.b).O1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                tl0 tl0Var2 = (tl0) yVar.b;
                jl0 jl0Var = tl0Var2.S0;
                if (jl0Var != null) {
                    jl0Var.f(i10, view);
                    return;
                }
                kl0 kl0Var = tl0Var2.T0;
                if (kl0Var != null) {
                    kl0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
