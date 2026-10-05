package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z81 implements nl0, ol0 {
    public final /* synthetic */ g91 a;

    public /* synthetic */ z81(g91 g91Var) {
        this.a = g91Var;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        g91 g91Var = this.a;
        f91 f91Var = g91Var.y;
        if (f91Var != null) {
            h91 h91Var = (h91) ((n2.c) f91Var).b;
            if (h91Var.x || h91Var.H) {
                return;
            }
        }
        e91 e91Var = (e91) view;
        if (i10 != g91Var.F || f91Var == null) {
            Utilities.Callback2Return callback2Return = g91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(e91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                g91Var.d(e91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((e91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
