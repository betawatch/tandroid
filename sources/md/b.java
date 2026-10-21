package md;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
