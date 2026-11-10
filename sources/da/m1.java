package da;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class m1 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final n1 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new n1(this.a, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.b == null) {
            sb2.append(" version");
        }
        if (this.c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
