// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i5 {
    public String a;
    public String b;

    public i5(String str, String str2, byte b) {
        switch (b) {
            case 1:
                this.a = str;
                this.b = str2;
                if (str.length() > 0) {
                    return;
                }
                w26.j("userId should not be empty");
                throw null;
            default:
                this.a = str;
                this.b = str2;
                return;
        }
    }

    public final yw8 a() {
        if ("first_party".equals(this.b)) {
            w26.j("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (this.a == null) {
            w26.j("Product id must be provided.");
            return null;
        }
        if (this.b != null) {
            return new yw8(this);
        }
        w26.j("Product type must be provided.");
        return null;
    }
}
