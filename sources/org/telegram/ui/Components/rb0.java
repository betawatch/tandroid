package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class rb0 extends w81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ oc0 b;

    public rb0(oc0 oc0Var, Context context) {
        this.b = oc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
        ic0 ic0Var = (ic0) view;
        ic0Var.i();
        ic0Var.l(false);
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        return new ic0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        return ((lc0) this.b.e.a.get(i10)).a;
    }
}
