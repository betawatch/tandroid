package md;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
