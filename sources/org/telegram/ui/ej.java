package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ej extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ wn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(wn wnVar, cj cjVar) {
        super(cjVar, -2, -2);
        this.o = wnVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wn wnVar = this.o;
        if (wnVar.Q8 != this) {
            return;
        }
        wnVar.Q8 = null;
        wnVar.T8 = null;
        wnVar.S8 = null;
        wnVar.z0.R = true;
        if (wnVar.R8) {
            wnVar.g8(false, true, 0.0f);
        } else {
            wnVar.R8 = true;
        }
        jk jkVar = wnVar.Y;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        wnVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
