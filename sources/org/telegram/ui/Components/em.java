package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class em implements vk, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ org.telegram.messenger.c20 a;

    public /* synthetic */ em(org.telegram.messenger.c20 c20Var) {
        this.a = c20Var;
    }

    @Override // org.telegram.ui.Components.vk
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        this.a.a(new th.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.c20 c20Var = this.a;
        if (c20Var != null) {
            c20Var.a(Boolean.FALSE);
        }
    }
}
