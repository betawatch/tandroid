package ee;

import zd.z;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
