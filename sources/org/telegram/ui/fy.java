package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fy extends s4.u {
    public boolean d;
    public final /* synthetic */ hy e;

    public fy(hy hyVar) {
        this.e = hyVar;
    }

    @Override // s4.u
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.u
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        return c1Var.f != 3 ? s4.u.l(0, 0) : s4.u.l(3, 0);
    }

    @Override // s4.u
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        if (c1Var.f != c1Var2.f) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        hy hyVar = this.e;
        ey eyVar = hyVar.a;
        hy hyVar2 = eyVar.f;
        int i10 = hyVar2.n;
        ArrayList arrayList = hyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = hyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l4 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l4);
            eyVar.j(b10, b11);
            ((org.telegram.ui.Cells.j4) c1Var.a).setDrawDivider(b11 != hyVar.r - 1);
            ((org.telegram.ui.Cells.j4) c1Var2.a).setDrawDivider(b10 != hyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.u
    public final void p(s4.c1 c1Var, int i10) {
        hy hyVar = this.e;
        if (i10 != 0) {
            hyVar.b.I0(false);
            c1Var.a.setPressed(true);
        } else if (this.d) {
            gy gyVar = hyVar.f;
            if (gyVar != null) {
                gyVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
    }
}
