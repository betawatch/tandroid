package i5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public String b;

    public static c a(h5.w wVar) {
        String str;
        wVar.G(2);
        int u10 = wVar.u();
        int i10 = u10 >> 1;
        int u11 = ((wVar.u() >> 3) & 31) | ((u10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i10);
        sb.append(u11 >= 10 ? "." : ".0");
        sb.append(u11);
        return new c(sb.toString(), 0);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(String str, int i10) {
        this.a = i10;
        this.b = str;
    }
}
