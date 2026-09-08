package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b81 implements al0, bl0 {
    public final /* synthetic */ h81 a;

    public /* synthetic */ b81(h81 h81Var) {
        this.a = h81Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((f81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        h81 h81Var = this.a;
        g81 g81Var = h81Var.y;
        if (g81Var != null) {
            i81 i81Var = (i81) ((k2.g0) g81Var).b;
            if (i81Var.x || i81Var.H) {
                return;
            }
        }
        f81 f81Var = (f81) view;
        if (i10 != h81Var.F || g81Var == null) {
            Utilities.Callback2Return callback2Return = h81Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(f81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                h81Var.d(f81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
