package n2;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
