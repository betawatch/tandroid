package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class oi extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ cn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(cn cnVar, mi miVar) {
        super(miVar, -2, -2);
        this.o = cnVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        cn cnVar = this.o;
        if (cnVar.e9 != this) {
            return;
        }
        cnVar.e9 = null;
        cnVar.j9 = null;
        cnVar.i9 = null;
        cnVar.B0.R = true;
        if (cnVar.f9) {
            cnVar.w8(false, true, 0.0f);
        } else {
            cnVar.f9 = true;
        }
        sj sjVar = cnVar.Z;
        if (sjVar == null || sjVar.getEditField() == null) {
            return;
        }
        cnVar.Z.getEditField().setAllowDrawCursor(true);
    }
}
