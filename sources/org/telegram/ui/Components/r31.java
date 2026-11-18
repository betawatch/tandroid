package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r31 implements zt0 {
    public int a;
    public boolean b;
    public final /* synthetic */ s31 c;

    public r31(s31 s31Var) {
        this.c = s31Var;
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        if (this.a == i7 && this.b == z10) {
            return;
        }
        this.a = i7;
        this.b = z10;
        if (i7 > org.telegram.messenger.g0.L(20.0f)) {
            s31 s31Var = this.c;
            if (s31Var.h0) {
                return;
            }
            s31Var.o0.r0 = false;
            s31Var.h0 = true;
        }
    }
}
