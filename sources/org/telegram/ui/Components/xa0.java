package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xa0 extends z71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ub0 b;

    public xa0(ub0 ub0Var, Context context) {
        this.b = ub0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.z71
    public final void b(View view, int i10, int i11) {
        ob0 ob0Var = (ob0) view;
        ob0Var.h();
        ob0Var.k(false);
    }

    @Override // org.telegram.ui.Components.z71
    public final View d(int i10) {
        return new ob0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.z71
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.z71
    public final int h(int i10) {
        return ((rb0) this.b.e.a.get(i10)).a;
    }
}
