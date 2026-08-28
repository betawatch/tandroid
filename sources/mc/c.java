package mc;

import f7.e8;
import ie.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f = Pattern.compile("^`+");

    @Override // mc.h
    public final p b() {
        String a2;
        String a3 = a(f);
        if (a3 == null) {
            return null;
        }
        int i9 = this.d;
        do {
            a2 = a(e);
            if (a2 == null) {
                this.d = i9;
                return f(a3);
            }
        } while (!a2.equals(a3));
        ie.d dVar = new ie.d(0);
        String replace = this.c.substring(i9, this.d - a3.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (e8.b(' ', replace, 0, length) != length) {
                replace = e2.c.m(replace, 1, 1);
            }
        }
        dVar.h = replace;
        return dVar;
    }

    @Override // mc.h
    public final char d() {
        return '`';
    }
}
