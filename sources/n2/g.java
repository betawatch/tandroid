package n2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g extends Exception {
    public final int a;
    public final boolean b;

    public g(int i7, boolean z10) {
        super(i5.c.i(i7, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i7;
    }
}
