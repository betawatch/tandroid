package c5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a {
    public String a;
    public String b;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public r a() {
        if ("first_party".equals(this.b)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.a == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.b != null) {
            return new r(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }
}
