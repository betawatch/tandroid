package ld;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b implements jd.c {
    public static final b a = new b();

    @Override // jd.c
    public final jd.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // jd.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
