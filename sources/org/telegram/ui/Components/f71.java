package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f71 implements nk0, ok0 {
    public final /* synthetic */ m71 a;

    public /* synthetic */ f71(m71 m71Var) {
        this.a = m71Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((k71) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        m71 m71Var = this.a;
        l71 l71Var = m71Var.y;
        if (l71Var != null) {
            n71 n71Var = (n71) ((n2.p) l71Var).b;
            if (n71Var.x || n71Var.D) {
                return;
            }
        }
        k71 k71Var = (k71) view;
        if (i9 != m71Var.B || l71Var == null) {
            Utilities.Callback2Return callback2Return = m71Var.h0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(k71Var.a.a), Integer.valueOf(i9))).booleanValue()) {
                m71Var.d(k71Var.a.a, i9);
            }
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
