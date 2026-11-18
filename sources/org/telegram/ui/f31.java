package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f31 implements org.telegram.messenger.v10, org.telegram.messenger.w10, r0.m {
    public final /* synthetic */ o31 a;

    public /* synthetic */ f31(o31 o31Var) {
        this.a = o31Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.d;
        o31 o31Var = this.a;
        o31Var.d0 = i7;
        int i10 = I0.b;
        if (o31Var.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = o31Var.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                o31Var.Q.setLayoutParams(layoutParams);
            }
        }
        ri.a.e(o31Var.c, i10, i7, org.telegram.messenger.g0.L(12.0f), o31Var.e0);
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(org.telegram.ui.Components.l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(o31.Z(this.a, l41Var, view));
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o31.h0(this.a, (org.telegram.ui.Components.l41) obj);
    }
}
