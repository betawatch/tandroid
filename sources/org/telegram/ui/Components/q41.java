package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q41 implements ax0 {
    public final /* synthetic */ x41 a;

    public q41(x41 x41Var) {
        this.a = x41Var;
    }

    @Override // org.telegram.ui.Components.ax0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.gj gjVar, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }

    @Override // org.telegram.ui.Components.ax0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ax0
    public final boolean c() {
        return this.a.b.c();
    }
}
