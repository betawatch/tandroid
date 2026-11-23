package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class b0 {
    public final c0 a;
    public final int b;
    public final int c;

    public b0(c0 c0Var, int i7, int i10) {
        this.a = c0Var;
        this.b = i7;
        this.c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.a.d[this.c]) * this.b;
    }

    public final float b(float f10) {
        return (f10 / this.a.d[this.c]) * (this.b + 1);
    }
}
