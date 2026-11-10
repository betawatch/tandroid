package f2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class m extends Exception {
    public m(k kVar) {
        this("Unhandled input format:", kVar);
    }

    public m(String str, k kVar) {
        super(str + " " + kVar);
    }
}
