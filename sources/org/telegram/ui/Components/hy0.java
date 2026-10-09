package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ xy0 a;

    public /* synthetic */ hy0(xy0 xy0Var) {
        this.a = xy0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        xy0.E(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new o50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
