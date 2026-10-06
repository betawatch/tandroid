package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class fj extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ yn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(yn ynVar, dj djVar) {
        super(djVar, -2, -2);
        this.o = ynVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        yn ynVar = this.o;
        if (ynVar.O8 != this) {
            return;
        }
        ynVar.O8 = null;
        ynVar.R8 = null;
        ynVar.Q8 = null;
        ynVar.x0.R = true;
        if (ynVar.P8) {
            ynVar.g8(false, true, 0.0f);
        } else {
            ynVar.P8 = true;
        }
        jk jkVar = ynVar.W;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        ynVar.W.getEditField().setAllowDrawCursor(true);
    }
}
