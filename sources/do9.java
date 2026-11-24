// default package

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class do9 {
    public static final Pattern c = Pattern.compile("[0-9]+");
    public int a;
    public ArrayList b;

    public final String a(String str, String str2, String str3, boolean z) {
        int length = str.length();
        int i = this.a;
        if (length < i) {
            return null;
        }
        int i2 = 0;
        Matcher matcher = c.matcher(str.substring(0, i));
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            q38 q38Var = (q38) obj;
            if (parseInt >= q38Var.a && parseInt <= q38Var.b && str.length() <= q38Var.c) {
                if (z) {
                    int i4 = q38Var.d;
                    if (((i4 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i4 & 1) != 0) || (str2 != null && (i4 & 2) != 0))) {
                        return q38Var.a(str, str2, str3);
                    }
                } else if (str3 == null) {
                    if (str2 == null) {
                        return q38Var.a(str, str2, str3);
                    }
                    if (str2 != null && (q38Var.d & 2) != 0) {
                        return q38Var.a(str, str2, str3);
                    }
                } else {
                    if ((q38Var.d & 1) != 0) {
                        return q38Var.a(str, str2, str3);
                    }
                    if (str2 != null) {
                        return q38Var.a(str, str2, str3);
                    }
                    continue;
                }
            }
        }
        if (z) {
            return null;
        }
        if (str2 != null) {
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                q38 q38Var2 = (q38) obj2;
                if (parseInt >= q38Var2.a && parseInt <= q38Var2.b && str.length() <= q38Var2.c && (str3 == null || (q38Var2.d & 1) != 0)) {
                    return q38Var2.a(str, str2, str3);
                }
            }
            return null;
        }
        if (str3 == null) {
            return null;
        }
        ArrayList arrayList3 = this.b;
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj3 = arrayList3.get(i2);
            i2++;
            q38 q38Var3 = (q38) obj3;
            if (parseInt >= q38Var3.a && parseInt <= q38Var3.b && str.length() <= q38Var3.c && (str2 == null || (q38Var3.d & 2) != 0)) {
                return q38Var3.a(str, str2, str3);
            }
        }
        return null;
    }
}
