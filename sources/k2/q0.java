package k2;

import android.text.TextUtils;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class q0 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public q0(b2.w wVar, b2.w wVar2, int i10, int i11, o oVar, c2.j jVar) {
        this.c = wVar;
        this.d = wVar2;
        this.a = i10;
        this.b = i11;
        this.e = oVar;
        this.f = jVar;
    }

    public static boolean a(q0 q0Var) {
        return Objects.equals(((b2.w) q0Var.c).s, "audio/raw");
    }

    public qi.a b() {
        if (this.a == 3) {
            String str = (String) this.c;
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                int indexOf = str.indexOf(47);
                String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                String substring2 = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                if (!TextUtils.isEmpty(substring) && substring.indexOf(58) < 0 && substring.indexOf(63) < 0 && substring.indexOf(35) < 0 && (substring2 == null || (substring2.length() <= 128 && qi.a.g.matcher(substring2).matches()))) {
                    try {
                        String lowerCase = IDN.toASCII(substring, 3).toLowerCase(Locale.US);
                        if (substring2 == null) {
                            str = lowerCase;
                        } else {
                            str = lowerCase + '/' + substring2;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            this.c = str;
            if (str == null || str.indexOf(47) < 0) {
                this.f = ((String) this.f).toLowerCase(Locale.US);
            } else {
                String b10 = qi.a.b((String) this.f);
                if (b10 == null) {
                    b10 = ((String) this.f).toLowerCase(Locale.US);
                }
                this.f = b10;
            }
        }
        return new qi.a(this);
    }
}
