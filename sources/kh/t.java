package kh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t {
    public final u a;
    public final int b;
    public final int c;

    public t(u uVar, int i9, int i10) {
        this.a = uVar;
        this.b = i9;
        this.c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.a.d[this.c]) * this.b;
    }

    public final float b(float f10) {
        return (f10 / this.a.d[this.c]) * (this.b + 1);
    }
}
