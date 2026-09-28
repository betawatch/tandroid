package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q81 implements nl0, ol0 {
    public final /* synthetic */ x81 a;

    public /* synthetic */ q81(x81 x81Var) {
        this.a = x81Var;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        x81 x81Var = this.a;
        w81 w81Var = x81Var.y;
        if (w81Var != null) {
            y81 y81Var = (y81) ((l.d) w81Var).a;
            if (y81Var.x || y81Var.H) {
                return;
            }
        }
        v81 v81Var = (v81) view;
        if (i10 != x81Var.F || w81Var == null) {
            Utilities.Callback2Return callback2Return = x81Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(v81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                x81Var.d(v81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((v81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
