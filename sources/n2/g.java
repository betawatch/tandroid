package n2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
