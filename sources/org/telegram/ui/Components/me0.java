package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements u0.g, c5 {
    public final /* synthetic */ xe0 a;

    public /* synthetic */ me0(xe0 xe0Var) {
        this.a = xe0Var;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        xe0 xe0Var = this.a;
        xe0Var.K.a(xe0Var.N, z10, i10, 0L);
        xe0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.H(!r2.s);
    }
}
