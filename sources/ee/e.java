package ee;

import zd.c0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final id.h a;

    public e(id.h hVar) {
        this.a = hVar;
    }

    @Override // zd.c0
    public final id.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
