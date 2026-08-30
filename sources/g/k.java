package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class k {
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
