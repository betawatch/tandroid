package ac;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class d {
    public boolean a;
    public boolean b;
    public boolean c;

    public d() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public k2.e a() {
        if (this.a || !(this.b || this.c)) {
            return new k2.e(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public /* synthetic */ d(boolean z10, boolean z11, boolean z12) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }
}
