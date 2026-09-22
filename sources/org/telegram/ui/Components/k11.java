package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k11 extends kl0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.kl0
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
            int b10 = k6Var.f == org.telegram.ui.ActionBar.i6.Nd ? 0 : k6Var.b();
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) c1Var.a;
            z8Var.a.setText(org.telegram.ui.ActionBar.g5.i(k6Var.f));
            z8Var.b = b10;
            z8Var.setWillNotDraw(b10 == 0);
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
        return new vk0(z8Var);
    }
}
