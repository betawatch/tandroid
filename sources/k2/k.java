package k2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
