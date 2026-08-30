package f7;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class q {
    public static final StringBuilder a;

    static {
        Locale locale = Locale.ROOT;
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        a = new StringBuilder(33);
    }

    public static void a(StringBuilder sb, long j10) {
        if (j10 == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z4 = false;
        if (j10 < 0) {
            sb.append("-");
            if (j10 != Long.MIN_VALUE) {
                j10 = -j10;
            } else {
                j10 = Long.MAX_VALUE;
                z4 = true;
            }
        }
        if (j10 >= 86400000) {
            sb.append(j10 / 86400000);
            sb.append("d");
            j10 %= 86400000;
        }
        if (true == z4) {
            j10 = 25975808;
        }
        if (j10 >= 3600000) {
            sb.append(j10 / 3600000);
            sb.append("h");
            j10 %= 3600000;
        }
        if (j10 >= 60000) {
            sb.append(j10 / 60000);
            sb.append("m");
            j10 %= 60000;
        }
        if (j10 >= 1000) {
            sb.append(j10 / 1000);
            sb.append("s");
            j10 %= 1000;
        }
        if (j10 > 0) {
            sb.append(j10);
            sb.append("ms");
        }
    }
}
