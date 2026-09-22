package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fx0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ vx0 a;

    public /* synthetic */ fx0(vx0 vx0Var) {
        this.a = vx0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        vx0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new w40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
