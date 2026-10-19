package ei;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
