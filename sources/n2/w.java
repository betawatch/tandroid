package n2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class w extends Exception {
    public final int a;
    public final boolean b;
    public final e2.u c;

    public w(int i7, e2.u uVar, boolean z10) {
        super(i5.c.i(i7, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i7;
        this.c = uVar;
    }
}
