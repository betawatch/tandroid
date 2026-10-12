package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d91 implements bm0, cm0 {
    public final /* synthetic */ j91 a;

    public /* synthetic */ d91(j91 j91Var) {
        this.a = j91Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((h91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        j91 j91Var = this.a;
        i91 i91Var = j91Var.y;
        if (i91Var != null) {
            k91 k91Var = (k91) ((l2.f) i91Var).b;
            if (k91Var.x || k91Var.H) {
                return;
            }
        }
        h91 h91Var = (h91) view;
        if (i10 != j91Var.F || i91Var == null) {
            Utilities.Callback2Return callback2Return = j91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(h91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                j91Var.d(h91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
