package md;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
