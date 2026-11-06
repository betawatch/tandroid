package n2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class w extends Exception {
    public final int a;
    public final boolean b;
    public final e2.u c;

    public w(int i7, e2.u uVar, boolean z9) {
        super(jg.g.j(i7, "AudioTrack write failed: "));
        this.b = z9;
        this.a = i7;
        this.c = uVar;
    }
}
