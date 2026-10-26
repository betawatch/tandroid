package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ cz0 a;

    public /* synthetic */ ly0(cz0 cz0Var) {
        this.a = cz0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        cz0.F(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new i50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
