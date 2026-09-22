package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fp0 extends org.telegram.ui.Components.q81 {
    public final /* synthetic */ cq0 a;

    public fp0(cq0 cq0Var) {
        this.a = cq0Var;
    }

    @Override // org.telegram.ui.Components.q81
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

    @Override // org.telegram.ui.Components.q81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.q81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.q81
    public final void b(View view, int i10, int i11) {
    }
}
