package bd;

import b8.ec;
import gf.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f = Pattern.compile("^`+");

    @Override // bd.h
    public final p b() {
        String a10;
        String a11 = a(f);
        if (a11 == null) {
            return null;
        }
        int i3 = this.d;
        do {
            a10 = a(e);
            if (a10 == null) {
                this.d = i3;
                return f(a11);
            }
        } while (!a10.equals(a11));
        gf.d dVar = new gf.d(0);
        String replace = this.c.substring(i3, this.d - a11.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (ec.b(' ', 0, length, replace) != length) {
                replace = com.google.android.recaptcha.internal.a.j(replace, 1, 1);
            }
        }
        dVar.h = replace;
        return dVar;
    }

    @Override // bd.h
    public final char d() {
        return '`';
    }
}
