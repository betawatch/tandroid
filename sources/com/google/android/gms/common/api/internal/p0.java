package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p0 implements c {
    public final /* synthetic */ h a;

    public p0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        com.google.android.gms.internal.cast.z zVar = this.a.y;
        zVar.sendMessage(zVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
