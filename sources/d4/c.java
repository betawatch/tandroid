package d4;

import android.graphics.PointF;
import e2.l0;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;

    static {
        String str = l0.a;
        Locale locale = Locale.US;
        b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String group;
        String group2;
        Matcher matcher = b.matcher(str);
        Matcher matcher2 = c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                e2.a.g("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
