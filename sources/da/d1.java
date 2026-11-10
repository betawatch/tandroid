package da;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
