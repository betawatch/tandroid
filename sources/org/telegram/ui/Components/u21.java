package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u21 extends mm0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
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
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f == 0) {
            org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int c10 = h7Var.e == org.telegram.ui.ActionBar.y6.Nd ? 0 : h7Var.c();
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) e1Var.a;
            d9Var.a.setText(org.telegram.ui.ActionBar.m5.c(h7Var.e));
            d9Var.b = c10;
            d9Var.setWillNotDraw(c10 == 0);
            d9Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View d9Var;
        Context context = this.c;
        if (i10 != 0) {
            d9Var = new View(context);
            d9Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setLayoutParams(new s4.q0(-1, -2));
        }
        return new wl0(d9Var);
    }
}
