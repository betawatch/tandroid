package org.telegram.messenger;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.SparseArray;
import android.util.Xml;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x41;
import org.telegram.ui.e01;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class cd {
    public static boolean X = false;
    public static int Y = 1;
    public static boolean Z = false;
    public static volatile cd a0;
    public static final char[] b0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[][] c0 = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    public static Boolean d0;
    public ad A;
    public zc B;
    public String C;
    public boolean E;
    public String F;
    public HashMap G;
    public HashMap H;
    public boolean I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final HashMap M;
    public final HashMap N;
    public final ArrayList O;
    public boolean P;
    public boolean Q;
    public ii.b R;
    public volatile Locale S;
    public volatile ii.b T;
    public volatile boolean U;
    public ii.b V;
    public int W;
    public volatile FastDateFormat a;
    public volatile FastDateFormat b;
    public volatile FastDateFormat c;
    public volatile FastDateFormat d;
    public volatile FastDateFormat e;
    public volatile FastDateFormat f;
    public volatile FastDateFormat g;
    public volatile FastDateFormat h;
    public volatile FastDateFormat i;
    public volatile FastDateFormat j;
    public volatile FastDateFormat k;
    public volatile FastDateFormat l;
    public volatile FastDateFormat m;
    public volatile FastDateFormat n;
    public volatile FastDateFormat o;
    public volatile FastDateFormat p;
    public volatile FastDateFormat q;
    public volatile FastDateFormat r;
    public volatile FastDateFormat s;
    public volatile FastDateFormat t;
    public volatile FastDateFormat u;
    public volatile FastDateFormat v;
    public Locale y;
    public Locale z;
    public final FastDateFormat[] w = new FastDateFormat[18];
    public final HashMap x = new HashMap();
    public boolean D = false;

    public cd() {
        boolean z10 = false;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new HashMap();
        HashMap hashMap = new HashMap();
        this.N = hashMap;
        this.O = new ArrayList();
        this.Q = false;
        ii.b bVar = ii.b.c;
        this.T = bVar;
        this.V = bVar;
        b(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new ad(11));
        b(new String[]{"cs", "sk"}, new ad(3));
        b(new String[]{"ff", "fr", "kab"}, new ad(4));
        b(new String[]{"ru", "uk", "be"}, new ad(1));
        b(new String[]{"sr", "hr", "bs", "sh"}, new ad(14));
        b(new String[]{"lv"}, new ad(6));
        b(new String[]{"lt"}, new ad(7));
        b(new String[]{"pl"}, new ad(12));
        b(new String[]{"ro", "mo"}, new ad(13));
        b(new String[]{"sl"}, new ad(15));
        b(new String[]{"ar"}, new ad(0));
        b(new String[]{"mk"}, new ad(8));
        b(new String[]{"cy"}, new ad(18));
        b(new String[]{"br"}, new ad(2));
        b(new String[]{"lag"}, new ad(5));
        b(new String[]{"shi"}, new ad(16));
        b(new String[]{"mt"}, new ad(9));
        b(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new ad(17));
        b(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new ad(19));
        b(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new ad(10));
        zc zcVar = new zc();
        zcVar.a = "English";
        zcVar.b = "English";
        zcVar.f = "en";
        zcVar.c = "en";
        zc zcVar2 = null;
        zcVar.d = null;
        zcVar.j = true;
        arrayList.add(zcVar);
        hashMap.put(zcVar.c, zcVar);
        zc zcVar3 = new zc();
        zcVar3.a = "Italiano";
        zcVar3.b = "Italian";
        zcVar3.f = "it";
        zcVar3.c = "it";
        zcVar3.d = null;
        zcVar3.j = true;
        arrayList.add(zcVar3);
        hashMap.put(zcVar3.c, zcVar3);
        zc zcVar4 = new zc();
        zcVar4.a = "Español";
        zcVar4.b = "Spanish";
        zcVar4.f = "es";
        zcVar4.c = "es";
        zcVar4.j = true;
        arrayList.add(zcVar4);
        hashMap.put(zcVar4.c, zcVar4);
        zc zcVar5 = new zc();
        zcVar5.a = "Deutsch";
        zcVar5.b = "German";
        zcVar5.f = "de";
        zcVar5.c = "de";
        zcVar5.d = null;
        zcVar5.j = true;
        arrayList.add(zcVar5);
        hashMap.put(zcVar5.c, zcVar5);
        zc zcVar6 = new zc();
        zcVar6.a = "Nederlands";
        zcVar6.b = "Dutch";
        zcVar6.f = "nl";
        zcVar6.c = "nl";
        zcVar6.d = null;
        zcVar6.j = true;
        arrayList.add(zcVar6);
        hashMap.put(zcVar6.c, zcVar6);
        zc zcVar7 = new zc();
        zcVar7.a = "العربية";
        zcVar7.b = "Arabic";
        zcVar7.f = "ar";
        zcVar7.c = "ar";
        zcVar7.d = null;
        zcVar7.j = true;
        zcVar7.g = true;
        arrayList.add(zcVar7);
        hashMap.put(zcVar7.c, zcVar7);
        zc zcVar8 = new zc();
        zcVar8.a = "Português (Brasil)";
        zcVar8.b = "Portuguese (Brazil)";
        zcVar8.f = "pt_br";
        zcVar8.c = "pt_br";
        zcVar8.d = null;
        zcVar8.j = true;
        arrayList.add(zcVar8);
        hashMap.put(zcVar8.c, zcVar8);
        zc zcVar9 = new zc();
        zcVar9.a = "한국어";
        zcVar9.b = "Korean";
        zcVar9.f = "ko";
        zcVar9.c = "ko";
        zcVar9.d = null;
        zcVar9.j = true;
        arrayList.add(zcVar9);
        hashMap.put(zcVar9.c, zcVar9);
        zc zcVar10 = new zc();
        zcVar10.a = "Українська";
        zcVar10.b = "Ukrainian";
        zcVar10.f = "uk";
        zcVar10.c = "uk";
        zcVar10.d = null;
        zcVar10.j = true;
        arrayList.add(zcVar10);
        hashMap.put(zcVar10.c, zcVar10);
        zc zcVar11 = new zc();
        zcVar11.a = "Русский";
        zcVar11.b = "Russian";
        zcVar11.f = "ru";
        zcVar11.c = "ru";
        zcVar11.d = null;
        zcVar11.j = true;
        arrayList.add(zcVar11);
        hashMap.put(zcVar11.c, zcVar11);
        SharedPreferences sharedPreferences = w0.b.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                zc a2 = zc.a(str);
                if (a2 != null) {
                    this.O.add(a2);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                zc a10 = zc.a(str2);
                a10.c = a10.c.replace("-", "_");
                if (!this.M.containsKey(a10.b())) {
                    this.L.add(a10);
                    this.M.put(a10.b(), a10);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (!TextUtils.isEmpty(string3)) {
            for (String str3 : string3.split("&")) {
                zc a11 = zc.a(str3);
                if (a11 != null) {
                    a11.c = a11.c.replace("-", "_");
                    this.K.add(a11);
                }
            }
        }
        if (this.L.isEmpty()) {
            final int i10 = 0;
            i0.g3(new Runnable(this) { // from class: org.telegram.messenger.tc
                public final /* synthetic */ cd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.S0(d20.s0, true);
                            break;
                        default:
                            cd cdVar = this.b;
                            cdVar.getClass();
                            cdVar.F = cd.P0();
                            break;
                    }
                }
            });
        }
        for (int i11 = 0; i11 < this.O.size(); i11++) {
            zc zcVar12 = (zc) this.O.get(i11);
            this.J.add(zcVar12);
            this.N.put(zcVar12.b(), zcVar12);
        }
        for (int i12 = 0; i12 < this.L.size(); i12++) {
            zc zcVar13 = (zc) this.L.get(i12);
            zc F0 = F0(zcVar13.b());
            if (F0 != null) {
                F0.d = zcVar13.d;
                F0.h = zcVar13.h;
                F0.i = zcVar13.i;
                F0.k = zcVar13.k;
                this.L.set(i12, F0);
            } else {
                this.J.add(zcVar13);
                this.N.put(zcVar13.b(), zcVar13);
            }
        }
        for (int i13 = 0; i13 < this.K.size(); i13++) {
            zc zcVar14 = (zc) this.K.get(i13);
            zc F02 = F0(zcVar14.b());
            if (F02 != null) {
                F02.d = zcVar14.d;
                F02.h = zcVar14.h;
                F02.i = zcVar14.i;
                F02.k = zcVar14.k;
                this.K.set(i13, F02);
            } else {
                this.N.put(zcVar14.b(), zcVar14);
            }
        }
        this.z = Locale.getDefault();
        Z = DateFormat.is24HourFormat(w0.b);
        try {
            String string4 = vp.d1().getString("language", null);
            if (string4 != null && (zcVar2 = F0(string4)) != null) {
                z10 = true;
            }
            if (zcVar2 == null && this.z.getLanguage() != null) {
                zcVar2 = F0(this.z.getLanguage());
            }
            if (zcVar2 == null && (zcVar2 = F0(H0(this.z))) == null) {
                zcVar2 = F0("en");
            }
            d(zcVar2, z10, true, d20.s0);
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                w0.b.registerReceiver(new androidx.mediarouter.app.f(this, 10), intentFilter, 4);
            } else {
                w0.b.registerReceiver(new androidx.mediarouter.app.f(this, 10), intentFilter);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        final int i14 = 1;
        i0.g3(new Runnable(this) { // from class: org.telegram.messenger.tc
            public final /* synthetic */ cd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.S0(d20.s0, true);
                        break;
                    default:
                        cd cdVar = this.b;
                        cdVar.getClass();
                        cdVar.F = cd.P0();
                        break;
                }
            }
        });
    }

    public static String A(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, long j10, Locale locale, boolean z10) {
        String str;
        long j11 = tL_messageEntityFormattedDate.date * 1000;
        if (tL_messageEntityFormattedDate.relative && !z10) {
            return Build.VERSION.SDK_INT >= 24 ? bd.a(j11 - j10, locale) : DateUtils.getRelativeTimeSpanString(j11, j10, 1000L, 262144).toString();
        }
        boolean z11 = (tL_messageEntityFormattedDate.flags == 0) | z10;
        String str2 = "";
        String format = tL_messageEntityFormattedDate.day_of_week ? D0().A0().format(j11) : "";
        String format2 = z11 ? D0().r0().format(j11) : tL_messageEntityFormattedDate.long_date ? D0().h0().format(j11) : tL_messageEntityFormattedDate.short_date ? D0().B0().format(j11) : "";
        if (z11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            str2 = calendar.get(13) != 0 ? D0().q0().format(j11) : D0().o0().format(j11);
        } else if (tL_messageEntityFormattedDate.long_time) {
            str2 = D0().q0().format(j11);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str2 = D0().o0().format(j11);
        }
        boolean isEmpty = TextUtils.isEmpty(format);
        boolean isEmpty2 = TextUtils.isEmpty(format2);
        boolean isEmpty3 = TextUtils.isEmpty(str2);
        if (isEmpty2 && isEmpty3) {
            return format;
        }
        if (isEmpty2 || isEmpty3) {
            if (isEmpty2) {
                format2 = str2;
            }
            str = format2;
        } else {
            str = a0(null, null, 2131742808, format2, str2);
        }
        return !isEmpty ? a0(null, null, 2131746349, format, str) : str;
    }

    public static String B(long j10) {
        long j11 = j10 * 1000;
        try {
            return a0(null, null, 2131752335, Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11))) : a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11))));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String C(int i10) {
        int i11 = (i10 / 60) / 60;
        int i12 = i10 - (i11 * 3600);
        int i13 = i12 / 60;
        int i14 = i12 - (i13 * 60);
        if (i11 != 0) {
            return String.format("%dh", Integer.valueOf(i11 + (i13 > 30 ? 1 : 0)));
        }
        if (i13 != 0) {
            return String.format("%d", Integer.valueOf(i13 + (i14 > 30 ? 1 : 0)));
        }
        return String.format("%d", Integer.valueOf(i14));
    }

    public static String D(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 != i10 || i11 != i13) {
                return (i12 + 1 == i10 && i11 == i13) ? a0(null, null, 2131748757, a0("YesterdayAtFormatted", null, 2131742868, D0().o0().format(new Date(j11)))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131748757, a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11)))) : a0(null, null, 2131748757, a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11))));
            }
            int currentTime = ((int) (ConnectionsManager.getInstance(d20.s0).getCurrentTime() - (j11 / 1000))) / 60;
            return currentTime < 1 ? L0(2131748756, null) : currentTime < 60 ? G(currentTime, "UpdatedMinutes", new Object[0]) : a0(null, null, 2131748757, a0("TodayAtFormatted", null, 2131744136, D0().o0().format(new Date(j11))));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static cd D0() {
        cd cdVar;
        cd cdVar2 = a0;
        if (cdVar2 != null) {
            return cdVar2;
        }
        synchronized (cd.class) {
            try {
                cdVar = a0;
                if (cdVar == null) {
                    cdVar = new cd();
                    a0 = cdVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cdVar;
    }

    public static String E(long j10, char c10) {
        if (j10 < 0) {
            return i0.a.k(-j10, c10, new StringBuilder("-"));
        }
        StringBuilder sb2 = new StringBuilder(String.format("%d", Long.valueOf(j10)));
        for (int length = sb2.length() - 3; length > 0; length -= 3) {
            sb2.insert(length, c10);
        }
        return sb2.toString();
    }

    public static String E0(String str) {
        if (str.length() != 2 || str.equals("YL")) {
            return null;
        }
        if (str.equals("FT")) {
            return "💎";
        }
        if (str.equals("XG")) {
            return "🛰";
        }
        if (str.equals("XV")) {
            return "🌍";
        }
        char[] charArray = str.toCharArray();
        char c10 = (char) 55356;
        return new String(new char[]{c10, (char) (((charArray[0] + 61861) & 1023) + 56320), c10, (char) (((charArray[1] + 61861) & 1023) + 56320)});
    }

    public static CharSequence F(String str, int i10, CharSequence... charSequenceArr) {
        if (str.length() == 0 || D0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        D0();
        String C = a1.g.C(str, "_", b1(D0().A.a(i10)));
        Object[] objArr = new Object[charSequenceArr.length + 1];
        objArr[0] = Integer.valueOf(i10);
        System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
        return V(C, str.concat("_other"), 0, objArr);
    }

    public static String G(int i10, String str, Object... objArr) {
        if (str.length() == 0 || D0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        D0();
        String C = a1.g.C(str, "_", b1(D0().A.a(i10)));
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = Integer.valueOf(i10);
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return a0(C, str.concat("_other"), 0, objArr2);
    }

    public static String H(char c10, String str, int i10) {
        return K(str, i10, c10, new Object[0]);
    }

    public static String H0(Locale locale) {
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(country);
        if (variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(variant);
        return sb2.toString();
    }

    public static String I(int i10, String str) {
        return H(',', str, i10);
    }

    public static String I0() {
        zc zcVar = D0().B;
        if (zcVar != null) {
            return zcVar.c();
        }
        Locale locale = D0().y;
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb2.append('-');
        }
        sb2.append(country);
        if (variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(variant);
        return sb2.toString();
    }

    public static String J(int i10, String str, Object... objArr) {
        return K(str, i10, ',', objArr);
    }

    public static String J0(int i10, String str) {
        if (str.length() == 0 || D0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        D0();
        return D0().N0(0, a1.g.C(str, "_", b1(D0().A.a(i10))), str.concat("_other"));
    }

    public static String K(String str, int i10, char c10, Object... objArr) {
        try {
            if (str.length() != 0 && D0().A != null) {
                D0();
                String str2 = str + "_" + b1(D0().A.a(i10));
                int i11 = 0;
                StringBuilder sb2 = new StringBuilder(String.format("%d", Integer.valueOf(i10)));
                for (int length = sb2.length() - 3; length > 0; length -= 3) {
                    sb2.insert(length, c10);
                }
                boolean z10 = v2.a;
                String b10 = D0().V.b(str2);
                if (b10 == null) {
                    b10 = D0().V.b(str + "_other");
                }
                if (b10 == null) {
                    try {
                        cd D0 = D0();
                        D0.i();
                        b10 = D0.T.b(str2);
                    } catch (Exception unused) {
                    }
                }
                if (b10 == null) {
                    cd D02 = D0();
                    D02.i();
                    b10 = D02.T.b(str + "_other");
                }
                String replace = b10.replace("%d", "%1$s").replace("%1$d", "%1$s");
                int length2 = objArr.length + 1;
                Object[] objArr2 = new Object[length2];
                while (i11 < length2) {
                    objArr2[i11] = i11 == 0 ? sb2 : objArr[i11 - 1];
                    i11++;
                }
                return D0().y != null ? String.format(D0().y, replace, objArr2) : String.format(replace, objArr2);
            }
            return "LOC_ERR:".concat(str);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: ".concat(str);
        }
    }

    public static String K0(int i10) {
        return L0(i10, null);
    }

    public static String L(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            return (i12 == i10 && i11 == i13) ? a0(null, null, 2131747217, D0().o0().format(new Date(j11))) : (i12 + 1 == i10 && i11 == i13) ? a0(null, null, 2131747216, D0().o0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131747218, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11))) : a0(null, null, 2131747218, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String L0(int i10, String str) {
        return D0().N0(i10, str, null);
    }

    public static String M(int i10, boolean z10) {
        return a0(null, null, z10 ? 2131747175 : 2131747187, i10 < 86400 ? R(i10) : G(i10 / 86400, "Days", new Object[0]));
    }

    public static String M0(String str) {
        return TextUtils.isEmpty(str) ? sc.e.h("LOC_ERR:", str) : L0(0, str);
    }

    public static String N(long j10) {
        try {
            long j11 = j10 / 60;
            long j12 = j11 / 60;
            long j13 = j12 / 24;
            long j14 = j13 / 30;
            long j15 = j13 / 365;
            return j15 >= 1 ? j15 == 1 ? L0(2131742881, null) : H(',', "YearsAgo", (int) j15) : j14 >= 1 ? j14 == 1 ? L0(2131748360, null) : H(',', "MonthsAgo", (int) j14) : j13 >= 1 ? j13 == 1 ? L0(2131751669, null) : H(',', "DaysAgo", (int) j13) : j12 >= 1 ? j12 == 1 ? L0(2131749298, null) : H(',', "HoursAgo", (int) j12) : j11 >= 1 ? j11 == 1 ? L0(2131748441, null) : H(',', "MinutesAgo", (int) j11) : L0(2131748997, null);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String O(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            return (i12 == i10 && i11 == i13) ? a0(null, null, 2131744135, D0().o0().format(new Date(j11))) : (i12 + 1 == i10 && i11 == i13) ? a0(null, null, 2131742868, D0().o0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11))) : a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String P(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            long j12 = timeInMillis - j11;
            return j12 < 60000 ? L0(2131745375, null) : j12 < 3600000 ? G((int) (j12 / 60000), "ShortMinutesAgo", new Object[0]) : (i12 == i10 && i11 == i13) ? j12 < 43200000 ? G((int) (j12 / 3600000), "ShortHoursAgo", new Object[0]) : L0(2131745373, null) : (i12 + 1 == i10 && i11 == i13) ? L0(2131745372, null) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? D0().p0().format(new Date(j11)) : a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String P0() {
        Locale locale = D0().z;
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb2.append('-');
        }
        sb2.append(country);
        if (variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(variant);
        return sb2.toString();
    }

    public static String Q(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return D0().v0().format(new Date(j11)) + ", " + D0().o0().format(new Date(j11));
            }
            return D0().x0().format(new Date(j11)) + ", " + D0().o0().format(new Date(j11));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String R(int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(":");
            }
            sb2.append(i11 >= 10 ? "" : "0");
            sb2.append(i11);
        }
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        sb2.append(i12 >= 10 ? "" : "0");
        sb2.append(i12);
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        sb2.append(i13 >= 10 ? "" : "0");
        sb2.append(i13);
        return sb2.toString();
    }

    public static String S(int[] iArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = i10 / 1000;
            if (i12 <= 0) {
                break;
            }
            sb2.append("K");
            i11 = (i10 % 1000) / 100;
            i10 = i12;
        }
        if (iArr != null) {
            double d = (i11 / 10.0d) + i10;
            for (int i13 = 0; i13 < sb2.length(); i13++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i11 == 0 || sb2.length() <= 0) {
            if (sb2.length() == 2) {
                Locale locale = Locale.US;
                return a1.g.k(i10, "M");
            }
            Locale locale2 = Locale.US;
            return a1.g.k(i10, sb2.toString());
        }
        if (sb2.length() == 2) {
            Locale locale3 = Locale.US;
            return i10 + "." + i11 + "M";
        }
        Locale locale4 = Locale.US;
        return i10 + "." + i11 + sb2.toString();
    }

    public static String T(long j10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (i10 == calendar.get(1)) {
                return D0().p0().format(j11);
            }
            return D0().p0().format(j11) + ", " + calendar.get(1);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static CharSequence U(int i10, Object... objArr) {
        return V(null, null, i10, objArr);
    }

    public static void U0(String str) {
        if (v2.a) {
            f8.b("set as patched " + str + " langpack");
        }
        vp.d1().edit().putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static CharSequence V(String str, String str2, int i10, Object... objArr) {
        String str3;
        try {
            String O0 = D0().O0(i10, str, str2);
            if (O0 == null) {
                return "LOC_ERR: " + str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O0);
            int i11 = 0;
            while (i11 < objArr.length) {
                String str4 = "s";
                Object obj = objArr[i11];
                if (obj instanceof CharSequence) {
                    str3 = (CharSequence) obj;
                } else {
                    if (obj instanceof Integer) {
                        str3 = "" + ((Integer) objArr[i11]);
                    } else if (obj instanceof Long) {
                        str3 = "" + ((Long) objArr[i11]);
                    } else {
                        str3 = obj == null ? "null" : "";
                    }
                    str4 = "d";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("%");
                i11++;
                sb2.append(i11);
                sb2.append("$");
                sb2.append(str4);
                String sb3 = sb2.toString();
                int indexOf = spannableStringBuilder.toString().indexOf(sb3);
                if (indexOf != -1) {
                    spannableStringBuilder.replace(indexOf, sb3.length() + indexOf, str3);
                } else {
                    String str5 = "%" + str4;
                    int indexOf2 = spannableStringBuilder.toString().indexOf(str5);
                    if (indexOf2 != -1) {
                        spannableStringBuilder.replace(indexOf2, str5.length() + indexOf2, str3);
                    }
                }
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String W(int i10, long j10, boolean z10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        int i12 = calendar.get(6);
        calendar.setTimeInMillis(j10 * 1000);
        int i13 = i11 == calendar.get(1) ? (z10 && calendar.get(6) == i12) ? 0 : 1 : 2;
        if (i10 == 1) {
            i13 += 3;
        } else if (i10 == 2) {
            i13 += 6;
        } else if (i10 == 3) {
            i13 += 9;
        } else if (i10 == 4) {
            i13 += 12;
        }
        return D0().w0(i13).format(calendar.getTimeInMillis());
    }

    public static String X(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            long j12 = timeInMillis - j11;
            if (j12 < 60000) {
                return L0(2131746015, null);
            }
            if (j12 >= 3600000) {
                return (i12 == i10 && i11 == i13) ? a0(null, null, 2131744135, D0().o0().format(new Date(j11))) : (i12 + 1 == i10 && i11 == i13) ? a0(null, null, 2131742868, D0().o0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11))) : a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
            int i14 = (int) (j12 / 60000);
            return G(i14, "MinutesAgo", Integer.valueOf(i14));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String Y(int i10, String str, Object... objArr) {
        return a0(str, null, i10, objArr);
    }

    public static String Z(int i10, Object... objArr) {
        return a0(null, null, i10, objArr);
    }

    public static String a(String str) {
        return str.replace(' ', (char) 160);
    }

    public static String a0(String str, String str2, int i10, Object... objArr) {
        try {
            String O0 = D0().O0(i10, str, str2);
            if (O0 != null) {
                return D0().y != null ? String.format(D0().y, O0, objArr) : String.format(O0, objArr);
            }
            return "LOC_ERR: " + str;
        } catch (Exception e) {
            f8.g(e, true);
            if (i10 != 0) {
                try {
                    return String.format(w0.b.getString(i10), objArr);
                } catch (Exception unused) {
                    return sc.e.h("LOC_ERR: ", str);
                }
            }
            return sc.e.h("LOC_ERR: ", str);
        }
    }

    public static String a1(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return D0().B0().format(new Date(j11));
            }
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6) - i10;
            if (i11 != 0 && (i11 != -1 || System.currentTimeMillis() - j11 >= 28800000)) {
                return (i11 <= -7 || i11 > -1) ? D0().p0().format(new Date(j11)) : D0().z0().format(new Date(j11));
            }
            return D0().o0().format(new Date(j11));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String b0(String str, Object... objArr) {
        try {
            return D0().y != null ? String.format(D0().y, str, objArr) : String.format(str, objArr);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String b1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? i10 != 16 ? "other" : "many" : "few" : "two" : "one" : "zero";
    }

    public static String c0(int i10) {
        if (i10 < 60) {
            return G(i10, "Seconds", new Object[0]);
        }
        if (i10 < 3600) {
            return G(i10 / 60, "Minutes", new Object[0]);
        }
        if (i10 < 86400) {
            return G((i10 / 60) / 60, "Hours", new Object[0]);
        }
        if (i10 < 604800) {
            return G(((i10 / 60) / 60) / 24, "Days", new Object[0]);
        }
        if (i10 >= 2678400) {
            return (i10 < 31536000 || i10 % 31536000 != 0) ? G((((i10 / 60) / 60) / 24) / 30, "Months", new Object[0]) : G((((i10 / 60) / 60) / 24) / 365, "Years", new Object[0]);
        }
        int i11 = ((i10 / 60) / 60) / 24;
        return i10 % 7 == 0 ? G(i11 / 7, "Weeks", new Object[0]) : a1.g.C(G(i11 / 7, "Weeks", new Object[0]), " ", G(i11 % 7, "Days", new Object[0]));
    }

    public static String d0(int i10, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        if (user != null && (userStatus3 = user.status) != null && userStatus3.expires == 0) {
            if (userStatus3 instanceof TLRPC.TL_userStatusRecently) {
                userStatus3.expires = userStatus3.by_me ? -1000 : -100;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastWeek) {
                userStatus3.expires = userStatus3.by_me ? -1001 : -101;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastMonth) {
                userStatus3.expires = userStatus3.by_me ? -1002 : -102;
            }
        }
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && vp.r1(i10).Z.containsKey(Long.valueOf(user.id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return L0(2131747842, "Online");
        }
        if (user == null || (userStatus = user.status) == null || userStatus.expires == 0 || h20.x(user) || (user instanceof TLRPC.TL_userEmpty)) {
            return L0(2131754951, "ALongTimeAgo");
        }
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        int i11 = user.status.expires;
        if (i11 <= currentTime) {
            return i11 == -1 ? L0(2131749188, "Invisible") : (i11 == -100 || i11 == -1000) ? L0(2131749021, "Lately") : (i11 == -101 || i11 == -1001) ? L0(2131742887, "WithinAWeek") : (i11 == -102 || i11 == -1002) ? L0(2131742888, "WithinAMonth") : w(i11, zArr2);
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        return L0(2131747842, "Online");
    }

    public static String e0(long j10, boolean z10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(1);
            int i12 = calendar.get(2);
            String[] strArr = {L0(2131749096, null), L0(2131750830, null), L0(2131748698, null), L0(2131754173, null), L0(2131748677, null), L0(2131749074, null), L0(2131749076, null), L0(2131753895, null), L0(2131745582, null), L0(2131747846, null), L0(2131747851, null), L0(2131751606, null)};
            if (i10 == i11 && !z10) {
                return strArr[i12];
            }
            return strArr[i12] + " " + i11;
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String f0(long j10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            return new String[]{L0(2131749096, null), L0(2131750830, null), L0(2131748698, null), L0(2131754173, null), L0(2131748677, null), L0(2131749074, null), L0(2131749076, null), L0(2131753895, null), L0(2131745582, null), L0(2131747846, null), L0(2131747851, null), L0(2131751606, null)}[i11] + " " + calendar.get(5) + ", " + i10;
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Spannable g(String str) {
        if (str instanceof Spannable) {
            ((Spannable) str).setSpan(new x41(i0.o()), 0, str.length(), 33);
            return (Spannable) str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new x41(i0.o()), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static int h(HashMap hashMap) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (String str : hashMap.keySet()) {
            if (str != null) {
                String m10 = str.endsWith("_other") ? c3.i0.m(6, 0, str) : (str.endsWith("_zero") || str.endsWith("_many")) ? c3.i0.m(5, 0, str) : (str.endsWith("_one") || str.endsWith("_two") || str.endsWith("_few")) ? c3.i0.m(4, 0, str) : null;
                if (m10 != null) {
                    if (!hashSet.contains(m10)) {
                        hashSet.add(m10);
                    }
                }
                i10++;
            }
        }
        hashSet.clear();
        return i10;
    }

    public static String i0(int i10, String str) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return L0(i10, null);
        }
        try {
            return new Locale("", str).getDisplayCountry(D0().y);
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static String j0() {
        zc zcVar = D0().B;
        return (zcVar == null || TextUtils.isEmpty(zcVar.a)) ? L0(2131749059, "LanguageName") : zcVar.a;
    }

    public static FastDateFormat k(Locale locale, String str, String str2) {
        if (str == null || str.length() == 0) {
            str = str2;
        }
        try {
            return FastDateFormat.getInstance(str, locale);
        } catch (Exception unused) {
            return FastDateFormat.getInstance(str2, locale);
        }
    }

    public static void l() {
        if (d0 != null) {
            return;
        }
        int i10 = tz.s1;
        if (i10 != 0) {
            d0 = Boolean.valueOf(i10 == 2);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) w0.b.getSystemService("phone");
            if (telephonyManager != null) {
                String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                if (!"US".equals(upperCase)) {
                    if (!"GB".equals(upperCase)) {
                        if (!"MM".equals(upperCase)) {
                            if ("LR".equals(upperCase)) {
                            }
                            d0 = Boolean.valueOf(r1);
                        }
                    }
                }
                r1 = true;
                d0 = Boolean.valueOf(r1);
            }
        } catch (Exception e) {
            d0 = Boolean.FALSE;
            f8.g(e, true);
        }
    }

    public static String m(String str) {
        return str.contains("[CDATA") ? str : str.replace("<", "&lt;").replace(">", "&gt;").replace("& ", "&amp; ");
    }

    public static String n(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence);
        int length = sb2.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = sb2.charAt(i10);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != ',') {
                int i11 = 0;
                while (i11 < 18) {
                    int i12 = 0;
                    while (true) {
                        char[] cArr = c0[i11];
                        if (i12 >= cArr.length) {
                            break;
                        }
                        if (charAt == cArr[i12]) {
                            sb2.setCharAt(i10, b0[i12]);
                            i11 = 18;
                            break;
                        }
                        i12++;
                    }
                    i11++;
                }
            }
        }
        return sb2.toString();
    }

    public static String o(int i10) {
        if (i10 <= 3600) {
            return i10 > 60 ? G(i10 / 60, "Minutes", new Object[0]) : G(i10, "Seconds", new Object[0]);
        }
        String G = G(i10 / 3600, "Hours", new Object[0]);
        int i11 = (i10 % 3600) / 60;
        if (i11 <= 0) {
            return G;
        }
        StringBuilder i12 = sc.e.i(G, ", ");
        i12.append(G(i11, "Minutes", new Object[0]));
        return i12.toString();
    }

    public static String r(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            return (i12 == i10 && i11 == i13) ? z10 ? L0(2131745373, null) : D0().o0().format(new Date(j11)) : (i12 + 1 == i10 && i11 == i13) ? L0(2131742870, "Yesterday") : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? D0().p0().format(new Date(j11)) : D0().B0().format(new Date(j11));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: formatDate";
        }
    }

    public static String s(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            return (i12 == i10 && i11 == i13) ? z10 ? a0(null, null, 2131744136, D0().o0().format(new Date(j11))) : a0(null, null, 2131744135, D0().o0().format(new Date(j11))) : (i12 + 1 == i10 && i11 == i13) ? a0(null, null, 2131742868, D0().o0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11))) : a0(null, null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String t(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return D0().o0().format(new Date(j11));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return a0(null, null, 2131742868, D0().o0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return a0(null, null, 2131742808, D0().h0().format(new Date(j11)), D0().o0().format(new Date(j11)));
            }
            cd D0 = D0();
            if (D0.m == null) {
                synchronized (D0) {
                    try {
                        if (D0.m == null) {
                            Locale locale = D0.y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            D0.m = k(locale, D0.N0(2131742810, "chatDateShort", null), "d MMM");
                        }
                    } finally {
                    }
                }
            }
            return a0(null, null, 2131742808, D0.m.format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String u(long j10, boolean z10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (z10) {
                if (i10 != calendar.get(1)) {
                }
                return D0().g0().format(j11);
            }
            if (z10 || Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return D0().h0().format(j11);
            }
            return D0().g0().format(j11);
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String v(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            return i10 == calendar.get(1) ? D0().m0().format(new Date(j11)) : D0().l0().format(new Date(j11));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String w(long j10, boolean[] zArr) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            int i12 = calendar.get(11);
            calendar.setTimeInMillis(j11);
            int i13 = calendar.get(6);
            int i14 = calendar.get(1);
            int i15 = calendar.get(11);
            if (i13 == i10 && i11 == i14) {
                return a0(null, null, 2131749027, a0("TodayAtFormatted", null, 2131744136, D0().o0().format(new Date(j11))));
            }
            if (i13 + 1 != i10 || i11 != i14) {
                return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0("LastSeenDateFormatted", null, 2131749030, a0("formatDateAtTime", null, 2131742808, D0().p0().format(new Date(j11)), D0().o0().format(new Date(j11)))) : a0("LastSeenDateFormatted", null, 2131749030, a0("formatDateAtTime", null, 2131742808, D0().B0().format(new Date(j11)), D0().o0().format(new Date(j11))));
            }
            if (zArr == null) {
                return a0(null, null, 2131749027, a0("YesterdayAtFormatted", null, 2131742868, D0().o0().format(new Date(j11))));
            }
            zArr[0] = true;
            return (i12 > 6 || i15 <= 18 || !Z) ? a0(null, null, 2131742868, D0().o0().format(new Date(j11))) : a0(null, null, 2131749027, D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String x(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            return (i12 == i10 && i11 == i13 && z10) ? a0(null, null, 2131744135, D0().o0().format(new Date(j11))) : (i12 + 1 == i10 && i11 == i13 && z10) ? a0(null, null, 2131742868, D0().o0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742808, D0().g0().format(new Date(j11)), D0().o0().format(new Date(j11))) : a0(null, null, 2131742808, D0().h0().format(new Date(j11)), D0().o0().format(new Date(j11)));
        } catch (Exception e) {
            f8.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String y(float f7, int i10, Boolean bool) {
        l();
        if ((bool == null || !bool.booleanValue()) && !(bool == null && d0.booleanValue())) {
            if (f7 < 1000.0f) {
                return i10 != 0 ? i10 != 1 ? a0("MetersShort", null, 2131748457, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7)))) : a0("MetersFromYou2", null, 2131748458, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7)))) : a0("MetersAway2", null, 2131748459, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7))));
            }
            String format = f7 % 1000.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f7 / 1000.0f))) : String.format("%.2f", Float.valueOf(f7 / 1000.0f));
            return i10 != 0 ? i10 != 1 ? a0("KMetersShort", null, 2131749071, format) : a0("KMetersFromYou2", null, 2131749072, format) : a0("KMetersAway2", null, 2131749073, format);
        }
        float f10 = f7 * 3.28084f;
        if (f10 < 1000.0f) {
            return i10 != 0 ? i10 != 1 ? a0("FootsShort", null, 2131750602, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : a0("FootsFromYou", null, 2131750603, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : a0("FootsAway", null, 2131750604, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
        }
        String format2 = f10 % 5280.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f10 / 5280.0f))) : String.format("%.2f", Float.valueOf(f10 / 5280.0f));
        return i10 != 0 ? i10 != 1 ? a0("MilesShort", null, 2131748442, format2) : a0("MilesFromYou", null, 2131748443, format2) : a0("MilesAway", null, 2131748444, format2);
    }

    public static String z(int i10) {
        if (i10 <= 0) {
            return G(0, "Seconds", new Object[0]);
        }
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            sb2.append(G(i11, "Hours", new Object[0]));
        }
        if (i12 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(G(i12, "Minutes", new Object[0]));
        }
        if (i13 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(G(i13, "Seconds", new Object[0]));
        }
        return sb2.toString();
    }

    public final FastDateFormat A0() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.e = k(locale, N0(2131742785, "formatterWeekLong", null), "EEEE");
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final FastDateFormat B0() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.g = k(locale, N0(2131742784, "formatterYear", null), "dd.MM.yy");
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public final FastDateFormat C0() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.h = k(locale, N0(2131742783, "formatterYearMax", null), "dd.MM.yyyy");
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public final zc F0(String str) {
        if (str == null) {
            return null;
        }
        return (zc) this.N.get(str.toLowerCase().replace("-", "_"));
    }

    public final HashMap G0(File file, boolean z10) {
        this.E = false;
        f8.b("getLocaleFileStrings: reloadLastFile = false");
        FileInputStream fileInputStream = null;
        try {
            try {
                if (!file.exists()) {
                    return new HashMap();
                }
                HashMap hashMap = new HashMap(10000);
                XmlPullParser newPullParser = Xml.newPullParser();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    newPullParser.setInput(fileInputStream2, "UTF-8");
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                        if (eventType == 2) {
                            str2 = newPullParser.getName();
                            if (newPullParser.getAttributeCount() > 0) {
                                str = newPullParser.getAttributeValue(0);
                            }
                        } else if (eventType == 4) {
                            if (str != null && (str3 = newPullParser.getText()) != null) {
                                String trim = str3.trim();
                                if (z10) {
                                    str3 = trim.replace("<", "&lt;").replace(">", "&gt;").replace("'", "\\'").replace("& ", "&amp; ");
                                } else {
                                    String replace = trim.replace("\\n", "\n").replace("\\", "");
                                    str3 = replace.replace("&lt;", "<");
                                    if (!this.E && !str3.equals(replace)) {
                                        this.E = true;
                                        f8.b("getLocaleFileStrings: value != old, reloadLastFile = true;");
                                    }
                                }
                            }
                        } else if (eventType == 3) {
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        if (str2 != null && str2.equals("string") && str3 != null && str != null && str3.length() != 0 && str.length() != 0) {
                            hashMap.put(str, str3);
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                    }
                    try {
                        fileInputStream2.close();
                        return hashMap;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return hashMap;
                    }
                } catch (Exception e7) {
                    e = e7;
                    fileInputStream = fileInputStream2;
                    try {
                        File file2 = new File(w0.h(), "malformed_locales/");
                        file2.mkdirs();
                        i0.E(file, new File(file2, file.getName()));
                    } catch (Exception unused) {
                    }
                    f8.g(e, true);
                    f8.b("getLocaleFileStrings: error, reloadLastFile = true;");
                    this.E = true;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e10) {
                            f8.g(e10, true);
                        }
                    }
                    return new HashMap();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e11) {
                            f8.g(e11, true);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public final String N0(int i10, String str, String str2) {
        String O0 = O0(i10, str, str2);
        return O0 == null ? sc.e.h("LOC_ERR:", str) : O0;
    }

    public final String O0(int i10, String str, String str2) {
        Context context = w0.b;
        boolean z10 = v2.a;
        String c10 = this.V.c(i10, context, str);
        if (c10 != null) {
            return c10;
        }
        String b10 = this.V.b(str2);
        if (b10 != null) {
            return b10;
        }
        i();
        String c11 = this.T.c(i10, context, str);
        return c11 != null ? c11 : this.T.b(str2);
    }

    public final String Q0(String str) {
        return R0(str, true, false);
    }

    public final String R0(String str, boolean z10, boolean z11) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        if (str == null) {
            return null;
        }
        if (this.H == null) {
            HashMap hashMap = new HashMap(33);
            this.H = hashMap;
            hashMap.put("а", "a");
            this.H.put("б", "b");
            this.H.put("в", "v");
            this.H.put("г", "g");
            this.H.put("д", "d");
            this.H.put("е", "e");
            obj7 = "g";
            this.H.put("ё", "yo");
            this.H.put("ж", "zh");
            this.H.put("з", "z");
            this.H.put("и", "i");
            this.H.put("й", "i");
            this.H.put("к", "k");
            this.H.put("л", "l");
            this.H.put("м", "m");
            this.H.put("н", "n");
            this.H.put("о", "o");
            this.H.put("п", "p");
            obj4 = "m";
            obj5 = "r";
            this.H.put("р", obj5);
            obj6 = "z";
            this.H.put("с", "s");
            obj = "v";
            this.H.put("т", "t");
            obj2 = "u";
            this.H.put("у", obj2);
            obj3 = "s";
            this.H.put("ф", "f");
            obj8 = "h";
            this.H.put("х", obj8);
            obj9 = "p";
            this.H.put("ц", "ts");
            this.H.put("ч", "ch");
            this.H.put("ш", "sh");
            this.H.put("щ", "sch");
            this.H.put("ы", "i");
            this.H.put("ь", "");
            this.H.put("ъ", "");
            this.H.put("э", "e");
            this.H.put("ю", "yu");
            this.H.put("я", "ya");
        } else {
            obj = "v";
            obj2 = "u";
            obj3 = "s";
            obj4 = "m";
            obj5 = "r";
            obj6 = "z";
            obj7 = "g";
            obj8 = "h";
            obj9 = "p";
        }
        if (this.G == null) {
            HashMap hashMap2 = new HashMap(488);
            this.G = hashMap2;
            hashMap2.put("ȼ", "c");
            this.G.put("ᶇ", "n");
            this.G.put("ɖ", "d");
            this.G.put("ỿ", "y");
            this.G.put("ᴓ", "o");
            this.G.put("ø", "o");
            this.G.put("ḁ", "a");
            this.G.put("ʯ", obj8);
            this.G.put("ŷ", "y");
            this.G.put("ʞ", "k");
            this.G.put("ừ", obj2);
            Object obj10 = obj2;
            this.G.put("ꜳ", "aa");
            this.G.put("ĳ", "ij");
            this.G.put("ḽ", "l");
            this.G.put("ɪ", "i");
            this.G.put("ḇ", "b");
            this.G.put("ʀ", obj5);
            this.G.put("ě", "e");
            this.G.put("ﬃ", "ffi");
            this.G.put("ơ", "o");
            this.G.put("ⱹ", obj5);
            this.G.put("ồ", "o");
            this.G.put("ǐ", "i");
            Object obj11 = obj9;
            this.G.put("ꝕ", obj11);
            this.G.put("ý", "y");
            this.G.put("ḝ", "e");
            this.G.put("ₒ", "o");
            this.G.put("ⱥ", "a");
            this.G.put("ʙ", "b");
            this.G.put("ḛ", "e");
            this.G.put("ƈ", "c");
            this.G.put("ɦ", obj8);
            this.G.put("ᵬ", "b");
            Object obj12 = obj8;
            Object obj13 = obj3;
            this.G.put("ṣ", obj13);
            this.G.put("đ", "d");
            this.G.put("ỗ", "o");
            this.G.put("ɟ", "j");
            this.G.put("ẚ", "a");
            this.G.put("ɏ", "y");
            this.G.put("ʌ", obj);
            this.G.put("ꝓ", obj11);
            this.G.put("ﬁ", "fi");
            this.G.put("ᶄ", "k");
            this.G.put("ḏ", "d");
            this.G.put("ᴌ", "l");
            this.G.put("ė", "e");
            this.G.put("ᴋ", "k");
            this.G.put("ċ", "c");
            this.G.put("ʁ", obj5);
            this.G.put("ƕ", "hv");
            this.G.put("ƀ", "b");
            this.G.put("ṍ", "o");
            this.G.put("ȣ", "ou");
            this.G.put("ǰ", "j");
            Object obj14 = obj7;
            this.G.put("ᶃ", obj14);
            this.G.put("ṋ", "n");
            this.G.put("ɉ", "j");
            this.G.put("ǧ", obj14);
            this.G.put("ǳ", "dz");
            Object obj15 = obj6;
            this.G.put("ź", obj15);
            this.G.put("ꜷ", "au");
            this.G.put("ǖ", obj10);
            this.G.put("ᵹ", obj14);
            this.G.put("ȯ", "o");
            this.G.put("ɐ", "a");
            this.G.put("ą", "a");
            this.G.put("õ", "o");
            this.G.put("ɻ", obj5);
            this.G.put("ꝍ", "o");
            this.G.put("ǟ", "a");
            this.G.put("ȴ", "l");
            this.G.put("ʂ", obj13);
            this.G.put("ﬂ", "fl");
            this.G.put("ȉ", "i");
            this.G.put("ⱻ", "e");
            this.G.put("ṉ", "n");
            this.G.put("ï", "i");
            this.G.put("ñ", "n");
            this.G.put("ᴉ", "i");
            this.G.put("ʇ", "t");
            this.G.put("ẓ", obj15);
            this.G.put("ỷ", "y");
            this.G.put("ȳ", "y");
            this.G.put("ṩ", obj13);
            this.G.put("ɽ", obj5);
            this.G.put("ĝ", obj14);
            this.G.put("ᴝ", obj10);
            this.G.put("ḳ", "k");
            this.G.put("ꝫ", "et");
            this.G.put("ī", "i");
            this.G.put("ť", "t");
            this.G.put("ꜿ", "c");
            this.G.put("ʟ", "l");
            this.G.put("ꜹ", "av");
            this.G.put("û", obj10);
            this.G.put("æ", "ae");
            this.G.put("ă", "a");
            this.G.put("ǘ", obj10);
            this.G.put("ꞅ", obj13);
            this.G.put("ᵣ", obj5);
            this.G.put("ᴀ", "a");
            this.G.put("ƃ", "b");
            this.G.put("ḩ", obj12);
            this.G.put("ṧ", obj13);
            this.G.put("ₑ", "e");
            this.G.put("ʜ", obj12);
            this.G.put("ẋ", "x");
            this.G.put("ꝅ", "k");
            this.G.put("ḋ", "d");
            this.G.put("ƣ", "oi");
            this.G.put("ꝑ", obj11);
            this.G.put("ħ", obj12);
            Object obj16 = obj;
            this.G.put("ⱴ", obj16);
            this.G.put("ẇ", "w");
            this.G.put("ǹ", "n");
            Object obj17 = obj4;
            this.G.put("ɯ", obj17);
            this.G.put("ɡ", obj14);
            this.G.put("ɴ", "n");
            this.G.put("ᴘ", obj11);
            this.G.put("ᵥ", obj16);
            this.G.put("ū", obj10);
            this.G.put("ḃ", "b");
            this.G.put("ṗ", obj11);
            this.G.put("å", "a");
            this.G.put("ɕ", "c");
            this.G.put("ọ", "o");
            this.G.put("ắ", "a");
            this.G.put("ƒ", "f");
            this.G.put("ǣ", "ae");
            this.G.put("ꝡ", "vy");
            this.G.put("ﬀ", "ff");
            this.G.put("ᶉ", obj5);
            this.G.put("ô", "o");
            this.G.put("ǿ", "o");
            this.G.put("ṳ", obj10);
            this.G.put("ȥ", obj15);
            this.G.put("ḟ", "f");
            this.G.put("ḓ", "d");
            this.G.put("ȇ", "e");
            this.G.put("ȕ", obj10);
            this.G.put("ȵ", "n");
            this.G.put("ʠ", "q");
            this.G.put("ấ", "a");
            this.G.put("ǩ", "k");
            this.G.put("ĩ", "i");
            this.G.put("ṵ", obj10);
            this.G.put("ŧ", "t");
            this.G.put("ɾ", obj5);
            this.G.put("ƙ", "k");
            this.G.put("ṫ", "t");
            this.G.put("ꝗ", "q");
            this.G.put("ậ", "a");
            this.G.put("ʄ", "j");
            this.G.put("ƚ", "l");
            this.G.put("ᶂ", "f");
            this.G.put("ᵴ", obj13);
            this.G.put("ꞃ", obj5);
            this.G.put("ᶌ", obj16);
            this.G.put("ɵ", "o");
            this.G.put("ḉ", "c");
            this.G.put("ᵤ", obj10);
            this.G.put("ẑ", obj15);
            this.G.put("ṹ", obj10);
            this.G.put("ň", "n");
            this.G.put("ʍ", "w");
            this.G.put("ầ", "a");
            this.G.put("ǉ", "lj");
            this.G.put("ɓ", "b");
            this.G.put("ɼ", obj5);
            this.G.put("ò", "o");
            this.G.put("ẘ", "w");
            this.G.put("ɗ", "d");
            this.G.put("ꜽ", "ay");
            this.G.put("ư", obj10);
            this.G.put("ᶀ", "b");
            this.G.put("ǜ", obj10);
            this.G.put("ẹ", "e");
            this.G.put("ǡ", "a");
            this.G.put("ɥ", obj12);
            this.G.put("ṏ", "o");
            this.G.put("ǔ", obj10);
            this.G.put("ʎ", "y");
            this.G.put("ȱ", "o");
            this.G.put("ệ", "e");
            this.G.put("ế", "e");
            this.G.put("ĭ", "i");
            this.G.put("ⱸ", "e");
            this.G.put("ṯ", "t");
            this.G.put("ᶑ", "d");
            this.G.put("ḧ", obj12);
            this.G.put("ṥ", obj13);
            this.G.put("ë", "e");
            this.G.put("ᴍ", obj17);
            this.G.put("ö", "o");
            this.G.put("é", "e");
            this.G.put("ı", "i");
            this.G.put("ď", "d");
            this.G.put("ᵯ", obj17);
            this.G.put("ỵ", "y");
            this.G.put("ŵ", "w");
            this.G.put("ề", "e");
            this.G.put("ứ", obj10);
            this.G.put("ƶ", obj15);
            this.G.put("ĵ", "j");
            this.G.put("ḍ", "d");
            this.G.put("ŭ", obj10);
            this.G.put("ʝ", "j");
            this.G.put("ê", "e");
            this.G.put("ǚ", obj10);
            this.G.put("ġ", obj14);
            this.G.put("ṙ", obj5);
            this.G.put("ƞ", "n");
            this.G.put("ḗ", "e");
            this.G.put("ẝ", obj13);
            this.G.put("ᶁ", "d");
            this.G.put("ķ", "k");
            this.G.put("ᴂ", "ae");
            this.G.put("ɘ", "e");
            this.G.put("ợ", "o");
            this.G.put("ḿ", obj17);
            this.G.put("ꜰ", "f");
            this.G.put("ẵ", "a");
            this.G.put("ꝏ", "oo");
            this.G.put("ᶆ", obj17);
            this.G.put("ᵽ", obj11);
            this.G.put("ữ", obj10);
            this.G.put("ⱪ", "k");
            this.G.put("ḥ", obj12);
            this.G.put("ţ", "t");
            this.G.put("ᵱ", obj11);
            this.G.put("ṁ", obj17);
            this.G.put("á", "a");
            this.G.put("ᴎ", "n");
            this.G.put("ꝟ", obj16);
            this.G.put("è", "e");
            this.G.put("ᶎ", obj15);
            this.G.put("ꝺ", "d");
            this.G.put("ᶈ", obj11);
            this.G.put("ɫ", "l");
            this.G.put("ᴢ", obj15);
            this.G.put("ɱ", obj17);
            this.G.put("ṝ", obj5);
            this.G.put("ṽ", obj16);
            this.G.put("ũ", obj10);
            this.G.put("ß", "ss");
            this.G.put("ĥ", obj12);
            this.G.put("ᵵ", "t");
            this.G.put("ʐ", obj15);
            this.G.put("ṟ", obj5);
            this.G.put("ɲ", "n");
            this.G.put("à", "a");
            this.G.put("ẙ", "y");
            this.G.put("ỳ", "y");
            this.G.put("ᴔ", "oe");
            this.G.put("ₓ", "x");
            this.G.put("ȗ", obj10);
            this.G.put("ⱼ", "j");
            this.G.put("ẫ", "a");
            this.G.put("ʑ", obj15);
            this.G.put("ẛ", obj13);
            this.G.put("ḭ", "i");
            Object obj18 = obj5;
            this.G.put("ꜵ", "ao");
            this.G.put("ɀ", obj15);
            this.G.put("ÿ", "y");
            this.G.put("ǝ", "e");
            this.G.put("ǭ", "o");
            this.G.put("ᴅ", "d");
            this.G.put("ᶅ", "l");
            this.G.put("ù", obj10);
            this.G.put("ạ", "a");
            this.G.put("ḅ", "b");
            this.G.put("ụ", obj10);
            this.G.put("ằ", "a");
            this.G.put("ᴛ", "t");
            this.G.put("ƴ", "y");
            this.G.put("ⱦ", "t");
            this.G.put("ⱡ", "l");
            this.G.put("ȷ", "j");
            this.G.put("ᵶ", obj15);
            this.G.put("ḫ", obj12);
            this.G.put("ⱳ", "w");
            this.G.put("ḵ", "k");
            this.G.put("ờ", "o");
            this.G.put("î", "i");
            this.G.put("ģ", obj14);
            this.G.put("ȅ", "e");
            this.G.put("ȧ", "a");
            this.G.put("ẳ", "a");
            this.G.put("ɋ", "q");
            this.G.put("ṭ", "t");
            this.G.put("ꝸ", "um");
            this.G.put("ᴄ", "c");
            this.G.put("ẍ", "x");
            this.G.put("ủ", obj10);
            this.G.put("ỉ", "i");
            this.G.put("ᴚ", obj18);
            this.G.put("ś", obj13);
            this.G.put("ꝋ", "o");
            this.G.put("ỹ", "y");
            this.G.put("ṡ", obj13);
            this.G.put("ǌ", "nj");
            this.G.put("ȁ", "a");
            this.G.put("ẗ", "t");
            this.G.put("ĺ", "l");
            this.G.put("ž", obj15);
            this.G.put("ᵺ", "th");
            this.G.put("ƌ", "d");
            this.G.put("ș", obj13);
            this.G.put("š", obj13);
            this.G.put("ᶙ", obj10);
            this.G.put("ẽ", "e");
            this.G.put("ẜ", obj13);
            this.G.put("ɇ", "e");
            this.G.put("ṷ", obj10);
            this.G.put("ố", "o");
            this.G.put("ȿ", obj13);
            this.G.put("ᴠ", obj16);
            this.G.put("ꝭ", "is");
            this.G.put("ᴏ", "o");
            this.G.put("ɛ", "e");
            this.G.put("ǻ", "a");
            this.G.put("ﬄ", "ffl");
            this.G.put("ⱺ", "o");
            this.G.put("ȋ", "i");
            this.G.put("ᵫ", "ue");
            this.G.put("ȡ", "d");
            this.G.put("ⱬ", obj15);
            this.G.put("ẁ", "w");
            this.G.put("ᶏ", "a");
            this.G.put("ꞇ", "t");
            this.G.put("ğ", obj14);
            this.G.put("ɳ", "n");
            this.G.put("ʛ", obj14);
            this.G.put("ᴜ", obj10);
            this.G.put("ẩ", "a");
            this.G.put("ṅ", "n");
            this.G.put("ɨ", "i");
            this.G.put("ᴙ", obj18);
            this.G.put("ǎ", "a");
            this.G.put("ſ", obj13);
            this.G.put("ȫ", "o");
            this.G.put("ɿ", obj18);
            this.G.put("ƭ", "t");
            this.G.put("ḯ", "i");
            this.G.put("ǽ", "ae");
            this.G.put("ⱱ", obj16);
            this.G.put("ɶ", "oe");
            this.G.put("ṃ", obj17);
            this.G.put("ż", obj15);
            this.G.put("ĕ", "e");
            this.G.put("ꜻ", "av");
            this.G.put("ở", "o");
            this.G.put("ễ", "e");
            this.G.put("ɬ", "l");
            this.G.put("ị", "i");
            this.G.put("ᵭ", "d");
            this.G.put("ﬆ", "st");
            this.G.put("ḷ", "l");
            this.G.put("ŕ", obj18);
            this.G.put("ᴕ", "ou");
            this.G.put("ʈ", "t");
            this.G.put("ā", "a");
            this.G.put("ḙ", "e");
            this.G.put("ᴑ", "o");
            this.G.put("ç", "c");
            this.G.put("ᶊ", obj13);
            this.G.put("ặ", "a");
            this.G.put("ų", obj10);
            this.G.put("ả", "a");
            this.G.put("ǥ", obj14);
            this.G.put("ꝁ", "k");
            this.G.put("ẕ", obj15);
            this.G.put("ŝ", obj13);
            this.G.put("ḕ", "e");
            this.G.put("ɠ", obj14);
            this.G.put("ꝉ", "l");
            this.G.put("ꝼ", "f");
            this.G.put("ᶍ", "x");
            this.G.put("ǒ", "o");
            this.G.put("ę", "e");
            this.G.put("ổ", "o");
            this.G.put("ƫ", "t");
            this.G.put("ǫ", "o");
            this.G.put("i̇", "i");
            this.G.put("ṇ", "n");
            this.G.put("ć", "c");
            this.G.put("ᵷ", obj14);
            this.G.put("ẅ", "w");
            this.G.put("ḑ", "d");
            this.G.put("ḹ", "l");
            this.G.put("œ", "oe");
            this.G.put("ᵳ", obj18);
            this.G.put("ļ", "l");
            this.G.put("ȑ", obj18);
            this.G.put("ȭ", "o");
            this.G.put("ᵰ", "n");
            this.G.put("ᴁ", "ae");
            this.G.put("ŀ", "l");
            this.G.put("ä", "a");
            this.G.put("ƥ", obj11);
            this.G.put("ỏ", "o");
            this.G.put("į", "i");
            this.G.put("ȓ", obj18);
            this.G.put("ǆ", "dz");
            this.G.put("ḡ", obj14);
            this.G.put("ṻ", obj10);
            this.G.put("ō", "o");
            this.G.put("ľ", "l");
            this.G.put("ẃ", "w");
            this.G.put("ț", "t");
            this.G.put("ń", "n");
            this.G.put("ɍ", obj18);
            this.G.put("ȃ", "a");
            this.G.put("ü", obj10);
            this.G.put("ꞁ", "l");
            this.G.put("ᴐ", "o");
            this.G.put("ớ", "o");
            this.G.put("ᴃ", "b");
            this.G.put("ɹ", obj18);
            this.G.put("ᵲ", obj18);
            this.G.put("ʏ", "y");
            this.G.put("ᵮ", "f");
            this.G.put("ⱨ", obj12);
            this.G.put("ŏ", "o");
            this.G.put("ú", obj10);
            this.G.put("ṛ", obj18);
            this.G.put("ʮ", obj12);
            this.G.put("ó", "o");
            this.G.put("ů", obj10);
            this.G.put("ỡ", "o");
            this.G.put("ṕ", obj11);
            this.G.put("ᶖ", "i");
            this.G.put("ự", obj10);
            this.G.put("ã", "a");
            this.G.put("ᵢ", "i");
            this.G.put("ṱ", "t");
            this.G.put("ể", "e");
            this.G.put("ử", obj10);
            this.G.put("í", "i");
            this.G.put("ɔ", "o");
            this.G.put("ɺ", obj18);
            this.G.put("ɢ", obj14);
            this.G.put("ř", obj18);
            this.G.put("ẖ", obj12);
            this.G.put("ű", obj10);
            this.G.put("ȍ", "o");
            this.G.put("ḻ", "l");
            this.G.put("ḣ", obj12);
            this.G.put("ȶ", "t");
            this.G.put("ņ", "n");
            this.G.put("ᶒ", "e");
            this.G.put("ì", "i");
            this.G.put("ẉ", "w");
            this.G.put("ē", "e");
            this.G.put("ᴇ", "e");
            this.G.put("ł", "l");
            this.G.put("ộ", "o");
            this.G.put("ɭ", "l");
            this.G.put("ẏ", "y");
            this.G.put("ᴊ", "j");
            this.G.put("ḱ", "k");
            this.G.put("ṿ", obj16);
            this.G.put("ȩ", "e");
            this.G.put("â", "a");
            this.G.put("ş", obj13);
            this.G.put("ŗ", obj18);
            this.G.put("ʋ", obj16);
            this.G.put("ₐ", "a");
            this.G.put("ↄ", "c");
            this.G.put("ᶓ", "e");
            this.G.put("ɰ", obj17);
            this.G.put("ᴡ", "w");
            this.G.put("ȏ", "o");
            this.G.put("č", "c");
            this.G.put("ǵ", obj14);
            this.G.put("ĉ", "c");
            this.G.put("ᶗ", "o");
            this.G.put("ꝃ", "k");
            this.G.put("ꝙ", "q");
            this.G.put("ṑ", "o");
            this.G.put("ꜱ", obj13);
            this.G.put("ṓ", "o");
            this.G.put("ȟ", obj12);
            this.G.put("ő", "o");
            this.G.put("ꜩ", "tz");
            this.G.put("ẻ", "e");
            this.G.put("і", "i");
            this.G.put("ї", "i");
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        int i10 = 0;
        boolean z12 = false;
        while (i10 < length) {
            int i11 = i10 + 1;
            String substring = str.substring(i10, i11);
            if (z11) {
                String lowerCase = substring.toLowerCase();
                z12 = !substring.equals(lowerCase);
                substring = lowerCase;
            }
            String str2 = (String) this.G.get(substring);
            if (str2 == null && z10) {
                str2 = (String) this.H.get(substring);
            }
            if (str2 != null) {
                if (z11 && z12) {
                    if (str2.length() > 1) {
                        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                    } else {
                        str2 = str2.toUpperCase();
                    }
                }
                sb2.append(str2);
            } else {
                if (z11) {
                    char charAt = substring.charAt(0);
                    if ((charAt < 'a' || charAt > 'z' || charAt < '0' || charAt > '9') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/') {
                        return null;
                    }
                    if (z12) {
                        substring = substring.toUpperCase();
                    }
                }
                sb2.append(substring);
            }
            i10 = i11;
        }
        return sb2.toString();
    }

    public final void S0(int i10, boolean z10) {
        if (this.I) {
            return;
        }
        this.I = true;
        ConnectionsManager.getInstance(i10).sendRequest(new TLRPC.TL_langpack_getLanguages(), new yc(this, z10, i10), 8);
    }

    public final void T0(Configuration configuration) {
        if (this.D) {
            return;
        }
        Z = DateFormat.is24HourFormat(w0.b);
        Locale locale = configuration.locale;
        this.z = locale;
        if (this.C != null) {
            zc zcVar = this.B;
            this.B = null;
            d(zcVar, false, false, d20.s0);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.y.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                V0();
            }
            this.y = locale;
            zc zcVar2 = this.B;
            if (zcVar2 != null && !TextUtils.isEmpty(zcVar2.f)) {
                this.A = (ad) this.x.get(this.B.f);
            }
            if (this.A == null) {
                ad adVar = (ad) this.x.get(this.y.getLanguage());
                this.A = adVar;
                if (adVar == null) {
                    this.A = (ad) this.x.get("en");
                }
            }
        }
        String P0 = P0();
        String str = this.F;
        if (str != null && !P0.equals(str)) {
            this.F = P0;
            ConnectionsManager.setSystemLangCode(P0);
        }
        i();
    }

    public final void V0() {
        zc zcVar;
        Locale locale = this.y;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i10 = 0;
        X = (lowerCase.length() == 2 && (lowerCase.equals("ar") || lowerCase.equals("fa") || lowerCase.equals("he") || lowerCase.equals("iw"))) || lowerCase.startsWith("ar_") || lowerCase.startsWith("fa_") || lowerCase.startsWith("he_") || lowerCase.startsWith("iw_") || ((zcVar = this.B) != null && zcVar.g);
        Y = lowerCase.equals("ko") ? 2 : 1;
        this.t = null;
        this.s = null;
        this.u = null;
        this.v = null;
        this.q = null;
        this.r = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.l = null;
        this.n = null;
        this.d = null;
        this.e = null;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.i = null;
        this.j = null;
        this.k = null;
        while (true) {
            FastDateFormat[] fastDateFormatArr = this.w;
            if (i10 >= fastDateFormatArr.length) {
                return;
            }
            fastDateFormatArr[i10] = null;
            i10++;
        }
    }

    public final void W0(int i10, String str, boolean z10, wc wcVar) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            zc zcVar = this.B;
            if (zcVar == null) {
                return;
            }
            if (!str2.equals(zcVar.c) && !str2.equals(this.B.e)) {
                return;
            }
        }
        f(this.B, str2, z10, i10, wcVar);
    }

    public final void X0() {
        SharedPreferences.Editor edit = w0.b.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            String f7 = ((zc) this.O.get(i10)).f();
            if (f7 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f7);
            }
        }
        edit.putString("locales", sb2.toString());
        sb2.setLength(0);
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            String f10 = ((zc) this.L.get(i11)).f();
            if (f10 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f10);
            }
        }
        edit.putString("remote", sb2.toString());
        sb2.setLength(0);
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            String f11 = ((zc) this.K.get(i12)).f();
            if (f11 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f11);
            }
        }
        edit.putString("unofficial", sb2.toString());
        edit.commit();
    }

    public final void Y0(zc zcVar, TLRPC.TL_langPackDifference tL_langPackDifference, Runnable runnable) {
        HashMap G0;
        boolean z10 = true;
        if (tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty() || zcVar == null || zcVar.h()) {
            StringBuilder sb2 = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
            sb2.append(tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty());
            sb2.append("; locale is local or null=");
            if (zcVar != null && !zcVar.h()) {
                z10 = false;
            }
            sb2.append(z10);
            f8.b(sb2.toString());
            V0();
            zs.e().k(zs.x4, new Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        int i10 = lowerCase.equals(zcVar.c) ? 0 : lowerCase.equals(zcVar.e) ? 1 : -1;
        if (i10 == -1) {
            StringBuilder u10 = a1.g.u("saveRemoteLocaleStrings: unknown language ", lowerCase, " (locale short=");
            u10.append(zcVar.c);
            u10.append(", base=");
            u10.append(zcVar.e);
            u10.append(")");
            f8.b(u10.toString());
            return;
        }
        File e = i10 == 0 ? zcVar.e() : zcVar.d();
        try {
            if (tL_langPackDifference.from_version == 0) {
                f8.b("saveRemoteLocaleStrings: difference is straight from the beginning");
                G0 = new HashMap();
            } else {
                f8.b("saveRemoteLocaleStrings: difference is from version " + tL_langPackDifference.from_version + " ours " + zcVar.h + " (base version " + zcVar.e + ")");
                G0 = G0(e, true);
            }
            for (int i11 = 0; i11 < tL_langPackDifference.strings.size(); i11++) {
                TLRPC.LangPackString langPackString = tL_langPackDifference.strings.get(i11);
                if (langPackString instanceof TLRPC.TL_langPackString) {
                    G0.put(langPackString.key, m(langPackString.value));
                } else if (langPackString instanceof TLRPC.TL_langPackStringPluralized) {
                    String str = langPackString.key + "_zero";
                    String str2 = langPackString.zero_value;
                    G0.put(str, str2 != null ? m(str2) : "");
                    String str3 = langPackString.key + "_one";
                    String str4 = langPackString.one_value;
                    G0.put(str3, str4 != null ? m(str4) : "");
                    String str5 = langPackString.key + "_two";
                    String str6 = langPackString.two_value;
                    G0.put(str5, str6 != null ? m(str6) : "");
                    String str7 = langPackString.key + "_few";
                    String str8 = langPackString.few_value;
                    G0.put(str7, str8 != null ? m(str8) : "");
                    String str9 = langPackString.key + "_many";
                    String str10 = langPackString.many_value;
                    G0.put(str9, str10 != null ? m(str10) : "");
                    String str11 = langPackString.key + "_other";
                    String str12 = langPackString.other_value;
                    G0.put(str11, str12 != null ? m(str12) : "");
                } else if (langPackString instanceof TLRPC.TL_langPackStringDeleted) {
                    G0.remove(langPackString.key);
                }
            }
            f8.b("save locale file to " + e);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(e));
            bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
            bufferedWriter.write("<resources>\n");
            for (Map.Entry entry : G0.entrySet()) {
                bufferedWriter.write(String.format("<string name=\"%1$s\">%2$s</string>\n", entry.getKey(), entry.getValue()));
            }
            bufferedWriter.write("</resources>");
            bufferedWriter.close();
            boolean g10 = zcVar.g();
            HashMap G02 = G0(g10 ? zcVar.d() : zcVar.e(), false);
            if (g10) {
                G02.putAll(G0(zcVar.e(), false));
            }
            f8.b("saved locale file to " + e);
            i0.g3(new m4.a1(this, i10, zcVar, tL_langPackDifference, G02, runnable, 2));
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public final boolean Z0(String str) {
        int i10;
        int i11 = vp.r1(d20.s0).A7;
        if (i11 > 0) {
            if (!vp.d1().getBoolean("lngpack_patched_" + str, false) && (i10 = this.W) < i11) {
                f8.d("reinstalling " + str + " langpack because of patch (" + i10 + " keys, must be at least " + i11 + ")");
                U0(str);
                return true;
            }
        }
        return false;
    }

    public final void b(String[] strArr, ad adVar) {
        for (String str : strArr) {
            this.x.put(str, adVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(zc zcVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, ag.j0 j0Var) {
        int i11;
        int i12;
        String str;
        int f7;
        boolean z14;
        int i13;
        boolean z15;
        boolean z16;
        Locale locale;
        String[] strArr;
        boolean z17;
        boolean z18;
        cd cdVar = this;
        zc zcVar2 = zcVar;
        if (zcVar2 == null) {
            return 0;
        }
        boolean g10 = zcVar2.g();
        File e = zcVar2.e();
        File d = zcVar2.d();
        if (!z11) {
            ConnectionsManager.setLangCode(zcVar2.c());
        }
        if (cdVar.F0(zcVar2.b()) == null) {
            if (zcVar2.i()) {
                cdVar.L.add(zcVar2);
                cdVar.M.put(zcVar2.b(), zcVar2);
                cdVar.J.add(zcVar2);
                cdVar.N.put(zcVar2.b(), zcVar2);
                cdVar.X0();
            } else if (zcVar2.j()) {
                cdVar.K.add(zcVar2);
                cdVar.N.put(zcVar2.b(), zcVar2);
                cdVar.X0();
            }
        }
        if ((zcVar2.i() || zcVar2.j()) && (z13 || !e.exists() || (g10 && !d.exists()))) {
            if (v2.a) {
                f8.b("reload locale because one of file doesn't exist " + e + " " + d);
            }
            if (z11) {
                i11 = 0;
                i0.g3(new cg(cdVar, zcVar2, i10, j0Var, 6));
                cdVar = this;
                zcVar2 = zcVar;
                i12 = i10;
                str = " ";
                z14 = true;
                f7 = 0;
            } else {
                i11 = 0;
                cdVar = this;
                zcVar2 = zcVar;
                i12 = i10;
                str = " ";
                f7 = cdVar.f(zcVar2, null, true, i12, j0Var);
                z14 = true;
            }
        } else {
            i12 = i10;
            str = " ";
            f7 = 0;
            i11 = 0;
            z14 = false;
        }
        try {
            String[] split = !TextUtils.isEmpty(zcVar2.f) ? zcVar2.f.split("_") : !TextUtils.isEmpty(zcVar2.e) ? zcVar2.e.split("_") : zcVar2.c.split("_");
            i13 = f7;
            try {
                if (split.length == 1) {
                    locale = new Locale(split[i11]);
                    strArr = split;
                } else {
                    strArr = split;
                    locale = new Locale(split[i11], strArr[1]);
                }
                if (z10) {
                    cdVar.C = zcVar2.c;
                    SharedPreferences.Editor edit = vp.d1().edit();
                    z17 = g10;
                    edit.putString("language", zcVar2.b());
                    edit.commit();
                } else {
                    z17 = g10;
                }
                if (e == null) {
                    cdVar.V = ii.b.c;
                    cdVar.W = i11;
                } else if (!z12) {
                    HashMap G0 = cdVar.G0(z17 ? zcVar2.d() : zcVar2.e(), false);
                    if (z17) {
                        G0.putAll(cdVar.G0(zcVar2.e(), false));
                    }
                    ii.a aVar = new ii.a();
                    aVar.a(G0);
                    cdVar.V = new ii.b(aVar);
                    cdVar.W = h(G0);
                }
                cdVar.y = locale;
                cdVar.B = zcVar2;
                f8.b("applyLanguage: currentLocaleInfo is set");
                if (!TextUtils.isEmpty(cdVar.B.f)) {
                    cdVar.A = (ad) cdVar.x.get(cdVar.B.f);
                }
                if (cdVar.A == null) {
                    cdVar.A = (ad) cdVar.x.get(strArr[0]);
                }
                if (cdVar.A == null) {
                    cdVar.A = (ad) cdVar.x.get(cdVar.y.getLanguage());
                }
                if (cdVar.A == null) {
                    cdVar.A = new ad(10);
                }
                cdVar.D = true;
                Locale.setDefault(cdVar.y);
                Configuration configuration = new Configuration();
                configuration.locale = cdVar.y;
                w0.b.getResources().updateConfiguration(configuration, w0.b.getResources().getDisplayMetrics());
                cdVar.D = false;
                f8.b("applyLanguage: reloadLastFile=" + cdVar.E + " force=" + z13 + " isLoadingRemote=" + z14);
                if (cdVar.E || (!z14 && !z13 && cdVar.Z0(zcVar2.c))) {
                    if (v2.a) {
                        f8.b("reload locale because one of file is corrupted " + e + str + d + " reloadLastFile=" + cdVar.E + " isLoadingRemote=" + z14 + " force=" + z13);
                    }
                    if (z11) {
                        i0.g3(new vc(cdVar, i12, 3));
                    } else {
                        cdVar.W0(i12, null, true, null);
                    }
                    cdVar.E = false;
                    f8.b("reloadLastFile=false");
                }
                if (!z14) {
                    if (z11) {
                        i0.g3(new ag.f3(20));
                        z18 = false;
                    } else {
                        z18 = false;
                        zs.e().k(zs.x4, new Object[0]);
                    }
                    e01.s = z18;
                    if (j0Var != null) {
                        j0Var.run();
                    }
                }
                z16 = false;
                z15 = true;
            } catch (Exception e7) {
                e = e7;
                z15 = true;
                f8.g(e, true);
                z16 = false;
                cdVar.D = false;
                cdVar.V0();
                if (z13) {
                }
                return i13;
            }
        } catch (Exception e10) {
            e = e10;
            i13 = f7;
        }
        cdVar.V0();
        if (z13) {
            ui.b0(i12).E0(z16, z15, null);
        }
        return i13;
    }

    public final void d(zc zcVar, boolean z10, boolean z11, int i10) {
        c(zcVar, z10, z11, false, false, i10, null);
    }

    public final boolean e(File file, int i10) {
        try {
            HashMap G0 = G0(file, false);
            String str = (String) G0.get("LanguageName");
            String str2 = (String) G0.get("LanguageNameInEnglish");
            String str3 = (String) G0.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(w0.h(), str3.concat(".xml"));
                if (i0.E(file, file2)) {
                    zc F0 = F0("local_" + str3.toLowerCase());
                    if (F0 == null) {
                        F0 = new zc();
                        F0.a = str;
                        F0.b = str2;
                        String lowerCase = str3.toLowerCase();
                        F0.c = lowerCase;
                        F0.f = lowerCase;
                        F0.d = file2.getAbsolutePath();
                        this.J.add(F0);
                        this.N.put(F0.b(), F0);
                        this.O.add(F0);
                        X0();
                    }
                    zc zcVar = F0;
                    ii.a aVar = new ii.a();
                    aVar.a(G0);
                    this.V = new ii.b(aVar);
                    this.W = h(G0);
                    c(zcVar, true, false, true, false, i10, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            f8.g(e, true);
            return false;
        }
    }

    public final int f(final zc zcVar, String str, boolean z10, final int i10, Runnable runnable) {
        if (zcVar != null && (zcVar.i() || zcVar.j())) {
            StringBuilder sb2 = new StringBuilder("applyRemoteLanguage ");
            sb2.append(str);
            sb2.append(" force=");
            sb2.append(z10);
            sb2.append(" currentAccount=");
            i0.a.p(i10, sb2);
            int[] iArr = {0};
            final mg mgVar = new mg(new int[]{0}, iArr, runnable, 27);
            if (z10) {
                U0(zcVar.c);
            }
            if (zcVar.g() && (str == null || str.equals(zcVar.e))) {
                if (zcVar.i == 0 || z10) {
                    f8.b("applyRemoteLanguage getLangPack of base");
                    TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack = new TLRPC.TL_langpack_getLangPack();
                    String str2 = zcVar.e;
                    tL_langpack_getLangPack.lang_code = str2 == null ? "" : str2.replace("_", "-");
                    iArr[0] = iArr[0] + 1;
                    final int i11 = 2;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getLangPack, new RequestDelegate(this) { // from class: org.telegram.messenger.uc
                        public final /* synthetic */ cd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i11) {
                                case 0:
                                    if (tLObject != null) {
                                        final int i12 = 1;
                                        final cd cdVar = this.b;
                                        final zc zcVar2 = zcVar;
                                        final int i13 = i10;
                                        final mg mgVar2 = mgVar;
                                        i0.g3(new Runnable(cdVar, zcVar2, tLObject, i13, mgVar2, i12) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i12;
                                                this.e = mgVar2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar3 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar3);
                                                        break;
                                                    case 1:
                                                        mg mgVar4 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar4);
                                                        break;
                                                    case 2:
                                                        mg mgVar5 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar5);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (tLObject != null) {
                                        final int i14 = 3;
                                        final cd cdVar2 = this.b;
                                        final zc zcVar3 = zcVar;
                                        final int i15 = i10;
                                        final mg mgVar3 = mgVar;
                                        i0.g3(new Runnable(cdVar2, zcVar3, tLObject, i15, mgVar3, i14) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i14;
                                                this.e = mgVar3;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar4 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar4);
                                                        break;
                                                    case 2:
                                                        mg mgVar5 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar5);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (tLObject != null) {
                                        final int i16 = 0;
                                        final cd cdVar3 = this.b;
                                        final zc zcVar4 = zcVar;
                                        final int i17 = i10;
                                        final mg mgVar4 = mgVar;
                                        i0.g3(new Runnable(cdVar3, zcVar4, tLObject, i17, mgVar4, i16) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i16;
                                                this.e = mgVar4;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar5 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar5);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                default:
                                    if (tLObject != null) {
                                        final int i18 = 2;
                                        final cd cdVar4 = this.b;
                                        final zc zcVar5 = zcVar;
                                        final int i19 = i10;
                                        final mg mgVar5 = mgVar;
                                        i0.g3(new Runnable(cdVar4, zcVar5, tLObject, i19, mgVar5, i18) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i18;
                                                this.e = mgVar5;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, 8);
                } else if (zcVar.g()) {
                    f8.b("applyRemoteLanguage getDifference of base");
                    TLRPC.TL_langpack_getDifference tL_langpack_getDifference = new TLRPC.TL_langpack_getDifference();
                    tL_langpack_getDifference.from_version = zcVar.i;
                    String str3 = zcVar.e;
                    tL_langpack_getDifference.lang_code = str3 == null ? "" : str3.replace("_", "-");
                    tL_langpack_getDifference.lang_pack = "";
                    iArr[0] = iArr[0] + 1;
                    final int i12 = 1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getDifference, new RequestDelegate(this) { // from class: org.telegram.messenger.uc
                        public final /* synthetic */ cd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i12) {
                                case 0:
                                    if (tLObject != null) {
                                        final int i122 = 1;
                                        final cd cdVar = this.b;
                                        final zc zcVar2 = zcVar;
                                        final int i13 = i10;
                                        final mg mgVar2 = mgVar;
                                        i0.g3(new Runnable(cdVar, zcVar2, tLObject, i13, mgVar2, i122) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i122;
                                                this.e = mgVar2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (tLObject != null) {
                                        final int i14 = 3;
                                        final cd cdVar2 = this.b;
                                        final zc zcVar3 = zcVar;
                                        final int i15 = i10;
                                        final mg mgVar3 = mgVar;
                                        i0.g3(new Runnable(cdVar2, zcVar3, tLObject, i15, mgVar3, i14) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i14;
                                                this.e = mgVar3;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (tLObject != null) {
                                        final int i16 = 0;
                                        final cd cdVar3 = this.b;
                                        final zc zcVar4 = zcVar;
                                        final int i17 = i10;
                                        final mg mgVar4 = mgVar;
                                        i0.g3(new Runnable(cdVar3, zcVar4, tLObject, i17, mgVar4, i16) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i16;
                                                this.e = mgVar4;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                default:
                                    if (tLObject != null) {
                                        final int i18 = 2;
                                        final cd cdVar4 = this.b;
                                        final zc zcVar5 = zcVar;
                                        final int i19 = i10;
                                        final mg mgVar5 = mgVar;
                                        i0.g3(new Runnable(cdVar4, zcVar5, tLObject, i19, mgVar5, i18) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i18;
                                                this.e = mgVar5;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, 8);
                }
            }
            if (str == null || str.equals(zcVar.c)) {
                if (zcVar.h != 0 && !z10) {
                    f8.b("applyRemoteLanguage getDifference");
                    TLRPC.TL_langpack_getDifference tL_langpack_getDifference2 = new TLRPC.TL_langpack_getDifference();
                    tL_langpack_getDifference2.from_version = zcVar.h;
                    tL_langpack_getDifference2.lang_code = zcVar.c();
                    tL_langpack_getDifference2.lang_pack = "";
                    iArr[0] = iArr[0] + 1;
                    final int i13 = 3;
                    return ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getDifference2, new RequestDelegate(this) { // from class: org.telegram.messenger.uc
                        public final /* synthetic */ cd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    if (tLObject != null) {
                                        final int i122 = 1;
                                        final cd cdVar = this.b;
                                        final zc zcVar2 = zcVar;
                                        final int i132 = i10;
                                        final mg mgVar2 = mgVar;
                                        i0.g3(new Runnable(cdVar, zcVar2, tLObject, i132, mgVar2, i122) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i122;
                                                this.e = mgVar2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (tLObject != null) {
                                        final int i14 = 3;
                                        final cd cdVar2 = this.b;
                                        final zc zcVar3 = zcVar;
                                        final int i15 = i10;
                                        final mg mgVar3 = mgVar;
                                        i0.g3(new Runnable(cdVar2, zcVar3, tLObject, i15, mgVar3, i14) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i14;
                                                this.e = mgVar3;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (tLObject != null) {
                                        final int i16 = 0;
                                        final cd cdVar3 = this.b;
                                        final zc zcVar4 = zcVar;
                                        final int i17 = i10;
                                        final mg mgVar4 = mgVar;
                                        i0.g3(new Runnable(cdVar3, zcVar4, tLObject, i17, mgVar4, i16) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i16;
                                                this.e = mgVar4;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                default:
                                    if (tLObject != null) {
                                        final int i18 = 2;
                                        final cd cdVar4 = this.b;
                                        final zc zcVar5 = zcVar;
                                        final int i19 = i10;
                                        final mg mgVar5 = mgVar;
                                        i0.g3(new Runnable(cdVar4, zcVar5, tLObject, i19, mgVar5, i18) { // from class: org.telegram.messenger.xc
                                            public final /* synthetic */ int a;
                                            public final /* synthetic */ cd b;
                                            public final /* synthetic */ zc c;
                                            public final /* synthetic */ TLObject d;
                                            public final /* synthetic */ mg e;

                                            {
                                                this.a = i18;
                                                this.e = mgVar5;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (this.a) {
                                                    case 0:
                                                        mg mgVar32 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                        break;
                                                    case 1:
                                                        mg mgVar42 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                        break;
                                                    case 2:
                                                        mg mgVar52 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                        break;
                                                    default:
                                                        mg mgVar6 = this.e;
                                                        this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, 8);
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    ConnectionsManager.setLangCode(zcVar.c());
                }
                f8.b("applyRemoteLanguage getLangPack");
                TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack2 = new TLRPC.TL_langpack_getLangPack();
                tL_langpack_getLangPack2.lang_code = zcVar.c();
                iArr[0] = iArr[0] + 1;
                final int i15 = 0;
                return ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getLangPack2, new RequestDelegate(this) { // from class: org.telegram.messenger.uc
                    public final /* synthetic */ cd b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i15) {
                            case 0:
                                if (tLObject != null) {
                                    final int i122 = 1;
                                    final cd cdVar = this.b;
                                    final zc zcVar2 = zcVar;
                                    final int i132 = i10;
                                    final mg mgVar2 = mgVar;
                                    i0.g3(new Runnable(cdVar, zcVar2, tLObject, i132, mgVar2, i122) { // from class: org.telegram.messenger.xc
                                        public final /* synthetic */ int a;
                                        public final /* synthetic */ cd b;
                                        public final /* synthetic */ zc c;
                                        public final /* synthetic */ TLObject d;
                                        public final /* synthetic */ mg e;

                                        {
                                            this.a = i122;
                                            this.e = mgVar2;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (this.a) {
                                                case 0:
                                                    mg mgVar32 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                    break;
                                                case 1:
                                                    mg mgVar42 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                    break;
                                                case 2:
                                                    mg mgVar52 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                    break;
                                                default:
                                                    mg mgVar6 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject != null) {
                                    final int i142 = 3;
                                    final cd cdVar2 = this.b;
                                    final zc zcVar3 = zcVar;
                                    final int i152 = i10;
                                    final mg mgVar3 = mgVar;
                                    i0.g3(new Runnable(cdVar2, zcVar3, tLObject, i152, mgVar3, i142) { // from class: org.telegram.messenger.xc
                                        public final /* synthetic */ int a;
                                        public final /* synthetic */ cd b;
                                        public final /* synthetic */ zc c;
                                        public final /* synthetic */ TLObject d;
                                        public final /* synthetic */ mg e;

                                        {
                                            this.a = i142;
                                            this.e = mgVar3;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (this.a) {
                                                case 0:
                                                    mg mgVar32 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                    break;
                                                case 1:
                                                    mg mgVar42 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                    break;
                                                case 2:
                                                    mg mgVar52 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                    break;
                                                default:
                                                    mg mgVar6 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            case 2:
                                if (tLObject != null) {
                                    final int i16 = 0;
                                    final cd cdVar3 = this.b;
                                    final zc zcVar4 = zcVar;
                                    final int i17 = i10;
                                    final mg mgVar4 = mgVar;
                                    i0.g3(new Runnable(cdVar3, zcVar4, tLObject, i17, mgVar4, i16) { // from class: org.telegram.messenger.xc
                                        public final /* synthetic */ int a;
                                        public final /* synthetic */ cd b;
                                        public final /* synthetic */ zc c;
                                        public final /* synthetic */ TLObject d;
                                        public final /* synthetic */ mg e;

                                        {
                                            this.a = i16;
                                            this.e = mgVar4;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (this.a) {
                                                case 0:
                                                    mg mgVar32 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                    break;
                                                case 1:
                                                    mg mgVar42 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                    break;
                                                case 2:
                                                    mg mgVar52 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                    break;
                                                default:
                                                    mg mgVar6 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                if (tLObject != null) {
                                    final int i18 = 2;
                                    final cd cdVar4 = this.b;
                                    final zc zcVar5 = zcVar;
                                    final int i19 = i10;
                                    final mg mgVar5 = mgVar;
                                    i0.g3(new Runnable(cdVar4, zcVar5, tLObject, i19, mgVar5, i18) { // from class: org.telegram.messenger.xc
                                        public final /* synthetic */ int a;
                                        public final /* synthetic */ cd b;
                                        public final /* synthetic */ zc c;
                                        public final /* synthetic */ TLObject d;
                                        public final /* synthetic */ mg e;

                                        {
                                            this.a = i18;
                                            this.e = mgVar5;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (this.a) {
                                                case 0:
                                                    mg mgVar32 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar32);
                                                    break;
                                                case 1:
                                                    mg mgVar42 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar42);
                                                    break;
                                                case 2:
                                                    mg mgVar52 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar52);
                                                    break;
                                                default:
                                                    mg mgVar6 = this.e;
                                                    this.b.Y0(this.c, (TLRPC.TL_langPackDifference) this.d, mgVar6);
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                        }
                    }
                }, 8);
            }
        }
        return 0;
    }

    public final FastDateFormat g0() {
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.l = k(locale, N0(2131742811, "chatDate", null), "d MMMM");
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public final FastDateFormat h0() {
        if (this.n == null) {
            synchronized (this) {
                try {
                    if (this.n == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.n = k(locale, N0(2131742809, "chatFullDate", null), "d MMMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
    
        if (r14.equals("de") == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:12:0x001a, B:14:0x0025, B:17:0x01e0, B:21:0x002d, B:23:0x0031, B:25:0x003a, B:26:0x0042, B:33:0x0190, B:36:0x0199, B:38:0x01a4, B:39:0x01c8, B:41:0x01ca, B:42:0x01d2, B:43:0x01de, B:46:0x01ad, B:48:0x01b6, B:50:0x01da, B:51:0x0061, B:56:0x00fd), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ad A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:12:0x001a, B:14:0x0025, B:17:0x01e0, B:21:0x002d, B:23:0x0031, B:25:0x003a, B:26:0x0042, B:33:0x0190, B:36:0x0199, B:38:0x01a4, B:39:0x01c8, B:41:0x01ca, B:42:0x01d2, B:43:0x01de, B:46:0x01ad, B:48:0x01b6, B:50:0x01da, B:51:0x0061, B:56:0x00fd), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        char c10;
        ii.a aVar;
        if (!Objects.equals(this.S, this.y) || this.T == null || this.U) {
            boolean z10 = true;
            this.U = true;
            synchronized (this) {
                try {
                    Locale locale = this.y;
                    if (Objects.equals(this.S, locale)) {
                        if (this.T == null) {
                        }
                    }
                    if (this.R == null) {
                        ii.a aVar2 = new ii.a();
                        try {
                            aVar2.a = ii.b.a(w0.b, "localization_en.bin", aVar2.a);
                        } catch (Exception unused) {
                        }
                        this.R = new ii.b(aVar2);
                    }
                    String str = "localization_ar.bin";
                    if (locale != null) {
                        String languageTag = locale.toLanguageTag();
                        languageTag.getClass();
                        switch (languageTag.hashCode()) {
                            case 3121:
                                if (languageTag.equals("ar")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3201:
                                if (languageTag.equals("de")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3241:
                                if (languageTag.equals("en")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3246:
                                if (languageTag.equals("es")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3371:
                                if (languageTag.equals("it")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3428:
                                if (languageTag.equals("ko")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3518:
                                if (languageTag.equals("nl")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3651:
                                if (languageTag.equals("ru")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3734:
                                if (languageTag.equals("uk")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 106935481:
                                if (languageTag.equals("pt-BR")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                break;
                            case 1:
                                str = "localization_de.bin";
                                break;
                            case 2:
                                str = "localization_en.bin";
                                break;
                            case 3:
                                str = "localization_es.bin";
                                break;
                            case 4:
                                str = "localization_it.bin";
                                break;
                            case 5:
                                str = "localization_ko.bin";
                                break;
                            case 6:
                                str = "localization_nl.bin";
                                break;
                            case 7:
                                str = "localization_ru.bin";
                                break;
                            case '\b':
                                str = "localization_uk.bin";
                                break;
                            case '\t':
                                str = "localization_pt_br.bin";
                                break;
                            default:
                                String language = locale.getLanguage();
                                language.getClass();
                                switch (language.hashCode()) {
                                    case 3121:
                                        if (language.equals("ar")) {
                                            z10 = false;
                                            break;
                                        }
                                        z10 = -1;
                                        break;
                                    case 3201:
                                        break;
                                    case 3241:
                                        if (language.equals("en")) {
                                            z10 = 2;
                                            break;
                                        }
                                        z10 = -1;
                                        break;
                                    case 3246:
                                        if (language.equals("es")) {
                                            z10 = 3;
                                            break;
                                        }
                                        z10 = -1;
                                        break;
                                    case 3371:
                                        if (language.equals("it")) {
                                            z10 = 4;
                                            break;
                                        }
                                        z10 = -1;
                                        break;
                                    case 3428:
                                        if (language.equals("ko")) {
                                            z10 = 5;
                                            break;
                                        }
                                        z10 = -1;
                                        break;
                                    case 3518:
                                        if (language.equals("nl")) {
                                            z10 = 6;
                                            break;
                                        }
                                        z10 = -1;
                                        break;
                                    case 3651:
                                        if (language.equals("ru")) {
                                            z10 = 7;
                                            break;
                                        }
                                        z10 = -1;
                                        break;
                                    case 3734:
                                        if (language.equals("uk")) {
                                            z10 = 8;
                                            break;
                                        }
                                        z10 = -1;
                                        break;
                                    default:
                                        z10 = -1;
                                        break;
                                }
                                switch (z10) {
                                }
                        }
                        if (str != null && !TextUtils.equals(str, "localization_en.bin")) {
                            aVar = new ii.a();
                            ii.b bVar = this.R;
                            if (aVar.a != null) {
                                aVar.a = bVar.a.clone();
                            } else {
                                SparseArray sparseArray = bVar.a;
                                int size = sparseArray.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    aVar.a.put(sparseArray.keyAt(i10), (String) sparseArray.valueAt(i10));
                                }
                            }
                            try {
                                aVar.a = ii.b.a(w0.b, str, aVar.a);
                            } catch (Exception unused2) {
                            }
                            this.T = new ii.b(aVar);
                            this.S = locale;
                        }
                        this.T = this.R;
                        this.S = locale;
                    }
                    str = null;
                    if (str != null) {
                        aVar = new ii.a();
                        ii.b bVar2 = this.R;
                        if (aVar.a != null) {
                        }
                        aVar.a = ii.b.a(w0.b, str, aVar.a);
                        this.T = new ii.b(aVar);
                        this.S = locale;
                    }
                    this.T = this.R;
                    this.S = locale;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.U = false;
        }
    }

    public final void j(int i10) {
        zc zcVar = this.B;
        if (zcVar == null || this.P || !Z0(zcVar.c)) {
            return;
        }
        if (v2.a) {
            f8.b("reload locale because locale file is not enough");
        }
        i0.g3(new vc(this, i10, 2));
    }

    public final Locale k0() {
        return this.y;
    }

    public final FastDateFormat l0() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.j = k(locale, Z ? N0(2131742804, "formatterBannedUntil24H", null) : N0(2131742805, "formatterBannedUntil12H", null), Z ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.j;
    }

    public final FastDateFormat m0() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.k = k(locale, Z ? N0(2131742802, "formatterBannedUntilThisYear24H", null) : N0(2131742803, "formatterBannedUntilThisYear12H", null), Z ? "MMM dd, HH:mm" : "MMM dd, h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public final FastDateFormat n0() {
        if (this.t == null) {
            synchronized (this) {
                try {
                    if (this.t == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.t = k(locale, N0(2131742801, "formatterBoostExpired", null), "MMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.t;
    }

    public final FastDateFormat o0() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        String language = locale.getLanguage();
                        if (language == null) {
                            language = "en";
                        }
                        String lowerCase = language.toLowerCase();
                        if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                            locale = Locale.US;
                        }
                        this.a = k(locale, Z ? N0(2131742799, "formatterDay24H", null) : N0(2131742800, "formatterDay12H", null), Z ? "HH:mm" : "h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    public final String p(long j10, String str) {
        return q(j10, true, true, false, str);
    }

    public final FastDateFormat p0() {
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f = k(locale, N0(2131742793, "formatterMonth", null), "dd MMM");
                    }
                } finally {
                }
            }
        }
        return this.f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String q(long j10, boolean z10, boolean z11, boolean z12, String str) {
        double d;
        int length;
        String upperCase = str.toUpperCase();
        boolean z13 = j10 < 0;
        long abs = Math.abs(j10);
        Currency currency = Currency.getInstance(upperCase);
        upperCase.getClass();
        char c10 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c10 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c10 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c10 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c10 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c10 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c10 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c10 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c10 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c10 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c10 = 29;
                    break;
                }
                break;
            case 87254:
                if (upperCase.equals("XTR")) {
                    c10 = 30;
                    break;
                }
                break;
        }
        String str2 = " %.2f";
        switch (c10) {
            case 0:
            case '\b':
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = abs / 1000.0d;
                str2 = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\n':
            case '\f':
            case '\r':
            case 14:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case zs.T /* 30 */:
                d = abs;
                str2 = " %.0f";
                break;
            case 3:
                d = abs / 10000.0d;
                str2 = " %.4f";
                break;
            case '\t':
                double d10 = abs / 100.0f;
                if (z10 && abs % 100 == 0) {
                    str2 = " %.0f";
                }
                d = d10;
                break;
            case 18:
                d = abs / 10.0d;
                str2 = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                break;
        }
        String str3 = z11 ? str2 : " %.0f";
        if (currency == null) {
            return (z13 ? "-" : "").concat(String.format(Locale.US, upperCase.concat(str3), Double.valueOf(d)));
        }
        Locale locale = this.y;
        if (locale == null) {
            locale = this.z;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        if (z12) {
            currencyInstance.setGroupingUsed(false);
        }
        if (!z11 || (z10 && upperCase.equals("IRR"))) {
            currencyInstance.setMaximumFractionDigits(0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z13 ? "-" : "");
        sb2.append(currencyInstance.format(d));
        String sb3 = sb2.toString();
        int indexOf = sb3.indexOf(upperCase);
        if (indexOf < 0 || (length = upperCase.length() + indexOf) >= sb3.length() || sb3.charAt(length) == ' ') {
            return sb3;
        }
        return sb3.substring(0, length) + " " + sb3.substring(length);
    }

    public final FastDateFormat q0() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        String language = locale.getLanguage();
                        if (language == null) {
                            language = "en";
                        }
                        String lowerCase = language.toLowerCase();
                        if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                            locale = Locale.US;
                        }
                        this.b = k(locale, Z ? N0(2131742797, "formatterDayWithSeconds24H", null) : N0(2131742798, "formatterDayWithSeconds12H", null), Z ? "HH:mm:ss" : "h:mm:ss a");
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final FastDateFormat r0() {
        if (this.s == null) {
            synchronized (this) {
                try {
                    if (this.s == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.s = k(locale, N0(2131742796, "formatterGiveawayCard", null), "dd MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.s;
    }

    public final FastDateFormat s0() {
        if (this.u == null) {
            synchronized (this) {
                try {
                    if (this.u == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.u = k(locale, N0(2131742795, "formatterGiveawayMonthDay", null), "MMMM dd");
                    }
                } finally {
                }
            }
        }
        return this.u;
    }

    public final FastDateFormat t0() {
        if (this.v == null) {
            synchronized (this) {
                try {
                    if (this.v == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.v = k(locale, N0(2131742794, "formatterGiveawayMonthDayYear", null), "MMMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.v;
    }

    public final FastDateFormat u0() {
        if (this.q == null) {
            synchronized (this) {
                try {
                    if (this.q == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.q = k(locale, N0(2131742790, "formatterMonthYear", null), "MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.q;
    }

    public final FastDateFormat v0() {
        if (this.o == null) {
            synchronized (this) {
                try {
                    if (this.o == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.o = k(locale, N0(2131742807, "formatDateSchedule", null), "MMM d");
                    }
                } finally {
                }
            }
        }
        return this.o;
    }

    public final FastDateFormat w0(int i10) {
        if (i10 >= 0) {
            FastDateFormat[] fastDateFormatArr = this.w;
            if (i10 < fastDateFormatArr.length) {
                if (fastDateFormatArr[i10] == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    switch (i10) {
                        case 0:
                            fastDateFormatArr[i10] = k(locale, N0(2131745604, "SendTodayAt", null), "'Send today at' HH:mm");
                            break;
                        case 1:
                            fastDateFormatArr[i10] = k(locale, N0(2131745646, "SendDayAt", null), "'Send on' MMM d 'at' HH:mm");
                            break;
                        case 2:
                            fastDateFormatArr[i10] = k(locale, N0(2131745645, "SendDayYearAt", null), "'Send on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 3:
                            fastDateFormatArr[i10] = k(locale, N0(2131746338, "RemindTodayAt", null), "'Remind today at' HH:mm");
                            break;
                        case 4:
                            fastDateFormatArr[i10] = k(locale, N0(2131746340, "RemindDayAt", null), "'Remind on' MMM d 'at' HH:mm");
                            break;
                        case 5:
                            fastDateFormatArr[i10] = k(locale, N0(2131746339, "RemindDayYearAt", null), "'Remind on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 6:
                            fastDateFormatArr[i10] = k(locale, N0(2131744923, "StartTodayAt", null), "'Start today at' HH:mm");
                            break;
                        case 7:
                            fastDateFormatArr[i10] = k(locale, N0(2131744932, "StartDayAt", null), "'Start on' MMM d 'at' HH:mm");
                            break;
                        case 8:
                            fastDateFormatArr[i10] = k(locale, N0(2131744931, "StartDayYearAt", null), "'Start on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 9:
                            fastDateFormatArr[i10] = k(locale, N0(2131744926, "StartShortTodayAt", null), "'Today,' HH:mm");
                            break;
                        case 10:
                            fastDateFormatArr[i10] = k(locale, N0(2131744928, "StartShortDayAt", null), "MMM d',' HH:mm");
                            break;
                        case 11:
                            fastDateFormatArr[i10] = k(locale, N0(2131744927, "StartShortDayYearAt", null), "MMM d yyyy, HH:mm");
                            break;
                        case 12:
                            fastDateFormatArr[i10] = k(locale, N0(2131744915, "StartsTodayAt", null), "'Starts today at' HH:mm");
                            break;
                        case 13:
                            fastDateFormatArr[i10] = k(locale, N0(2131744917, "StartsDayAt", null), "'Starts on' MMM d 'at' HH:mm");
                            break;
                        case 14:
                            fastDateFormatArr[i10] = k(locale, N0(2131744916, "StartsDayYearAt", null), "'Starts on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 15:
                            fastDateFormatArr[i10] = k(locale, N0(2131746592, "PublishTodayAt", null), "'Publish today at' HH:mm");
                            break;
                        case 16:
                            fastDateFormatArr[i10] = k(locale, N0(2131746594, "PublishDayAt", null), "'Publish on' MMM d 'at' HH:mm");
                            break;
                        case 17:
                            fastDateFormatArr[i10] = k(locale, N0(2131746593, "PublishDayYearAt", null), "'Publish on' MMM d yyyy 'at' HH:mm");
                            break;
                    }
                }
                return fastDateFormatArr[i10];
            }
        }
        return null;
    }

    public final FastDateFormat x0() {
        if (this.p == null) {
            synchronized (this) {
                try {
                    if (this.p == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.p = k(locale, N0(2131742806, "formatDateScheduleYear", null), "MMM d yyyy");
                    }
                } finally {
                }
            }
        }
        return this.p;
    }

    public final FastDateFormat y0() {
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.i = k(locale, Z ? N0(2131742787, "formatterStats24H", null) : N0(2131742788, "formatterStats12H", null), Z ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    public final FastDateFormat z0() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.d = k(locale, N0(2131742786, "formatterWeek", null), "EEE");
                    }
                } finally {
                }
            }
        }
        return this.d;
    }
}
