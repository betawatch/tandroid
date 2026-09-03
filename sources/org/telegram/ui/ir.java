package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ir extends org.telegram.ui.Components.p20 {
    public final /* synthetic */ qr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(qr qrVar, Activity activity, qr qrVar2) {
        super(activity, qrVar2);
        this.b = qrVar;
    }

    @Override // org.telegram.ui.Components.p20
    public final void n() {
        qr qrVar = this.b;
        qrVar.getMessagesController().convertToGigaGroup(qrVar.getParentActivity(), qrVar.r, qrVar, new a1(this, 24));
    }

    @Override // org.telegram.ui.Components.p20
    public final void m() {
    }
}
