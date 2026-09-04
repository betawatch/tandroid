package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class fp0 extends org.telegram.ui.Components.a81 {
    public final /* synthetic */ bq0 a;

    public fp0(bq0 bq0Var) {
        this.a = bq0Var;
    }

    @Override // org.telegram.ui.Components.a81
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

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
    }
}
