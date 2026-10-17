package md;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class b implements kd.c {
    public static final b a = new b();

    @Override // kd.c
    public final kd.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kd.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
