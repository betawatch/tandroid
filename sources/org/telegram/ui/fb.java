package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        org.telegram.ui.Components.pc.e();
        vbVar.F0 = null;
    }
}
