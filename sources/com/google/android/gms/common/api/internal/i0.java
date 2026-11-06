package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
