package oc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import le.p;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override // oc.h
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
                    sVar.g = com.google.android.recaptcha.internal.a.m(str, end, 0);
                }
                return end >= 2 ? new le.g(1) : new le.g(2);
            }
        }
        return new le.g(2);
    }

    @Override // oc.h
    public final char d() {
        return '\n';
    }
}
