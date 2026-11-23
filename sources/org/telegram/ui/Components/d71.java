package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d71 implements rj0, sj0 {
    public final /* synthetic */ j71 a;

    public /* synthetic */ d71(j71 j71Var) {
        this.a = j71Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        org.telegram.messenger.q10 q10Var = this.a.b;
        if (q10Var == null) {
            return false;
        }
        return ((Boolean) q10Var.d(Integer.valueOf(((h71) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        j71 j71Var = this.a;
        i71 i71Var = j71Var.E;
        if (i71Var == null || i71Var.d()) {
            h71 h71Var = (h71) view;
            if (i7 != j71Var.G || j71Var.E == null) {
                org.telegram.messenger.q10 q10Var = j71Var.m0;
                if (q10Var == null || !((Boolean) q10Var.d(Integer.valueOf(h71Var.a.a), Integer.valueOf(i7))).booleanValue()) {
                    j71Var.e(h71Var.a.a, i7);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
