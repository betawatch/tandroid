// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kve {
    public final ave a;
    public final Integer b;

    public /* synthetic */ kve(k7b k7bVar) {
        this.a = (ave) k7bVar.b;
        this.b = (Integer) k7bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kve)) {
            return false;
        }
        kve kveVar = (kve) obj;
        return vue.a(this.a, kveVar.a) && vue.a(this.b, kveVar.b) && vue.a(null, null) && vue.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
