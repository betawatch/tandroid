// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dt6 {
    public final Object a;
    public final byte b;

    public dt6(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = (byte) 1;
        } else if (obj instanceof eu6) {
            this.b = (byte) 2;
        } else {
            sc8.e();
            throw null;
        }
    }
}
