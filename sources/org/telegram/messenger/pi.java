package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class pi {
    public final boolean a;
    public final String b;
    public final String c;

    public pi(String str, String str2, boolean z10) {
        this.a = z10;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pi.class != obj.getClass()) {
            return false;
        }
        pi piVar = (pi) obj;
        return this.a == piVar.a && Objects.equals(this.b, piVar.b) && Objects.equals(this.c, piVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
