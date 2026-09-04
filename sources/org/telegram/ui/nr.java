package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class nr extends org.telegram.ui.Components.n20 {
    public final /* synthetic */ vr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(vr vrVar, Activity activity, vr vrVar2) {
        super(activity, vrVar2);
        this.b = vrVar;
    }

    @Override // org.telegram.ui.Components.n20
    public final void n() {
        vr vrVar = this.b;
        vrVar.getMessagesController().convertToGigaGroup(vrVar.getParentActivity(), vrVar.r, vrVar, new z0(this, 24));
    }

    @Override // org.telegram.ui.Components.n20
    public final void m() {
    }
}
