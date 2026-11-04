package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ft implements fd.c {
    public final /* synthetic */ zs a;

    public ft(zs zsVar) {
        this.a = zsVar;
    }

    @Override // fd.c
    public final fd.h getContext() {
        return fd.i.a;
    }

    @Override // fd.c
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof dd.f;
        zs zsVar = this.a;
        if (z10) {
            zsVar.a(null, ((dd.f) obj).a);
        } else {
            zsVar.a(obj, null);
        }
    }
}
