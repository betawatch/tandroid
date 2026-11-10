package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fx extends v4.v {
    public boolean d;
    public final /* synthetic */ hx e;

    public fx(hx hxVar) {
        this.e = hxVar;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        return d1Var.f != 3 ? v4.v.l(0, 0) : v4.v.l(3, 0);
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        if (d1Var.f != d1Var2.f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        hx hxVar = this.e;
        ex exVar = hxVar.a;
        hx hxVar2 = exVar.f;
        int i7 = hxVar2.n;
        ArrayList arrayList = hxVar2.e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = hxVar2.r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            Long l10 = (Long) arrayList.get(i10);
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, l10);
            exVar.j(b10, b11);
            ((org.telegram.ui.Cells.h4) d1Var.a).setDrawDivider(b11 != hxVar.r - 1);
            ((org.telegram.ui.Cells.h4) d1Var2.a).setDrawDivider(b10 != hxVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        hx hxVar = this.e;
        if (i7 != 0) {
            hxVar.b.I0(false);
            d1Var.a.setPressed(true);
        } else if (this.d) {
            gx gxVar = hxVar.f;
            if (gxVar != null) {
                gxVar.a();
            }
            this.d = false;
        }
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
    }
}
