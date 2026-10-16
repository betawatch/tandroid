package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class d9 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final d9 a() {
        d9 d9Var = new d9();
        d9Var.c = this.c;
        d9Var.d = this.d;
        d9Var.e = this.e;
        d9Var.f = this.f;
        d9Var.b = this.b;
        return d9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        return this.c == d9Var.c && this.d == d9Var.d && this.e == d9Var.e && this.f == d9Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
