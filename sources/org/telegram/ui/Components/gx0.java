package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gx0 implements org.telegram.ui.ActionBar.s0, MessagesStorage.StringCallback {
    public final /* synthetic */ wx0 a;

    public /* synthetic */ gx0(wx0 wx0Var) {
        this.a = wx0Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        wx0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new w40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
