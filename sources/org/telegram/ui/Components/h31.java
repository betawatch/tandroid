package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
