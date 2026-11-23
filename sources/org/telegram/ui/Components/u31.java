package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u31 implements cu0 {
    public int a;
    public boolean b;
    public final /* synthetic */ v31 c;

    public u31(v31 v31Var) {
        this.c = v31Var;
    }

    @Override // org.telegram.ui.Components.cu0
    public final void L(int i7, boolean z10) {
        if (this.a == i7 && this.b == z10) {
            return;
        }
        this.a = i7;
        this.b = z10;
        if (i7 > org.telegram.messenger.g0.L(20.0f)) {
            v31 v31Var = this.c;
            if (v31Var.h0) {
                return;
            }
            v31Var.o0.r0 = false;
            v31Var.h0 = true;
        }
    }
}
