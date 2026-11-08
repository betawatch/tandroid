package n2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;

    public k a() {
        if (this.b || !(this.c || this.d)) {
            return new k(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
