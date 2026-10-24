package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class l21 extends lm0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.lm0
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
            org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int c10 = t6Var.e == org.telegram.ui.ActionBar.k6.Nd ? 0 : t6Var.c();
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) b1Var.a;
            z8Var.a.setText(org.telegram.ui.ActionBar.k5.i(t6Var.e));
            z8Var.b = c10;
            z8Var.setWillNotDraw(c10 == 0);
            z8Var.invalidate();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        Context context = this.c;
        if (i10 != 0) {
            z8Var = new View(context);
            z8Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new wl0(z8Var);
    }
}
