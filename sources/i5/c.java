package i5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c {
    public String a;

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
        String sb2 = sb.toString();
        c cVar = new c();
        cVar.a = sb2;
        return cVar;
    }
}
