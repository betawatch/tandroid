package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static n0.c b(Configuration configuration) {
        return n0.c.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(n0.c cVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(cVar.a.a()));
    }

    public static void d(Configuration configuration, n0.c cVar) {
        configuration.setLocales(LocaleList.forLanguageTags(cVar.a.a()));
    }
}
