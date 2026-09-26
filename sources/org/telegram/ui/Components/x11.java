package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class x11 extends vl0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.vl0
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
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) c1Var.a;
            z8Var.a.setText(org.telegram.ui.ActionBar.e5.i(j6Var.f));
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
        return new gl0(z8Var);
    }
}
