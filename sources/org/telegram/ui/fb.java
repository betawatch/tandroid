package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
