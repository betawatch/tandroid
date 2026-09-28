package c2;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class g extends Exception {
    public g(f fVar) {
        this("Unhandled input format:", fVar);
    }

    public g(String str, f fVar) {
        super(str + " " + fVar);
    }
}
