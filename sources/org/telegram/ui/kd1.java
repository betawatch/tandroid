package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kd1 implements rd1 {
    public boolean a;
    public final /* synthetic */ eo b;

    public kd1(eo eoVar, boolean z10) {
        this.b = eoVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.rd1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.rd1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.rd1
    public final void n1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        bo boVar = this.b.ea;
        boVar.i(boVar.f, boVar.h, z10, Boolean.valueOf(z11), false);
    }
}
