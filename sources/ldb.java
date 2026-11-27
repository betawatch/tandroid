// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ldb extends kdb {
    public static String c(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int e = ddb.e(0, str, str2, false);
        if (e < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, e);
            sb.append(str3);
            i2 = e + length;
            if (e >= str.length()) {
                break;
            }
            e = ddb.e(e + i, str, str2, false);
        } while (e > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean d(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str.startsWith(str2);
    }
}
