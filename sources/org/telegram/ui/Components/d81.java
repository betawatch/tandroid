package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d81 implements il0, jl0 {
    public final /* synthetic */ k81 a;

    public /* synthetic */ d81(k81 k81Var) {
        this.a = k81Var;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        k81 k81Var = this.a;
        j81 j81Var = k81Var.y;
        if (j81Var != null) {
            l81 l81Var = (l81) ((tp0) j81Var).b;
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
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((i81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
