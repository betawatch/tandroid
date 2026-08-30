package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class no0 extends org.telegram.ui.Components.c81 {
    public final /* synthetic */ gp0 a;

    public no0(gp0 gp0Var) {
        this.a = gp0Var;
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        gp0 gp0Var = this.a;
        if (i10 == 1) {
            return gp0Var.f;
        }
        if (i10 == 0) {
            return gp0Var.h;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
    }
}
