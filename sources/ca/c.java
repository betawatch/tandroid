package ca;

import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final long b;
    public final Map c;

    public c(String str, long j3, Map additionalCustomKeys) {
        kotlin.jvm.internal.j.e(additionalCustomKeys, "additionalCustomKeys");
        this.a = str;
        this.b = j3;
        this.c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.j.a(this.a, cVar.a) && this.b == cVar.b && kotlin.jvm.internal.j.a(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j3 = this.b;
        return this.c.hashCode() + ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}
