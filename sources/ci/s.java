package ci;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
