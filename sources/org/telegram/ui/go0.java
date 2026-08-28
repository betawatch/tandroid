package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class go0 extends org.telegram.ui.Components.e71 {
    public final /* synthetic */ zo0 a;

    public go0(zo0 zo0Var) {
        this.a = zo0Var;
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        zo0 zo0Var = this.a;
        if (i9 == 1) {
            return zo0Var.f;
        }
        if (i9 == 0) {
            return zo0Var.h;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        return i9;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
    }
}
