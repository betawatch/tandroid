package ne;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public String a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (str.startsWith(this.a)) {
            str4 = this.a;
            str3 = str.substring(str4.length());
        } else {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    str2 = null;
                    break;
                }
                Object obj = arrayList.get(i9);
                i9++;
                str2 = (String) obj;
                if (str.startsWith(str2)) {
                    break;
                }
            }
            if (str2 != null) {
                str3 = str.substring(str2.length());
                str4 = null;
                str5 = str2;
            } else {
                str3 = str;
                str4 = null;
            }
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            String a2 = ((d) obj2).a(str3, str4, str5, true);
            if (a2 != null) {
                return a2;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            String a3 = ((d) obj3).a(str3, str4, str5, false);
            if (a3 != null) {
                return a3;
            }
        }
        return (str4 == null || str3.length() == 0) ? str : aa.d.z(str4, " ", str3);
    }
}
