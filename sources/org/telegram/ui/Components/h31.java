package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h31 implements rt0 {
    public int a;
    public boolean b;
    public final /* synthetic */ i31 c;

    public h31(i31 i31Var) {
        this.c = i31Var;
    }

    @Override // org.telegram.ui.Components.rt0
    public final void L(int i7, boolean z10) {
        if (this.a == i7 && this.b == z10) {
            return;
        }
        this.a = i7;
        this.b = z10;
        if (i7 > org.telegram.messenger.g0.L(20.0f)) {
            i31 i31Var = this.c;
            if (i31Var.h0) {
                return;
            }
            i31Var.o0.r0 = false;
            i31Var.h0 = true;
        }
    }
}
