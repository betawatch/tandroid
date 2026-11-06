package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class o90 extends m61 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ia0 b;

    public o90(ia0 ia0Var, Context context) {
        this.b = ia0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        ca0 ca0Var = (ca0) view;
        ca0Var.i();
        ca0Var.l(false);
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        return new ca0(this.b, this.a, i7);
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.m61
    public final int h(int i7) {
        return ((fa0) this.b.e.a.get(i7)).a;
    }
}
