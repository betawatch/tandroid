// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
