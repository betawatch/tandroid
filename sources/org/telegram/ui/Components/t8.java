package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final t8 a() {
        t8 t8Var = new t8();
        t8Var.c = this.c;
        t8Var.d = this.d;
        t8Var.e = this.e;
        t8Var.f = this.f;
        t8Var.b = this.b;
        return t8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return this.c == t8Var.c && this.d == t8Var.d && this.e == t8Var.e && this.f == t8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
