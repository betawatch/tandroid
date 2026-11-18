package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ni extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ bn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(bn bnVar, li liVar) {
        super(liVar, -2, -2);
        this.o = bnVar;
    }

    @Override // org.telegram.ui.ActionBar.h1, android.widget.PopupWindow
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
