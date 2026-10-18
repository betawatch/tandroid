package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a9 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final a9 a() {
        a9 a9Var = new a9();
        a9Var.c = this.c;
        a9Var.d = this.d;
        a9Var.e = this.e;
        a9Var.f = this.f;
        a9Var.b = this.b;
        return a9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        return this.c == a9Var.c && this.d == a9Var.d && this.e == a9Var.e && this.f == a9Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
