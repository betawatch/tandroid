package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o0 implements c {
    public final /* synthetic */ h a;

    public o0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z4) {
        a7.e eVar = this.a.x;
        eVar.sendMessage(eVar.obtainMessage(1, Boolean.valueOf(z4)));
    }
}
