package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        org.telegram.ui.Components.tc.e();
        vbVar.F0 = null;
    }
}
