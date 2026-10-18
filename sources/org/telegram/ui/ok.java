package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ sn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(sn snVar, pj pjVar, sj sjVar) {
        super(pjVar, sjVar);
        this.l = snVar;
    }

    public final void e(int i10) {
        if (this.l.Qa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
