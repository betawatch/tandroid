package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class t20 implements jg.y1 {
    public final /* synthetic */ u20 a;

    public t20(u20 u20Var) {
        this.a = u20Var;
    }

    @Override // jg.y1
    public final a0.h K0() {
        return this.a.x.Z1;
    }

    @Override // jg.y1
    public final /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // jg.y1
    public final void r(int i7) {
        u20 u20Var = this.a;
        v20 v20Var = u20Var.x;
        if (i7 < 0 || i7 != u20Var.n || u20Var.h) {
            return;
        }
        int i10 = u20Var.f - 1;
        boolean z10 = v20Var.u1.getVisibility() == 0;
        u20Var.f();
        if (u20Var.f > i10) {
            v20Var.P0(i10);
        }
        if (u20Var.d.e() || !v20Var.o1.R0()) {
            return;
        }
        v20Var.u1.e(false, z10);
    }

    @Override // jg.y1
    public final /* synthetic */ boolean v1(int i7) {
        return true;
    }

    @Override // jg.y1
    public final /* synthetic */ void P1(ArrayList arrayList) {
    }
}
