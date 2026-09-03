package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dj extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ xn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(xn xnVar, bj bjVar) {
        super(bjVar, -2, -2);
        this.o = xnVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        xn xnVar = this.o;
        if (xnVar.N8 != this) {
            return;
        }
        xnVar.N8 = null;
        xnVar.Q8 = null;
        xnVar.P8 = null;
        xnVar.w0.R = true;
        if (xnVar.O8) {
            xnVar.g8(false, true, 0.0f);
        } else {
            xnVar.O8 = true;
        }
        jk jkVar = xnVar.V;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        xnVar.V.getEditField().setAllowDrawCursor(true);
    }
}
