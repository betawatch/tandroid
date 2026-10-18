package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
