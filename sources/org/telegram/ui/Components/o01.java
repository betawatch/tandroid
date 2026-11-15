package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o01 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ v01 c;

    public o01(v01 v01Var, int i7, long j3) {
        this.c = v01Var;
        this.a = i7;
        this.b = j3;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.c.w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        v01 v01Var = this.c;
        v01Var.i();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var == null || b0Var.N0() < v01Var.s.c.size() - 3) {
            return;
        }
        boolean z10 = v01Var.d;
        int i11 = this.a;
        if (z10) {
            org.telegram.messenger.np.s1(i11).G1().g(false);
            return;
        }
        org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(i11).r7;
        long j3 = -this.b;
        if (h00Var.e(j3)) {
            return;
        }
        h00Var.o(j3);
    }
}
