package ed;

import bf.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class g extends h {
    public static final Pattern e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override // ed.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        bf.d dVar = new bf.d(1);
        dVar.h = a2;
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '<';
    }
}
