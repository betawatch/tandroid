package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class k8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final k8 a() {
        k8 k8Var = new k8();
        k8Var.c = this.c;
        k8Var.d = this.d;
        k8Var.e = this.e;
        k8Var.f = this.f;
        k8Var.b = this.b;
        return k8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return this.c == k8Var.c && this.d == k8Var.d && this.e == k8Var.e && this.f == k8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
