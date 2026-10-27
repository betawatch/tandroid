package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cj extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ wn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(wn wnVar, aj ajVar) {
        super(ajVar, -2, -2);
        this.o = wnVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wn wnVar = this.o;
        if (wnVar.g9 != this) {
            return;
        }
        wnVar.g9 = null;
        wnVar.j9 = null;
        wnVar.i9 = null;
        wnVar.z0.R = true;
        if (wnVar.h9) {
            wnVar.p8(false, true, 0.0f);
        } else {
            wnVar.h9 = true;
        }
        jk jkVar = wnVar.Y;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        wnVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
