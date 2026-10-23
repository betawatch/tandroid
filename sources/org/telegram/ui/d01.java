package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class d01 implements z4.e {
    public int a;
    public final /* synthetic */ e01 b;

    public d01(e01 e01Var) {
        this.b = e01Var;
    }

    @Override // z4.e
    public final void b(int i10) {
        e01 e01Var = this.b;
        ProfileActivity profileActivity = e01Var.n;
        int k10 = profileActivity.o0.D0.k(i10);
        e01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.r0 == null) {
            return;
        }
        if (profileActivity.U0.t()) {
            AndroidUtilities.runOnUIThread(new qy0(e01Var, 3), 500L);
        } else {
            e01Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
    }
}
