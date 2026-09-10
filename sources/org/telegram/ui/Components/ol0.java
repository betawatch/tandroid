package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ol0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ pl0 e;

    public ol0(pl0 pl0Var, View view, int i10, float f7, float f10) {
        this.e = pl0Var;
        this.a = view;
        this.b = i10;
        this.c = f7;
        this.d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ql0 ql0Var = this.e.b;
        vl0 vl0Var = (vl0) ql0Var.b;
        if (this == vl0Var.S1) {
            vl0Var.S1 = null;
        }
        View view = this.a;
        if (view != null) {
            vl0Var.g1(view, 0.0f, 0.0f, false);
            if (((vl0) ql0Var.b).R1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.b;
            if (i10 != -1) {
                vl0 vl0Var2 = (vl0) ql0Var.b;
                jl0 jl0Var = vl0Var2.V0;
                if (jl0Var != null) {
                    jl0Var.d(i10, view);
                    return;
                }
                kl0 kl0Var = vl0Var2.W0;
                if (kl0Var != null) {
                    kl0Var.c(this.c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
