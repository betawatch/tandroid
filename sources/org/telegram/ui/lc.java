package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class lc extends r61 {
    public final /* synthetic */ cd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(cd cdVar, kc kcVar) {
        super(kcVar);
        this.e = cdVar;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
