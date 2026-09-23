package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class j11 extends ll0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int c10 = j6Var.f == org.telegram.ui.ActionBar.h6.Nd ? 0 : j6Var.c();
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) c1Var.a;
            a9Var.a.setText(org.telegram.ui.ActionBar.f5.i(j6Var.f));
            a9Var.b = c10;
            a9Var.setWillNotDraw(c10 == 0);
            a9Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        Context context = this.c;
        if (i10 != 0) {
            a9Var = new View(context);
            a9Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setLayoutParams(new s4.p0(-1, -2));
        }
        return new wk0(a9Var);
    }
}
