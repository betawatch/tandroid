package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yb0 extends f91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ vc0 b;

    public yb0(vc0 vc0Var, Context context) {
        this.b = vc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(View view, int i10, int i11) {
        pc0 pc0Var = (pc0) view;
        pc0Var.h();
        pc0Var.k(false);
    }

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        return new pc0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.f91
    public final int h(int i10) {
        return ((sc0) this.b.e.a.get(i10)).a;
    }
}
