// default package

import android.net.Uri;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k0b {
    public final int a;
    public final long b;
    public final Uri c;
    public final mo5 d;
    public final mo5 e;

    public k0b(int i, long j, Uri uri, y79 y79Var, y79 y79Var2) {
        this.a = i;
        this.b = j;
        this.c = uri;
        this.d = mo5.q(y79Var);
        this.e = mo5.q(y79Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0b)) {
            return false;
        }
        k0b k0bVar = (k0b) obj;
        return this.a == k0bVar.a && this.b == k0bVar.b && Objects.equals(this.c, k0bVar.c) && Objects.equals(this.d, k0bVar.d) && Objects.equals(this.e, k0bVar.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e);
    }
}
