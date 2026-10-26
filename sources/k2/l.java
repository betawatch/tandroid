package k2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
