package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ta0 extends q71 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ rb0 b;

    public ta0(rb0 rb0Var, Context context) {
        this.b = rb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        lb0 lb0Var = (lb0) view;
        lb0Var.h();
        lb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        return new lb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        return ((ob0) this.b.e.a.get(i10)).a;
    }
}
