// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
