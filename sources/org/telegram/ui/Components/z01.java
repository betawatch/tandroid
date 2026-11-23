package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z01 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ g11 c;

    public z01(g11 g11Var, int i7, long j3) {
        this.c = g11Var;
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
        g11 g11Var = this.c;
        g11Var.o();
        v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
        if (c0Var == null || c0Var.N0() < g11Var.s.c.size() - 3) {
            return;
        }
        if (g11Var.j()) {
            g11Var.k();
            return;
        }
        boolean z10 = g11Var.d;
        int i11 = this.a;
        if (z10) {
            org.telegram.messenger.np.u1(i11).I1().g(false);
            return;
        }
        org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(i11).t7;
        long j3 = -this.b;
        if (f00Var.e(j3)) {
            return;
        }
        f00Var.o(j3);
    }
}
