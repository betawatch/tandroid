package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nx extends n61 {
    public final /* synthetic */ qy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(qy qyVar, mx mxVar) {
        super(mxVar);
        this.e = qyVar;
    }

    @Override // org.telegram.ui.n61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.J0 = null;
    }
}
