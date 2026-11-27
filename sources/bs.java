// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bs extends ka {
    public final String c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public bs(int i, int i2, String str) {
        super(i, false);
        this.d = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bs.class != obj.getClass()) {
            return false;
        }
        bs bsVar = (bs) obj;
        return this.d == bsVar.d && this.c.equals(bsVar.c);
    }
}
