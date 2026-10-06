package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class by0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ ry0 a;

    public /* synthetic */ by0(ry0 ry0Var) {
        this.a = ry0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        ry0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new a50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
