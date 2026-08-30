package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final /* synthetic */ xx0 a;

    public /* synthetic */ hx0(xx0 xx0Var) {
        this.a = xx0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void l(int i10) {
        xx0.C(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new y40(r1.getContext(), r1.l0, null, this.a.resourcesProvider).show();
    }
}
