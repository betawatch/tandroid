package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ji {
    public final boolean a;
    public final String b;
    public final String c;

    public ji(String str, String str2, boolean z10) {
        this.a = z10;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ji.class != obj.getClass()) {
            return false;
        }
        ji jiVar = (ji) obj;
        return this.a == jiVar.a && Objects.equals(this.b, jiVar.b) && Objects.equals(this.c, jiVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
