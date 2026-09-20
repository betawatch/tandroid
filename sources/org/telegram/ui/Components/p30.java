package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class p30 implements gg.b2 {
    public final /* synthetic */ q30 a;

    public p30(q30 q30Var) {
        this.a = q30Var;
    }

    @Override // gg.b2
    public final /* synthetic */ boolean F(int i10) {
        return true;
    }

    @Override // gg.b2
    public final void a(int i10) {
        q30 q30Var = this.a;
        r30 r30Var = q30Var.w;
        if (i10 < 0 || i10 != q30Var.n || q30Var.h) {
            return;
        }
        int i11 = q30Var.f - 1;
        boolean z10 = r30Var.s.getVisibility() == 0;
        q30Var.l();
        if (q30Var.f > i11) {
            r30Var.J(i11);
        }
        if (q30Var.d.e() || !r30Var.d.T0()) {
            return;
        }
        r30Var.s.e(false, z10);
    }

    @Override // gg.b2
    public final a0.i l() {
        return this.a.w.e0;
    }

    @Override // gg.b2
    public final /* synthetic */ a0.i w() {
        return null;
    }

    @Override // gg.b2
    public final /* synthetic */ void G(ArrayList arrayList) {
    }
}
