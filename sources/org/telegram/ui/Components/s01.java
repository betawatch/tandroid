package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s01 extends yk0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f == 0) {
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            int b10 = i6Var.f == org.telegram.ui.ActionBar.g6.Nd ? 0 : i6Var.b();
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) o1Var.a;
            s8Var.a.setText(org.telegram.ui.ActionBar.e5.i(i6Var.f));
            s8Var.b = b10;
            s8Var.setWillNotDraw(b10 == 0);
            s8Var.invalidate();
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s8Var;
        Context context = this.c;
        if (i10 != 0) {
            s8Var = new View(context);
            s8Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            s8Var = new org.telegram.ui.Cells.s8(context);
            s8Var.setLayoutParams(new f2.y0(-1, -2));
        }
        return new lk0(s8Var);
    }
}
