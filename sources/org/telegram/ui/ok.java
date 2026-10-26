package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.pl0 {
    public final /* synthetic */ un l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(un unVar, oj ojVar, rj rjVar) {
        super(ojVar, rjVar);
        this.l = unVar;
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
