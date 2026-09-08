package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class b9 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final b9 a() {
        b9 b9Var = new b9();
        b9Var.c = this.c;
        b9Var.d = this.d;
        b9Var.e = this.e;
        b9Var.f = this.f;
        b9Var.b = this.b;
        return b9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        return this.c == b9Var.c && this.d == b9Var.d && this.e == b9Var.e && this.f == b9Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
