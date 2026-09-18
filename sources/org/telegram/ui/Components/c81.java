package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c81 implements bl0, cl0 {
    public final /* synthetic */ i81 a;

    public /* synthetic */ c81(i81 i81Var) {
        this.a = i81Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        i81 i81Var = this.a;
        h81 h81Var = i81Var.y;
        if (h81Var != null) {
            j81 j81Var = (j81) ((ka.c) h81Var).b;
            if (j81Var.x || j81Var.H) {
                return;
            }
        }
        g81 g81Var = (g81) view;
        if (i10 != i81Var.F || h81Var == null) {
            Utilities.Callback2Return callback2Return = i81Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(g81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                i81Var.d(g81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((g81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
