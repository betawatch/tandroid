package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements org.telegram.messenger.a20, org.telegram.messenger.b20, r0.m {
    public final /* synthetic */ m31 a;

    public /* synthetic */ c31(m31 m31Var) {
        this.a = m31Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        m31 m31Var = this.a;
        m31Var.c0 = i7;
        int i10 = I0.b;
        if (m31Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = m31Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                m31Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.e(m31Var.c, i10, i7, org.telegram.messenger.g0.L(12.0f), m31Var.d0);
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(org.telegram.ui.Components.x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(m31.Z(this.a, x31Var, view));
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        m31.h0(this.a, (org.telegram.ui.Components.x31) obj);
    }
}
