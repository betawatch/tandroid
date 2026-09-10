package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gb extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ wb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.o = wbVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wb wbVar = this.o;
        if (wbVar.J0 != this) {
            return;
        }
        org.telegram.ui.Components.pc.e();
        wbVar.J0 = null;
    }
}
