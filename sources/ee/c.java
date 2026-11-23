package ee;

import zd.z;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
