package n2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
