package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bq implements sv0 {
    public final /* synthetic */ zp a;
    public final /* synthetic */ dq b;

    public bq(dq dqVar, zp zpVar) {
        this.b = dqVar;
        this.a = zpVar;
    }

    @Override // org.telegram.ui.Components.sv0
    public final void g(int i10) {
        dq dqVar = this.b;
        dqVar.r = i10;
        dqVar.p(true);
    }

    @Override // org.telegram.ui.Components.sv0
    public final void l() {
        int measuredHeight = this.b.c.getMeasuredHeight();
        zp zpVar = this.a;
        zpVar.y(0 - zpVar.getScrollX(), measuredHeight - zpVar.getScrollY(), false);
    }
}
