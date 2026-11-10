package ed;

import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g extends h {
    public static final Pattern e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override // ed.h
    public final p b() {
        String a10 = a(e);
        if (a10 == null) {
            return null;
        }
        kf.d dVar = new kf.d(1);
        dVar.h = a10;
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '<';
    }
}
