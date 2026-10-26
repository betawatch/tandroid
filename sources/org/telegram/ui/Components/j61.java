package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j61 implements zy0 {
    public final /* synthetic */ p61 a;

    public j61(p61 p61Var) {
        this.a = p61Var;
    }

    @Override // org.telegram.ui.Components.zy0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }

    @Override // org.telegram.ui.Components.zy0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.zy0
    public final boolean c() {
        return this.a.b.c();
    }
}
