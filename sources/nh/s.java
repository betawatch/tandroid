package nh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public final float a(float f9) {
        return (f9 / this.a.d[this.c]) * this.b;
    }

    public final float b(float f9) {
        return (f9 / this.a.d[this.c]) * (this.b + 1);
    }
}
