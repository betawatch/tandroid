package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class g21 extends hm0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 0) {
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int c10 = j6Var.f == org.telegram.ui.ActionBar.h6.Nd ? 0 : j6Var.c();
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) b1Var.a;
            y8Var.a.setText(org.telegram.ui.ActionBar.g5.i(j6Var.f));
            y8Var.b = c10;
            y8Var.setWillNotDraw(c10 == 0);
            y8Var.invalidate();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View y8Var;
        Context context = this.c;
        if (i10 != 0) {
            y8Var = new View(context);
            y8Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new sl0(y8Var);
    }
}
