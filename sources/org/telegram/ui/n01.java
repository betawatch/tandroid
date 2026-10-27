package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n01 implements a5.i {
    public int a;
    public final /* synthetic */ o01 b;

    public n01(o01 o01Var) {
        this.b = o01Var;
    }

    @Override // a5.i
    public final void a(int i10) {
        o01 o01Var = this.b;
        ProfileActivity profileActivity = o01Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        o01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.x()) {
            AndroidUtilities.runOnUIThread(new oy0(o01Var, 5), 500L);
        } else {
            o01Var.c();
        }
    }

    @Override // a5.i
    public final void c(int i10) {
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
    }
}
