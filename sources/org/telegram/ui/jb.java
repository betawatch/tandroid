package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jb extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ac o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(ac acVar, ib ibVar) {
        super(ibVar, -2, -2);
        this.o = acVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ac acVar = this.o;
        if (acVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.sc.e();
        acVar.F0 = null;
    }
}
