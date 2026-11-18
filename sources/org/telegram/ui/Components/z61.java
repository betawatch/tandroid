package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z61 implements pj0, qj0 {
    public final /* synthetic */ f71 a;

    public /* synthetic */ z61(f71 f71Var) {
        this.a = f71Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        org.telegram.messenger.r10 r10Var = this.a.b;
        if (r10Var == null) {
            return false;
        }
        return ((Boolean) r10Var.g(Integer.valueOf(((d71) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        f71 f71Var = this.a;
        e71 e71Var = f71Var.E;
        if (e71Var == null || e71Var.b()) {
            d71 d71Var = (d71) view;
            if (i7 != f71Var.G || f71Var.E == null) {
                org.telegram.messenger.r10 r10Var = f71Var.m0;
                if (r10Var == null || !((Boolean) r10Var.g(Integer.valueOf(d71Var.a.a), Integer.valueOf(i7))).booleanValue()) {
                    f71Var.e(d71Var.a.a, i7);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
