package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n11 extends ql0 {
    public Context c;
    public ArrayList d;

    @Override // org.telegram.ui.Components.ql0
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
            org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) l1Var.a;
            u8Var.a.setText(org.telegram.ui.ActionBar.h5.i(l6Var.f));
            u8Var.b = b10;
            u8Var.setWillNotDraw(b10 == 0);
            u8Var.invalidate();
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View u8Var;
        Context context = this.c;
        if (i10 != 0) {
            u8Var = new View(context);
            u8Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            u8Var = new org.telegram.ui.Cells.u8(context);
            u8Var.setLayoutParams(new f2.w0(-1, -2));
        }
        return new dl0(u8Var);
    }
}
