package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
