package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.q61 {
    public final /* synthetic */ y e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, w wVar) {
        super(wVar);
        this.e = yVar;
    }

    @Override // org.telegram.ui.q61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.i0 = null;
    }
}
