package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final z8 a() {
        z8 z8Var = new z8();
        z8Var.c = this.c;
        z8Var.d = this.d;
        z8Var.e = this.e;
        z8Var.f = this.f;
        z8Var.b = this.b;
        return z8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return this.c == z8Var.c && this.d == z8Var.d && this.e == z8Var.e && this.f == z8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
