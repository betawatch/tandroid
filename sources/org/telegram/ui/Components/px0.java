package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class px0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final /* synthetic */ fy0 a;

    public /* synthetic */ px0(fy0 fy0Var) {
        this.a = fy0Var;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void m(int i10) {
        fy0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new x40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
