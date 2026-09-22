package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final y8 a() {
        y8 y8Var = new y8();
        y8Var.c = this.c;
        y8Var.d = this.d;
        y8Var.e = this.e;
        y8Var.f = this.f;
        y8Var.b = this.b;
        return y8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        return this.c == y8Var.c && this.d == y8Var.d && this.e == y8Var.e && this.f == y8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
