package ee;

import zd.z;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c implements z {
    public final id.h a;

    public c(id.h hVar) {
        this.a = hVar;
    }

    @Override // zd.z
    public final id.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
