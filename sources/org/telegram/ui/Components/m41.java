package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m41 implements kx0 {
    public final /* synthetic */ s41 a;

    public m41(s41 s41Var) {
        this.a = s41Var;
    }

    @Override // org.telegram.ui.Components.kx0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }

    @Override // org.telegram.ui.Components.kx0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.kx0
    public final boolean c() {
        return this.a.b.c();
    }
}
