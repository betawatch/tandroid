package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class au implements cd.c {
    public final /* synthetic */ ut a;

    public au(ut utVar) {
        this.a = utVar;
    }

    @Override // cd.c
    public final cd.h getContext() {
        return cd.i.a;
    }

    @Override // cd.c
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof ad.f;
        ut utVar = this.a;
        if (z10) {
            utVar.a(null, ((ad.f) obj).a);
        } else {
            utVar.a(obj, null);
        }
    }
}
