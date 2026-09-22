package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r81 implements nl0, ol0 {
    public final /* synthetic */ y81 a;

    public /* synthetic */ r81(y81 y81Var) {
        this.a = y81Var;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        y81 y81Var = this.a;
        x81 x81Var = y81Var.y;
        if (x81Var != null) {
            z81 z81Var = (z81) ((ki.e0) x81Var).b;
            if (z81Var.x || z81Var.H) {
                return;
            }
        }
        w81 w81Var = (w81) view;
        if (i10 != y81Var.F || x81Var == null) {
            Utilities.Callback2Return callback2Return = y81Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(w81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                y81Var.d(w81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((w81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
