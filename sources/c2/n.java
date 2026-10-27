package c2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n extends Exception {
    public n(l lVar) {
        this("Unhandled input format:", lVar);
    }

    public n(String str, l lVar) {
        super(str + " " + lVar);
    }
}
