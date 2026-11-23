package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ac extends j11 {
    public final /* synthetic */ qc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(qc qcVar, zb zbVar) {
        super(zbVar);
        this.e = qcVar;
    }

    @Override // org.telegram.ui.j11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.R = null;
    }
}
