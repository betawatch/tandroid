package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dz extends s4.v {
    public boolean d;
    public final /* synthetic */ fz e;

    public dz(fz fzVar) {
        this.e = fzVar;
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
        fz fzVar = this.e;
        cz czVar = fzVar.a;
        fz fzVar2 = czVar.d;
        int i10 = fzVar2.n;
        ArrayList arrayList = fzVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = fzVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l4 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l4);
            czVar.p(b10, b11);
            ((org.telegram.ui.Cells.g4) c1Var.a).setDrawDivider(b11 != fzVar.r - 1);
            ((org.telegram.ui.Cells.g4) c1Var2.a).setDrawDivider(b10 != fzVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        fz fzVar = this.e;
        if (i10 != 0) {
            fzVar.b.I0(false);
            c1Var.a.setPressed(true);
        } else if (this.d) {
            ez ezVar = fzVar.f;
            if (ezVar != null) {
                ezVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
