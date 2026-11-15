package n2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
