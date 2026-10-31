package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p71 implements hk0, ik0 {
    public final /* synthetic */ v71 a;

    public /* synthetic */ p71(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        v71 v71Var = this.a;
        u71 u71Var = v71Var.D;
        if (u71Var != null) {
            w71 w71Var = (w71) ((n2.u) u71Var).b;
            if (w71Var.y || w71Var.H) {
                return;
            }
        }
        t71 t71Var = (t71) view;
        if (i10 != v71Var.F || u71Var == null) {
            org.telegram.messenger.k20 k20Var = v71Var.l0;
            if (k20Var == null || !((Boolean) k20Var.d(Integer.valueOf(t71Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                v71Var.d(t71Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        org.telegram.messenger.k20 k20Var = this.a.b;
        if (k20Var == null) {
            return false;
        }
        return ((Boolean) k20Var.d(Integer.valueOf(((t71) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
