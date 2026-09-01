package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nc1 extends ed1 {
    public final /* synthetic */ xn h2;
    public final /* synthetic */ boolean i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc1(Object obj, xn xnVar, boolean z4) {
        super(obj, null, true);
        this.h2 = xnVar;
        this.i2 = z4;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.h2.ba;
        vnVar.i(vnVar.f, vnVar.h, false, Boolean.valueOf(this.i2), false);
    }
}
