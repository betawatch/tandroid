package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ac extends e11 {
    public final /* synthetic */ qc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(qc qcVar, zb zbVar) {
        super(zbVar);
        this.e = qcVar;
    }

    @Override // org.telegram.ui.e11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.R = null;
    }
}
