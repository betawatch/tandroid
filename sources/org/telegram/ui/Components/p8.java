package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class p8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final p8 a() {
        p8 p8Var = new p8();
        p8Var.c = this.c;
        p8Var.d = this.d;
        p8Var.e = this.e;
        p8Var.f = this.f;
        p8Var.b = this.b;
        return p8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return this.c == p8Var.c && this.d == p8Var.d && this.e == p8Var.e && this.f == p8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
