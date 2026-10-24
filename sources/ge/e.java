package ge;

import be.c0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
