package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c91 extends v4.u0 {
    public int a;
    public int b;
    public final /* synthetic */ y91 c;

    public c91(y91 y91Var) {
        this.c = y91Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    @Override // v4.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        boolean z11;
        y91 y91Var = this.c;
        int L0 = y91Var.G.L0();
        if (L0 != -1) {
            v4.f1 K = recyclerView.K(L0);
            int top = K != null ? K.a.getTop() : 0;
            int i11 = this.a;
            if (i11 == L0) {
                int i12 = this.b;
                int i13 = i12 - top;
                z10 = top < i12;
                if (Math.abs(i13) <= 1) {
                    z11 = false;
                    if (z11) {
                        y91Var.K0(z10 || !y91Var.L, true);
                    }
                    this.a = L0;
                    this.b = top;
                }
            } else {
                z10 = L0 > i11;
            }
            z11 = true;
            if (z11) {
            }
            this.a = L0;
            this.b = top;
        }
    }
}
