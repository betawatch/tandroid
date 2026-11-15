package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
