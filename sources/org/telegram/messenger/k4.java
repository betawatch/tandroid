package org.telegram.messenger;

import android.graphics.Paint;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class k4 {
    public static final List a = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    public static final Paint b = new Paint(2);

    public static i4 a(String str, Integer num, Integer num2) {
        Pair c10;
        if (str == null || (c10 = c(str)) == null) {
            return null;
        }
        if (num == null) {
            num = (Integer) c10.first;
        }
        j4 j4Var = new j4(num.intValue(), 0);
        if (num2 == null) {
            num2 = (Integer) c10.second;
        }
        j4 j4Var2 = new j4(num2.intValue(), 1);
        i4 i4Var = new i4();
        i4Var.c = j4Var;
        i4Var.d = j4Var2;
        return i4Var;
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        return a.indexOf(str.substring(str.length() - 2));
    }

    public static Pair c(String str) {
        int i10;
        String[] split;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i10 = b(str);
                    r3 = i10 >= 0 ? i10 : -1;
                    split = str.split("\u200d");
                    if (split.length == 2 || !split[0].startsWith("\u1faf1") || !split[1].startsWith("\u1faf2")) {
                        return null;
                    }
                    if (split[0].length() != 2 && (split[0].length() != 4 || (i10 = b(split[0])) < 0)) {
                        return null;
                    }
                    if (split[1].length() == 2 || (split[1].length() == 4 && (r3 = b(split[1])) >= 0)) {
                        return new Pair(Integer.valueOf(i10), Integer.valueOf(r3));
                    }
                    return null;
                }
            }
            return new Pair(Integer.valueOf(r3), Integer.valueOf(r3));
        }
        i10 = -1;
        split = str.split("\u200d");
        return split.length == 2 ? null : null;
    }
}
