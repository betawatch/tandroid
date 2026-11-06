package n2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
