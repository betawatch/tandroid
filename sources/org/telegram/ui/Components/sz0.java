package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sz0 extends tj0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f == 0) {
            org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            int c10 = s6Var.e == org.telegram.ui.ActionBar.j6.Ee ? 0 : s6Var.c();
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) e1Var.a;
            t8Var.a.setText(org.telegram.ui.ActionBar.s4.c(s6Var.e));
            t8Var.b = c10;
            t8Var.setWillNotDraw(c10 == 0);
            t8Var.invalidate();
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View t8Var;
        Context context = this.c;
        if (i7 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new v4.p0(-1, -2));
        }
        return new cj0(t8Var);
    }
}
