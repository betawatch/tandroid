package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p61 implements hj0, ij0 {
    public final /* synthetic */ v61 a;

    public /* synthetic */ p61(v61 v61Var) {
        this.a = v61Var;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        org.telegram.messenger.t10 t10Var = this.a.b;
        if (t10Var == null) {
            return false;
        }
        return ((Boolean) t10Var.d(Integer.valueOf(((t61) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        v61 v61Var = this.a;
        u61 u61Var = v61Var.E;
        if (u61Var != null) {
            w61 w61Var = (w61) ((cf) u61Var).a;
            if (w61Var.y || w61Var.I) {
                return;
            }
        }
        t61 t61Var = (t61) view;
        if (i7 != v61Var.G || u61Var == null) {
            org.telegram.messenger.t10 t10Var = v61Var.m0;
            if (t10Var == null || !((Boolean) t10Var.d(Integer.valueOf(t61Var.a.a), Integer.valueOf(i7))).booleanValue()) {
                v61Var.d(t61Var.a.a, i7);
            }
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
