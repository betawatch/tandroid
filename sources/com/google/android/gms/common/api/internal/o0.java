package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
