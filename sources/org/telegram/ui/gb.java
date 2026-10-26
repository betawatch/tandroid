package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
