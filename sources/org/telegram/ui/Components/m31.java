package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
