package ac;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
