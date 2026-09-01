package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ix0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final /* synthetic */ yx0 a;

    public /* synthetic */ ix0(yx0 yx0Var) {
        this.a = yx0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        yx0.C(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new a50(r1.getContext(), r1.l0, null, this.a.resourcesProvider).show();
    }
}
