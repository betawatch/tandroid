package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class br extends org.telegram.ui.Components.j20 {
    public final /* synthetic */ jr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.b = jrVar;
    }

    @Override // org.telegram.ui.Components.j20
    public final void n() {
        jr jrVar = this.b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.r, jrVar, new c1(this, 24));
    }

    @Override // org.telegram.ui.Components.j20
    public final void m() {
    }
}
