// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k0e extends WeakReference {
    public final int a;

    public k0e(Exception exc) {
        super(exc, null);
        this.a = System.identityHashCode(exc);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == k0e.class) {
            if (this == obj) {
                return true;
            }
            k0e k0eVar = (k0e) obj;
            if (this.a == k0eVar.a && get() == k0eVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
