package org.telegram.ui;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class gd1 implements nd1 {
    public boolean a;
    public final /* synthetic */ co b;

    public gd1(co coVar, boolean z10) {
        this.b = coVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.nd1
    public final boolean Z0() {
        return true;
    }

    @Override // org.telegram.ui.nd1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.nd1
    public final void p1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        ao aoVar = this.b.ea;
        aoVar.i(aoVar.f, aoVar.h, z10, Boolean.valueOf(z11), false);
    }
}
