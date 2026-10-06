package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class dq implements pw0 {
    public final /* synthetic */ bq a;
    public final /* synthetic */ fq b;

    public dq(fq fqVar, bq bqVar) {
        this.b = fqVar;
        this.a = bqVar;
    }

    @Override // org.telegram.ui.Components.pw0
    public final void j(int i10) {
        fq fqVar = this.b;
        fqVar.r = i10;
        fqVar.p(true);
    }

    @Override // org.telegram.ui.Components.pw0
    public final void l() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        bq bqVar = this.a;
        bqVar.z(0 - bqVar.getScrollX(), measuredHeight - bqVar.getScrollY(), false);
    }
}
