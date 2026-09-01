package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class po0 extends org.telegram.ui.Components.e81 {
    public final /* synthetic */ ip0 a;

    public po0(ip0 ip0Var) {
        this.a = ip0Var;
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        ip0 ip0Var = this.a;
        if (i10 == 1) {
            return ip0Var.f;
        }
        if (i10 == 0) {
            return ip0Var.h;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.e81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
    }
}
