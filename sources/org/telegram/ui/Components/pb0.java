package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pb0 extends m91 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ nc0 b;

    public pb0(nc0 nc0Var, Context context) {
        this.b = nc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        hc0 hc0Var = (hc0) view;
        hc0Var.i();
        hc0Var.l(false);
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        return new hc0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        return ((kc0) this.b.e.a.get(i10)).a;
    }
}
