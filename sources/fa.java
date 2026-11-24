// default package

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fa implements oq4, Serializable {
    public final AtomicReference a;
    public final boolean b = false;
    public final int c = 2;

    public fa(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return this.b == faVar.b && this.c == faVar.c && rp5.a(this.a, faVar.a) && AtomicReference.class.equals(AtomicReference.class);
    }

    @Override // oq4
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        return ((((((((((AtomicReference.class.hashCode() + ((this.a != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + (this.b ? 1231 : 1237)) * 31) + 2) * 31) + this.c;
    }

    public final String toString() {
        f59.a.getClass();
        return g59.a(this);
    }
}
