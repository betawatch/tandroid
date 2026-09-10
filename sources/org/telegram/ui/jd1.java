package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jd1 extends ae1 {
    public final /* synthetic */ eo k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd1(Object obj, eo eoVar, boolean z10) {
        super(obj, null, true);
        this.k2 = eoVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        bo boVar = this.k2.ea;
        boVar.i(boVar.f, boVar.h, false, Boolean.valueOf(this.l2), false);
    }
}
