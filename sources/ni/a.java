package ni;

import android.text.TextUtils;
import java.net.IDN;
import java.util.Locale;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class a {
    public int a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;

    public final b a() {
        if (this.a == 3) {
            String str = this.b;
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                int indexOf = str.indexOf(47);
                String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                String substring2 = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                if (!TextUtils.isEmpty(substring) && substring.indexOf(58) < 0 && substring.indexOf(63) < 0 && substring.indexOf(35) < 0 && (substring2 == null || (substring2.length() <= 128 && b.g.matcher(substring2).matches()))) {
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
            this.b = str;
            if (str == null || str.indexOf(47) < 0) {
                this.f = this.f.toLowerCase(Locale.US);
            } else {
                String b10 = b.b(this.f);
                if (b10 == null) {
                    b10 = this.f.toLowerCase(Locale.US);
                }
                this.f = b10;
            }
        }
        return new b(this);
    }
}
