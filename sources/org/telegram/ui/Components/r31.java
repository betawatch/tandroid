package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r31 implements yv0 {
    public final /* synthetic */ x31 a;

    public r31(x31 x31Var) {
        this.a = x31Var;
    }

    @Override // org.telegram.ui.Components.yv0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.yv0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.yv0
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, boolean z11, int i7, int i10) {
        this.a.b.f(document, obj, z11, i7);
    }
}
