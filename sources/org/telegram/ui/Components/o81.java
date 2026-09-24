package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements ll0, ml0 {
    public final /* synthetic */ v81 a;

    public /* synthetic */ o81(v81 v81Var) {
        this.a = v81Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        v81 v81Var = this.a;
        u81 u81Var = v81Var.y;
        if (u81Var != null) {
            w81 w81Var = (w81) ((l.d) u81Var).a;
            if (w81Var.x || w81Var.H) {
                return;
            }
        }
        t81 t81Var = (t81) view;
        if (i10 != v81Var.F || u81Var == null) {
            Utilities.Callback2Return callback2Return = v81Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(t81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                v81Var.d(t81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((t81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
