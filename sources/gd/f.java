package gd;

import java.io.Serializable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f implements Serializable {
    public final Throwable a;

    public f(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        this.a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return kotlin.jvm.internal.j.a(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
