package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i01 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ n01 c;

    public i01(n01 n01Var, int i3, long j10) {
        this.c = n01Var;
        this.a = i3;
        this.b = j10;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        EditText editText = this.c.w;
        if (i3 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        n01 n01Var = this.c;
        n01Var.h();
        u4.b0 b0Var = (u4.b0) recyclerView.getLayoutManager();
        if (b0Var == null || b0Var.N0() < n01Var.s.c.size() - 3) {
            return;
        }
        boolean z10 = n01Var.d;
        int i11 = this.a;
        if (z10) {
            org.telegram.messenger.hp.s1(i11).G1().g(false);
            return;
        }
        org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(i11).q7;
        long j10 = -this.b;
        if (c00Var.e(j10)) {
            return;
        }
        c00Var.o(j10);
    }
}
