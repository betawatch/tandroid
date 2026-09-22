package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class k31 extends a71 {
    public final /* synthetic */ m31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(m31 m31Var, j31 j31Var) {
        super(j31Var);
        this.e = m31Var;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
