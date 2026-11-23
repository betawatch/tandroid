package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements ll, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ org.telegram.messenger.y10 a;

    public /* synthetic */ vm(org.telegram.messenger.y10 y10Var) {
        this.a = y10Var;
    }

    @Override // org.telegram.ui.Components.ll
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.a.a(new th.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.y10 y10Var = this.a;
        if (y10Var != null) {
            y10Var.a(Boolean.FALSE);
        }
    }
}
