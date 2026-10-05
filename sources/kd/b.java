package kd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
