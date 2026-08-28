package n0;

import android.os.Build;
import androidx.emoji2.text.v;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public static final c b = a(new Locale[0]);
    public final e a;

    public c(e eVar) {
        this.a = eVar;
    }

    public static c a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new c(new f(v.d(localeArr))) : new c(new d(localeArr));
    }

    public static c b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i9 = 0; i9 < length; i9++) {
            String str2 = split[i9];
            int i10 = b.a;
            localeArr[i9] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.a.equals(((c) obj).a);
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
