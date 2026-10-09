package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c9 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final c9 a() {
        c9 c9Var = new c9();
        c9Var.c = this.c;
        c9Var.d = this.d;
        c9Var.e = this.e;
        c9Var.f = this.f;
        c9Var.b = this.b;
        return c9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return this.c == c9Var.c && this.d == c9Var.d && this.e == c9Var.e && this.f == c9Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
