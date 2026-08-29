package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fo0 extends org.telegram.ui.Components.q71 {
    public final /* synthetic */ yo0 a;

    public fo0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        yo0 yo0Var = this.a;
        if (i10 == 1) {
            return yo0Var.f;
        }
        if (i10 == 0) {
            return yo0Var.h;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
    }
}
