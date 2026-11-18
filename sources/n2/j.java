package n2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
