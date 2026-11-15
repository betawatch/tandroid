package n2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
