package ea;

import k2.g;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b {
    public boolean a;
    public boolean b;
    public boolean c;

    public b() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public g a() {
        if (this.a || !(this.b || this.c)) {
            return new g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public /* synthetic */ b(boolean z10, boolean z11, boolean z12) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }
}
