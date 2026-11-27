// default package

import android.graphics.Paint;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class jr2 {
    public static final List a = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    public static final Paint b = new Paint(2);

    public static hr2 a(String str, Integer num, Integer num2) {
        Pair c;
        if (str == null || (c = c(str)) == null) {
            return null;
        }
        if (num == null) {
            num = (Integer) c.first;
        }
        ir2 ir2Var = new ir2(num.intValue(), 0);
        if (num2 == null) {
            num2 = (Integer) c.second;
        }
        ir2 ir2Var2 = new ir2(num2.intValue(), 1);
        hr2 hr2Var = new hr2();
        hr2Var.c = ir2Var;
        hr2Var.d = ir2Var2;
        return hr2Var;
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        return a.indexOf(str.substring(str.length() - 2));
    }

    public static Pair c(String str) {
        int i;
        String[] split;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i = b(str);
                    r3 = i >= 0 ? i : -1;
                    split = str.split("\u200d");
                    if (split.length == 2 || !split[0].startsWith("🫱") || !split[1].startsWith("🫲")) {
                        return null;
                    }
                    if (split[0].length() != 2 && (split[0].length() != 4 || (i = b(split[0])) < 0)) {
                        return null;
                    }
                    if (split[1].length() == 2 || (split[1].length() == 4 && (r3 = b(split[1])) >= 0)) {
                        return new Pair(Integer.valueOf(i), Integer.valueOf(r3));
                    }
                    return null;
                }
            }
            return new Pair(Integer.valueOf(r3), Integer.valueOf(r3));
        }
        i = -1;
        split = str.split("\u200d");
        return split.length == 2 ? null : null;
    }
}
