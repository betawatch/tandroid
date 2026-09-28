package kd;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
