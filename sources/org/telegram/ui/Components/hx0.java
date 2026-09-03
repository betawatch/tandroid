package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final /* synthetic */ xx0 a;

    public /* synthetic */ hx0(xx0 xx0Var) {
        this.a = xx0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        xx0.C(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new z40(r1.getContext(), r1.l0, null, this.a.resourcesProvider).show();
    }
}
