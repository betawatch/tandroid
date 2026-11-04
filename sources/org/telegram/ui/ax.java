package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ax extends u4.v {
    public boolean d;
    public final /* synthetic */ cx e;

    public ax(cx cxVar) {
        this.e = cxVar;
    }

    @Override // u4.v
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // u4.v
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        return d1Var.f != 3 ? u4.v.l(0, 0) : u4.v.l(3, 0);
    }

    @Override // u4.v
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        if (d1Var.f != d1Var2.f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        cx cxVar = this.e;
        zw zwVar = cxVar.a;
        cx cxVar2 = zwVar.f;
        int i3 = cxVar2.n;
        ArrayList arrayList = cxVar2.e;
        int i10 = b10 - i3;
        int i11 = b11 - i3;
        int i12 = cxVar2.r - i3;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            Long l10 = (Long) arrayList.get(i10);
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, l10);
            zwVar.j(b10, b11);
            ((org.telegram.ui.Cells.h4) d1Var.a).setDrawDivider(b11 != cxVar.r - 1);
            ((org.telegram.ui.Cells.h4) d1Var2.a).setDrawDivider(b10 != cxVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // u4.v
    public final void p(u4.d1 d1Var, int i3) {
        cx cxVar = this.e;
        if (i3 != 0) {
            cxVar.b.I0(false);
            d1Var.a.setPressed(true);
        } else if (this.d) {
            bx bxVar = cxVar.f;
            if (bxVar != null) {
                bxVar.a();
            }
            this.d = false;
        }
    }

    @Override // u4.v
    public final void q(u4.d1 d1Var) {
    }
}
