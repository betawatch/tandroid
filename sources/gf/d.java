package gf;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d {
    public static final Pattern c = Pattern.compile("[0-9]+");
    public int a;
    public ArrayList b;

    public final String a(String str, String str2, String str3, boolean z10) {
        int length = str.length();
        int i10 = this.a;
        if (length < i10) {
            return null;
        }
        int i11 = 0;
        Matcher matcher = c.matcher(str.substring(0, i10));
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            c cVar = (c) obj;
            if (parseInt >= cVar.a && parseInt <= cVar.b && str.length() <= cVar.c) {
                if (z10) {
                    int i13 = cVar.d;
                    if (((i13 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i13 & 1) != 0) || (str2 != null && (i13 & 2) != 0))) {
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
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
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
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            c cVar3 = (c) obj3;
            if (parseInt >= cVar3.a && parseInt <= cVar3.b && str.length() <= cVar3.c && (str2 == null || (cVar3.d & 2) != 0)) {
                return cVar3.a(str, str2, str3);
            }
        }
        return null;
    }
}
