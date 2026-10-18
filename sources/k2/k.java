package k2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
