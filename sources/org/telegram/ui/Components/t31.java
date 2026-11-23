package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t31 implements bu0 {
    public int a;
    public boolean b;
    public final /* synthetic */ u31 c;

    public t31(u31 u31Var) {
        this.c = u31Var;
    }

    @Override // org.telegram.ui.Components.bu0
    public final void L(int i7, boolean z10) {
        if (this.a == i7 && this.b == z10) {
            return;
        }
        this.a = i7;
        this.b = z10;
        if (i7 > org.telegram.messenger.g0.L(20.0f)) {
            u31 u31Var = this.c;
            if (u31Var.h0) {
                return;
            }
            u31Var.o0.r0 = false;
            u31Var.h0 = true;
        }
    }
}
