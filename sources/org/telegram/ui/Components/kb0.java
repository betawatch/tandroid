package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class kb0 extends y81 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ic0 b;

    public kb0(ic0 ic0Var, Context context) {
        this.b = ic0Var;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        cc0 cc0Var = (cc0) view;
        cc0Var.h();
        cc0Var.k(false);
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        return new cc0(this.b, this.a, i10);
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // org.telegram.ui.Components.y81
    public final int h(int i10) {
        return ((fc0) this.b.e.a.get(i10)).a;
    }
}
