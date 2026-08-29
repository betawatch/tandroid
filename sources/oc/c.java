package oc;

import java.util.regex.Pattern;
import le.p;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f = Pattern.compile("^`+");

    @Override // oc.h
    public final p b() {
        String a2;
        String a10 = a(f);
        if (a10 == null) {
            return null;
        }
        int i10 = this.d;
        do {
            a2 = a(e);
            if (a2 == null) {
                this.d = i10;
                return f(a10);
            }
        } while (!a2.equals(a10));
        le.d dVar = new le.d(0);
        String replace = this.c.substring(i10, this.d - a10.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (i7.k.b(' ', replace, 0, length) != length) {
                replace = com.google.android.recaptcha.internal.a.m(replace, 1, 1);
            }
        }
        dVar.h = replace;
        return dVar;
    }

    @Override // oc.h
    public final char d() {
        return '`';
    }
}
