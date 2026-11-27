// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jlb extends wl5 {
    public final String b;
    public final po5 c;

    public jlb(String str, String str2, j99 j99Var) {
        super(str);
        yve.f(!j99Var.isEmpty());
        this.b = str2;
        po5 q = po5.q(j99Var);
        this.c = q;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // wl5, sf7
    public final void b(lt6 lt6Var) {
        char c;
        Integer valueOf;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2581856:
                if (str.equals("TPOS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2584864:
                if (str.equals("TSST")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        po5 po5Var = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    lt6Var.c = (CharSequence) po5Var.get(0);
                    break;
                case 1:
                case 11:
                    lt6Var.A = (CharSequence) po5Var.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) po5Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    lt6Var.u = Integer.valueOf(parseInt);
                    lt6Var.v = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    lt6Var.b = (CharSequence) po5Var.get(0);
                    break;
                case 4:
                case 19:
                    lt6Var.d = (CharSequence) po5Var.get(0);
                    break;
                case 5:
                case 20:
                    lt6Var.B = (CharSequence) po5Var.get(0);
                    break;
                case 6:
                case 22:
                    String str3 = (String) po5Var.get(0);
                    String str4 = gcc.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    lt6Var.o = Integer.valueOf(parseInt3);
                    lt6Var.p = valueOf;
                    break;
                case 7:
                case 17:
                    lt6Var.a = (CharSequence) po5Var.get(0);
                    break;
                case '\b':
                case 16:
                    lt6Var.z = (CharSequence) po5Var.get(0);
                    break;
                case '\t':
                case 24:
                    lt6Var.t = Integer.valueOf(Integer.parseInt((String) po5Var.get(0)));
                    break;
                case '\f':
                    Integer f = ype.f((String) po5Var.get(0));
                    if (f != null) {
                        String a = xl5.a(f.intValue());
                        if (a != null) {
                            lt6Var.F = a;
                            break;
                        }
                    } else {
                        lt6Var.F = (CharSequence) po5Var.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList d = d((String) po5Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                lt6Var.v = (Integer) d.get(2);
                            }
                        }
                        lt6Var.u = (Integer) d.get(1);
                    }
                    lt6Var.t = (Integer) d.get(0);
                    break;
                case 15:
                    ArrayList d2 = d((String) po5Var.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                lt6Var.y = (Integer) d2.get(2);
                            }
                        }
                        lt6Var.x = (Integer) d2.get(1);
                    }
                    lt6Var.w = (Integer) d2.get(0);
                    break;
                case 21:
                    String str5 = (String) po5Var.get(0);
                    String str6 = gcc.a;
                    String[] split2 = str5.split("/", -1);
                    int parseInt4 = Integer.parseInt(split2[0]);
                    valueOf = split2.length > 1 ? Integer.valueOf(Integer.parseInt(split2[1])) : null;
                    lt6Var.D = Integer.valueOf(parseInt4);
                    lt6Var.E = valueOf;
                    break;
                case 23:
                    lt6Var.C = (CharSequence) po5Var.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jlb.class != obj.getClass()) {
            return false;
        }
        jlb jlbVar = (jlb) obj;
        return this.a.equals(jlbVar.a) && Objects.equals(this.b, jlbVar.b) && this.c.equals(jlbVar.c);
    }

    public final int hashCode() {
        int j = bs2.j(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // wl5
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
