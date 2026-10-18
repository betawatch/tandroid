package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
