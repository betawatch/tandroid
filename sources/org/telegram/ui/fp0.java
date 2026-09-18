package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fp0 extends org.telegram.ui.Components.o81 {
    public final /* synthetic */ cq0 a;

    public fp0(cq0 cq0Var) {
        this.a = cq0Var;
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        cq0 cq0Var = this.a;
        if (i10 == 1) {
            return cq0Var.h;
        }
        if (i10 == 0) {
            return cq0Var.n;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
    }
}
