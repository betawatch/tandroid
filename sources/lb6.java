// default package

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lb6 {
    public static final lb6 b = a(new Locale[0]);
    public final nb6 a;

    public lb6(nb6 nb6Var) {
        this.a = nb6Var;
    }

    public static lb6 a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new lb6(new ob6(ki0.e(localeArr))) : new lb6(new mb6(localeArr));
    }

    public static lb6 b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i2 = kb6.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lb6) {
            return this.a.equals(((lb6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
