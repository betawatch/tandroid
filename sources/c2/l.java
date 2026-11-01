package c2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class l extends Exception {
    public l(j jVar) {
        this("Unhandled input format:", jVar);
    }

    public l(String str, j jVar) {
        super(str + " " + jVar);
    }
}
