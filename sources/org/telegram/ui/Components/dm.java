package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm implements uk, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ org.telegram.messenger.c20 a;

    public /* synthetic */ dm(org.telegram.messenger.c20 c20Var) {
        this.a = c20Var;
    }

    @Override // org.telegram.ui.Components.uk
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
