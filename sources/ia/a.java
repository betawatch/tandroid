package ia;

import n2.f;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a {
    public boolean a;
    public boolean b;
    public boolean c;

    public a() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public f a() {
        if (this.a || !(this.b || this.c)) {
            return new f(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public /* synthetic */ a(boolean z9, boolean z10, boolean z11) {
        this.a = z9;
        this.b = z10;
        this.c = z11;
    }
}
