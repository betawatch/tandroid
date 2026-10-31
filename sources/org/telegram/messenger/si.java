package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class si {
    public final boolean a;
    public final String b;
    public final String c;

    public si(String str, String str2, boolean z10) {
        this.a = z10;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || si.class != obj.getClass()) {
            return false;
        }
        si siVar = (si) obj;
        return this.a == siVar.a && Objects.equals(this.b, siVar.b) && Objects.equals(this.c, siVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
