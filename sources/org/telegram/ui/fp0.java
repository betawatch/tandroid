package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
