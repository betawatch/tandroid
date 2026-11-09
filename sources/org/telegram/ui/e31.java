package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements org.telegram.messenger.a20, org.telegram.messenger.b20, r0.m {
    public final /* synthetic */ n31 a;

    public /* synthetic */ e31(n31 n31Var) {
        this.a = n31Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        n31 n31Var = this.a;
        n31Var.c0 = i7;
        int i10 = I0.b;
        if (n31Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = n31Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                n31Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.e(n31Var.c, i10, i7, org.telegram.messenger.g0.L(12.0f), n31Var.d0);
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(org.telegram.ui.Components.y31 y31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(n31.Z(this.a, y31Var, view));
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n31.h0(this.a, (org.telegram.ui.Components.y31) obj);
    }
}
