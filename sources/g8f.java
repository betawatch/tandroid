// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
