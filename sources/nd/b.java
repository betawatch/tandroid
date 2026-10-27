package nd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
