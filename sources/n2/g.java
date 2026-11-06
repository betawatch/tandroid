package n2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g extends Exception {
    public final int a;
    public final boolean b;

    public g(int i7, boolean z9) {
        super(jg.g.j(i7, "AudioOutput write failed: "));
        this.b = z9;
        this.a = i7;
    }
}
