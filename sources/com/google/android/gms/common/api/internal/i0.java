package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
