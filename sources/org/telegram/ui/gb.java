package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gb extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ wb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.o = wbVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wb wbVar = this.o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        wbVar.F0 = null;
    }
}
