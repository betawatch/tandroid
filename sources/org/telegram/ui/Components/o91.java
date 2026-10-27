package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o91 implements bm0, cm0 {
    public final /* synthetic */ u91 a;

    public /* synthetic */ o91(u91 u91Var) {
        this.a = u91Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((s91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        u91 u91Var = this.a;
        t91 t91Var = u91Var.y;
        if (t91Var != null) {
            v91 v91Var = (v91) ((jg.i) t91Var).a;
            if (v91Var.x || v91Var.H) {
                return;
            }
        }
        s91 s91Var = (s91) view;
        if (i10 != u91Var.F || t91Var == null) {
            Utilities.Callback2Return callback2Return = u91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(s91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                u91Var.d(s91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
