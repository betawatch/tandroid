package org.telegram.messenger;

import android.graphics.Paint;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class j4 {
    public static final List a = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    public static final Paint b = new Paint(2);

    public static h4 a(String str, Integer num, Integer num2) {
        Pair c10;
        if (str == null || (c10 = c(str)) == null) {
            return null;
        }
        if (num == null) {
            num = (Integer) c10.first;
        }
        i4 i4Var = new i4(num.intValue(), 0);
        if (num2 == null) {
            num2 = (Integer) c10.second;
        }
        i4 i4Var2 = new i4(num2.intValue(), 1);
        h4 h4Var = new h4();
        h4Var.c = i4Var;
        h4Var.d = i4Var2;
        return h4Var;
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        return a.indexOf(str.substring(str.length() - 2));
    }

    public static Pair c(String str) {
        int i7;
        String[] split;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i7 = b(str);
                    r3 = i7 >= 0 ? i7 : -1;
                    split = str.split("\u200d");
                    if (split.length == 2 || !split[0].startsWith("🫱") || !split[1].startsWith("🫲")) {
                        return null;
                    }
                    if (split[0].length() != 2 && (split[0].length() != 4 || (i7 = b(split[0])) < 0)) {
                        return null;
                    }
                    if (split[1].length() == 2 || (split[1].length() == 4 && (r3 = b(split[1])) >= 0)) {
                        return new Pair(Integer.valueOf(i7), Integer.valueOf(r3));
                    }
                    return null;
                }
            }
            return new Pair(Integer.valueOf(r3), Integer.valueOf(r3));
        }
        i7 = -1;
        split = str.split("\u200d");
        return split.length == 2 ? null : null;
    }
}
