package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f31 implements org.telegram.messenger.a20, org.telegram.messenger.b20, r0.m {
    public final /* synthetic */ o31 a;

    public /* synthetic */ f31(o31 o31Var) {
        this.a = o31Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        o31 o31Var = this.a;
        o31Var.c0 = i7;
        int i10 = I0.b;
        if (o31Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = o31Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                o31Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.e(o31Var.c, i10, i7, org.telegram.messenger.g0.L(12.0f), o31Var.d0);
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(org.telegram.ui.Components.x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(o31.Z(this.a, x31Var, view));
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o31.h0(this.a, (org.telegram.ui.Components.x31) obj);
    }
}
