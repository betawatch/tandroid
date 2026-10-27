package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class er extends org.telegram.ui.Components.y20 {
    public final /* synthetic */ mr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(mr mrVar, Activity activity, mr mrVar2) {
        super(activity, mrVar2);
        this.b = mrVar;
    }

    @Override // org.telegram.ui.Components.y20
    public final void n() {
        mr mrVar = this.b;
        mrVar.getMessagesController().convertToGigaGroup(mrVar.getParentActivity(), mrVar.n, mrVar, new y0(this, 26));
    }

    @Override // org.telegram.ui.Components.y20
    public final void m() {
    }
}
