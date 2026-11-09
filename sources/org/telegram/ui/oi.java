package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
