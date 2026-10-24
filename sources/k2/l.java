package k2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
