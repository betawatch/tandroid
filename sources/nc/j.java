package nc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.p;
import je.s;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // nc.h
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
                    sVar.g = com.google.android.recaptcha.internal.a.n(str, end, 0);
                }
                return end >= 2 ? new je.g(1) : new je.g(2);
            }
        }
        return new je.g(2);
    }

    @Override // nc.h
    public final char d() {
        return '\n';
    }
}
