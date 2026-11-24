// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mcb {
    public int a;
    public float b;
    public float c;

    public mcb(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final Object clone() {
        return new mcb(this.b, this.c, this.a);
    }
}
