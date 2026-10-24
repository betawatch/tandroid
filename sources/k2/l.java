package k2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class l {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;

    public m a() {
        if (this.b || !(this.c || this.d)) {
            return new m(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
