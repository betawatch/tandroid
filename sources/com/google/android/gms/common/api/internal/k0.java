package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class k0 implements b {
    public final /* synthetic */ g a;

    public k0(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        g gVar = this.a;
        gVar.y.sendMessage(gVar.y.obtainMessage(1, valueOf));
    }
}
