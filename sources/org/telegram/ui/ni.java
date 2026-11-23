package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ bn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(bn bnVar, li liVar) {
        super(liVar, -2, -2);
        this.o = bnVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        bn bnVar = this.o;
        if (bnVar.g9 != this) {
            return;
        }
        bnVar.g9 = null;
        bnVar.l9 = null;
        bnVar.k9 = null;
        bnVar.C0.R = true;
        if (bnVar.h9) {
            bnVar.x8(false, true, 0.0f);
        } else {
            bnVar.h9 = true;
        }
        rj rjVar = bnVar.a0;
        if (rjVar == null || rjVar.getEditField() == null) {
            return;
        }
        bnVar.a0.getEditField().setAllowDrawCursor(true);
    }
}
