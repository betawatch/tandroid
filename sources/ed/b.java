package ed;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b implements cd.c {
    public static final b a = new b();

    @Override // cd.c
    public final cd.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // cd.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
