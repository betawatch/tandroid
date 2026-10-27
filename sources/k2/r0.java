package k2;

import android.text.TextUtils;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r0 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public r0(b2.x xVar, b2.x xVar2, int i10, int i11, p pVar, c2.k kVar) {
        this.c = xVar;
        this.d = xVar2;
        this.a = i10;
        this.b = i11;
        this.e = pVar;
        this.f = kVar;
    }

    public static boolean a(r0 r0Var) {
        return Objects.equals(((b2.x) r0Var.c).s, "audio/raw");
    }

    public ti.a b() {
        if (this.a == 3) {
            String str = (String) this.c;
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                int indexOf = str.indexOf(47);
                String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                String substring2 = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                if (!TextUtils.isEmpty(substring) && substring.indexOf(58) < 0 && substring.indexOf(63) < 0 && substring.indexOf(35) < 0 && (substring2 == null || (substring2.length() <= 128 && ti.a.g.matcher(substring2).matches()))) {
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
                String b10 = ti.a.b((String) this.f);
                if (b10 == null) {
                    b10 = ((String) this.f).toLowerCase(Locale.US);
                }
                this.f = b10;
            }
        }
        return new ti.a(this);
    }
}
