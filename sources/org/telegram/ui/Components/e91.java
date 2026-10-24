package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e91 implements bm0, cm0 {
    public final /* synthetic */ k91 a;

    public /* synthetic */ e91(k91 k91Var) {
        this.a = k91Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        k91 k91Var = this.a;
        j91 j91Var = k91Var.y;
        if (j91Var != null) {
            l91 l91Var = (l91) ((l2.f) j91Var).b;
            if (l91Var.x || l91Var.H) {
                return;
            }
        }
        i91 i91Var = (i91) view;
        if (i10 != k91Var.F || j91Var == null) {
            Utilities.Callback2Return callback2Return = k91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(i91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                k91Var.d(i91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((i91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
