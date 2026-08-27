package nc;

import g7.j8;
import java.util.regex.Pattern;
import je.p;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f = Pattern.compile("^`+");

    @Override // nc.h
    public final p b() {
        String a2;
        String a3 = a(f);
        if (a3 == null) {
            return null;
        }
        int i10 = this.d;
        do {
            a2 = a(e);
            if (a2 == null) {
                this.d = i10;
                return f(a3);
            }
        } while (!a2.equals(a3));
        je.d dVar = new je.d(0);
        String replace = this.c.substring(i10, this.d - a3.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (j8.b(' ', replace, 0, length) != length) {
                replace = com.google.android.recaptcha.internal.a.n(replace, 1, 1);
            }
        }
        dVar.h = replace;
        return dVar;
    }

    @Override // nc.h
    public final char d() {
        return '`';
    }
}
