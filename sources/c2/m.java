package c2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class m extends Exception {
    public m(k kVar) {
        this("Unhandled input format:", kVar);
    }

    public m(String str, k kVar) {
        super(str + " " + kVar);
    }
}
