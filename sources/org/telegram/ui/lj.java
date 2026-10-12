package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lj extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ fo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(fo foVar, jj jjVar) {
        super(jjVar, -2, -2);
        this.o = foVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        fo foVar = this.o;
        if (foVar.Q8 != this) {
            return;
        }
        foVar.Q8 = null;
        foVar.T8 = null;
        foVar.S8 = null;
        foVar.z0.R = true;
        if (foVar.R8) {
            foVar.j8(false, true, 0.0f);
        } else {
            foVar.R8 = true;
        }
        sk skVar = foVar.Y;
        if (skVar == null || skVar.getEditField() == null) {
            return;
        }
        foVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
