package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hb0 extends q81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ gc0 b;

    public hb0(gc0 gc0Var, Context context) {
        this.b = gc0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q81
    public final void b(View view, int i10, int i11) {
        ac0 ac0Var = (ac0) view;
        ac0Var.h();
        ac0Var.k(false);
    }

    @Override // org.telegram.ui.Components.q81
    public final View d(int i10) {
        return new ac0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.q81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.q81
    public final int h(int i10) {
        return ((dc0) this.b.e.a.get(i10)).a;
    }
}
