package ed;

import c8.a1;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f = Pattern.compile("^`+");

    @Override // ed.h
    public final p b() {
        String a10;
        String a11 = a(f);
        if (a11 == null) {
            return null;
        }
        int i7 = this.d;
        do {
            a10 = a(e);
            if (a10 == null) {
                this.d = i7;
                return f(a11);
            }
        } while (!a10.equals(a11));
        kf.d dVar = new kf.d(0);
        String replace = this.c.substring(i7, this.d - a11.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (a1.b(' ', 0, length, replace) != length) {
                replace = e2.k(replace, 1, 1);
            }
        }
        dVar.h = replace;
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '`';
    }
}
