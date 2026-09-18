package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
