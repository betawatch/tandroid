package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class mi extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ an o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(an anVar, ki kiVar) {
        super(kiVar, -2, -2);
        this.o = anVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        an anVar = this.o;
        if (anVar.e9 != this) {
            return;
        }
        anVar.e9 = null;
        anVar.h9 = null;
        anVar.g9 = null;
        anVar.B0.R = true;
        if (anVar.f9) {
            anVar.v8(false, true, 0.0f);
        } else {
            anVar.f9 = true;
        }
        qj qjVar = anVar.Z;
        if (qjVar == null || qjVar.getEditField() == null) {
            return;
        }
        anVar.Z.getEditField().setAllowDrawCursor(true);
    }
}
