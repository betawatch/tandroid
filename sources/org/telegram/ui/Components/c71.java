package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c71 implements rj0, sj0 {
    public final /* synthetic */ i71 a;

    public /* synthetic */ c71(i71 i71Var) {
        this.a = i71Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        org.telegram.messenger.s10 s10Var = this.a.b;
        if (s10Var == null) {
            return false;
        }
        return ((Boolean) s10Var.g(Integer.valueOf(((g71) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        i71 i71Var = this.a;
        h71 h71Var = i71Var.E;
        if (h71Var == null || h71Var.b()) {
            g71 g71Var = (g71) view;
            if (i7 != i71Var.G || i71Var.E == null) {
                org.telegram.messenger.s10 s10Var = i71Var.m0;
                if (s10Var == null || !((Boolean) s10Var.g(Integer.valueOf(g71Var.a.a), Integer.valueOf(i7))).booleanValue()) {
                    i71Var.e(g71Var.a.a, i7);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
