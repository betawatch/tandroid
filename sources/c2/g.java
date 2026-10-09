package c2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g extends Exception {
    public g(f fVar) {
        this("Unhandled input format:", fVar);
    }

    public g(String str, f fVar) {
        super(str + " " + fVar);
    }
}
