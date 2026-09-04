package bf;

import v7.i0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class s extends p {
    public String g;

    public s(String str) {
        this.g = str;
    }

    @Override // bf.p
    public final void a(i0 i0Var) {
        i0Var.o(this);
    }

    @Override // bf.p
    public final String f() {
        return "literal=" + this.g;
    }
}
