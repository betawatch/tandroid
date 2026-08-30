package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bb extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ sb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(sb sbVar, ab abVar) {
        super(abVar, -2, -2);
        this.o = sbVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        sb sbVar = this.o;
        if (sbVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.ic.e();
        sbVar.G0 = null;
    }
}
