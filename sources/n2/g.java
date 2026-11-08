package n2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g extends Exception {
    public final int a;
    public final boolean b;

    public g(int i7, boolean z9) {
        super(jg.g.j(i7, "AudioOutput write failed: "));
        this.b = z9;
        this.a = i7;
    }
}
