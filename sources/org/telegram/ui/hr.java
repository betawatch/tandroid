package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hr extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ pr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(pr prVar, Activity activity, pr prVar2) {
        super(activity, prVar2);
        this.b = prVar;
    }

    @Override // org.telegram.ui.Components.o20
    public final void n() {
        pr prVar = this.b;
        prVar.getMessagesController().convertToGigaGroup(prVar.getParentActivity(), prVar.r, prVar, new a1(this, 24));
    }

    @Override // org.telegram.ui.Components.o20
    public final void m() {
    }
}
