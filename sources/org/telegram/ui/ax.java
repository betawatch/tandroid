package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ax extends s51 {
    public final /* synthetic */ ey e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(ey eyVar, zw zwVar) {
        super(zwVar);
        this.e = eyVar;
    }

    @Override // org.telegram.ui.s51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.M0 = null;
    }
}
