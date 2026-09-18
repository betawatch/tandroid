package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gp0 extends org.telegram.ui.Components.b81 {
    public final /* synthetic */ cq0 a;

    public gp0(cq0 cq0Var) {
        this.a = cq0Var;
    }

    @Override // org.telegram.ui.Components.b81
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

    @Override // org.telegram.ui.Components.b81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.b81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.b81
    public final void b(View view, int i10, int i11) {
    }
}
