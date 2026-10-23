package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nk extends org.telegram.ui.Components.pl0 {
    public final /* synthetic */ sn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(sn snVar, nj njVar, qj qjVar) {
        super(njVar, qjVar);
        this.l = snVar;
    }

    public final void e(int i10) {
        if (this.l.cb) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
