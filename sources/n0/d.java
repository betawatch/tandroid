package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d implements e {
    public static final Locale[] c = new Locale[0];
    public final Locale[] a;
    public final String b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    public d(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = c;
            this.b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < localeArr.length; i7++) {
            Locale locale = localeArr[i7];
            if (locale == null) {
                throw new NullPointerException(jg.g.k(i7, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb2.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb2.append('-');
                    sb2.append(locale2.getCountry());
                }
                if (i7 < localeArr.length - 1) {
                    sb2.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.b = sb2.toString();
    }

    @Override // n0.e
    public final String a() {
        return this.b;
    }

    @Override // n0.e
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Locale[] localeArr = ((d) obj).a;
        Locale[] localeArr2 = this.a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < localeArr2.length; i7++) {
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // n0.e
    public final Locale get(int i7) {
        if (i7 < 0) {
            return null;
        }
        Locale[] localeArr = this.a;
        if (i7 < localeArr.length) {
            return localeArr[i7];
        }
        return null;
    }

    public final int hashCode() {
        int i7 = 1;
        for (Locale locale : this.a) {
            i7 = (i7 * 31) + locale.hashCode();
        }
        return i7;
    }

    @Override // n0.e
    public final int size() {
        return this.a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i7 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i7]);
            if (i7 < localeArr.length - 1) {
                sb2.append(',');
            }
            i7++;
        }
    }
}
