package e5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public String b;

    public static c a(d5.y yVar) {
        String str;
        yVar.D(2);
        int r10 = yVar.r();
        int i9 = r10 >> 1;
        int r11 = ((yVar.r() >> 3) & 31) | ((r10 & 1) << 5);
        if (i9 == 4 || i9 == 5 || i9 == 7) {
            str = "dvhe";
        } else if (i9 == 8) {
            str = "hev1";
        } else {
            if (i9 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i9);
        sb2.append(r11 >= 10 ? "." : ".0");
        sb2.append(r11);
        return new c(sb2.toString(), 0);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(String str, int i9) {
        this.a = i9;
        this.b = str;
    }
}
