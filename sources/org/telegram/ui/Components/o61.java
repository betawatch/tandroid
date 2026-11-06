package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements cj0, dj0 {
    public final /* synthetic */ u61 a;

    public /* synthetic */ o61(u61 u61Var) {
        this.a = u61Var;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        org.telegram.messenger.w10 w10Var = this.a.b;
        if (w10Var == null) {
            return false;
        }
        return ((Boolean) w10Var.d(Integer.valueOf(((s61) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        u61 u61Var = this.a;
        t61 t61Var = u61Var.D;
        if (t61Var != null) {
            v61 v61Var = (v61) ((n) t61Var).a;
            if (v61Var.y || v61Var.H) {
                return;
            }
        }
        s61 s61Var = (s61) view;
        if (i7 != u61Var.F || t61Var == null) {
            org.telegram.messenger.w10 w10Var = u61Var.l0;
            if (w10Var == null || !((Boolean) w10Var.d(Integer.valueOf(s61Var.a.a), Integer.valueOf(i7))).booleanValue()) {
                u61Var.d(s61Var.a.a, i7);
            }
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
