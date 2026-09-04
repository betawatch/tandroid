package gd;

import java.io.Serializable;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e implements Serializable {
    public final Throwable a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return kotlin.jvm.internal.i.a(this.a, ((e) obj).a);
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
