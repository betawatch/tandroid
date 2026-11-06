package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i01 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ n01 c;

    public i01(n01 n01Var, int i7, long j3) {
        this.c = n01Var;
        this.a = i7;
        this.b = j3;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.c.w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        n01 n01Var = this.c;
        n01Var.h();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var == null || b0Var.N0() < n01Var.s.c.size() - 3) {
            return;
        }
        boolean z9 = n01Var.d;
        int i11 = this.a;
        if (z9) {
            org.telegram.messenger.qp.s1(i11).G1().g(false);
            return;
        }
        org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i11).q7;
        long j3 = -this.b;
        if (k00Var.e(j3)) {
            return;
        }
        k00Var.o(j3);
    }
}
