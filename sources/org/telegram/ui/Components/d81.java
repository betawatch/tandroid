package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d81 implements jl0, kl0 {
    public final /* synthetic */ k81 a;

    public /* synthetic */ d81(k81 k81Var) {
        this.a = k81Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        k81 k81Var = this.a;
        j81 j81Var = k81Var.y;
        if (j81Var != null) {
            l81 l81Var = (l81) ((o2.o) j81Var).b;
            if (l81Var.x || l81Var.E) {
                return;
            }
        }
        i81 i81Var = (i81) view;
        if (i10 != k81Var.C || j81Var == null) {
            Utilities.Callback2Return callback2Return = k81Var.i0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(i81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                k81Var.d(i81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((i81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
    }
}
