package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zt implements cd.c {
    public final /* synthetic */ tt a;

    public zt(tt ttVar) {
        this.a = ttVar;
    }

    @Override // cd.c
    public final cd.h getContext() {
        return cd.i.a;
    }

    @Override // cd.c
    public final void resumeWith(Object obj) {
        boolean z10 = obj instanceof ad.f;
        tt ttVar = this.a;
        if (z10) {
            ttVar.a(null, ((ad.f) obj).a);
        } else {
            ttVar.a(obj, null);
        }
    }
}
