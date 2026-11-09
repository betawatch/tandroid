package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class si {
    public final boolean a;
    public final String b;
    public final String c;

    public si(String str, String str2, boolean z9) {
        this.a = z9;
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
