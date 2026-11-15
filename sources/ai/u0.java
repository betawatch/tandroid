package ai;

import android.content.Context;
import android.icu.util.ULocale;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class u0 {
    public static final HashMap a = new HashMap();

    static {
        new HashSet();
    }

    public static void a(LinkedHashMap linkedHashMap, Locale locale) {
        if (locale == null) {
            return;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language) || "und".equals(language) || linkedHashMap.containsKey(language)) {
            return;
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country) && Build.VERSION.SDK_INT >= 24) {
            country = ULocale.addLikelySubtags(new ULocale(language)).getCountry();
        }
        if (country == null) {
            country = "";
        }
        linkedHashMap.put(language, new Locale(language, country).toLanguageTag());
    }

    public static ArrayList b(Context context, long j3) {
        ArrayList arrayList = (ArrayList) a.get(Long.valueOf(j3));
        if (arrayList != null && !arrayList.isEmpty()) {
            return new ArrayList(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                a(linkedHashMap, d(inputMethodManager.getCurrentInputMethodSubtype()));
                String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    if (TextUtils.equals(inputMethodInfo.getId(), string)) {
                        Iterator<InputMethodSubtype> it = inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true).iterator();
                        while (it.hasNext()) {
                            a(linkedHashMap, d(it.next()));
                        }
                    }
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return new ArrayList(linkedHashMap.values());
    }

    public static boolean c(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return Locale.forLanguageTag(str.replace('_', '-')).getLanguage().equals(Locale.forLanguageTag(str2.replace('_', '-')).getLanguage());
    }

    public static Locale d(InputMethodSubtype inputMethodSubtype) {
        if (inputMethodSubtype == null || !"keyboard".equals(inputMethodSubtype.getMode())) {
            return null;
        }
        String languageTag = Build.VERSION.SDK_INT >= 24 ? inputMethodSubtype.getLanguageTag() : null;
        if (TextUtils.isEmpty(languageTag)) {
            String locale = inputMethodSubtype.getLocale();
            languageTag = locale == null ? null : locale.replace('_', '-');
        }
        if (TextUtils.isEmpty(languageTag)) {
            return null;
        }
        return Locale.forLanguageTag(languageTag);
    }
}
