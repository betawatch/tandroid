package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final s8 a() {
        s8 s8Var = new s8();
        s8Var.c = this.c;
        s8Var.d = this.d;
        s8Var.e = this.e;
        s8Var.f = this.f;
        s8Var.b = this.b;
        return s8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return this.c == s8Var.c && this.d == s8Var.d && this.e == s8Var.e && this.f == s8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
