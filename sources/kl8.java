// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kl8 {
    public final String a;
    public final String b;
    public final int c;

    public kl8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kl8)) {
            return false;
        }
        kl8 kl8Var = (kl8) obj;
        return this.a.equals(kl8Var.a) && this.b.equals(kl8Var.b);
    }

    public final int hashCode() {
        return this.c;
    }
}
