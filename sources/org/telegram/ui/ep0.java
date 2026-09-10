package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ep0 extends org.telegram.ui.Components.n81 {
    public final /* synthetic */ bq0 a;

    public ep0(bq0 bq0Var) {
        this.a = bq0Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        bq0 bq0Var = this.a;
        if (i10 == 1) {
            return bq0Var.h;
        }
        if (i10 == 0) {
            return bq0Var.n;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
    }
}
