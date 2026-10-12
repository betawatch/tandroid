package ge;

import be.c0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
