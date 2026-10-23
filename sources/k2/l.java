package k2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
