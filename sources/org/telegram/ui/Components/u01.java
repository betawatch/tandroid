package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u01 extends sk0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int c10 = c7Var.e == org.telegram.ui.ActionBar.t6.Be ? 0 : c7Var.c();
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) c1Var.a;
            w8Var.a.setText(org.telegram.ui.ActionBar.d5.c(c7Var.e));
            w8Var.b = c10;
            w8Var.setWillNotDraw(c10 == 0);
            w8Var.invalidate();
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View w8Var;
        Context context = this.c;
        if (i10 != 0) {
            w8Var = new View(context);
            w8Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
        } else {
            w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new ck0(w8Var);
    }
}
