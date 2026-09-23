package gd;

import java.io.Serializable;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class f implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return kotlin.jvm.internal.i.a(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
