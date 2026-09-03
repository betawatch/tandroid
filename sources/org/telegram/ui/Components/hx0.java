package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final /* synthetic */ xx0 a;

    public /* synthetic */ hx0(xx0 xx0Var) {
        this.a = xx0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        xx0.C(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new a50(r1.getContext(), r1.l0, null, this.a.resourcesProvider).show();
    }
}
