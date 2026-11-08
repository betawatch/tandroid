package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
