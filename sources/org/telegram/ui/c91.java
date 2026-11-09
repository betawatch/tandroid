package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c91 extends v4.s0 {
    public int a;
    public int b;
    public final /* synthetic */ y91 c;

    public c91(y91 y91Var) {
        this.c = y91Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    @Override // v4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        boolean z10;
        y91 y91Var = this.c;
        int L0 = y91Var.F.L0();
        if (L0 != -1) {
            v4.d1 K = recyclerView.K(L0);
            int top = K != null ? K.a.getTop() : 0;
            int i11 = this.a;
            if (i11 == L0) {
                int i12 = this.b;
                int i13 = i12 - top;
                z9 = top < i12;
                if (Math.abs(i13) <= 1) {
                    z10 = false;
                    if (z10) {
                        y91Var.K0(z9 || !y91Var.K, true);
                    }
                    this.a = L0;
                    this.b = top;
                }
            } else {
                z9 = L0 > i11;
            }
            z10 = true;
            if (z10) {
            }
            this.a = L0;
            this.b = top;
        }
    }
}
