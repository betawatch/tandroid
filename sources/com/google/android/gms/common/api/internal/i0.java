package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i0 implements b {
    public final /* synthetic */ g a;

    public i0(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z9) {
        Boolean valueOf = Boolean.valueOf(z9);
        g gVar = this.a;
        gVar.y.sendMessage(gVar.y.obtainMessage(1, valueOf));
    }
}
