package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        return b6.m.l(this.b, bVar.b) && b6.m.l(this.c, bVar.c) && b6.m.l(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
