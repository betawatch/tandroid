package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m31 implements vv0 {
    public final /* synthetic */ t31 a;

    public m31(t31 t31Var) {
        this.a = t31Var;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        this.a.b.f(document, obj, z10, i7);
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean c() {
        return this.a.b.c();
    }
}
