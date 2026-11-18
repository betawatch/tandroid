package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ix extends v4.w {
    public boolean d;
    public final /* synthetic */ kx e;

    public ix(kx kxVar) {
        this.e = kxVar;
    }

    @Override // v4.w
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.a.setPressed(false);
    }

    @Override // v4.w
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        return f1Var.f != 3 ? v4.w.l(0, 0) : v4.w.l(3, 0);
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        if (f1Var.f != f1Var2.f) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        kx kxVar = this.e;
        hx hxVar = kxVar.a;
        kx kxVar2 = hxVar.f;
        int i7 = kxVar2.n;
        ArrayList arrayList = kxVar2.e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = kxVar2.r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            Long l10 = (Long) arrayList.get(i10);
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, l10);
            hxVar.j(b10, b11);
            ((org.telegram.ui.Cells.i4) f1Var.a).setDrawDivider(b11 != kxVar.r - 1);
            ((org.telegram.ui.Cells.i4) f1Var2.a).setDrawDivider(b10 != kxVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        kx kxVar = this.e;
        if (i7 != 0) {
            kxVar.b.I0(false);
            f1Var.a.setPressed(true);
        } else if (this.d) {
            jx jxVar = kxVar.f;
            if (jxVar != null) {
                jxVar.a();
            }
            this.d = false;
        }
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
    }
}
