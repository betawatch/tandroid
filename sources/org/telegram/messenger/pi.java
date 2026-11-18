package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
