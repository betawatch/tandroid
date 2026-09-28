package ee;

import zd.c0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
