// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n2e extends WeakReference {
    public final int a;

    public n2e(Exception exc) {
        super(exc, null);
        this.a = System.identityHashCode(exc);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == n2e.class) {
            if (this == obj) {
                return true;
            }
            n2e n2eVar = (n2e) obj;
            if (this.a == n2eVar.a && get() == n2eVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
