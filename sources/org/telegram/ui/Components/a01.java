package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a01 extends dk0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 0) {
            org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            int c10 = w6Var.e == org.telegram.ui.ActionBar.n6.Ee ? 0 : w6Var.c();
            org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) f1Var.a;
            u8Var.a.setText(org.telegram.ui.ActionBar.v4.c(w6Var.e));
            u8Var.b = c10;
            u8Var.setWillNotDraw(c10 == 0);
            u8Var.invalidate();
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View u8Var;
        Context context = this.c;
        if (i7 != 0) {
            u8Var = new View(context);
            u8Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            u8Var = new org.telegram.ui.Cells.u8(context);
            u8Var.setLayoutParams(new v4.q0(-1, -2));
        }
        return new mj0(u8Var);
    }
}
