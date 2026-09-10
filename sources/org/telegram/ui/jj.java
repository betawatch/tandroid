package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ eo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(eo eoVar, hj hjVar) {
        super(hjVar, -2, -2);
        this.o = eoVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        eo eoVar = this.o;
        if (eoVar.Q8 != this) {
            return;
        }
        eoVar.Q8 = null;
        eoVar.T8 = null;
        eoVar.S8 = null;
        eoVar.z0.R = true;
        if (eoVar.R8) {
            eoVar.g8(false, true, 0.0f);
        } else {
            eoVar.R8 = true;
        }
        ok okVar = eoVar.Y;
        if (okVar == null || okVar.getEditField() == null) {
            return;
        }
        eoVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
