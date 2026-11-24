// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class as extends ja {
    public final String c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public as(int i, int i2, String str) {
        super(i, false);
        this.d = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || as.class != obj.getClass()) {
            return false;
        }
        as asVar = (as) obj;
        return this.d == asVar.d && this.c.equals(asVar.c);
    }
}
