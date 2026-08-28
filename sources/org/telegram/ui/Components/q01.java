package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q01 extends vk0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 == 0 ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f == 0) {
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) ((ArrayList) this.d.get(i9 - 1)).get(0);
            int b10 = h6Var.f == org.telegram.ui.ActionBar.f6.Nd ? 0 : h6Var.b();
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) q1Var.a;
            w8Var.a.setText(org.telegram.ui.ActionBar.e5.i(h6Var.f));
            w8Var.b = b10;
            w8Var.setWillNotDraw(b10 == 0);
            w8Var.invalidate();
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View w8Var;
        Context context = this.c;
        if (i9 != 0) {
            w8Var = new View(context);
            w8Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
        } else {
            w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setLayoutParams(new f2.a1(-1, -2));
        }
        return new ik0(w8Var);
    }
}
