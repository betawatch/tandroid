package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ar extends org.telegram.ui.Components.y10 {
    public final /* synthetic */ jr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.b = jrVar;
    }

    @Override // org.telegram.ui.Components.y10
    public final void n() {
        jr jrVar = this.b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.r, jrVar, new b1(this, 24));
    }

    @Override // org.telegram.ui.Components.y10
    public final void m() {
    }
}
