package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final /* synthetic */ cx0 a;

    public /* synthetic */ nw0(cx0 cx0Var) {
        this.a = cx0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        cx0.C(this.a, i9);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new g40(r1.getContext(), r1.k0, null, this.a.resourcesProvider).show();
    }
}
