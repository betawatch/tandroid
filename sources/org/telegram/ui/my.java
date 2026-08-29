package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class my extends f2.b0 {
    public boolean d;
    public final /* synthetic */ oy e;

    public my(oy oyVar) {
        this.e = oyVar;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        n1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        return n1Var.f != 3 ? f2.b0.l(0, 0) : f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        if (n1Var.f != n1Var2.f) {
            return false;
        }
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        oy oyVar = this.e;
        ly lyVar = oyVar.a;
        oy oyVar2 = lyVar.d;
        int i10 = oyVar2.n;
        ArrayList arrayList = oyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = oyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l10 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l10);
            lyVar.p(b10, b11);
            ((org.telegram.ui.Cells.e4) n1Var.a).setDrawDivider(b11 != oyVar.r - 1);
            ((org.telegram.ui.Cells.e4) n1Var2.a).setDrawDivider(b10 != oyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.n1 n1Var, int i10) {
        oy oyVar = this.e;
        if (i10 != 0) {
            oyVar.b.I0(false);
            n1Var.a.setPressed(true);
        } else if (this.d) {
            ny nyVar = oyVar.f;
            if (nyVar != null) {
                nyVar.a();
            }
            this.d = false;
        }
    }

    @Override // f2.b0
    public final void q(f2.n1 n1Var) {
    }
}
