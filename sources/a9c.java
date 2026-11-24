// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class a9c {
    public float a;
    public float b;
    public float c;

    public a9c(float f) {
        d(f);
    }

    public final boolean a(float f) {
        float f2 = this.b;
        float A = tb4.A(this.c, f2, f, f2);
        if (this.a == A) {
            return false;
        }
        this.a = A;
        return true;
    }

    public final boolean b(float f) {
        return this.c != f;
    }

    public final void c(boolean z) {
        if (!z) {
            this.b = this.a;
            return;
        }
        float f = this.c;
        this.a = f;
        this.b = f;
    }

    public final void d(float f) {
        this.b = f;
        this.c = f;
        this.a = f;
    }
}
