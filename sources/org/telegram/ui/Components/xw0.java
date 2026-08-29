package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final /* synthetic */ nx0 a;

    public /* synthetic */ xw0(nx0 nx0Var) {
        this.a = nx0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
        nx0.C(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new u40(r1.getContext(), r1.k0, null, this.a.resourcesProvider).show();
    }
}
