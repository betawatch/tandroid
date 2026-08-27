package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ja0 extends g71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ gb0 b;

    public ja0(gb0 gb0Var, Context context) {
        this.b = gb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        ab0 ab0Var = (ab0) view;
        ab0Var.h();
        ab0Var.k(false);
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        return new ab0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        return ((db0) this.b.e.a.get(i10)).a;
    }
}
