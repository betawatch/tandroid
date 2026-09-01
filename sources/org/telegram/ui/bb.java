package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
