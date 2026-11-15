package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r90 extends n61 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ka0 b;

    public r90(ka0 ka0Var, Context context) {
        this.b = ka0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        ea0 ea0Var = (ea0) view;
        ea0Var.i();
        ea0Var.l(false);
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        return new ea0(this.b, this.a, i7);
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return ((ha0) this.b.e.a.get(i7)).a;
    }
}
