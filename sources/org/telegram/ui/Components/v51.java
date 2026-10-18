package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class v51 implements ly0 {
    public final /* synthetic */ b61 a;

    public v51(b61 b61Var) {
        this.a = b61Var;
    }

    @Override // org.telegram.ui.Components.ly0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ly0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.ly0
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
