package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        return y5.l.l(this.b, bVar.b) && y5.l.l(this.c, bVar.c) && y5.l.l(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
