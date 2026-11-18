package n0;

import android.os.Build;
import androidx.emoji2.text.x;
import java.util.Locale;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c {
    public static final c b = a(new Locale[0]);
    public final e a;

    public c(e eVar) {
        this.a = eVar;
    }

    public static c a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new c(new f(x.d(localeArr))) : new c(new d(localeArr));
    }

    public static c b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = split[i7];
            int i10 = b.a;
            localeArr[i7] = Locale.forLanguageTag(str2);
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
