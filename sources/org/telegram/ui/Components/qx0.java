package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ gy0 a;

    public /* synthetic */ qx0(gy0 gy0Var) {
        this.a = gy0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        gy0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new w40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
