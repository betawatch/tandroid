// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ek2 {
    public final fk2 a;
    public final int b;
    public final int c;

    public ek2(fk2 fk2Var, int i, int i2) {
        this.a = fk2Var;
        this.b = i;
        this.c = i2;
    }

    public final float a(float f) {
        return (f / this.a.d[this.c]) * this.b;
    }

    public final float b(float f) {
        return (f / this.a.d[this.c]) * (this.b + 1);
    }
}
