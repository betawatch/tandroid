package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class jy extends s4.v {
    public boolean d;
    public final /* synthetic */ ly e;

    public jy(ly lyVar) {
        this.e = lyVar;
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
        ly lyVar = this.e;
        iy iyVar = lyVar.a;
        ly lyVar2 = iyVar.d;
        int i10 = lyVar2.n;
        ArrayList arrayList = lyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = lyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l4 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l4);
            iyVar.p(b10, b11);
            ((org.telegram.ui.Cells.f4) b1Var.a).setDrawDivider(b11 != lyVar.r - 1);
            ((org.telegram.ui.Cells.f4) b1Var2.a).setDrawDivider(b10 != lyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        ly lyVar = this.e;
        if (i10 != 0) {
            lyVar.b.I0(false);
            b1Var.a.setPressed(true);
        } else if (this.d) {
            ky kyVar = lyVar.f;
            if (kyVar != null) {
                kyVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
