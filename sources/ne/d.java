package ne;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public static final Pattern c = Pattern.compile("[0-9]+");
    public int a;
    public ArrayList b;

    public final String a(String str, String str2, String str3, boolean z10) {
        int length = str.length();
        int i9 = this.a;
        if (length < i9) {
            return null;
        }
        int i10 = 0;
        Matcher matcher = c.matcher(str.substring(0, i9));
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            c cVar = (c) obj;
            if (parseInt >= cVar.a && parseInt <= cVar.b && str.length() <= cVar.c) {
                if (z10) {
                    int i12 = cVar.d;
                    if (((i12 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i12 & 1) != 0) || (str2 != null && (i12 & 2) != 0))) {
                        return cVar.a(str, str2, str3);
                    }
                } else if ((str3 == null && str2 == null) || ((str3 != null && (cVar.d & 1) != 0) || (str2 != null && (cVar.d & 2) != 0))) {
                    return cVar.a(str, str2, str3);
                }
            }
        }
        if (z10) {
            return null;
        }
        if (str2 != null) {
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                c cVar2 = (c) obj2;
                if (parseInt >= cVar2.a && parseInt <= cVar2.b && str.length() <= cVar2.c && (str3 == null || (cVar2.d & 1) != 0)) {
                    return cVar2.a(str, str2, str3);
                }
            }
            return null;
        }
        if (str3 == null) {
            return null;
        }
        ArrayList arrayList3 = this.b;
        int size3 = arrayList3.size();
        while (i10 < size3) {
            Object obj3 = arrayList3.get(i10);
            i10++;
            c cVar3 = (c) obj3;
            if (parseInt >= cVar3.a && parseInt <= cVar3.b && str.length() <= cVar3.c && (str2 == null || (cVar3.d & 2) != 0)) {
                return cVar3.a(str, str2, str3);
            }
        }
        return null;
    }
}
