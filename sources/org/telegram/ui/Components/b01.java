package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class b01 extends dk0 {
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
            org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) ((ArrayList) this.d.get(i7 - 1)).get(0);
            int c10 = v6Var.e == org.telegram.ui.ActionBar.m6.Ee ? 0 : v6Var.c();
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) f1Var.a;
            v8Var.a.setText(org.telegram.ui.ActionBar.v4.c(v6Var.e));
            v8Var.b = c10;
            v8Var.setWillNotDraw(c10 == 0);
            v8Var.invalidate();
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View v8Var;
        Context context = this.c;
        if (i7 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new v4.q0(-1, -2));
        }
        return new mj0(v8Var);
    }
}
