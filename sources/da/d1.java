package da;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class d1 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final e1 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new e1(this.b, this.c, str, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
