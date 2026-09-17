package ee;

import zd.c0;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
