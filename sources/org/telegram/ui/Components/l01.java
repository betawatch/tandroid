package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l01 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ s01 c;

    public l01(s01 s01Var, int i7, long j3) {
        this.c = s01Var;
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
        s01 s01Var = this.c;
        s01Var.i();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var == null || b0Var.N0() < s01Var.s.c.size() - 3) {
            return;
        }
        boolean z9 = s01Var.d;
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
