package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class gb extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ wb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.o = wbVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wb wbVar = this.o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.rc.e();
        wbVar.F0 = null;
    }
}
