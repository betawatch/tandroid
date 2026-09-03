package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n11 extends rl0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
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
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f == 0) {
            org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int b10 = m6Var.f == org.telegram.ui.ActionBar.k6.Nd ? 0 : m6Var.b();
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) m1Var.a;
            v8Var.a.setText(org.telegram.ui.ActionBar.i5.i(m6Var.f));
            v8Var.b = b10;
            v8Var.setWillNotDraw(b10 == 0);
            v8Var.invalidate();
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.c;
        if (i10 != 0) {
            v8Var = new View(context);
            v8Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            v8Var = new org.telegram.ui.Cells.v8(context);
            v8Var.setLayoutParams(new f2.x0(-1, -2));
        }
        return new el0(v8Var);
    }
}
