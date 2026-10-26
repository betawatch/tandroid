package nd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b implements ld.c {
    public static final b a = new b();

    @Override // ld.c
    public final ld.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // ld.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
