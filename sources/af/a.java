package af;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t7.u;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class a {
    public static final Pattern a = Pattern.compile("[\\\\&]");
    public static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern c;
    public static final u d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        c = Pattern.compile("[ \t\r\n]+");
        d = new u(1);
    }

    public static String a(String str) {
        if (!a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, matcher.start());
            String group = matcher.group();
            d.getClass();
            if (group.charAt(0) == '\\') {
                sb2.append((CharSequence) group, 1, group.length());
            } else {
                sb2.append(b.a(group));
            }
            i10 = matcher.end();
        } while (matcher.find());
        if (i10 != str.length()) {
            sb2.append((CharSequence) str, i10, str.length());
        }
        return sb2.toString();
    }
}
