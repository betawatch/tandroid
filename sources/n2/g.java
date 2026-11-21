package n2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
