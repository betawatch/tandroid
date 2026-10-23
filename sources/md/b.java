package md;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
