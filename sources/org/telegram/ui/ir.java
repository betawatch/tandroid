package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ir extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ qr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(qr qrVar, Activity activity, qr qrVar2) {
        super(activity, qrVar2);
        this.b = qrVar;
    }

    @Override // org.telegram.ui.Components.o20
    public final void n() {
        qr qrVar = this.b;
        qrVar.getMessagesController().convertToGigaGroup(qrVar.getParentActivity(), qrVar.r, qrVar, new z0(this, 24));
    }

    @Override // org.telegram.ui.Components.o20
    public final void m() {
    }
}
