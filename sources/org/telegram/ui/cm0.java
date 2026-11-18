package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cm0 extends i11 {
    public final /* synthetic */ fm0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm0(fm0 fm0Var, bm0 bm0Var) {
        super(bm0Var);
        this.e = fm0Var;
    }

    @Override // org.telegram.ui.i11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
