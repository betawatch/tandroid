package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class az extends s4.w {
    public boolean d;
    public final /* synthetic */ cz e;

    public az(cz czVar) {
        this.e = czVar;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        return d1Var.f != 3 ? s4.w.l(0, 0) : s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        if (d1Var.f != d1Var2.f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        cz czVar = this.e;
        zy zyVar = czVar.a;
        cz czVar2 = zyVar.d;
        int i10 = czVar2.n;
        ArrayList arrayList = czVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = czVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l4 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l4);
            zyVar.p(b10, b11);
            ((org.telegram.ui.Cells.g4) d1Var.a).setDrawDivider(b11 != czVar.r - 1);
            ((org.telegram.ui.Cells.g4) d1Var2.a).setDrawDivider(b10 != czVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.d1 d1Var, int i10) {
        cz czVar = this.e;
        if (i10 != 0) {
            czVar.b.I0(false);
            d1Var.a.setPressed(true);
        } else if (this.d) {
            bz bzVar = czVar.f;
            if (bzVar != null) {
                bzVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
    }
}
