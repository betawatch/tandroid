package kd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b implements id.c {
    public static final b a = new b();

    @Override // id.c
    public final id.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
