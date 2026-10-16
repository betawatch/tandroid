package ge;

import be.c0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final kd.h a;

    public e(kd.h hVar) {
        this.a = hVar;
    }

    @Override // be.c0
    public final kd.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
