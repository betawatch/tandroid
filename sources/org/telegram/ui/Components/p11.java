package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p11 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ u11 c;

    public p11(u11 u11Var, int i10, long j10) {
        this.c = u11Var;
        this.a = i10;
        this.b = j10;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        EditText editText = this.c.w;
        if (i10 == 1 && editText.hasFocus()) {
            org.telegram.messenger.i0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u11 u11Var = this.c;
        u11Var.h();
        s4.a0 a0Var = (s4.a0) recyclerView.getLayoutManager();
        if (a0Var == null || a0Var.N0() < u11Var.s.c.size() - 3) {
            return;
        }
        boolean z10 = u11Var.d;
        int i12 = this.a;
        if (z10) {
            org.telegram.messenger.wp.r1(i12).F1().g(false);
            return;
        }
        org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(i12).r7;
        long j10 = -this.b;
        if (y00Var.e(j10)) {
            return;
        }
        y00Var.o(j10);
    }
}
