package c5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a {
    public String a;
    public String b;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public s a() {
        if ("first_party".equals(this.b)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.a == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.b != null) {
            return new s(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }
}
