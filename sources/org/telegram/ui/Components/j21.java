package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class j21 extends yl0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.yl0
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
            org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int c10 = k6Var.f == org.telegram.ui.ActionBar.i6.Nd ? 0 : k6Var.c();
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) c1Var.a;
            z8Var.a.setText(org.telegram.ui.ActionBar.f5.i(k6Var.f));
            z8Var.b = c10;
            z8Var.setWillNotDraw(c10 == 0);
            z8Var.invalidate();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        Context context = this.c;
        if (i10 != 0) {
            z8Var = new View(context);
            z8Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setLayoutParams(new s4.p0(-1, -2));
        }
        return new il0(z8Var);
    }
}
