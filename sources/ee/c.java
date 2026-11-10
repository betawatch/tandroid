package ee;

import zd.z;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
