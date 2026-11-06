package ia;

import n2.f;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
