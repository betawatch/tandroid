package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y01 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ f11 c;

    public y01(f11 f11Var, int i7, long j3) {
        this.c = f11Var;
        this.a = i7;
        this.b = j3;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.c.w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        f11 f11Var = this.c;
        f11Var.o();
        v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
        if (c0Var == null || c0Var.N0() < f11Var.s.c.size() - 3) {
            return;
        }
        if (f11Var.j()) {
            f11Var.k();
            return;
        }
        boolean z10 = f11Var.d;
        int i11 = this.a;
        if (z10) {
            org.telegram.messenger.mp.u1(i11).I1().g(false);
            return;
        }
        org.telegram.messenger.d00 d00Var = org.telegram.messenger.mp.u1(i11).t7;
        long j3 = -this.b;
        if (d00Var.e(j3)) {
            return;
        }
        d00Var.o(j3);
    }
}
