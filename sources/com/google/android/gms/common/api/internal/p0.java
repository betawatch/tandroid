package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
