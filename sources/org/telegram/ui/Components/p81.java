package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p81 implements ll0, ml0 {
    public final /* synthetic */ w81 a;

    public /* synthetic */ p81(w81 w81Var) {
        this.a = w81Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        w81 w81Var = this.a;
        v81 v81Var = w81Var.y;
        if (v81Var != null) {
            x81 x81Var = (x81) ((l.d) v81Var).a;
            if (x81Var.x || x81Var.H) {
                return;
            }
        }
        u81 u81Var = (u81) view;
        if (i10 != w81Var.F || v81Var == null) {
            Utilities.Callback2Return callback2Return = w81Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(u81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                w81Var.d(u81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((u81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
