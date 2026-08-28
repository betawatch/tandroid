package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fa0 extends e71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ cb0 b;

    public fa0(cb0 cb0Var, Context context) {
        this.b = cb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        wa0 wa0Var = (wa0) view;
        wa0Var.h();
        wa0Var.k(false);
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        return new wa0(this.b, this.a, i9);
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        return ((za0) this.b.e.a.get(i9)).a;
    }
}
