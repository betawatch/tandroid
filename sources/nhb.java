// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nhb extends uj5 {
    public final String b;
    public final mm5 c;

    public nhb(String str, String str2, w59 w59Var) {
        super(str);
        gre.f(!w59Var.isEmpty());
        this.b = str2;
        mm5 q = mm5.q(w59Var);
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
    @Override // uj5, jd7
    public final void b(hr6 hr6Var) {
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
        mm5 mm5Var = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    hr6Var.c = (CharSequence) mm5Var.get(0);
                    break;
                case 1:
                case 11:
                    hr6Var.A = (CharSequence) mm5Var.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) mm5Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    hr6Var.u = Integer.valueOf(parseInt);
                    hr6Var.v = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    hr6Var.b = (CharSequence) mm5Var.get(0);
                    break;
                case 4:
                case 19:
                    hr6Var.d = (CharSequence) mm5Var.get(0);
                    break;
                case 5:
                case 20:
                    hr6Var.B = (CharSequence) mm5Var.get(0);
                    break;
                case 6:
                case 22:
                    String str3 = (String) mm5Var.get(0);
                    String str4 = g8c.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    hr6Var.o = Integer.valueOf(parseInt3);
                    hr6Var.p = valueOf;
                    break;
                case 7:
                case 17:
                    hr6Var.a = (CharSequence) mm5Var.get(0);
                    break;
                case '\b':
                case 16:
                    hr6Var.z = (CharSequence) mm5Var.get(0);
                    break;
                case '\t':
                case 24:
                    hr6Var.t = Integer.valueOf(Integer.parseInt((String) mm5Var.get(0)));
                    break;
                case '\f':
                    Integer f = gle.f((String) mm5Var.get(0));
                    if (f != null) {
                        String a = vj5.a(f.intValue());
                        if (a != null) {
                            hr6Var.F = a;
                            break;
                        }
                    } else {
                        hr6Var.F = (CharSequence) mm5Var.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList d = d((String) mm5Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                hr6Var.v = (Integer) d.get(2);
                            }
                        }
                        hr6Var.u = (Integer) d.get(1);
                    }
                    hr6Var.t = (Integer) d.get(0);
                    break;
                case 15:
                    ArrayList d2 = d((String) mm5Var.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                hr6Var.y = (Integer) d2.get(2);
                            }
                        }
                        hr6Var.x = (Integer) d2.get(1);
                    }
                    hr6Var.w = (Integer) d2.get(0);
                    break;
                case 21:
                    String str5 = (String) mm5Var.get(0);
                    String str6 = g8c.a;
                    String[] split2 = str5.split("/", -1);
                    int parseInt4 = Integer.parseInt(split2[0]);
                    valueOf = split2.length > 1 ? Integer.valueOf(Integer.parseInt(split2[1])) : null;
                    hr6Var.D = Integer.valueOf(parseInt4);
                    hr6Var.E = valueOf;
                    break;
                case 23:
                    hr6Var.C = (CharSequence) mm5Var.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nhb.class != obj.getClass()) {
            return false;
        }
        nhb nhbVar = (nhb) obj;
        return this.a.equals(nhbVar.a) && Objects.equals(this.b, nhbVar.b) && this.c.equals(nhbVar.c);
    }

    public final int hashCode() {
        int j = ir2.j(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((j + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // uj5
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
