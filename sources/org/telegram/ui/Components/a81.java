package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a81 implements bl0, cl0 {
    public final /* synthetic */ g81 a;

    public /* synthetic */ a81(g81 g81Var) {
        this.a = g81Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        g81 g81Var = this.a;
        f81 f81Var = g81Var.y;
        if (f81Var != null) {
            h81 h81Var = (h81) ((ka.c) f81Var).b;
            if (h81Var.x || h81Var.H) {
                return;
            }
        }
        e81 e81Var = (e81) view;
        if (i10 != g81Var.F || f81Var == null) {
            Utilities.Callback2Return callback2Return = g81Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(e81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                g81Var.d(e81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((e81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
