package k2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
