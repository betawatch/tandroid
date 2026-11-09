package n2;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
