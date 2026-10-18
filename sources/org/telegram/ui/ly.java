package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ly extends s4.v {
    public boolean d;
    public final /* synthetic */ ny e;

    public ly(ny nyVar) {
        this.e = nyVar;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        return b1Var.f != 3 ? s4.v.l(0, 0) : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        if (b1Var.f != b1Var2.f) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ny nyVar = this.e;
        ky kyVar = nyVar.a;
        ny nyVar2 = kyVar.d;
        int i10 = nyVar2.n;
        ArrayList arrayList = nyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = nyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l4 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l4);
            kyVar.p(b10, b11);
            ((org.telegram.ui.Cells.f4) b1Var.a).setDrawDivider(b11 != nyVar.r - 1);
            ((org.telegram.ui.Cells.f4) b1Var2.a).setDrawDivider(b10 != nyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        ny nyVar = this.e;
        if (i10 != 0) {
            nyVar.b.I0(false);
            b1Var.a.setPressed(true);
        } else if (this.d) {
            my myVar = nyVar.f;
            if (myVar != null) {
                myVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
