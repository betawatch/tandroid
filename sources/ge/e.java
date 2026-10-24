package ge;

import be.c0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
