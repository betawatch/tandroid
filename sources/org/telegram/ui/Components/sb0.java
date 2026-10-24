package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class sb0 extends d91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ rc0 b;

    public sb0(rc0 rc0Var, Context context) {
        this.b = rc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        lc0 lc0Var = (lc0) view;
        lc0Var.i();
        lc0Var.l(false);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        return new lc0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        return ((oc0) this.b.e.a.get(i10)).a;
    }
}
