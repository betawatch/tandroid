package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p21 extends pm0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f == 0) {
            org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int c10 = k6Var.f == org.telegram.ui.ActionBar.i6.Nd ? 0 : k6Var.c();
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) d1Var.a;
            z8Var.a.setText(org.telegram.ui.ActionBar.g5.i(k6Var.f));
            z8Var.b = c10;
            z8Var.setWillNotDraw(c10 == 0);
            z8Var.invalidate();
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        Context context = this.c;
        if (i10 != 0) {
            z8Var = new View(context);
            z8Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setLayoutParams(new s4.q0(-1, -2));
        }
        return new am0(z8Var);
    }
}
