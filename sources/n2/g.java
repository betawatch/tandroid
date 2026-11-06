package n2;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
