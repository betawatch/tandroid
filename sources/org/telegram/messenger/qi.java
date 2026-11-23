package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class qi {
    public final boolean a;
    public final String b;
    public final String c;

    public qi(String str, String str2, boolean z10) {
        this.a = z10;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qi.class != obj.getClass()) {
            return false;
        }
        qi qiVar = (qi) obj;
        return this.a == qiVar.a && Objects.equals(this.b, qiVar.b) && Objects.equals(this.c, qiVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
