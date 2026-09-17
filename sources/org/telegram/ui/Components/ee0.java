package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements u0.g, d5 {
    public final /* synthetic */ pe0 a;

    public /* synthetic */ ee0(pe0 pe0Var) {
        this.a = pe0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        pe0 pe0Var = this.a;
        pe0Var.K.b(pe0Var.N, z10, i10, 0L);
        pe0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.H(!r2.s);
    }
}
