package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g61 implements gj0, hj0 {
    public final /* synthetic */ m61 a;

    public /* synthetic */ g61(m61 m61Var) {
        this.a = m61Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        m61 m61Var = this.a;
        l61 l61Var = m61Var.E;
        if (l61Var != null) {
            n61 n61Var = (n61) ((y00) l61Var).a;
            if (n61Var.y || n61Var.I) {
                return;
            }
        }
        k61 k61Var = (k61) view;
        if (i3 != m61Var.G || l61Var == null) {
            org.telegram.messenger.o10 o10Var = m61Var.m0;
            if (o10Var == null || !((Boolean) o10Var.d(Integer.valueOf(k61Var.a.a), Integer.valueOf(i3))).booleanValue()) {
                m61Var.d(k61Var.a.a, i3);
            }
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        org.telegram.messenger.o10 o10Var = this.a.b;
        if (o10Var == null) {
            return false;
        }
        return ((Boolean) o10Var.d(Integer.valueOf(((k61) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
