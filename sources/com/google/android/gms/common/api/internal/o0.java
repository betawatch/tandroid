package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
