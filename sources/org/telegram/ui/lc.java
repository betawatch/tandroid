package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class lc extends a71 {
    public final /* synthetic */ bd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(bd bdVar, kc kcVar) {
        super(kcVar);
        this.e = bdVar;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}
