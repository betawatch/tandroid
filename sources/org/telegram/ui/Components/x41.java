package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class x41 implements rx0 {
    public final /* synthetic */ d51 a;

    public x41(d51 d51Var) {
        this.a = d51Var;
    }

    @Override // org.telegram.ui.Components.rx0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }

    @Override // org.telegram.ui.Components.rx0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.rx0
    public final boolean c() {
        return this.a.b.c();
    }
}
