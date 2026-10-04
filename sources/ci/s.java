package ci;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
