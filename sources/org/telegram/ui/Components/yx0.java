package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final /* synthetic */ oy0 a;

    public /* synthetic */ yx0(oy0 oy0Var) {
        this.a = oy0Var;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
        oy0.D(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new g50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
