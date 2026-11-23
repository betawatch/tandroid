package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements org.telegram.messenger.u10, org.telegram.messenger.v10, r0.m {
    public final /* synthetic */ n31 a;

    public /* synthetic */ e31(n31 n31Var) {
        this.a = n31Var;
    }

    @Override // org.telegram.messenger.v10
    public Boolean a(org.telegram.ui.Components.n41 n41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(n31.Z(this.a, n41Var, view));
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n31.h0(this.a, (org.telegram.ui.Components.n41) obj);
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.d;
        n31 n31Var = this.a;
        n31Var.d0 = i7;
        int i10 = I0.b;
        if (n31Var.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = n31Var.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                n31Var.Q.setLayoutParams(layoutParams);
            }
        }
        ri.a.e(n31Var.c, i10, i7, org.telegram.messenger.g0.L(12.0f), n31Var.e0);
        return r0.l1.b;
    }
}
