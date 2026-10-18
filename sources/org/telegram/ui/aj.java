package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class aj extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ sn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(sn snVar, yi yiVar) {
        super(yiVar, -2, -2);
        this.o = snVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        sn snVar = this.o;
        if (snVar.Q8 != this) {
            return;
        }
        snVar.Q8 = null;
        snVar.T8 = null;
        snVar.S8 = null;
        snVar.z0.R = true;
        if (snVar.R8) {
            snVar.j8(false, true, 0.0f);
        } else {
            snVar.R8 = true;
        }
        hk hkVar = snVar.Y;
        if (hkVar == null || hkVar.getEditField() == null) {
            return;
        }
        snVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
