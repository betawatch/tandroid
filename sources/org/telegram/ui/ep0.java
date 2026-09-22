package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ep0 extends org.telegram.ui.Components.a81 {
    public final /* synthetic */ aq0 a;

    public ep0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        aq0 aq0Var = this.a;
        if (i10 == 1) {
            return aq0Var.h;
        }
        if (i10 == 0) {
            return aq0Var.n;
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
