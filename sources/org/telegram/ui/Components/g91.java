package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g91 implements fm0, gm0 {
    public final /* synthetic */ n91 a;

    public /* synthetic */ g91(n91 n91Var) {
        this.a = n91Var;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        n91 n91Var = this.a;
        m91 m91Var = n91Var.y;
        if (m91Var != null) {
            o91 o91Var = (o91) ((m2.t) m91Var).b;
            if (o91Var.x || o91Var.H) {
                return;
            }
        }
        l91 l91Var = (l91) view;
        if (i10 != n91Var.F || m91Var == null) {
            Utilities.Callback2Return callback2Return = n91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(l91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                n91Var.d(l91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((l91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }
}
