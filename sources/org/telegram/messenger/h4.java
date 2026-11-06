package org.telegram.messenger;

import android.graphics.Paint;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class h4 {
    public static final List a = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    public static final Paint b = new Paint(2);

    public static f4 a(String str, Integer num, Integer num2) {
        Pair c10;
        if (str == null || (c10 = c(str)) == null) {
            return null;
        }
        if (num == null) {
            num = (Integer) c10.first;
        }
        g4 g4Var = new g4(num.intValue(), 0);
        if (num2 == null) {
            num2 = (Integer) c10.second;
        }
        g4 g4Var2 = new g4(num2.intValue(), 1);
        f4 f4Var = new f4();
        f4Var.c = g4Var;
        f4Var.d = g4Var2;
        return f4Var;
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
                    if (split.length == 2 || !split[0].startsWith("\u1faf1") || !split[1].startsWith("\u1faf2")) {
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
