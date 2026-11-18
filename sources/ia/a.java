package ia;

import n2.f;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    public /* synthetic */ a(boolean z10, boolean z11, boolean z12) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }
}
