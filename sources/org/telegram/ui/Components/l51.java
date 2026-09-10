package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l51 implements ey0 {
    public final /* synthetic */ r51 a;

    public l51(r51 r51Var) {
        this.a = r51Var;
    }

    @Override // org.telegram.ui.Components.ey0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ey0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.ey0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
