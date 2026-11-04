package hd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements fd.c {
    public static final b a = new b();

    @Override // fd.c
    public final fd.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // fd.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
