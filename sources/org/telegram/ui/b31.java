package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements org.telegram.messenger.x10, org.telegram.messenger.y10, r0.m {
    public final /* synthetic */ k31 a;

    public /* synthetic */ b31(k31 k31Var) {
        this.a = k31Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        k31 k31Var = this.a;
        k31Var.d0 = i7;
        int i10 = I0.b;
        if (k31Var.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = k31Var.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                k31Var.Q.setLayoutParams(layoutParams);
            }
        }
        ri.a.e(k31Var.c, i10, i7, org.telegram.messenger.g0.L(12.0f), k31Var.e0);
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(org.telegram.ui.Components.b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(k31.Z(this.a, b41Var, view));
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        k31.h0(this.a, (org.telegram.ui.Components.b41) obj);
    }
}
