// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class is9 {
    public static ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    public is9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static is9 a() {
        ArrayList b = b();
        return b.isEmpty() ? new is9("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (is9) b.get(Utilities.j(gba.m0, b.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i = 1;
            while (true) {
                String c = c(k96.N0("SearchEngine" + i + "Name"));
                if (c == null) {
                    break;
                }
                String c2 = c(k96.N0("SearchEngine" + i + "SearchURL"));
                String c3 = c(k96.N0("SearchEngine" + i + "AutocompleteURL"));
                c(k96.N0("SearchEngine" + i + "PrivacyPolicyURL"));
                d.add(new is9(c, c2, c3));
                i++;
            }
        }
        return d;
    }

    public static String c(String str) {
        if (str.startsWith("LOC_ERR") || "reserved".equals(str)) {
            return null;
        }
        return str;
    }
}
