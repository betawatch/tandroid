package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nx extends q61 {
    public final /* synthetic */ ry e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(ry ryVar, mx mxVar) {
        super(mxVar);
        this.e = ryVar;
    }

    @Override // org.telegram.ui.q61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
