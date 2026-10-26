package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n0 implements c {
    public final /* synthetic */ h a;

    public n0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z10) {
        com.google.android.gms.internal.cast.y yVar = this.a.x;
        yVar.sendMessage(yVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
