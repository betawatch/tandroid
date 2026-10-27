package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ly extends s4.w {
    public boolean d;
    public final /* synthetic */ ny e;

    public ly(ny nyVar) {
        this.e = nyVar;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        return e1Var.f != 3 ? s4.w.l(0, 0) : s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        if (e1Var.f != e1Var2.f) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        ny nyVar = this.e;
        ky kyVar = nyVar.a;
        ny nyVar2 = kyVar.f;
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
            ((org.telegram.ui.Cells.k4) e1Var.a).setDrawDivider(b11 != nyVar.r - 1);
            ((org.telegram.ui.Cells.k4) e1Var2.a).setDrawDivider(b10 != nyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        ny nyVar = this.e;
        if (i10 != 0) {
            nyVar.b.I0(false);
            e1Var.a.setPressed(true);
        } else if (this.d) {
            my myVar = nyVar.f;
            if (myVar != null) {
                myVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}
