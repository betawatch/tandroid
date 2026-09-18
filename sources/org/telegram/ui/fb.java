package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fb extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ vb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(vb vbVar, eb ebVar) {
        super(ebVar, -2, -2);
        this.o = vbVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        vb vbVar = this.o;
        if (vbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        vbVar.F0 = null;
    }
}
