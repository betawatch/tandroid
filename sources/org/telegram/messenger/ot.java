package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class ot implements id.c {
    public final /* synthetic */ ht a;

    public ot(ht htVar) {
        this.a = htVar;
    }

    @Override // id.c
    public final id.h getContext() {
        return id.i.a;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        boolean z9 = obj instanceof gd.f;
        ht htVar = this.a;
        if (z9) {
            htVar.a(null, ((gd.f) obj).a);
        } else {
            htVar.a(obj, null);
        }
    }
}
