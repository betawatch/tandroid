package c2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class m extends Exception {
    public m(k kVar) {
        this("Unhandled input format:", kVar);
    }

    public m(String str, k kVar) {
        super(str + " " + kVar);
    }
}
