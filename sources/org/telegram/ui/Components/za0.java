package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class za0 extends c81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xb0 b;

    public za0(xb0 xb0Var, Context context) {
        this.b = xb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        rb0 rb0Var = (rb0) view;
        rb0Var.h();
        rb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        return new rb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        return ((ub0) this.b.e.a.get(i10)).a;
    }
}
