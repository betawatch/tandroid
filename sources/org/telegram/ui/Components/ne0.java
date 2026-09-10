package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements u0.g, c5 {
    public final /* synthetic */ ye0 a;

    public /* synthetic */ ne0(ye0 ye0Var) {
        this.a = ye0Var;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        ye0 ye0Var = this.a;
        ye0Var.K.a(ye0Var.N, z10, i10, 0L);
        ye0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.H(!r2.s);
    }
}
