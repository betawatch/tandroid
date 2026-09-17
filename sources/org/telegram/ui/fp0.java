package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
