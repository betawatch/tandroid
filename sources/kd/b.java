package kd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
