package ia;

import n2.f;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
