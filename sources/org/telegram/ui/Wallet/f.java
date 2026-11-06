package org.telegram.ui.Wallet;

import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.telegram.messenger.hd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class f {
    public final int a;
    public final n0 b;
    public boolean c;
    public TL_wallet.currencyRates d;
    public String e = "en";
    public String f;

    public f(n0 n0Var) {
        this.b = n0Var;
        this.a = n0Var.a;
        try {
            this.f = org.telegram.messenger.t0.b.getSharedPreferences("gram_wallet", 0).getString("currency", g());
        } catch (Exception e10) {
            org.telegram.messenger.a8.e("[gram-wallet] failed to load currency prefs", e10);
        }
        if (TextUtils.equals(g(), "USD")) {
            return;
        }
        f();
    }

    public static void a(LinkedHashSet linkedHashSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Currency currency = Currency.getInstance(new Locale("", str.toUpperCase(Locale.US)));
            if (currency != null) {
                linkedHashSet.add(currency.getCurrencyCode());
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void b(LinkedHashSet linkedHashSet, InputMethodSubtype inputMethodSubtype) {
        if (inputMethodSubtype == null || !"keyboard".equals(inputMethodSubtype.getMode())) {
            return;
        }
        String languageTag = Build.VERSION.SDK_INT >= 24 ? inputMethodSubtype.getLanguageTag() : null;
        if (TextUtils.isEmpty(languageTag)) {
            languageTag = inputMethodSubtype.getLocale();
        }
        if (TextUtils.isEmpty(languageTag)) {
            return;
        }
        c(linkedHashSet, Locale.forLanguageTag(languageTag.replace('_', '-')));
    }

    public static void c(LinkedHashSet linkedHashSet, Locale locale) {
        if (locale == null) {
            return;
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country) && Build.VERSION.SDK_INT >= 24) {
            country = ULocale.addLikelySubtags(ULocale.forLocale(locale)).getCountry();
        }
        a(linkedHashSet, country);
    }

    public static String d(String str, Locale locale) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i7 = 0;
        while (i7 < str.length()) {
            int codePointAt = str.codePointAt(i7);
            int charCount = Character.charCount(codePointAt) + i7;
            if (Character.isLetter(codePointAt)) {
                return str.substring(0, i7) + str.substring(i7, charCount).toUpperCase(locale) + str.substring(charCount);
            }
            i7 = charCount;
        }
        return str;
    }

    public static TL_wallet.currencyRate e() {
        TL_wallet.currencyRate currencyrate = new TL_wallet.currencyRate();
        currencyrate.currency = "USD";
        currencyrate.rate = 1.0d;
        currencyrate.title = hd.M0(2131743148, null);
        currencyrate.symbol = "$";
        currencyrate.thousandsSeparator = ",";
        currencyrate.decimalSeparator = ".";
        currencyrate.symbolLeft = true;
        currencyrate.spaceBetween = false;
        currencyrate.dropZeros = false;
        currencyrate.exp = 2;
        return currencyrate;
    }

    public final TL_wallet.currencyRates f() {
        if (this.d != null) {
            Locale locale = hd.E0().y;
            String language = (locale == null || TextUtils.isEmpty(locale.getLanguage())) ? "en" : locale.getLanguage();
            if (!TextUtils.equals(this.e, language)) {
                boolean equals = TextUtils.equals(language, "en");
                for (int i7 = 0; i7 < this.d.rates.size(); i7++) {
                    TL_wallet.currencyRate currencyrate = this.d.rates.get(i7);
                    if (currencyrate != null) {
                        currencyrate.translatedTitle = null;
                        if (!equals && !TextUtils.isEmpty(currencyrate.currency)) {
                            try {
                                currencyrate.translatedTitle = d(Currency.getInstance(currencyrate.currency).getDisplayName(locale), locale);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                }
                this.e = language;
            }
        } else {
            if (this.c) {
                return null;
            }
            this.c = true;
            ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getCurrencyRates(), new d3.b(1), new d(this, 0));
        }
        return this.d;
    }

    public final String g() {
        String str = this.f;
        return str == null ? "USD" : str;
    }

    public final double h() {
        String g10 = g();
        if (TextUtils.equals(g10, "USD")) {
            return 1.0d;
        }
        if (this.d == null) {
            return 0.0d;
        }
        for (int i7 = 0; i7 < this.d.rates.size(); i7++) {
            TL_wallet.currencyRate currencyrate = this.d.rates.get(i7);
            if (TextUtils.equals(currencyrate.currency, g10)) {
                return currencyrate.rate;
            }
        }
        return 0.0d;
    }

    public final String i() {
        String g10 = g();
        TL_wallet.currencyRates f10 = f();
        if (f10 == null) {
            return "";
        }
        for (int i7 = 0; i7 < f10.rates.size(); i7++) {
            TL_wallet.currencyRate currencyrate = f10.rates.get(i7);
            if (TextUtils.equals(currencyrate.currency, g10)) {
                return TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.title : currencyrate.translatedTitle;
            }
        }
        return "";
    }

    public final TL_wallet.currencyRate j() {
        String g10 = g();
        if (this.d == null) {
            if (TextUtils.equals(g10, "USD")) {
                return e();
            }
            return null;
        }
        for (int i7 = 0; i7 < this.d.rates.size(); i7++) {
            TL_wallet.currencyRate currencyrate = this.d.rates.get(i7);
            if (TextUtils.equals(currencyrate.currency, g10)) {
                return currencyrate;
            }
        }
        return null;
    }
}
