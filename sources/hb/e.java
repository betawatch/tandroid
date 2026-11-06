package hb;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e {
    public final String a;

    public e(String sessionId) {
        j.e(sessionId, "sessionId");
        this.a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ')';
    }
}
