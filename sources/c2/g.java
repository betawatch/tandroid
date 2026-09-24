package c2;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class g extends Exception {
    public g(f fVar) {
        this("Unhandled input format:", fVar);
    }

    public g(String str, f fVar) {
        super(str + " " + fVar);
    }
}
