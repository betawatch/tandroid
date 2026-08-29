package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r71 implements al0, bl0 {
    public final /* synthetic */ y71 a;

    public /* synthetic */ r71(y71 y71Var) {
        this.a = y71Var;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        y71 y71Var = this.a;
        x71 x71Var = y71Var.y;
        if (x71Var != null) {
            z71 z71Var = (z71) ((n) x71Var).b;
            if (z71Var.x || z71Var.D) {
                return;
            }
        }
        w71 w71Var = (w71) view;
        if (i10 != y71Var.B || x71Var == null) {
            Utilities.Callback2Return callback2Return = y71Var.h0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(w71Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                y71Var.d(w71Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((w71) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
