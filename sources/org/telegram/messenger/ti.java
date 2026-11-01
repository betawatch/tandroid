package org.telegram.messenger;

import j$.util.Objects;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ti {
    public final boolean a;
    public final String b;
    public final String c;

    public ti(String str, String str2, boolean z10) {
        this.a = z10;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ti.class != obj.getClass()) {
            return false;
        }
        ti tiVar = (ti) obj;
        return this.a == tiVar.a && Objects.equals(this.b, tiVar.b) && Objects.equals(this.c, tiVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
