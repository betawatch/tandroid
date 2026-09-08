package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ ux0 a;

    public /* synthetic */ ex0(ux0 ux0Var) {
        this.a = ux0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        ux0.C(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new w40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
