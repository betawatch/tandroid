package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public final int a;
    public final com.google.android.gms.common.api.e b;
    public final com.google.android.gms.common.api.b c;
    public final String d;

    public b(com.google.android.gms.common.api.e eVar, com.google.android.gms.common.api.b bVar, String str) {
        this.b = eVar;
        this.c = bVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return z5.l.l(this.b, bVar.b) && z5.l.l(this.c, bVar.c) && z5.l.l(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
