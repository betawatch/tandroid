package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class m51 implements dy0 {
    public final /* synthetic */ s51 a;

    public m51(s51 s51Var) {
        this.a = s51Var;
    }

    @Override // org.telegram.ui.Components.dy0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.dy0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.dy0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
