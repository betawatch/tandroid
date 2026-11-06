package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pz0 extends oj0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 0) {
            org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            int c10 = t6Var.e == org.telegram.ui.ActionBar.k6.Be ? 0 : t6Var.c();
            org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) d1Var.a;
            u8Var.a.setText(org.telegram.ui.ActionBar.u4.c(t6Var.e));
            u8Var.b = c10;
            u8Var.setWillNotDraw(c10 == 0);
            u8Var.invalidate();
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View u8Var;
        Context context = this.c;
        if (i7 != 0) {
            u8Var = new View(context);
            u8Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            u8Var = new org.telegram.ui.Cells.u8(context);
            u8Var.setLayoutParams(new v4.o0(-1, -2));
        }
        return new xi0(u8Var);
    }
}
