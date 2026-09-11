package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        return n6.l.l(this.b, bVar.b) && n6.l.l(this.c, bVar.c) && n6.l.l(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
