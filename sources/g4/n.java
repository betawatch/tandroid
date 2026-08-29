package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j3.g1;
import j7.l1;
import java.util.ArrayList;
import q8.l0;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new d6.d(28);
    public final String b;
    public final z c;

    public n(String str, String str2, l0 l0Var) {
        super(str);
        f5.a.f(!l0Var.isEmpty());
        this.b = str2;
        z u10 = z.u(l0Var);
        this.c = u10;
    }

    public static ArrayList a(String str) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (d0.a(this.a, nVar.a) && d0.a(this.b, nVar.b) && this.c.equals(nVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f9 = l1.f(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((f9 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // g4.j, b4.b
    public final void populateMediaMetadata(g1 g1Var) {
        char c3;
        String str = this.a;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        z zVar = this.c;
        try {
            switch (c3) {
                case 0:
                case '\n':
                    g1Var.c = (CharSequence) zVar.get(0);
                    break;
                case 1:
                case 11:
                    g1Var.y = (CharSequence) zVar.get(0);
                    break;
                case 2:
                case '\f':
                    String str2 = (String) zVar.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    g1Var.s = Integer.valueOf(parseInt);
                    g1Var.t = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 17:
                    g1Var.b = (CharSequence) zVar.get(0);
                    break;
                case 4:
                case 18:
                    g1Var.d = (CharSequence) zVar.get(0);
                    break;
                case 5:
                case 19:
                    g1Var.z = (CharSequence) zVar.get(0);
                    break;
                case 6:
                case 20:
                    String str3 = (String) zVar.get(0);
                    int i10 = d0.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    g1Var.m = Integer.valueOf(parseInt3);
                    g1Var.n = valueOf;
                    break;
                case 7:
                case 16:
                    g1Var.a = (CharSequence) zVar.get(0);
                    break;
                case '\b':
                case 15:
                    g1Var.x = (CharSequence) zVar.get(0);
                    break;
                case '\t':
                case 21:
                    g1Var.r = Integer.valueOf(Integer.parseInt((String) zVar.get(0)));
                    break;
                case '\r':
                    ArrayList a2 = a((String) zVar.get(0));
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                g1Var.t = (Integer) a2.get(2);
                            }
                        }
                        g1Var.s = (Integer) a2.get(1);
                    }
                    g1Var.r = (Integer) a2.get(0);
                    break;
                case 14:
                    ArrayList a10 = a((String) zVar.get(0));
                    int size2 = a10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                g1Var.w = (Integer) a10.get(2);
                            }
                        }
                        g1Var.v = (Integer) a10.get(1);
                    }
                    g1Var.u = (Integer) a10.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // g4.j
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringArray((String[]) this.c.toArray(new String[0]));
    }
}
