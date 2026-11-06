package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
