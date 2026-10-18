package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class br extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ jr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.b = jrVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final void o() {
        jr jrVar = this.b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.r, jrVar, new b1(this, 24));
    }

    @Override // org.telegram.ui.Components.w20
    public final void n() {
    }
}
