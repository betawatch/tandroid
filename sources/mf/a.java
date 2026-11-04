package mf;

import a1.g;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    str2 = null;
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
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
            String a10 = ((d) obj2).a(str3, str4, str5, true);
            if (a10 != null) {
                return a10;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            String a11 = ((d) obj3).a(str3, str4, str5, false);
            if (a11 != null) {
                return a11;
            }
        }
        return (str4 == null || str3.length() == 0) ? str : g.C(str4, " ", str3);
    }
}
