// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class g8f {
    public final d8f a;
    public final Integer b;

    public /* synthetic */ g8f(zhc zhcVar) {
        this.a = (d8f) zhcVar.b;
        this.b = (Integer) zhcVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g8f)) {
            return false;
        }
        g8f g8fVar = (g8f) obj;
        return vue.a(this.a, g8fVar.a) && vue.a(this.b, g8fVar.b) && vue.a(null, null) && vue.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
