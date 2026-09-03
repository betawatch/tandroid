package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ab0 extends d81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yb0 b;

    public ab0(yb0 yb0Var, Context context) {
        this.b = yb0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
        sb0 sb0Var = (sb0) view;
        sb0Var.h();
        sb0Var.k(false);
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        return new sb0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.d81
    public final int h(int i10) {
        return ((vb0) this.b.e.a.get(i10)).a;
    }
}
