package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b41 implements zw0 {
    public final /* synthetic */ h41 a;

    public b41(h41 h41Var) {
        this.a = h41Var;
    }

    @Override // org.telegram.ui.Components.zw0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i9, int i10) {
        this.a.b.f(document, obj, z11, i9);
    }

    @Override // org.telegram.ui.Components.zw0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.zw0
    public final boolean c() {
        return this.a.b.c();
    }
}
