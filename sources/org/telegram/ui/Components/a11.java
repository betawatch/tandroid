package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class a11 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ h11 c;

    public a11(h11 h11Var, int i7, long j3) {
        this.c = h11Var;
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
        h11 h11Var = this.c;
        h11Var.o();
        v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
        if (c0Var == null || c0Var.N0() < h11Var.s.c.size() - 3) {
            return;
        }
        if (h11Var.j()) {
            h11Var.k();
            return;
        }
        boolean z10 = h11Var.d;
        int i11 = this.a;
        if (z10) {
            org.telegram.messenger.mp.u1(i11).I1().g(false);
            return;
        }
        org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(i11).t7;
        long j3 = -this.b;
        if (e00Var.e(j3)) {
            return;
        }
        e00Var.o(j3);
    }
}
