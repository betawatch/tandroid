package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ny extends f2.c0 {
    public boolean d;
    public final /* synthetic */ py e;

    public ny(py pyVar) {
        this.e = pyVar;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.a.setPressed(false);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        return o1Var.f != 3 ? f2.c0.l(0, 0) : f2.c0.l(3, 0);
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        if (o1Var.f != o1Var2.f) {
            return false;
        }
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        py pyVar = this.e;
        my myVar = pyVar.a;
        py pyVar2 = myVar.d;
        int i10 = pyVar2.n;
        ArrayList arrayList = pyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = pyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l10 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l10);
            myVar.p(b10, b11);
            ((org.telegram.ui.Cells.d4) o1Var.a).setDrawDivider(b11 != pyVar.r - 1);
            ((org.telegram.ui.Cells.d4) o1Var2.a).setDrawDivider(b10 != pyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        py pyVar = this.e;
        if (i10 != 0) {
            pyVar.b.I0(false);
            o1Var.a.setPressed(true);
        } else if (this.d) {
            oy oyVar = pyVar.f;
            if (oyVar != null) {
                oyVar.a();
            }
            this.d = false;
        }
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }
}
