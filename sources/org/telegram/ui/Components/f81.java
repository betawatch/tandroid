package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f81 implements kl0, ll0 {
    public final /* synthetic */ l81 a;

    public /* synthetic */ f81(l81 l81Var) {
        this.a = l81Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f10, float f11, int i10, View view) {
        l81 l81Var = this.a;
        k81 k81Var = l81Var.y;
        if (k81Var != null) {
            m81 m81Var = (m81) ((oh.h4) k81Var).b;
            if (m81Var.x || m81Var.E) {
                return;
            }
        }
        j81 j81Var = (j81) view;
        if (i10 != l81Var.C || k81Var == null) {
            Utilities.Callback2Return callback2Return = l81Var.i0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(j81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                l81Var.d(j81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((j81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
