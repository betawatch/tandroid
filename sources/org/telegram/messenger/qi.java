package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
