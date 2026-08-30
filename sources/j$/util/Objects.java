package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Objects {
    public static boolean nonNull(Object obj) {
        return obj != null;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }

    public static <T> T requireNonNull(T t6) {
        t6.getClass();
        return t6;
    }

    public static <T> T requireNonNull(T t6, String str) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(str);
    }
}
