package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dq implements ow0 {
    public final /* synthetic */ bq a;
    public final /* synthetic */ fq b;

    public dq(fq fqVar, bq bqVar) {
        this.b = fqVar;
        this.a = bqVar;
    }

    @Override // org.telegram.ui.Components.ow0
    public final void j(int i10) {
        fq fqVar = this.b;
        fqVar.r = i10;
        fqVar.p(true);
    }

    @Override // org.telegram.ui.Components.ow0
    public final void l() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        bq bqVar = this.a;
        bqVar.z(0 - bqVar.getScrollX(), measuredHeight - bqVar.getScrollY(), false);
    }
}
