package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k90 extends f61 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ da0 b;

    public k90(da0 da0Var, Context context) {
        this.b = da0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
        x90 x90Var = (x90) view;
        x90Var.i();
        x90Var.l(false);
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        return new x90(this.b, this.a, i3);
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.f61
    public final int h(int i3) {
        return ((aa0) this.b.e.a.get(i3)).a;
    }
}
