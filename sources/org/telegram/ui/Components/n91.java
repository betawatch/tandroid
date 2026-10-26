package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n91 implements am0, bm0 {
    public final /* synthetic */ t91 a;

    public /* synthetic */ n91(t91 t91Var) {
        this.a = t91Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((r91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        t91 t91Var = this.a;
        s91 s91Var = t91Var.y;
        if (s91Var != null) {
            u91 u91Var = (u91) ((jg.i) s91Var).a;
            if (u91Var.x || u91Var.H) {
                return;
            }
        }
        r91 r91Var = (r91) view;
        if (i10 != t91Var.F || s91Var == null) {
            Utilities.Callback2Return callback2Return = t91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(r91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                t91Var.d(r91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
