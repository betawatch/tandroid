// default package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mj7 extends tn5 {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // tn5
    public final tg6 b() {
        this.d++;
        tg6 tg6Var = (tg6) this.b.d;
        if (tg6Var instanceof ugb) {
            ugb ugbVar = (ugb) tg6Var;
            if (ugbVar.g.endsWith(" ")) {
                String str = ugbVar.g;
                Matcher matcher = e.matcher(str);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    ugbVar.g = ir2.n(end, 0, str);
                }
                return end >= 2 ? new u14((byte) 1) : new u14((byte) 2);
            }
        }
        return new u14((byte) 2);
    }

    @Override // tn5
    public final char c() {
        return '\n';
    }
}
