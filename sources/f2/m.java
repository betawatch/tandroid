package f2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class m extends Exception {
    public m(k kVar) {
        this("Unhandled input format:", kVar);
    }

    public m(String str, k kVar) {
        super(str + " " + kVar);
    }
}
