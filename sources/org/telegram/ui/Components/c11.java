package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c11 extends il0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f == 0) {
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int b10 = i6Var.f == org.telegram.ui.ActionBar.g6.Nd ? 0 : i6Var.b();
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) n1Var.a;
            t8Var.a.setText(org.telegram.ui.ActionBar.e5.i(i6Var.f));
            t8Var.b = b10;
            t8Var.setWillNotDraw(b10 == 0);
            t8Var.invalidate();
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View t8Var;
        Context context = this.c;
        if (i10 != 0) {
            t8Var = new View(context);
            t8Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.setLayoutParams(new f2.x0(-1, -2));
        }
        return new vk0(t8Var);
    }
}
