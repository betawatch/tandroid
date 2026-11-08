package ee;

import zd.z;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
