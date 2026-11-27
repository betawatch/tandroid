// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class o8d implements wn {
    public static final o8d c;
    public final boolean a;
    public final String b;

    static {
        zhc zhcVar = new zhc((byte) 7, false);
        zhcVar.b = Boolean.FALSE;
        c = new o8d(zhcVar);
    }

    public o8d(zhc zhcVar) {
        this.a = ((Boolean) zhcVar.b).booleanValue();
        this.b = (String) zhcVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o8d)) {
            return false;
        }
        o8d o8dVar = (o8d) obj;
        return vue.a(null, null) && this.a == o8dVar.a && vue.a(this.b, o8dVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
