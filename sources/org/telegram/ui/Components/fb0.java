package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class fb0 extends o81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ec0 b;

    public fb0(ec0 ec0Var, Context context) {
        this.b = ec0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        yb0 yb0Var = (yb0) view;
        yb0Var.h();
        yb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        return new yb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        return ((bc0) this.b.e.a.get(i10)).a;
    }
}
