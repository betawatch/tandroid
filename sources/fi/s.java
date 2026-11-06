package fi;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class s {
    public final t a;
    public final int b;
    public final int c;

    public s(t tVar, int i7, int i10) {
        this.a = tVar;
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
