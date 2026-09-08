package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bz extends s4.v {
    public boolean d;
    public final /* synthetic */ dz e;

    public bz(dz dzVar) {
        this.e = dzVar;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        return c1Var.f != 3 ? s4.v.l(0, 0) : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        if (c1Var.f != c1Var2.f) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        dz dzVar = this.e;
        az azVar = dzVar.a;
        dz dzVar2 = azVar.d;
        int i10 = dzVar2.n;
        ArrayList arrayList = dzVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = dzVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l4 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l4);
            azVar.p(b10, b11);
            ((org.telegram.ui.Cells.f4) c1Var.a).setDrawDivider(b11 != dzVar.r - 1);
            ((org.telegram.ui.Cells.f4) c1Var2.a).setDrawDivider(b10 != dzVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        dz dzVar = this.e;
        if (i10 != 0) {
            dzVar.b.I0(false);
            c1Var.a.setPressed(true);
        } else if (this.d) {
            cz czVar = dzVar.f;
            if (czVar != null) {
                czVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
