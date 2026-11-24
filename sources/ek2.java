// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
