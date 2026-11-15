package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        if (anVar.f9 != this) {
            return;
        }
        anVar.f9 = null;
        anVar.k9 = null;
        anVar.j9 = null;
        anVar.C0.R = true;
        if (anVar.g9) {
            anVar.x8(false, true, 0.0f);
        } else {
            anVar.g9 = true;
        }
        qj qjVar = anVar.a0;
        if (qjVar == null || qjVar.getEditField() == null) {
            return;
        }
        anVar.a0.getEditField().setAllowDrawCursor(true);
    }
}
