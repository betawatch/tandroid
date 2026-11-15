package org.telegram.ui.Components;

import j$.util.Objects;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m8 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final m8 a() {
        m8 m8Var = new m8();
        m8Var.c = this.c;
        m8Var.d = this.d;
        m8Var.e = this.e;
        m8Var.f = this.f;
        m8Var.b = this.b;
        return m8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj;
        return this.c == m8Var.c && this.d == m8Var.d && this.e == m8Var.e && this.f == m8Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
