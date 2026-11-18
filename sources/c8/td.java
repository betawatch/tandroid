package c8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class td {
    public static String a(String str) {
        if (d(str)) {
            return null;
        }
        return "American Express".equalsIgnoreCase(str) ? "American Express" : "MasterCard".equalsIgnoreCase(str) ? "MasterCard" : "Diners Club".equalsIgnoreCase(str) ? "Diners Club" : "Discover".equalsIgnoreCase(str) ? "Discover" : "JCB".equalsIgnoreCase(str) ? "JCB" : "Visa".equalsIgnoreCase(str) ? "Visa" : "Unknown";
    }

    public static String b(String str) {
        if (d(str)) {
            return null;
        }
        return "credit".equalsIgnoreCase(str) ? "credit" : "debit".equalsIgnoreCase(str) ? "debit" : "prepaid".equalsIgnoreCase(str) ? "prepaid" : "unknown";
    }

    public static boolean c(String str, String... strArr) {
        if (str != null) {
            for (String str2 : strArr) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String e(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }
}
