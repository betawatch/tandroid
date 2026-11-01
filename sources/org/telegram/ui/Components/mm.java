package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm implements wk, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ org.telegram.messenger.r20 a;

    public /* synthetic */ mm(org.telegram.messenger.r20 r20Var) {
        this.a = r20Var;
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.a.a(new jh.h(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.messenger.r20 r20Var = this.a;
        if (r20Var != null) {
            r20Var.a(Boolean.FALSE);
        }
    }
}
