package k2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;

    public l a() {
        if (this.b || !(this.c || this.d)) {
            return new l(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
