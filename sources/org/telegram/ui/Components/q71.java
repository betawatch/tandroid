package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q71 implements ik0, jk0 {
    public final /* synthetic */ w71 a;

    public /* synthetic */ q71(w71 w71Var) {
        this.a = w71Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        w71 w71Var = this.a;
        v71 v71Var = w71Var.D;
        if (v71Var != null) {
            x71 x71Var = (x71) ((n2.u) v71Var).b;
            if (x71Var.y || x71Var.H) {
                return;
            }
        }
        u71 u71Var = (u71) view;
        if (i10 != w71Var.F || v71Var == null) {
            org.telegram.messenger.l20 l20Var = w71Var.l0;
            if (l20Var == null || !((Boolean) l20Var.d(Integer.valueOf(u71Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                w71Var.d(u71Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        org.telegram.messenger.l20 l20Var = this.a.b;
        if (l20Var == null) {
            return false;
        }
        return ((Boolean) l20Var.d(Integer.valueOf(((u71) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
