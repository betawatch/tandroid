package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ba0 extends y61 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ua0 b;

    public ba0(ua0 ua0Var, Context context) {
        this.b = ua0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        oa0 oa0Var = (oa0) view;
        oa0Var.i();
        oa0Var.l(false);
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        return new oa0(this.b, this.a, i7);
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.y61
    public final int h(int i7) {
        return ((ra0) this.b.e.a.get(i7)).a;
    }
}
