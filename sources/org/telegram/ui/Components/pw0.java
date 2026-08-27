package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ ex0 a;

    public /* synthetic */ pw0(ex0 ex0Var) {
        this.a = ex0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        ex0.D(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new l40(r1.getContext(), r1.k0, null, this.a.resourcesProvider).show();
    }
}
