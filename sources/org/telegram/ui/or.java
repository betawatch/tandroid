package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class or extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ wr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(wr wrVar, Activity activity, wr wrVar2) {
        super(activity, wrVar2);
        this.b = wrVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final void n() {
        wr wrVar = this.b;
        wrVar.getMessagesController().convertToGigaGroup(wrVar.getParentActivity(), wrVar.r, wrVar, new a1(this, 24));
    }

    @Override // org.telegram.ui.Components.w20
    public final void m() {
    }
}
