package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n11 extends rl0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f == 0) {
            org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int b10 = l6Var.f == org.telegram.ui.ActionBar.j6.Nd ? 0 : l6Var.b();
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) l1Var.a;
            v8Var.a.setText(org.telegram.ui.ActionBar.h5.i(l6Var.f));
            v8Var.b = b10;
            v8Var.setWillNotDraw(b10 == 0);
            v8Var.invalidate();
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.c;
        if (i10 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new f2.w0(-1, -2));
        }
        return new el0(v8Var);
    }
}
