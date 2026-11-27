// default package

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ga implements ss4, Serializable {
    public final AtomicReference a;
    public final boolean b = false;
    public final int c = 2;

    public ga(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        return this.b == gaVar.b && this.c == gaVar.c && ur5.a(this.a, gaVar.a) && AtomicReference.class.equals(AtomicReference.class);
    }

    @Override // ss4
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        return ((((((((((AtomicReference.class.hashCode() + ((this.a != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + (this.b ? 1231 : 1237)) * 31) + 2) * 31) + this.c;
    }

    public final String toString() {
        s89.a.getClass();
        return t89.a(this);
    }
}
