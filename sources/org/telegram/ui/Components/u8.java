package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final u8 a() {
        u8 u8Var = new u8();
        u8Var.c = this.c;
        u8Var.d = this.d;
        u8Var.e = this.e;
        u8Var.f = this.f;
        u8Var.b = this.b;
        return u8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return this.c == u8Var.c && this.d == u8Var.d && this.e == u8Var.e && this.f == u8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
