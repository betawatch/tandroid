// default package

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fa implements ps4, Serializable {
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
        return this.b == faVar.b && this.c == faVar.c && rr5.a(this.a, faVar.a) && AtomicReference.class.equals(AtomicReference.class);
    }

    @Override // ps4
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        return ((((((((((AtomicReference.class.hashCode() + ((this.a != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + (this.b ? 1231 : 1237)) * 31) + 2) * 31) + this.c;
    }

    public final String toString() {
        h79.a.getClass();
        return i79.a(this);
    }
}
