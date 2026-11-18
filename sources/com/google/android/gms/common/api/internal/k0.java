package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
