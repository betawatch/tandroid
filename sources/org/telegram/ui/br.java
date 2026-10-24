package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class br extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ jr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(jr jrVar, Activity activity, jr jrVar2) {
        super(activity, jrVar2);
        this.b = jrVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final void n() {
        jr jrVar = this.b;
        jrVar.getMessagesController().convertToGigaGroup(jrVar.getParentActivity(), jrVar.r, jrVar, new a1(this, 24));
    }

    @Override // org.telegram.ui.Components.w20
    public final void m() {
    }
}
