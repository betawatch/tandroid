// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class a5e extends WeakReference {
    public final int a;

    public a5e(Exception exc) {
        super(exc, null);
        this.a = System.identityHashCode(exc);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == a5e.class) {
            if (this == obj) {
                return true;
            }
            a5e a5eVar = (a5e) obj;
            if (this.a == a5eVar.a && get() == a5eVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
