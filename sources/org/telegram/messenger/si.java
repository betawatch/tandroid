package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
