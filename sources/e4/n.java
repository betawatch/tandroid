package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import h3.g1;
import j3.r0;
import java.util.ArrayList;
import o8.l0;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new c.c(15);
    public final String b;
    public final z c;

    public n(String str, String str2, l0 l0Var) {
        super(str);
        d5.a.f(!l0Var.isEmpty());
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
            if (f0.a(this.a, nVar.a) && f0.a(this.b, nVar.b) && this.c.equals(nVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f10 = r0.f(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((f10 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e4.j, z3.b
    public final void populateMediaMetadata(g1 g1Var) {
        char c10;
        String str = this.a;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        z zVar = this.c;
        try {
            switch (c10) {
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
                    int i9 = f0.a;
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
                    ArrayList a3 = a((String) zVar.get(0));
                    int size2 = a3.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                g1Var.w = (Integer) a3.get(2);
                            }
                        }
                        g1Var.v = (Integer) a3.get(1);
                    }
                    g1Var.u = (Integer) a3.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // e4.j
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringArray((String[]) this.c.toArray(new String[0]));
    }
}
