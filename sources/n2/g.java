package n2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
