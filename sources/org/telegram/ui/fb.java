package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fb extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ vb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(vb vbVar, eb ebVar) {
        super(ebVar, -2, -2);
        this.o = vbVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
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
