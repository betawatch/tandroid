package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final r8 a() {
        r8 r8Var = new r8();
        r8Var.c = this.c;
        r8Var.d = this.d;
        r8Var.e = this.e;
        r8Var.f = this.f;
        r8Var.b = this.b;
        return r8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return this.c == r8Var.c && this.d == r8Var.d && this.e == r8Var.e && this.f == r8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
