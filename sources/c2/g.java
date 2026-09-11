package c2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g extends Exception {
    public g(f fVar) {
        this("Unhandled input format:", fVar);
    }

    public g(String str, f fVar) {
        super(str + " " + fVar);
    }
}
