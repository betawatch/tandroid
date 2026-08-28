package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ky extends f2.d0 {
    public boolean d;
    public final /* synthetic */ my e;

    public ky(my myVar) {
        this.e = myVar;
    }

    @Override // f2.d0
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.a.setPressed(false);
    }

    @Override // f2.d0
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        return q1Var.f != 3 ? f2.d0.l(0, 0) : f2.d0.l(3, 0);
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        if (q1Var.f != q1Var2.f) {
            return false;
        }
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        my myVar = this.e;
        jy jyVar = myVar.a;
        my myVar2 = jyVar.d;
        int i9 = myVar2.n;
        ArrayList arrayList = myVar2.e;
        int i10 = b10 - i9;
        int i11 = b11 - i9;
        int i12 = myVar2.r - i9;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            Long l10 = (Long) arrayList.get(i10);
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, l10);
            jyVar.p(b10, b11);
            ((org.telegram.ui.Cells.g4) q1Var.a).setDrawDivider(b11 != myVar.r - 1);
            ((org.telegram.ui.Cells.g4) q1Var2.a).setDrawDivider(b10 != myVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        my myVar = this.e;
        if (i9 != 0) {
            myVar.b.I0(false);
            q1Var.a.setPressed(true);
        } else if (this.d) {
            ly lyVar = myVar.f;
            if (lyVar != null) {
                lyVar.a();
            }
            this.d = false;
        }
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
    }
}
