// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fs6 {
    public final boolean a;
    public final String b;
    public final String c;

    public fs6(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fs6.class != obj.getClass()) {
            return false;
        }
        fs6 fs6Var = (fs6) obj;
        return this.a == fs6Var.a && Objects.equals(this.b, fs6Var.b) && Objects.equals(this.c, fs6Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
