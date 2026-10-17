package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class hb extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ xb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(xb xbVar, gb gbVar) {
        super(gbVar, -2, -2);
        this.o = xbVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        xb xbVar = this.o;
        if (xbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        xbVar.F0 = null;
    }
}
