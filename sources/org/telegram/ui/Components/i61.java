package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i61 implements cj0, dj0 {
    public final /* synthetic */ o61 a;

    public /* synthetic */ i61(o61 o61Var) {
        this.a = o61Var;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        org.telegram.messenger.w10 w10Var = this.a.b;
        if (w10Var == null) {
            return false;
        }
        return ((Boolean) w10Var.d(Integer.valueOf(((m61) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        o61 o61Var = this.a;
        n61 n61Var = o61Var.D;
        if (n61Var != null) {
            p61 p61Var = (p61) ((n) n61Var).a;
            if (p61Var.y || p61Var.H) {
                return;
            }
        }
        m61 m61Var = (m61) view;
        if (i7 != o61Var.F || n61Var == null) {
            org.telegram.messenger.w10 w10Var = o61Var.l0;
            if (w10Var == null || !((Boolean) w10Var.d(Integer.valueOf(m61Var.a.a), Integer.valueOf(i7))).booleanValue()) {
                o61Var.d(m61Var.a.a, i7);
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
