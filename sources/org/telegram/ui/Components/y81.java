package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class y81 implements nl0, ol0 {
    public final /* synthetic */ f91 a;

    public /* synthetic */ y81(f91 f91Var) {
        this.a = f91Var;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        f91 f91Var = this.a;
        e91 e91Var = f91Var.y;
        if (e91Var != null) {
            g91 g91Var = (g91) ((n2.c) e91Var).b;
            if (g91Var.x || g91Var.H) {
                return;
            }
        }
        d91 d91Var = (d91) view;
        if (i10 != f91Var.F || e91Var == null) {
            Utilities.Callback2Return callback2Return = f91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(d91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                f91Var.d(d91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((d91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
