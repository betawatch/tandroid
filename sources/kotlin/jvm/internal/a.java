package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a implements g, Serializable {
    public final Object a;
    public final boolean b = false;
    public final int c = 2;

    public a(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && this.c == aVar.c && j.a(this.a, aVar.a) && AtomicReference.class.equals(AtomicReference.class);
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        return ((((((((((AtomicReference.class.hashCode() + ((this.a != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + (this.b ? 1231 : 1237)) * 31) + 2) * 31) + this.c;
    }

    public final String toString() {
        s.a.getClass();
        return t.a(this);
    }
}
