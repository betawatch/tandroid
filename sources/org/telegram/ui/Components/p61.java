package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p61 implements dj0, ej0 {
    public final /* synthetic */ v61 a;

    public /* synthetic */ p61(v61 v61Var) {
        this.a = v61Var;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        org.telegram.messenger.w10 w10Var = this.a.b;
        if (w10Var == null) {
            return false;
        }
        return ((Boolean) w10Var.d(Integer.valueOf(((t61) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        v61 v61Var = this.a;
        u61 u61Var = v61Var.D;
        if (u61Var != null) {
            w61 w61Var = (w61) ((n) u61Var).a;
            if (w61Var.y || w61Var.H) {
                return;
            }
        }
        t61 t61Var = (t61) view;
        if (i7 != v61Var.F || u61Var == null) {
            org.telegram.messenger.w10 w10Var = v61Var.l0;
            if (w10Var == null || !((Boolean) w10Var.d(Integer.valueOf(t61Var.a.a), Integer.valueOf(i7))).booleanValue()) {
                v61Var.d(t61Var.a.a, i7);
            }
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
