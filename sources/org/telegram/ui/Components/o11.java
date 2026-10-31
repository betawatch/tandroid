package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o11 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ t11 c;

    public o11(t11 t11Var, int i10, long j10) {
        this.c = t11Var;
        this.a = i10;
        this.b = j10;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        EditText editText = this.c.x;
        if (i10 == 1 && editText.hasFocus()) {
            org.telegram.messenger.i0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t11 t11Var = this.c;
        t11Var.g();
        s4.a0 a0Var = (s4.a0) recyclerView.getLayoutManager();
        if (a0Var == null || a0Var.N0() < t11Var.w.c.size() - 3) {
            return;
        }
        boolean z10 = t11Var.d;
        int i12 = this.a;
        if (z10) {
            org.telegram.messenger.vp.r1(i12).F1().g(false);
            return;
        }
        org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(i12).r7;
        long j10 = -this.b;
        if (x00Var.e(j10)) {
            return;
        }
        x00Var.o(j10);
    }
}
