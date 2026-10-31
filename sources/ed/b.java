package ed;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements cd.c {
    public static final b a = new b();

    @Override // cd.c
    public final cd.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // cd.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
