// default package

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m96 {
    public static final m96 b = a(new Locale[0]);
    public final o96 a;

    public m96(o96 o96Var) {
        this.a = o96Var;
    }

    public static m96 a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new m96(new p96(kh0.e(localeArr))) : new m96(new n96(localeArr));
    }

    public static m96 b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i2 = l96.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m96) {
            return this.a.equals(((m96) obj).a);
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
