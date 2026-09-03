package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fj extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ zn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(zn znVar, dj djVar) {
        super(djVar, -2, -2);
        this.o = znVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zn znVar = this.o;
        if (znVar.N8 != this) {
            return;
        }
        znVar.N8 = null;
        znVar.Q8 = null;
        znVar.P8 = null;
        znVar.w0.R = true;
        if (znVar.O8) {
            znVar.g8(false, true, 0.0f);
        } else {
            znVar.O8 = true;
        }
        lk lkVar = znVar.V;
        if (lkVar == null || lkVar.getEditField() == null) {
            return;
        }
        znVar.V.getEditField().setAllowDrawCursor(true);
    }
}
