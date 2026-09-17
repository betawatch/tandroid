package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class y extends org.telegram.ui.a71 {
    public final /* synthetic */ z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, x xVar) {
        super(xVar);
        this.e = zVar;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.i0 = null;
    }
}
