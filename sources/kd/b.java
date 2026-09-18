package kd;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
