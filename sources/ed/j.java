package ed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.p;
import kf.s;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // ed.h
    public final p b() {
        this.d++;
        p pVar = (p) this.b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.g.endsWith(" ")) {
                String str = sVar.g;
                Matcher matcher = e.matcher(str);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    sVar.g = com.google.android.recaptcha.internal.a.k(str, end, 0);
                }
                return end >= 2 ? new kf.g(1) : new kf.g(2);
            }
        }
        return new kf.g(2);
    }

    @Override // ed.h
    public final char d() {
        return '\n';
    }
}
