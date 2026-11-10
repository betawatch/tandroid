package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d91 extends v4.s0 {
    public int a;
    public int b;
    public final /* synthetic */ z91 c;

    public d91(z91 z91Var) {
        this.c = z91Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    @Override // v4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        boolean z10;
        z91 z91Var = this.c;
        int L0 = z91Var.F.L0();
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
                        z91Var.K0(z9 || !z91Var.K, true);
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
