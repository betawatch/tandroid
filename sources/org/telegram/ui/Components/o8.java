package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final o8 a() {
        o8 o8Var = new o8();
        o8Var.c = this.c;
        o8Var.d = this.d;
        o8Var.e = this.e;
        o8Var.f = this.f;
        o8Var.b = this.b;
        return o8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return this.c == o8Var.c && this.d == o8Var.d && this.e == o8Var.e && this.f == o8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
