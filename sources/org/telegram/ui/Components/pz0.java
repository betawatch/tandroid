package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pz0 extends sj0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 == 0 ? 1 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f == 0) {
            org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) ((ArrayList) this.d.get(i3 - 1)).get(0);
            int c2 = t6Var.e == org.telegram.ui.ActionBar.k6.Be ? 0 : t6Var.c();
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) d1Var.a;
            t8Var.a.setText(org.telegram.ui.ActionBar.u4.c(t6Var.e));
            t8Var.b = c2;
            t8Var.setWillNotDraw(c2 == 0);
            t8Var.invalidate();
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View t8Var;
        Context context = this.c;
        if (i3 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new u4.p0(-1, -2));
        }
        return new bj0(t8Var);
    }
}
