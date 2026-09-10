package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements kl0, ll0 {
    public final /* synthetic */ u81 a;

    public /* synthetic */ o81(u81 u81Var) {
        this.a = u81Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        u81 u81Var = this.a;
        t81 t81Var = u81Var.y;
        if (t81Var != null) {
            v81 v81Var = (v81) ((l2.h) t81Var).b;
            if (v81Var.x || v81Var.H) {
                return;
            }
        }
        s81 s81Var = (s81) view;
        if (i10 != u81Var.F || t81Var == null) {
            Utilities.Callback2Return callback2Return = u81Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(s81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                u81Var.d(s81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((s81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
