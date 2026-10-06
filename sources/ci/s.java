package ci;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class s {
    public final t a;
    public final int b;
    public final int c;

    public s(t tVar, int i10, int i11) {
        this.a = tVar;
        this.b = i10;
        this.c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.a.d[this.c]) * this.b;
    }

    public final float b(float f7) {
        return (f7 / this.a.d[this.c]) * (this.b + 1);
    }
}
