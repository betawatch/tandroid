package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l01 implements a5.i {
    public int a;
    public final /* synthetic */ m01 b;

    public l01(m01 m01Var) {
        this.b = m01Var;
    }

    @Override // a5.i
    public final void a(int i10) {
        m01 m01Var = this.b;
        ProfileActivity profileActivity = m01Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        m01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.x()) {
            AndroidUtilities.runOnUIThread(new my0(m01Var, 5), 500L);
        } else {
            m01Var.c();
        }
    }

    @Override // a5.i
    public final void c(int i10) {
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
    }
}
