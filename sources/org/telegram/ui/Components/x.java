package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x extends org.telegram.ui.e11 {
    public final /* synthetic */ y e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, w wVar) {
        super(wVar);
        this.e = yVar;
    }

    @Override // org.telegram.ui.e11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.e2 = null;
    }
}
