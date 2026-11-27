// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jb0 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final jb0 a() {
        jb0 jb0Var = new jb0();
        jb0Var.c = this.c;
        jb0Var.d = this.d;
        jb0Var.e = this.e;
        jb0Var.f = this.f;
        jb0Var.b = this.b;
        return jb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0Var = (jb0) obj;
        return this.c == jb0Var.c && this.d == jb0Var.d && this.e == jb0Var.e && this.f == jb0Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
