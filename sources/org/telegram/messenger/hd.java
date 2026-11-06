package org.telegram.messenger;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
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
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
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
import org.telegram.ui.Components.u31;
import org.telegram.ui.g60;
import org.telegram.ui.qy0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class hd {
    public static boolean a0 = false;
    public static int b0 = 1;
    public static boolean c0 = false;
    public static volatile hd d0;
    public static final char[] e0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[][] f0 = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    public static Boolean g0;
    public fd A;
    public ed B;
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
    public q5 R;
    public final HashMap S;
    public final HashMap T;
    public si.b U;
    public volatile Locale V;
    public volatile si.b W;
    public volatile boolean X;
    public si.b Y;
    public int Z;
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

    public hd() {
        boolean z9 = false;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new HashMap();
        HashMap hashMap = new HashMap();
        this.N = hashMap;
        this.O = new ArrayList();
        this.Q = false;
        this.S = new HashMap();
        this.T = new HashMap();
        si.b bVar = si.b.c;
        this.W = bVar;
        this.Y = bVar;
        b(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new fd(11));
        b(new String[]{"cs", "sk"}, new fd(3));
        b(new String[]{"ff", "fr", "kab"}, new fd(4));
        b(new String[]{"ru", "uk", "be"}, new fd(1));
        b(new String[]{"sr", "hr", "bs", "sh"}, new fd(14));
        b(new String[]{"lv"}, new fd(6));
        b(new String[]{"lt"}, new fd(7));
        b(new String[]{"pl"}, new fd(12));
        b(new String[]{"ro", "mo"}, new fd(13));
        b(new String[]{"sl"}, new fd(15));
        b(new String[]{"ar"}, new fd(0));
        b(new String[]{"mk"}, new fd(8));
        b(new String[]{"cy"}, new fd(18));
        b(new String[]{"br"}, new fd(2));
        b(new String[]{"lag"}, new fd(5));
        b(new String[]{"shi"}, new fd(16));
        b(new String[]{"mt"}, new fd(9));
        b(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new fd(17));
        b(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new fd(19));
        b(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new fd(10));
        ed edVar = new ed();
        edVar.a = "English";
        edVar.b = "English";
        edVar.f = "en";
        edVar.c = "en";
        ed edVar2 = null;
        edVar.d = null;
        edVar.j = true;
        arrayList.add(edVar);
        hashMap.put(edVar.c, edVar);
        ed edVar3 = new ed();
        edVar3.a = "Italiano";
        edVar3.b = "Italian";
        edVar3.f = "it";
        edVar3.c = "it";
        edVar3.d = null;
        edVar3.j = true;
        arrayList.add(edVar3);
        hashMap.put(edVar3.c, edVar3);
        ed edVar4 = new ed();
        edVar4.a = "Español";
        edVar4.b = "Spanish";
        edVar4.f = "es";
        edVar4.c = "es";
        edVar4.j = true;
        arrayList.add(edVar4);
        hashMap.put(edVar4.c, edVar4);
        ed edVar5 = new ed();
        edVar5.a = "Deutsch";
        edVar5.b = "German";
        edVar5.f = "de";
        edVar5.c = "de";
        edVar5.d = null;
        edVar5.j = true;
        arrayList.add(edVar5);
        hashMap.put(edVar5.c, edVar5);
        ed edVar6 = new ed();
        edVar6.a = "Nederlands";
        edVar6.b = "Dutch";
        edVar6.f = "nl";
        edVar6.c = "nl";
        edVar6.d = null;
        edVar6.j = true;
        arrayList.add(edVar6);
        hashMap.put(edVar6.c, edVar6);
        ed edVar7 = new ed();
        edVar7.a = "العربية";
        edVar7.b = "Arabic";
        edVar7.f = "ar";
        edVar7.c = "ar";
        edVar7.d = null;
        edVar7.j = true;
        edVar7.g = true;
        arrayList.add(edVar7);
        hashMap.put(edVar7.c, edVar7);
        ed edVar8 = new ed();
        edVar8.a = "Português (Brasil)";
        edVar8.b = "Portuguese (Brazil)";
        edVar8.f = "pt_br";
        edVar8.c = "pt_br";
        edVar8.d = null;
        edVar8.j = true;
        arrayList.add(edVar8);
        hashMap.put(edVar8.c, edVar8);
        ed edVar9 = new ed();
        edVar9.a = "한국어";
        edVar9.b = "Korean";
        edVar9.f = "ko";
        edVar9.c = "ko";
        edVar9.d = null;
        edVar9.j = true;
        arrayList.add(edVar9);
        hashMap.put(edVar9.c, edVar9);
        ed edVar10 = new ed();
        edVar10.a = "Українська";
        edVar10.b = "Ukrainian";
        edVar10.f = "uk";
        edVar10.c = "uk";
        edVar10.d = null;
        edVar10.j = true;
        arrayList.add(edVar10);
        hashMap.put(edVar10.c, edVar10);
        ed edVar11 = new ed();
        edVar11.a = "Русский";
        edVar11.b = "Russian";
        edVar11.f = "ru";
        edVar11.c = "ru";
        edVar11.d = null;
        edVar11.j = true;
        arrayList.add(edVar11);
        hashMap.put(edVar11.c, edVar11);
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                ed a10 = ed.a(str);
                if (a10 != null) {
                    this.O.add(a10);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                ed a11 = ed.a(str2);
                a11.c = a11.c.replace("-", "_");
                if (!this.M.containsKey(a11.b())) {
                    this.L.add(a11);
                    this.M.put(a11.b(), a11);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (!TextUtils.isEmpty(string3)) {
            for (String str3 : string3.split("&")) {
                ed a12 = ed.a(str3);
                if (a12 != null) {
                    a12.c = a12.c.replace("-", "_");
                    this.K.add(a12);
                }
            }
        }
        if (this.L.isEmpty()) {
            final int i7 = 0;
            g0.h3(new Runnable(this) { // from class: org.telegram.messenger.sc
                public final /* synthetic */ hd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            this.b.V0(p10.s0, true);
                            break;
                        default:
                            hd hdVar = this.b;
                            hdVar.getClass();
                            hdVar.F = hd.Q0();
                            break;
                    }
                }
            });
        }
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            ed edVar12 = (ed) this.O.get(i10);
            this.J.add(edVar12);
            this.N.put(edVar12.b(), edVar12);
        }
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            ed edVar13 = (ed) this.L.get(i11);
            ed G0 = G0(edVar13.b());
            if (G0 != null) {
                G0.d = edVar13.d;
                G0.h = edVar13.h;
                G0.i = edVar13.i;
                G0.k = edVar13.k;
                this.L.set(i11, G0);
            } else {
                this.J.add(edVar13);
                this.N.put(edVar13.b(), edVar13);
            }
        }
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            ed edVar14 = (ed) this.K.get(i12);
            ed G02 = G0(edVar14.b());
            if (G02 != null) {
                G02.d = edVar14.d;
                G02.h = edVar14.h;
                G02.i = edVar14.i;
                G02.k = edVar14.k;
                this.K.set(i12, G02);
            } else {
                this.N.put(edVar14.b(), edVar14);
            }
        }
        this.z = Locale.getDefault();
        c0 = DateFormat.is24HourFormat(t0.b);
        try {
            String string4 = qp.e1().getString("language", null);
            if (string4 != null && (edVar2 = G0(string4)) != null) {
                z9 = true;
            }
            if (edVar2 == null && this.z.getLanguage() != null) {
                edVar2 = G0(this.z.getLanguage());
            }
            if (edVar2 == null && (edVar2 = G0(I0(this.z))) == null) {
                edVar2 = G0("en");
            }
            d(edVar2, z9, true, p10.s0);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                t0.b.registerReceiver(new androidx.mediarouter.app.f(this, 7), intentFilter, 4);
            } else {
                t0.b.registerReceiver(new androidx.mediarouter.app.f(this, 7), intentFilter);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        final int i13 = 1;
        g0.h3(new Runnable(this) { // from class: org.telegram.messenger.sc
            public final /* synthetic */ hd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.V0(p10.s0, true);
                        break;
                    default:
                        hd hdVar = this.b;
                        hdVar.getClass();
                        hdVar.F = hd.Q0();
                        break;
                }
            }
        });
    }

    public static String A(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, long j3, Locale locale, boolean z9) {
        String str;
        long j10 = tL_messageEntityFormattedDate.date * 1000;
        if (tL_messageEntityFormattedDate.relative && !z9) {
            return Build.VERSION.SDK_INT >= 24 ? gd.a(j10 - j3, locale) : DateUtils.getRelativeTimeSpanString(j10, j3, 1000L, 262144).toString();
        }
        boolean z10 = (tL_messageEntityFormattedDate.flags == 0) | z9;
        String str2 = "";
        String format = tL_messageEntityFormattedDate.day_of_week ? E0().B0().format(j10) : "";
        String format2 = z10 ? E0().s0().format(j10) : tL_messageEntityFormattedDate.long_date ? E0().h0().format(j10) : tL_messageEntityFormattedDate.short_date ? E0().C0().format(j10) : "";
        if (z10) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            str2 = calendar.get(13) != 0 ? E0().r0().format(j10) : E0().p0().format(j10);
        } else if (tL_messageEntityFormattedDate.long_time) {
            str2 = E0().r0().format(j10);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str2 = E0().p0().format(j10);
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
            str = a0(null, null, 2131742784, format2, str2);
        }
        return !isEmpty ? a0(null, null, 2131746333, format, str) : str;
    }

    public static String B(long j3) {
        long j10 = j3 * 1000;
        try {
            return a0(null, null, 2131752335, Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10))) : a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10))));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String C(int i7) {
        int i10 = (i7 / 60) / 60;
        int i11 = i7 - (i10 * 3600);
        int i12 = i11 / 60;
        int i13 = i11 - (i12 * 60);
        if (i10 != 0) {
            return String.format("%dh", Integer.valueOf(i10 + (i12 > 30 ? 1 : 0)));
        }
        if (i12 != 0) {
            return String.format("%d", Integer.valueOf(i12 + (i13 > 30 ? 1 : 0)));
        }
        return String.format("%d", Integer.valueOf(i13));
    }

    public static String D(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 != i7 || i10 != i12) {
                return (i11 + 1 == i7 && i10 == i12) ? a0(null, null, 2131748745, a0("YesterdayAtFormatted", null, 2131742844, E0().p0().format(new Date(j10)))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? a0(null, null, 2131748745, a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10)))) : a0(null, null, 2131748745, a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10))));
            }
            int currentTime = ((int) (ConnectionsManager.getInstance(p10.s0).getCurrentTime() - (j10 / 1000))) / 60;
            return currentTime < 1 ? M0(2131748744, null) : currentTime < 60 ? G(currentTime, "UpdatedMinutes", new Object[0]) : a0(null, null, 2131748745, a0("TodayAtFormatted", null, 2131744112, E0().p0().format(new Date(j10))));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String E(long j3, char c10) {
        if (j3 < 0) {
            return jg.g.m(-j3, c10, new StringBuilder("-"));
        }
        StringBuilder sb2 = new StringBuilder(String.format("%d", Long.valueOf(j3)));
        for (int length = sb2.length() - 3; length > 0; length -= 3) {
            sb2.insert(length, c10);
        }
        return sb2.toString();
    }

    public static hd E0() {
        hd hdVar;
        hd hdVar2 = d0;
        if (hdVar2 != null) {
            return hdVar2;
        }
        synchronized (hd.class) {
            try {
                hdVar = d0;
                if (hdVar == null) {
                    hdVar = new hd();
                    d0 = hdVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hdVar;
    }

    public static CharSequence F(String str, int i7, CharSequence... charSequenceArr) {
        if (str.length() == 0 || E0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        E0();
        String D = a8.p0.D(str, "_", f1(E0().A.a(i7)));
        Object[] objArr = new Object[charSequenceArr.length + 1];
        objArr[0] = Integer.valueOf(i7);
        System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
        return V(D, str.concat("_other"), 0, objArr);
    }

    public static String F0(String str) {
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

    public static String G(int i7, String str, Object... objArr) {
        if (str.length() == 0 || E0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        E0();
        String D = a8.p0.D(str, "_", f1(E0().A.a(i7)));
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = Integer.valueOf(i7);
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return a0(D, str.concat("_other"), 0, objArr2);
    }

    public static String H(char c10, String str, int i7) {
        return K(str, i7, c10, new Object[0]);
    }

    public static String I(int i7, String str) {
        return H(',', str, i7);
    }

    public static String I0(Locale locale) {
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

    public static String J(int i7, String str, Object... objArr) {
        return K(str, i7, ',', objArr);
    }

    public static String J0() {
        ed edVar = E0().B;
        if (edVar != null) {
            return edVar.c();
        }
        Locale locale = E0().y;
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

    public static String K(String str, int i7, char c10, Object... objArr) {
        try {
            if (str.length() != 0 && E0().A != null) {
                E0();
                String str2 = str + "_" + f1(E0().A.a(i7));
                int i10 = 0;
                StringBuilder sb2 = new StringBuilder(String.format("%d", Integer.valueOf(i7)));
                for (int length = sb2.length() - 3; length > 0; length -= 3) {
                    sb2.insert(length, c10);
                }
                boolean z9 = r2.a;
                String b10 = E0().Y.b(str2);
                if (b10 == null) {
                    b10 = E0().Y.b(str + "_other");
                }
                if (b10 == null) {
                    try {
                        hd E0 = E0();
                        E0.i();
                        b10 = E0.W.b(str2);
                    } catch (Exception unused) {
                    }
                }
                if (b10 == null) {
                    hd E02 = E0();
                    E02.i();
                    b10 = E02.W.b(str + "_other");
                }
                String replace = b10.replace("%d", "%1$s").replace("%1$d", "%1$s");
                int length2 = objArr.length + 1;
                Object[] objArr2 = new Object[length2];
                while (i10 < length2) {
                    objArr2[i10] = i10 == 0 ? sb2 : objArr[i10 - 1];
                    i10++;
                }
                return E0().y != null ? String.format(E0().y, replace, objArr2) : String.format(replace, objArr2);
            }
            return "LOC_ERR:".concat(str);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: ".concat(str);
        }
    }

    public static String K0(int i7, String str) {
        if (str.length() == 0 || E0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        E0();
        return E0().O0(0, a8.p0.D(str, "_", f1(E0().A.a(i7))), str.concat("_other"));
    }

    public static String L(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i7 && i10 == i12) ? a0(null, null, 2131747201, E0().p0().format(new Date(j10))) : (i11 + 1 == i7 && i10 == i12) ? a0(null, null, 2131747200, E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? a0(null, null, 2131747202, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10))) : a0(null, null, 2131747202, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String L0(int i7) {
        return M0(i7, null);
    }

    public static String M(int i7, boolean z9) {
        return a0(null, null, z9 ? 2131747159 : 2131747171, i7 < 86400 ? R(i7) : G(i7 / 86400, "Days", new Object[0]));
    }

    public static String M0(int i7, String str) {
        return E0().O0(i7, str, null);
    }

    public static String N(long j3) {
        try {
            long j10 = j3 / 60;
            long j11 = j10 / 60;
            long j12 = j11 / 24;
            long j13 = j12 / 30;
            long j14 = j12 / 365;
            return j14 >= 1 ? j14 == 1 ? M0(2131742857, null) : H(',', "YearsAgo", (int) j14) : j13 >= 1 ? j13 == 1 ? M0(2131748344, null) : H(',', "MonthsAgo", (int) j13) : j12 >= 1 ? j12 == 1 ? M0(2131751669, null) : H(',', "DaysAgo", (int) j12) : j11 >= 1 ? j11 == 1 ? M0(2131749288, null) : H(',', "HoursAgo", (int) j11) : j10 >= 1 ? j10 == 1 ? M0(2131748425, null) : H(',', "MinutesAgo", (int) j10) : M0(2131748986, null);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String N0(String str) {
        return TextUtils.isEmpty(str) ? rf.b.i("LOC_ERR:", str) : M0(0, str);
    }

    public static String O(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i7 && i10 == i12) ? a0(null, null, 2131744111, E0().p0().format(new Date(j10))) : (i11 + 1 == i7 && i10 == i12) ? a0(null, null, 2131742844, E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10))) : a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String P(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            long j11 = timeInMillis - j10;
            return j11 < 60000 ? M0(2131745358, null) : j11 < 3600000 ? G((int) (j11 / 60000), "ShortMinutesAgo", new Object[0]) : (i11 == i7 && i10 == i12) ? j11 < 43200000 ? G((int) (j11 / 3600000), "ShortHoursAgo", new Object[0]) : M0(2131745356, null) : (i11 + 1 == i7 && i10 == i12) ? M0(2131745355, null) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? E0().q0().format(new Date(j10)) : a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String Q(long j3) {
        long j10 = j3 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return E0().w0().format(new Date(j10)) + ", " + E0().p0().format(new Date(j10));
            }
            return E0().y0().format(new Date(j10)) + ", " + E0().p0().format(new Date(j10));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String Q0() {
        Locale locale = E0().z;
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

    public static String R(int i7) {
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(":");
            }
            sb2.append(i10 >= 10 ? "" : "0");
            sb2.append(i10);
        }
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        sb2.append(i11 >= 10 ? "" : "0");
        sb2.append(i11);
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        sb2.append(i12 >= 10 ? "" : "0");
        sb2.append(i12);
        return sb2.toString();
    }

    public static String S(int[] iArr, int i7) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = i7 / 1000;
            if (i11 <= 0) {
                break;
            }
            sb2.append("K");
            i10 = (i7 % 1000) / 100;
            i7 = i11;
        }
        if (iArr != null) {
            double d = (i10 / 10.0d) + i7;
            for (int i12 = 0; i12 < sb2.length(); i12++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i10 == 0 || sb2.length() <= 0) {
            if (sb2.length() == 2) {
                Locale locale = Locale.US;
                return com.google.android.recaptcha.internal.a.i(i7, "M");
            }
            Locale locale2 = Locale.US;
            return com.google.android.recaptcha.internal.a.i(i7, sb2.toString());
        }
        if (sb2.length() == 2) {
            Locale locale3 = Locale.US;
            return i7 + "." + i10 + "M";
        }
        Locale locale4 = Locale.US;
        return i7 + "." + i10 + sb2.toString();
    }

    public static String T(long j3) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i7 = calendar.get(1);
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(j10);
            if (i7 == calendar.get(1)) {
                return E0().q0().format(j10);
            }
            return E0().q0().format(j10) + ", " + calendar.get(1);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static boolean T0(File file) {
        return file != null && new File(new File(t0.h(), "malformed_locales"), file.getName()).exists();
    }

    public static CharSequence U(int i7, Object... objArr) {
        return V(null, null, i7, objArr);
    }

    public static boolean U0(int i7) {
        if (i7 == 9 || i7 == 10 || i7 == 13) {
            return true;
        }
        if (i7 >= 32 && i7 <= 55295) {
            return true;
        }
        if (i7 < 57344 || i7 > 65533) {
            return i7 >= 65536 && i7 <= 1114111;
        }
        return true;
    }

    public static CharSequence V(String str, String str2, int i7, Object... objArr) {
        String str3;
        try {
            String P0 = E0().P0(i7, str, str2);
            if (P0 == null) {
                return "LOC_ERR: " + str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P0);
            int i10 = 0;
            while (i10 < objArr.length) {
                String str4 = "s";
                Object obj = objArr[i10];
                if (obj instanceof CharSequence) {
                    str3 = (CharSequence) obj;
                } else {
                    if (obj instanceof Integer) {
                        str3 = "" + ((Integer) objArr[i10]);
                    } else if (obj instanceof Long) {
                        str3 = "" + ((Long) objArr[i10]);
                    } else {
                        str3 = obj == null ? "null" : "";
                    }
                    str4 = "d";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("%");
                i10++;
                sb2.append(i10);
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
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String W(int i7, long j3, boolean z9) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(1);
        int i11 = calendar.get(6);
        calendar.setTimeInMillis(j3 * 1000);
        int i12 = i10 == calendar.get(1) ? (z9 && calendar.get(6) == i11) ? 0 : 1 : 2;
        if (i7 == 1) {
            i12 += 3;
        } else if (i7 == 2) {
            i12 += 6;
        } else if (i7 == 3) {
            i12 += 9;
        } else if (i7 == 4) {
            i12 += 12;
        }
        return E0().x0(i12).format(calendar.getTimeInMillis());
    }

    public static String X(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            long j11 = timeInMillis - j10;
            if (j11 < 60000) {
                return M0(2131745999, null);
            }
            if (j11 >= 3600000) {
                return (i11 == i7 && i10 == i12) ? a0(null, null, 2131744111, E0().p0().format(new Date(j10))) : (i11 + 1 == i7 && i10 == i12) ? a0(null, null, 2131742844, E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10))) : a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
            int i13 = (int) (j11 / 60000);
            return G(i13, "MinutesAgo", Integer.valueOf(i13));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static void X0(String str) {
        if (r2.a) {
            a8.b("set as patched " + str + " langpack");
        }
        qp.e1().edit().putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static String Y(int i7, String str, Object... objArr) {
        return a0(str, null, i7, objArr);
    }

    public static String Z(int i7, Object... objArr) {
        return a0(null, null, i7, objArr);
    }

    public static String a(String str) {
        return str.replace(' ', (char) 160);
    }

    public static String a0(String str, String str2, int i7, Object... objArr) {
        try {
            String P0 = E0().P0(i7, str, str2);
            if (P0 != null) {
                return E0().y != null ? String.format(E0().y, P0, objArr) : String.format(P0, objArr);
            }
            return "LOC_ERR: " + str;
        } catch (Exception e10) {
            a8.g(e10, true);
            if (i7 != 0) {
                try {
                    return String.format(t0.b.getString(i7), objArr);
                } catch (Exception unused) {
                    return rf.b.i("LOC_ERR: ", str);
                }
            }
            return rf.b.i("LOC_ERR: ", str);
        }
    }

    public static String b0(String str, Object... objArr) {
        try {
            return E0().y != null ? String.format(E0().y, str, objArr) : String.format(str, objArr);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String c0(int i7) {
        if (i7 < 60) {
            return G(i7, "Seconds", new Object[0]);
        }
        if (i7 < 3600) {
            return G(i7 / 60, "Minutes", new Object[0]);
        }
        if (i7 < 86400) {
            return G((i7 / 60) / 60, "Hours", new Object[0]);
        }
        if (i7 < 604800) {
            return G(((i7 / 60) / 60) / 24, "Days", new Object[0]);
        }
        if (i7 >= 2678400) {
            return (i7 < 31536000 || i7 % 31536000 != 0) ? G((((i7 / 60) / 60) / 24) / 30, "Months", new Object[0]) : G((((i7 / 60) / 60) / 24) / 365, "Years", new Object[0]);
        }
        int i10 = ((i7 / 60) / 60) / 24;
        return i7 % 7 == 0 ? G(i10 / 7, "Weeks", new Object[0]) : a8.p0.D(G(i10 / 7, "Weeks", new Object[0]), " ", G(i10 % 7, "Days", new Object[0]));
    }

    public static String d0(int i7, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
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
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && qp.s1(i7).Z.containsKey(Long.valueOf(user.id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return M0(2131747825, "Online");
        }
        if (user == null || (userStatus = user.status) == null || userStatus.expires == 0 || t10.x(user) || (user instanceof TLRPC.TL_userEmpty)) {
            return M0(2131754951, "ALongTimeAgo");
        }
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        int i10 = user.status.expires;
        if (i10 <= currentTime) {
            return i10 == -1 ? M0(2131749177, "Invisible") : (i10 == -100 || i10 == -1000) ? M0(2131749010, "Lately") : (i10 == -101 || i10 == -1001) ? M0(2131742863, "WithinAWeek") : (i10 == -102 || i10 == -1002) ? M0(2131742864, "WithinAMonth") : w(i10, zArr2);
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        return M0(2131747825, "Online");
    }

    public static String e0(long j3, boolean z9) {
        long j10 = 1000 * j3;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            String[] strArr = {M0(2131749085, null), M0(2131750830, null), M0(2131748682, null), M0(2131754173, null), M0(2131748661, null), M0(2131749063, null), M0(2131749065, null), M0(2131753895, null), M0(2131745566, null), M0(2131747829, null), M0(2131747834, null), M0(2131751606, null)};
            if (i7 == i10 && !z9) {
                return strArr[i11];
            }
            return strArr[i11] + " " + i10;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String e1(long j3) {
        long j10 = j3 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j10) >= 31536000000L) {
                return E0().C0().format(new Date(j10));
            }
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            calendar.setTimeInMillis(j10);
            int i10 = calendar.get(6) - i7;
            if (i10 != 0 && (i10 != -1 || System.currentTimeMillis() - j10 >= 28800000)) {
                return (i10 <= -7 || i10 > -1) ? E0().q0().format(new Date(j10)) : E0().A0().format(new Date(j10));
            }
            return E0().p0().format(new Date(j10));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String f0(long j3) {
        long j10 = 1000 * j3;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i7 = calendar.get(1);
            int i10 = calendar.get(2);
            return new String[]{M0(2131749085, null), M0(2131750830, null), M0(2131748682, null), M0(2131754173, null), M0(2131748661, null), M0(2131749063, null), M0(2131749065, null), M0(2131753895, null), M0(2131745566, null), M0(2131747829, null), M0(2131747834, null), M0(2131751606, null)}[i10] + " " + calendar.get(5) + ", " + i7;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String f1(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? i7 != 16 ? "other" : "many" : "few" : "two" : "one" : "zero";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Spannable g(String str) {
        if (str instanceof Spannable) {
            ((Spannable) str).setSpan(new u31(g0.o()), 0, str.length(), 33);
            return (Spannable) str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new u31(g0.o()), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static int h(HashMap hashMap) {
        HashSet hashSet = new HashSet();
        int i7 = 0;
        for (String str : hashMap.keySet()) {
            if (str != null) {
                String k10 = str.endsWith("_other") ? com.google.android.recaptcha.internal.a.k(str, 6, 0) : (str.endsWith("_zero") || str.endsWith("_many")) ? com.google.android.recaptcha.internal.a.k(str, 5, 0) : (str.endsWith("_one") || str.endsWith("_two") || str.endsWith("_few")) ? com.google.android.recaptcha.internal.a.k(str, 4, 0) : null;
                if (k10 != null) {
                    if (!hashSet.contains(k10)) {
                        hashSet.add(k10);
                    }
                }
                i7++;
            }
        }
        hashSet.clear();
        return i7;
    }

    public static String i0(int i7, String str) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return M0(i7, null);
        }
        try {
            return new Locale("", str).getDisplayCountry(E0().y);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static String j0() {
        ed edVar = E0().B;
        return (edVar == null || TextUtils.isEmpty(edVar.a)) ? M0(2131749048, "LanguageName") : edVar.a;
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
        if (g0 != null) {
            return;
        }
        int i7 = iz.s1;
        if (i7 != 0) {
            g0 = Boolean.valueOf(i7 == 2);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) t0.b.getSystemService("phone");
            if (telephonyManager != null) {
                String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                if (!"US".equals(upperCase)) {
                    if (!"GB".equals(upperCase)) {
                        if (!"MM".equals(upperCase)) {
                            if ("LR".equals(upperCase)) {
                            }
                            g0 = Boolean.valueOf(r1);
                        }
                    }
                }
                r1 = true;
                g0 = Boolean.valueOf(r1);
            }
        } catch (Exception e10) {
            g0 = Boolean.FALSE;
            a8.g(e10, true);
        }
    }

    public static int l0(ed edVar, TLRPC.TL_langPackDifference tL_langPackDifference) {
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        if (lowerCase.equals(edVar.c)) {
            return 0;
        }
        return lowerCase.equals(edVar.e) ? 1 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r6 != false) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m(String str, boolean z9) {
        String str2;
        int i7;
        int i10;
        boolean z10;
        String substring;
        int indexOf;
        int length = str.length();
        StringBuilder sb2 = null;
        int i11 = 0;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt == '<') {
                str2 = "&lt;";
                if (z9 && str.startsWith("<![CDATA[", i11) && (indexOf = str.indexOf("]]>", i11 + 9)) >= 0) {
                    i10 = ((indexOf + 3) - i11) - 1;
                    str2 = null;
                }
                i10 = 0;
            } else {
                if (charAt == '>') {
                    str2 = "&gt;";
                } else if (charAt == '&') {
                    if (z9) {
                        int i12 = i11 + 1;
                        int indexOf2 = str.indexOf(59, i12);
                        if (indexOf2 >= 0 && indexOf2 - i11 <= 9) {
                            substring = str.substring(i12, indexOf2);
                            substring.getClass();
                            switch (substring) {
                                case "gt":
                                case "lt":
                                case "amp":
                                case "apos":
                                case "quot":
                                    z10 = true;
                                    break;
                                default:
                                    if (substring.length() >= 2 && substring.charAt(0) == '#') {
                                        boolean z11 = substring.charAt(1) == 'x';
                                        int i13 = z11 ? 2 : 1;
                                        if (i13 < substring.length()) {
                                            int i14 = 0;
                                            while (i13 < substring.length()) {
                                                int i15 = 16;
                                                int digit = Character.digit(substring.charAt(i13), z11 ? 16 : 10);
                                                if (digit >= 0 && substring.charAt(i13) <= 'f') {
                                                    if (!z11) {
                                                        i15 = 10;
                                                    }
                                                    i14 = (i14 * i15) + digit;
                                                    i13++;
                                                }
                                            }
                                            z10 = U0(i14);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                        z10 = false;
                    }
                    str2 = "&amp;";
                } else if (Character.isHighSurrogate(charAt) && (i7 = i11 + 1) < length && Character.isLowSurrogate(str.charAt(i7))) {
                    str2 = null;
                    i10 = 1;
                } else {
                    if (!U0(charAt)) {
                        str2 = "";
                    }
                    str2 = null;
                }
                i10 = 0;
            }
            if (str2 != null && sb2 == null) {
                sb2 = new StringBuilder(length + 16);
                sb2.append((CharSequence) str, 0, i11);
            }
            if (sb2 != null) {
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append((CharSequence) str, i11, i11 + i10 + 1);
                }
            }
            i11 = i11 + i10 + 1;
        }
        return sb2 != null ? sb2.toString() : str;
    }

    public static String n(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence);
        int length = sb2.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = sb2.charAt(i7);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != ',') {
                int i10 = 0;
                while (i10 < 18) {
                    int i11 = 0;
                    while (true) {
                        char[] cArr = f0[i10];
                        if (i11 >= cArr.length) {
                            break;
                        }
                        if (charAt == cArr[i11]) {
                            sb2.setCharAt(i7, e0[i11]);
                            i10 = 18;
                            break;
                        }
                        i11++;
                    }
                    i10++;
                }
            }
        }
        return sb2.toString();
    }

    public static String o(int i7) {
        if (i7 <= 3600) {
            return i7 > 60 ? G(i7 / 60, "Minutes", new Object[0]) : G(i7, "Seconds", new Object[0]);
        }
        String G = G(i7 / 3600, "Hours", new Object[0]);
        int i10 = (i7 % 3600) / 60;
        if (i10 <= 0) {
            return G;
        }
        StringBuilder j3 = rf.b.j(G, ", ");
        j3.append(G(i10, "Minutes", new Object[0]));
        return j3.toString();
    }

    public static String r(long j3, boolean z9) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i7 && i10 == i12) ? z9 ? M0(2131745356, null) : E0().p0().format(new Date(j10)) : (i11 + 1 == i7 && i10 == i12) ? M0(2131742846, "Yesterday") : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? E0().q0().format(new Date(j10)) : E0().C0().format(new Date(j10));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDate";
        }
    }

    public static String s(long j3, boolean z9) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i7 && i10 == i12) ? z9 ? a0(null, null, 2131744112, E0().p0().format(new Date(j10))) : a0(null, null, 2131744111, E0().p0().format(new Date(j10))) : (i11 + 1 == i7 && i10 == i12) ? a0(null, null, 2131742844, E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? a0(null, null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10))) : a0(null, null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String t(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i7 && i10 == i12) {
                return E0().p0().format(new Date(j10));
            }
            if (i11 + 1 == i7 && i10 == i12) {
                return a0(null, null, 2131742844, E0().p0().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) >= 31536000000L) {
                return a0(null, null, 2131742784, E0().h0().format(new Date(j10)), E0().p0().format(new Date(j10)));
            }
            hd E0 = E0();
            if (E0.m == null) {
                synchronized (E0) {
                    try {
                        if (E0.m == null) {
                            Locale locale = E0.y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.m = k(locale, E0.O0(2131742786, "chatDateShort", null), "d MMM");
                        }
                    } finally {
                    }
                }
            }
            return a0(null, null, 2131742784, E0.m.format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String u(long j3, boolean z9) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i7 = calendar.get(1);
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(j10);
            if (z9) {
                if (i7 != calendar.get(1)) {
                }
                return E0().g0().format(j10);
            }
            if (z9 || Math.abs(System.currentTimeMillis() - j10) >= 31536000000L) {
                return E0().h0().format(j10);
            }
            return E0().g0().format(j10);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String v(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            return i7 == calendar.get(1) ? E0().n0().format(new Date(j10)) : E0().m0().format(new Date(j10));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String w(long j3, boolean[] zArr) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            int i11 = calendar.get(11);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            int i14 = calendar.get(11);
            if (i12 == i7 && i10 == i13) {
                return a0(null, null, 2131749016, a0("TodayAtFormatted", null, 2131744112, E0().p0().format(new Date(j10))));
            }
            if (i12 + 1 != i7 || i10 != i13) {
                return Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? a0("LastSeenDateFormatted", null, 2131749019, a0("formatDateAtTime", null, 2131742784, E0().q0().format(new Date(j10)), E0().p0().format(new Date(j10)))) : a0("LastSeenDateFormatted", null, 2131749019, a0("formatDateAtTime", null, 2131742784, E0().C0().format(new Date(j10)), E0().p0().format(new Date(j10))));
            }
            if (zArr == null) {
                return a0(null, null, 2131749016, a0("YesterdayAtFormatted", null, 2131742844, E0().p0().format(new Date(j10))));
            }
            zArr[0] = true;
            return (i11 > 6 || i14 <= 18 || !c0) ? a0(null, null, 2131742844, E0().p0().format(new Date(j10))) : a0(null, null, 2131749016, E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String x(long j3, boolean z9) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i7 && i10 == i12 && z9) ? a0(null, null, 2131744111, E0().p0().format(new Date(j10))) : (i11 + 1 == i7 && i10 == i12 && z9) ? a0(null, null, 2131742844, E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? a0(null, null, 2131742784, E0().g0().format(new Date(j10)), E0().p0().format(new Date(j10))) : a0(null, null, 2131742784, E0().h0().format(new Date(j10)), E0().p0().format(new Date(j10)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String y(float f10, int i7, Boolean bool) {
        l();
        if ((bool == null || !bool.booleanValue()) && !(bool == null && g0.booleanValue())) {
            if (f10 < 1000.0f) {
                return i7 != 0 ? i7 != 1 ? a0("MetersShort", null, 2131748441, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : a0("MetersFromYou2", null, 2131748442, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : a0("MetersAway2", null, 2131748443, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
            }
            String format = f10 % 1000.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f10 / 1000.0f))) : String.format("%.2f", Float.valueOf(f10 / 1000.0f));
            return i7 != 0 ? i7 != 1 ? a0("KMetersShort", null, 2131749060, format) : a0("KMetersFromYou2", null, 2131749061, format) : a0("KMetersAway2", null, 2131749062, format);
        }
        float f11 = f10 * 3.28084f;
        if (f11 < 1000.0f) {
            return i7 != 0 ? i7 != 1 ? a0("FootsShort", null, 2131750602, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11)))) : a0("FootsFromYou", null, 2131750603, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11)))) : a0("FootsAway", null, 2131750604, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11))));
        }
        String format2 = f11 % 5280.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f11 / 5280.0f))) : String.format("%.2f", Float.valueOf(f11 / 5280.0f));
        return i7 != 0 ? i7 != 1 ? a0("MilesShort", null, 2131748426, format2) : a0("MilesFromYou", null, 2131748427, format2) : a0("MilesAway", null, 2131748428, format2);
    }

    public static String z(int i7) {
        if (i7 <= 0) {
            return G(0, "Seconds", new Object[0]);
        }
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            sb2.append(G(i10, "Hours", new Object[0]));
        }
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(G(i11, "Minutes", new Object[0]));
        }
        if (i12 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(G(i12, "Seconds", new Object[0]));
        }
        return sb2.toString();
    }

    public final FastDateFormat A0() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.d = k(locale, O0(2131742762, "formatterWeek", null), "EEE");
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final FastDateFormat B0() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.e = k(locale, O0(2131742761, "formatterWeekLong", null), "EEEE");
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final FastDateFormat C0() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.g = k(locale, O0(2131742760, "formatterYear", null), "dd.MM.yy");
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public final FastDateFormat D0() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.h = k(locale, O0(2131742759, "formatterYearMax", null), "dd.MM.yyyy");
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public final ed G0(String str) {
        if (str == null) {
            return null;
        }
        return (ed) this.N.get(str.toLowerCase().replace("-", "_"));
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap H0(File file, boolean z9, boolean z10, boolean z11) {
        HashMap hashMap;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                if (!file.exists()) {
                    return new HashMap();
                }
                hashMap = new HashMap(10000);
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            newPullParser.setInput(fileInputStream, "UTF-8");
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
                                        if (z9) {
                                            str3 = m(trim, false);
                                        } else {
                                            String replace = trim.replace("\\n", "\n").replace("\\", "");
                                            str3 = replace.replace("&lt;", "<");
                                            if (z11 && !this.E && !str3.equals(replace)) {
                                                this.E = true;
                                                a8.b("getLocaleFileStrings: value != old, reloadLastFile = true;");
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
                                fileInputStream.close();
                                return hashMap;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return hashMap;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            try {
                                File file2 = new File(t0.h(), "malformed_locales/");
                                file2.mkdirs();
                                g0.E(file, new File(file2, file.getName()));
                            } catch (Exception unused) {
                            }
                            a8.g(e, true);
                            if (z11) {
                                a8.b("getLocaleFileStrings: error, reloadLastFile = true;");
                                this.E = true;
                            }
                            if (z10) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Exception e12) {
                                        a8.g(e12, true);
                                    }
                                }
                                return null;
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e13) {
                                    a8.g(e13, true);
                                }
                            }
                            return hashMap != null ? hashMap : new HashMap();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e14) {
                                a8.g(e14, true);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e15) {
                    e = e15;
                    fileInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream2 != null) {
                }
                throw th;
            }
        } catch (Exception e16) {
            e = e16;
            hashMap = null;
            fileInputStream = null;
        }
    }

    public final String O0(int i7, String str, String str2) {
        String P0 = P0(i7, str, str2);
        return P0 == null ? rf.b.i("LOC_ERR:", str) : P0;
    }

    public final String P0(int i7, String str, String str2) {
        Context context = t0.b;
        boolean z9 = r2.a;
        String c10 = this.Y.c(i7, context, str);
        if (c10 != null) {
            return c10;
        }
        String b10 = this.Y.b(str2);
        if (b10 != null) {
            return b10;
        }
        i();
        String c11 = this.W.c(i7, context, str);
        return c11 != null ? c11 : this.W.b(str2);
    }

    public final String R0(String str) {
        return S0(str, true, false);
    }

    public final String S0(String str, boolean z9, boolean z10) {
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
        int i7 = 0;
        boolean z11 = false;
        while (i7 < length) {
            int i10 = i7 + 1;
            String substring = str.substring(i7, i10);
            if (z10) {
                String lowerCase = substring.toLowerCase();
                z11 = !substring.equals(lowerCase);
                substring = lowerCase;
            }
            String str2 = (String) this.G.get(substring);
            if (str2 == null && z9) {
                str2 = (String) this.H.get(substring);
            }
            if (str2 != null) {
                if (z10 && z11) {
                    if (str2.length() > 1) {
                        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                    } else {
                        str2 = str2.toUpperCase();
                    }
                }
                sb2.append(str2);
            } else {
                if (z10) {
                    char charAt = substring.charAt(0);
                    if ((charAt < 'a' || charAt > 'z' || charAt < '0' || charAt > '9') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/') {
                        return null;
                    }
                    if (z11) {
                        substring = substring.toUpperCase();
                    }
                }
                sb2.append(substring);
            }
            i7 = i10;
        }
        return sb2.toString();
    }

    public final void V0(int i7, boolean z9) {
        if (this.I) {
            return;
        }
        this.I = true;
        ConnectionsManager.getInstance(i7).sendRequest(new TLRPC.TL_langpack_getLanguages(), new bd(this, z9, i7), 8);
    }

    public final void W0(Configuration configuration) {
        if (this.D) {
            return;
        }
        c0 = DateFormat.is24HourFormat(t0.b);
        Locale locale = configuration.locale;
        this.z = locale;
        if (this.C != null) {
            ed edVar = this.B;
            this.B = null;
            d(edVar, false, false, p10.s0);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.y.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                Y0();
            }
            this.y = locale;
            ed edVar2 = this.B;
            if (edVar2 != null && !TextUtils.isEmpty(edVar2.f)) {
                this.A = (fd) this.x.get(this.B.f);
            }
            if (this.A == null) {
                fd fdVar = (fd) this.x.get(this.y.getLanguage());
                this.A = fdVar;
                if (fdVar == null) {
                    this.A = (fd) this.x.get("en");
                }
            }
        }
        String Q0 = Q0();
        String str = this.F;
        if (str != null && !Q0.equals(str)) {
            this.F = Q0;
            ConnectionsManager.setSystemLangCode(Q0);
        }
        i();
    }

    public final void Y0() {
        ed edVar;
        Locale locale = this.y;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i7 = 0;
        a0 = (lowerCase.length() == 2 && (lowerCase.equals("ar") || lowerCase.equals("fa") || lowerCase.equals("he") || lowerCase.equals("iw"))) || lowerCase.startsWith("ar_") || lowerCase.startsWith("fa_") || lowerCase.startsWith("he_") || lowerCase.startsWith("iw_") || ((edVar = this.B) != null && edVar.g);
        b0 = lowerCase.equals("ko") ? 2 : 1;
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
            if (i7 >= fastDateFormatArr.length) {
                return;
            }
            fastDateFormatArr[i7] = null;
            i7++;
        }
    }

    public final void Z0(int i7, String str, boolean z9, wc wcVar) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            ed edVar = this.B;
            if (edVar == null) {
                return;
            }
            if (!str2.equals(edVar.c) && !str2.equals(this.B.e)) {
                return;
            }
        }
        f(this.B, str2, z9, i7, wcVar);
    }

    public final void a1() {
        SharedPreferences.Editor edit = t0.b.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            String f10 = ((ed) this.O.get(i7)).f();
            if (f10 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f10);
            }
        }
        edit.putString("locales", sb2.toString());
        sb2.setLength(0);
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            String f11 = ((ed) this.L.get(i10)).f();
            if (f11 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f11);
            }
        }
        edit.putString("remote", sb2.toString());
        sb2.setLength(0);
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            String f12 = ((ed) this.K.get(i11)).f();
            if (f12 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(f12);
            }
        }
        edit.putString("unofficial", sb2.toString());
        edit.commit();
    }

    public final void b(String[] strArr, fd fdVar) {
        for (String str : strArr) {
            this.x.put(str, fdVar);
        }
    }

    public final void b1(final ed edVar, final TLRPC.TL_langPackDifference tL_langPackDifference, final int i7, final boolean z9, final Runnable runnable) {
        int i10;
        boolean z10 = true;
        if (tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty() || edVar == null || edVar.h()) {
            StringBuilder sb2 = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
            sb2.append(tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty());
            sb2.append("; locale is local or null=");
            if (edVar != null && !edVar.h()) {
                z10 = false;
            }
            sb2.append(z10);
            a8.b(sb2.toString());
            if (tL_langPackDifference != null && edVar != null && !edVar.h() && tL_langPackDifference.from_version != 0) {
                int l02 = l0(edVar, tL_langPackDifference);
                int i11 = l02 == 0 ? edVar.h : edVar.i;
                if (l02 != -1 && tL_langPackDifference.from_version <= i11 && i11 < (i10 = tL_langPackDifference.version)) {
                    if (l02 == 0) {
                        edVar.h = i10;
                    } else {
                        edVar.i = i10;
                    }
                    a1();
                }
            }
            Y0();
            qs.e().k(qs.x4, new Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final int l03 = l0(edVar, tL_langPackDifference);
        if (l03 == -1) {
            a8.b("saveRemoteLocaleStrings: unknown language " + tL_langPackDifference.lang_code + " (locale short=" + edVar.c + ", base=" + edVar.e + ")");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final String str = l03 == 0 ? edVar.c : edVar.e;
        final int i12 = l03 == 0 ? edVar.h : edVar.i;
        File e10 = l03 == 0 ? edVar.e() : edVar.d();
        if (e10 == null) {
            org.telegram.ui.Cells.f1.u(tL_langPackDifference.lang_code, new StringBuilder("saveRemoteLocaleStrings: no file for "));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final File d = !edVar.g() ? null : l03 == 0 ? edVar.d() : edVar.e();
        if (this.R == null) {
            this.R = new q5("langpackQueue", true);
        }
        final File file = e10;
        this.R.postRunnable(new Runnable() { // from class: org.telegram.messenger.zc
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x034d  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00ec A[Catch: Exception -> 0x0283, TRY_LEAVE, TryCatch #5 {Exception -> 0x0283, blocks: (B:11:0x0036, B:31:0x00e4, B:33:0x00ec, B:39:0x010f, B:121:0x0086, B:124:0x00b1, B:127:0x00bd), top: B:10:0x0036 }] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x03c9  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x02e7 A[Catch: all -> 0x030b, LOOP:1: B:91:0x02e1->B:93:0x02e7, LOOP_END, TryCatch #4 {all -> 0x030b, blocks: (B:90:0x02c3, B:91:0x02e1, B:93:0x02e7, B:95:0x030e), top: B:89:0x02c3, outer: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:99:0x032b A[Catch: Exception -> 0x034a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x034a, blocks: (B:88:0x02aa, B:96:0x031d, B:99:0x032b, B:104:0x0355, B:105:0x035d, B:106:0x0366, B:108:0x036c, B:117:0x03c0, B:118:0x03c3, B:90:0x02c3, B:91:0x02e1, B:93:0x02e7, B:95:0x030e), top: B:87:0x02aa, inners: #4 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int[] iArr;
                int i13;
                boolean z11;
                File file2;
                final HashMap hashMap;
                int i14;
                HashMap hashMap2;
                int i15;
                boolean z12;
                FileOutputStream fileOutputStream;
                boolean z13;
                int i16;
                Object[] objArr;
                String str2;
                final TLRPC.TL_langPackDifference tL_langPackDifference2 = tL_langPackDifference;
                boolean z14 = true;
                int[] iArr2 = new int[1];
                int i17 = l03;
                boolean z15 = false;
                Object[] objArr2 = i17 == 1;
                final hd hdVar = hd.this;
                HashMap hashMap3 = hdVar.S;
                File file3 = file;
                Integer num = (Integer) hashMap3.get(file3.getPath());
                int i18 = i12;
                if (num != null && num.intValue() > i18) {
                    i18 = num.intValue();
                }
                iArr2[0] = 0;
                try {
                    i14 = 2;
                    try {
                    } catch (Exception e11) {
                        e = e11;
                        iArr = iArr2;
                        i13 = i17;
                        z11 = true;
                        file2 = null;
                        a8.g(e, z11);
                        if (file2 != null) {
                        }
                        hashMap = null;
                        final ed edVar2 = edVar;
                        final String str3 = str;
                        final boolean z16 = z9;
                        final int i19 = i7;
                        final Runnable runnable2 = runnable;
                        final int[] iArr3 = iArr;
                        final int i20 = i13;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                            @Override // java.lang.Runnable
                            public final void run() {
                                hd hdVar2 = hd.this;
                                HashMap hashMap4 = hashMap;
                                int[] iArr4 = iArr3;
                                ed edVar3 = edVar2;
                                String str4 = str3;
                                boolean z17 = z16;
                                int i21 = i19;
                                Runnable runnable3 = runnable2;
                                int i22 = i20;
                                TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                if (hashMap4 == null) {
                                    int i23 = iArr4[0];
                                    if (i23 == 1 || i23 == 2) {
                                        hdVar2.f(edVar3, str4, i23 == 2 || z17, i21, runnable3);
                                        return;
                                    } else {
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if (i22 == 0) {
                                    edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                                } else {
                                    edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                                }
                                hdVar2.a1();
                                try {
                                    if (hdVar2.B == edVar3) {
                                        String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                        Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                        hdVar2.C = edVar3.c;
                                        SharedPreferences.Editor edit = qp.e1().edit();
                                        edit.putString("language", edVar3.b());
                                        edit.commit();
                                        si.a aVar = new si.a();
                                        aVar.a(hashMap4);
                                        hdVar2.Y = new si.b(aVar);
                                        hdVar2.Z = hd.h(hashMap4);
                                        hdVar2.y = locale;
                                        hdVar2.B = edVar3;
                                        if (!TextUtils.isEmpty(edVar3.f)) {
                                            hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                        }
                                        if (hdVar2.A == null) {
                                            fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                            hdVar2.A = fdVar;
                                            if (fdVar == null) {
                                                hdVar2.A = (fd) hdVar2.x.get("en");
                                            }
                                        }
                                        hdVar2.D = true;
                                        Locale.setDefault(hdVar2.y);
                                        Configuration configuration = new Configuration();
                                        configuration.locale = hdVar2.y;
                                        t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                        hdVar2.D = false;
                                        qy0.s = false;
                                    } else {
                                        a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                    hdVar2.D = false;
                                }
                                hdVar2.Y0();
                                qs.e().k(qs.x4, new Object[0]);
                                if (runnable3 != null) {
                                    runnable3.run();
                                }
                            }
                        });
                    }
                } catch (Exception e12) {
                    e = e12;
                    iArr = iArr2;
                }
                if (tL_langPackDifference2.from_version != 0) {
                    a8.b("saveRemoteLocaleStrings: difference is from version " + tL_langPackDifference2.from_version + " to " + tL_langPackDifference2.version + " ours " + i18);
                    if (tL_langPackDifference2.version <= i18) {
                        a8.b("saveRemoteLocaleStrings: difference is not newer than ours, skip");
                    } else if (tL_langPackDifference2.from_version > i18) {
                        a8.b("saveRemoteLocaleStrings: difference starts after ours, request the missing part");
                        iArr2[0] = 1;
                    } else {
                        HashMap H0 = file3.exists() ? hdVar.H0(file3, true, true, false) : null;
                        if (H0 != null) {
                            hashMap2 = H0;
                            i15 = 0;
                            while (i15 < tL_langPackDifference2.strings.size()) {
                            }
                            z12 = z15;
                            iArr = iArr2;
                            Object[] objArr3 = objArr2;
                            i13 = i17;
                            file2 = new File(file3.getPath() + ".tmp");
                            a8.b("save locale file to " + file2);
                            fileOutputStream = new FileOutputStream(file2);
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8));
                            bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                            bufferedWriter.write("<resources>\n");
                            while (r4.hasNext()) {
                            }
                            bufferedWriter.write("</resources>");
                            bufferedWriter.flush();
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            hashMap = hdVar.H0(file2, z12, true, z12);
                            if (hashMap != null) {
                            }
                            hashMap = null;
                            final ed edVar22 = edVar;
                            final String str32 = str;
                            final boolean z162 = z9;
                            final int i192 = i7;
                            final Runnable runnable22 = runnable;
                            final int[] iArr32 = iArr;
                            final int i202 = i13;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hd hdVar2 = hd.this;
                                    HashMap hashMap4 = hashMap;
                                    int[] iArr4 = iArr32;
                                    ed edVar3 = edVar22;
                                    String str4 = str32;
                                    boolean z17 = z162;
                                    int i21 = i192;
                                    Runnable runnable3 = runnable22;
                                    int i22 = i202;
                                    TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                    if (hashMap4 == null) {
                                        int i23 = iArr4[0];
                                        if (i23 == 1 || i23 == 2) {
                                            hdVar2.f(edVar3, str4, i23 == 2 || z17, i21, runnable3);
                                            return;
                                        } else {
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (i22 == 0) {
                                        edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                                    } else {
                                        edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                                    }
                                    hdVar2.a1();
                                    try {
                                        if (hdVar2.B == edVar3) {
                                            String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                            Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                            hdVar2.C = edVar3.c;
                                            SharedPreferences.Editor edit = qp.e1().edit();
                                            edit.putString("language", edVar3.b());
                                            edit.commit();
                                            si.a aVar = new si.a();
                                            aVar.a(hashMap4);
                                            hdVar2.Y = new si.b(aVar);
                                            hdVar2.Z = hd.h(hashMap4);
                                            hdVar2.y = locale;
                                            hdVar2.B = edVar3;
                                            if (!TextUtils.isEmpty(edVar3.f)) {
                                                hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                            }
                                            if (hdVar2.A == null) {
                                                fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                                hdVar2.A = fdVar;
                                                if (fdVar == null) {
                                                    hdVar2.A = (fd) hdVar2.x.get("en");
                                                }
                                            }
                                            hdVar2.D = true;
                                            Locale.setDefault(hdVar2.y);
                                            Configuration configuration = new Configuration();
                                            configuration.locale = hdVar2.y;
                                            t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                            hdVar2.D = false;
                                            qy0.s = false;
                                        } else {
                                            a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                        }
                                    } catch (Exception e122) {
                                        a8.g(e122, true);
                                        hdVar2.D = false;
                                    }
                                    hdVar2.Y0();
                                    qs.e().k(qs.x4, new Object[0]);
                                    if (runnable3 != null) {
                                        runnable3.run();
                                    }
                                }
                            });
                        }
                        a8.b("saveRemoteLocaleStrings: can't read " + file3 + ", reload the whole langpack");
                        iArr2[0] = 2;
                    }
                    iArr = iArr2;
                    i13 = i17;
                    hashMap = null;
                    final ed edVar222 = edVar;
                    final String str322 = str;
                    final boolean z1622 = z9;
                    final int i1922 = i7;
                    final Runnable runnable222 = runnable;
                    final int[] iArr322 = iArr;
                    final int i2022 = i13;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                        @Override // java.lang.Runnable
                        public final void run() {
                            hd hdVar2 = hd.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr322;
                            ed edVar3 = edVar222;
                            String str4 = str322;
                            boolean z17 = z1622;
                            int i21 = i1922;
                            Runnable runnable3 = runnable222;
                            int i22 = i2022;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i23 = iArr4[0];
                                if (i23 == 1 || i23 == 2) {
                                    hdVar2.f(edVar3, str4, i23 == 2 || z17, i21, runnable3);
                                    return;
                                } else {
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i22 == 0) {
                                edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                            } else {
                                edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                            }
                            hdVar2.a1();
                            try {
                                if (hdVar2.B == edVar3) {
                                    String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    hdVar2.C = edVar3.c;
                                    SharedPreferences.Editor edit = qp.e1().edit();
                                    edit.putString("language", edVar3.b());
                                    edit.commit();
                                    si.a aVar = new si.a();
                                    aVar.a(hashMap4);
                                    hdVar2.Y = new si.b(aVar);
                                    hdVar2.Z = hd.h(hashMap4);
                                    hdVar2.y = locale;
                                    hdVar2.B = edVar3;
                                    if (!TextUtils.isEmpty(edVar3.f)) {
                                        hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                    }
                                    if (hdVar2.A == null) {
                                        fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                        hdVar2.A = fdVar;
                                        if (fdVar == null) {
                                            hdVar2.A = (fd) hdVar2.x.get("en");
                                        }
                                    }
                                    hdVar2.D = true;
                                    Locale.setDefault(hdVar2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = hdVar2.y;
                                    t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                    hdVar2.D = false;
                                    qy0.s = false;
                                } else {
                                    a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e122) {
                                a8.g(e122, true);
                                hdVar2.D = false;
                            }
                            hdVar2.Y0();
                            qs.e().k(qs.x4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                a8.b("saveRemoteLocaleStrings: difference is straight from the beginning, version " + tL_langPackDifference2.version + " ours " + i18);
                if (tL_langPackDifference2.version < i18 && !hd.T0(file3) && file3.exists() && hdVar.H0(file3, true, true, false) != null) {
                    a8.b("saveRemoteLocaleStrings: whole langpack is older than ours, skip");
                    iArr = iArr2;
                    i13 = i17;
                    hashMap = null;
                    final ed edVar2222 = edVar;
                    final String str3222 = str;
                    final boolean z16222 = z9;
                    final int i19222 = i7;
                    final Runnable runnable2222 = runnable;
                    final int[] iArr3222 = iArr;
                    final int i20222 = i13;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                        @Override // java.lang.Runnable
                        public final void run() {
                            hd hdVar2 = hd.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr3222;
                            ed edVar3 = edVar2222;
                            String str4 = str3222;
                            boolean z17 = z16222;
                            int i21 = i19222;
                            Runnable runnable3 = runnable2222;
                            int i22 = i20222;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i23 = iArr4[0];
                                if (i23 == 1 || i23 == 2) {
                                    hdVar2.f(edVar3, str4, i23 == 2 || z17, i21, runnable3);
                                    return;
                                } else {
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i22 == 0) {
                                edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                            } else {
                                edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                            }
                            hdVar2.a1();
                            try {
                                if (hdVar2.B == edVar3) {
                                    String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    hdVar2.C = edVar3.c;
                                    SharedPreferences.Editor edit = qp.e1().edit();
                                    edit.putString("language", edVar3.b());
                                    edit.commit();
                                    si.a aVar = new si.a();
                                    aVar.a(hashMap4);
                                    hdVar2.Y = new si.b(aVar);
                                    hdVar2.Z = hd.h(hashMap4);
                                    hdVar2.y = locale;
                                    hdVar2.B = edVar3;
                                    if (!TextUtils.isEmpty(edVar3.f)) {
                                        hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                    }
                                    if (hdVar2.A == null) {
                                        fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                        hdVar2.A = fdVar;
                                        if (fdVar == null) {
                                            hdVar2.A = (fd) hdVar2.x.get("en");
                                        }
                                    }
                                    hdVar2.D = true;
                                    Locale.setDefault(hdVar2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = hdVar2.y;
                                    t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                    hdVar2.D = false;
                                    qy0.s = false;
                                } else {
                                    a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e122) {
                                a8.g(e122, true);
                                hdVar2.D = false;
                            }
                            hdVar2.Y0();
                            qs.e().k(qs.x4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                hashMap2 = new HashMap();
                i15 = 0;
                while (i15 < tL_langPackDifference2.strings.size()) {
                    TLRPC.LangPackString langPackString = tL_langPackDifference2.strings.get(i15);
                    if (langPackString instanceof TLRPC.TL_langPackString) {
                        hashMap2.put(langPackString.key, hd.m(langPackString.value, z14));
                        z13 = z15;
                        iArr = iArr2;
                        i16 = i15;
                        objArr = objArr2;
                        i13 = i17;
                    } else {
                        z13 = z15;
                        iArr = iArr2;
                        i16 = i15;
                        if (langPackString instanceof TLRPC.TL_langPackStringPluralized) {
                            try {
                                StringBuilder sb3 = new StringBuilder();
                                objArr = objArr2;
                                sb3.append(langPackString.key);
                                sb3.append("_zero");
                                String sb4 = sb3.toString();
                                String str4 = langPackString.zero_value;
                                if (str4 != null) {
                                    i13 = i17;
                                    try {
                                        str2 = hd.m(str4, true);
                                    } catch (Exception e13) {
                                        e = e13;
                                        file2 = null;
                                        z11 = true;
                                        a8.g(e, z11);
                                        if (file2 != null) {
                                        }
                                        hashMap = null;
                                        final ed edVar22222 = edVar;
                                        final String str32222 = str;
                                        final boolean z162222 = z9;
                                        final int i192222 = i7;
                                        final Runnable runnable22222 = runnable;
                                        final int[] iArr32222 = iArr;
                                        final int i202222 = i13;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                hd hdVar2 = hd.this;
                                                HashMap hashMap4 = hashMap;
                                                int[] iArr4 = iArr32222;
                                                ed edVar3 = edVar22222;
                                                String str42 = str32222;
                                                boolean z17 = z162222;
                                                int i21 = i192222;
                                                Runnable runnable3 = runnable22222;
                                                int i22 = i202222;
                                                TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                                if (hashMap4 == null) {
                                                    int i23 = iArr4[0];
                                                    if (i23 == 1 || i23 == 2) {
                                                        hdVar2.f(edVar3, str42, i23 == 2 || z17, i21, runnable3);
                                                        return;
                                                    } else {
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                if (i22 == 0) {
                                                    edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                                                } else {
                                                    edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                                                }
                                                hdVar2.a1();
                                                try {
                                                    if (hdVar2.B == edVar3) {
                                                        String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                                        Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                                        hdVar2.C = edVar3.c;
                                                        SharedPreferences.Editor edit = qp.e1().edit();
                                                        edit.putString("language", edVar3.b());
                                                        edit.commit();
                                                        si.a aVar = new si.a();
                                                        aVar.a(hashMap4);
                                                        hdVar2.Y = new si.b(aVar);
                                                        hdVar2.Z = hd.h(hashMap4);
                                                        hdVar2.y = locale;
                                                        hdVar2.B = edVar3;
                                                        if (!TextUtils.isEmpty(edVar3.f)) {
                                                            hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                                        }
                                                        if (hdVar2.A == null) {
                                                            fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                                            hdVar2.A = fdVar;
                                                            if (fdVar == null) {
                                                                hdVar2.A = (fd) hdVar2.x.get("en");
                                                            }
                                                        }
                                                        hdVar2.D = true;
                                                        Locale.setDefault(hdVar2.y);
                                                        Configuration configuration = new Configuration();
                                                        configuration.locale = hdVar2.y;
                                                        t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                                        hdVar2.D = false;
                                                        qy0.s = false;
                                                    } else {
                                                        a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                                    }
                                                } catch (Exception e122) {
                                                    a8.g(e122, true);
                                                    hdVar2.D = false;
                                                }
                                                hdVar2.Y0();
                                                qs.e().k(qs.x4, new Object[0]);
                                                if (runnable3 != null) {
                                                    runnable3.run();
                                                }
                                            }
                                        });
                                    }
                                } else {
                                    i13 = i17;
                                    str2 = "";
                                }
                                hashMap2.put(sb4, str2);
                                String str5 = langPackString.key + "_one";
                                String str6 = langPackString.one_value;
                                hashMap2.put(str5, str6 != null ? hd.m(str6, true) : "");
                                String str7 = langPackString.key + "_two";
                                String str8 = langPackString.two_value;
                                hashMap2.put(str7, str8 != null ? hd.m(str8, true) : "");
                                String str9 = langPackString.key + "_few";
                                String str10 = langPackString.few_value;
                                hashMap2.put(str9, str10 != null ? hd.m(str10, true) : "");
                                String str11 = langPackString.key + "_many";
                                String str12 = langPackString.many_value;
                                hashMap2.put(str11, str12 != null ? hd.m(str12, true) : "");
                                String str13 = langPackString.key + "_other";
                                String str14 = langPackString.other_value;
                                hashMap2.put(str13, str14 != null ? hd.m(str14, true) : "");
                            } catch (Exception e14) {
                                e = e14;
                                i13 = i17;
                                file2 = null;
                                z11 = true;
                                a8.g(e, z11);
                                if (file2 != null) {
                                    file2.delete();
                                }
                                hashMap = null;
                                final ed edVar222222 = edVar;
                                final String str322222 = str;
                                final boolean z1622222 = z9;
                                final int i1922222 = i7;
                                final Runnable runnable222222 = runnable;
                                final int[] iArr322222 = iArr;
                                final int i2022222 = i13;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hd hdVar2 = hd.this;
                                        HashMap hashMap4 = hashMap;
                                        int[] iArr4 = iArr322222;
                                        ed edVar3 = edVar222222;
                                        String str42 = str322222;
                                        boolean z17 = z1622222;
                                        int i21 = i1922222;
                                        Runnable runnable3 = runnable222222;
                                        int i22 = i2022222;
                                        TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                        if (hashMap4 == null) {
                                            int i23 = iArr4[0];
                                            if (i23 == 1 || i23 == 2) {
                                                hdVar2.f(edVar3, str42, i23 == 2 || z17, i21, runnable3);
                                                return;
                                            } else {
                                                if (runnable3 != null) {
                                                    runnable3.run();
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        if (i22 == 0) {
                                            edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                                        } else {
                                            edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                                        }
                                        hdVar2.a1();
                                        try {
                                            if (hdVar2.B == edVar3) {
                                                String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                                Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                                hdVar2.C = edVar3.c;
                                                SharedPreferences.Editor edit = qp.e1().edit();
                                                edit.putString("language", edVar3.b());
                                                edit.commit();
                                                si.a aVar = new si.a();
                                                aVar.a(hashMap4);
                                                hdVar2.Y = new si.b(aVar);
                                                hdVar2.Z = hd.h(hashMap4);
                                                hdVar2.y = locale;
                                                hdVar2.B = edVar3;
                                                if (!TextUtils.isEmpty(edVar3.f)) {
                                                    hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                                }
                                                if (hdVar2.A == null) {
                                                    fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                                    hdVar2.A = fdVar;
                                                    if (fdVar == null) {
                                                        hdVar2.A = (fd) hdVar2.x.get("en");
                                                    }
                                                }
                                                hdVar2.D = true;
                                                Locale.setDefault(hdVar2.y);
                                                Configuration configuration = new Configuration();
                                                configuration.locale = hdVar2.y;
                                                t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                                hdVar2.D = false;
                                                qy0.s = false;
                                            } else {
                                                a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                            }
                                        } catch (Exception e122) {
                                            a8.g(e122, true);
                                            hdVar2.D = false;
                                        }
                                        hdVar2.Y0();
                                        qs.e().k(qs.x4, new Object[0]);
                                        if (runnable3 != null) {
                                            runnable3.run();
                                        }
                                    }
                                });
                            }
                        } else {
                            objArr = objArr2;
                            i13 = i17;
                            if (langPackString instanceof TLRPC.TL_langPackStringDeleted) {
                                hashMap2.remove(langPackString.key);
                                hashMap2.remove(langPackString.key + "_zero");
                                hashMap2.remove(langPackString.key + "_one");
                                hashMap2.remove(langPackString.key + "_two");
                                hashMap2.remove(langPackString.key + "_few");
                                hashMap2.remove(langPackString.key + "_many");
                                hashMap2.remove(langPackString.key + "_other");
                            }
                        }
                    }
                    i15 = i16 + 1;
                    z15 = z13;
                    iArr2 = iArr;
                    objArr2 = objArr;
                    i17 = i13;
                    z14 = true;
                }
                z12 = z15;
                iArr = iArr2;
                Object[] objArr32 = objArr2;
                i13 = i17;
                file2 = new File(file3.getPath() + ".tmp");
                try {
                    a8.b("save locale file to " + file2);
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e15) {
                    e = e15;
                    z11 = true;
                    a8.g(e, z11);
                    if (file2 != null) {
                    }
                    hashMap = null;
                    final ed edVar2222222 = edVar;
                    final String str3222222 = str;
                    final boolean z16222222 = z9;
                    final int i19222222 = i7;
                    final Runnable runnable2222222 = runnable;
                    final int[] iArr3222222 = iArr;
                    final int i20222222 = i13;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                        @Override // java.lang.Runnable
                        public final void run() {
                            hd hdVar2 = hd.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr3222222;
                            ed edVar3 = edVar2222222;
                            String str42 = str3222222;
                            boolean z17 = z16222222;
                            int i21 = i19222222;
                            Runnable runnable3 = runnable2222222;
                            int i22 = i20222222;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i23 = iArr4[0];
                                if (i23 == 1 || i23 == 2) {
                                    hdVar2.f(edVar3, str42, i23 == 2 || z17, i21, runnable3);
                                    return;
                                } else {
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i22 == 0) {
                                edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                            } else {
                                edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                            }
                            hdVar2.a1();
                            try {
                                if (hdVar2.B == edVar3) {
                                    String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    hdVar2.C = edVar3.c;
                                    SharedPreferences.Editor edit = qp.e1().edit();
                                    edit.putString("language", edVar3.b());
                                    edit.commit();
                                    si.a aVar = new si.a();
                                    aVar.a(hashMap4);
                                    hdVar2.Y = new si.b(aVar);
                                    hdVar2.Z = hd.h(hashMap4);
                                    hdVar2.y = locale;
                                    hdVar2.B = edVar3;
                                    if (!TextUtils.isEmpty(edVar3.f)) {
                                        hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                    }
                                    if (hdVar2.A == null) {
                                        fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                        hdVar2.A = fdVar;
                                        if (fdVar == null) {
                                            hdVar2.A = (fd) hdVar2.x.get("en");
                                        }
                                    }
                                    hdVar2.D = true;
                                    Locale.setDefault(hdVar2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = hdVar2.y;
                                    t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                    hdVar2.D = false;
                                    qy0.s = false;
                                } else {
                                    a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e122) {
                                a8.g(e122, true);
                                hdVar2.D = false;
                            }
                            hdVar2.Y0();
                            qs.e().k(qs.x4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8));
                    bufferedWriter2.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                    bufferedWriter2.write("<resources>\n");
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        int i21 = i14;
                        Object[] objArr4 = new Object[i21];
                        objArr4[z12 ? 1 : 0] = key;
                        objArr4[1] = value;
                        bufferedWriter2.write(String.format("<string name=\"%1$s\">%2$s</string>\n", objArr4));
                        i14 = i21;
                    }
                    bufferedWriter2.write("</resources>");
                    bufferedWriter2.flush();
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    hashMap = hdVar.H0(file2, z12, true, z12);
                    if (hashMap != null) {
                        a8.d("saveRemoteLocaleStrings: written locale file is unreadable, keep the old one");
                        new File(new File(t0.h(), "malformed_locales"), file2.getName()).delete();
                        file2.delete();
                    } else {
                        File file4 = d;
                        if (file4 != null) {
                            if (objArr32 == true) {
                                hashMap.putAll(hdVar.H0(file4, false, false, false));
                            } else {
                                HashMap H02 = hdVar.H0(file4, false, false, false);
                                H02.putAll(hashMap);
                                hashMap = H02;
                            }
                        }
                        if (file2.renameTo(file3)) {
                            hashMap3.put(file3.getPath(), Integer.valueOf(tL_langPackDifference2.version));
                            if (tL_langPackDifference2.from_version == 0) {
                                new File(new File(t0.h(), "malformed_locales"), file3.getName()).delete();
                            }
                            a8.b("saved locale file to " + file3);
                            final ed edVar22222222 = edVar;
                            final String str32222222 = str;
                            final boolean z162222222 = z9;
                            final int i192222222 = i7;
                            final Runnable runnable22222222 = runnable;
                            final int[] iArr32222222 = iArr;
                            final int i202222222 = i13;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hd hdVar2 = hd.this;
                                    HashMap hashMap4 = hashMap;
                                    int[] iArr4 = iArr32222222;
                                    ed edVar3 = edVar22222222;
                                    String str42 = str32222222;
                                    boolean z17 = z162222222;
                                    int i212 = i192222222;
                                    Runnable runnable3 = runnable22222222;
                                    int i22 = i202222222;
                                    TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                    if (hashMap4 == null) {
                                        int i23 = iArr4[0];
                                        if (i23 == 1 || i23 == 2) {
                                            hdVar2.f(edVar3, str42, i23 == 2 || z17, i212, runnable3);
                                            return;
                                        } else {
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (i22 == 0) {
                                        edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                                    } else {
                                        edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                                    }
                                    hdVar2.a1();
                                    try {
                                        if (hdVar2.B == edVar3) {
                                            String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                            Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                            hdVar2.C = edVar3.c;
                                            SharedPreferences.Editor edit = qp.e1().edit();
                                            edit.putString("language", edVar3.b());
                                            edit.commit();
                                            si.a aVar = new si.a();
                                            aVar.a(hashMap4);
                                            hdVar2.Y = new si.b(aVar);
                                            hdVar2.Z = hd.h(hashMap4);
                                            hdVar2.y = locale;
                                            hdVar2.B = edVar3;
                                            if (!TextUtils.isEmpty(edVar3.f)) {
                                                hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                            }
                                            if (hdVar2.A == null) {
                                                fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                                hdVar2.A = fdVar;
                                                if (fdVar == null) {
                                                    hdVar2.A = (fd) hdVar2.x.get("en");
                                                }
                                            }
                                            hdVar2.D = true;
                                            Locale.setDefault(hdVar2.y);
                                            Configuration configuration = new Configuration();
                                            configuration.locale = hdVar2.y;
                                            t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                            hdVar2.D = false;
                                            qy0.s = false;
                                        } else {
                                            a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                        }
                                    } catch (Exception e122) {
                                        a8.g(e122, true);
                                        hdVar2.D = false;
                                    }
                                    hdVar2.Y0();
                                    qs.e().k(qs.x4, new Object[0]);
                                    if (runnable3 != null) {
                                        runnable3.run();
                                    }
                                }
                            });
                        }
                        a8.d("saveRemoteLocaleStrings: can't replace " + file3);
                        file2.delete();
                    }
                    hashMap = null;
                    final ed edVar222222222 = edVar;
                    final String str322222222 = str;
                    final boolean z1622222222 = z9;
                    final int i1922222222 = i7;
                    final Runnable runnable222222222 = runnable;
                    final int[] iArr322222222 = iArr;
                    final int i2022222222 = i13;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.ad
                        @Override // java.lang.Runnable
                        public final void run() {
                            hd hdVar2 = hd.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr322222222;
                            ed edVar3 = edVar222222222;
                            String str42 = str322222222;
                            boolean z17 = z1622222222;
                            int i212 = i1922222222;
                            Runnable runnable3 = runnable222222222;
                            int i22 = i2022222222;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i23 = iArr4[0];
                                if (i23 == 1 || i23 == 2) {
                                    hdVar2.f(edVar3, str42, i23 == 2 || z17, i212, runnable3);
                                    return;
                                } else {
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i22 == 0) {
                                edVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.h, tL_langPackDifference3.version);
                            } else {
                                edVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(edVar3.i, tL_langPackDifference3.version);
                            }
                            hdVar2.a1();
                            try {
                                if (hdVar2.B == edVar3) {
                                    String[] split = !TextUtils.isEmpty(edVar3.f) ? edVar3.f.split("_") : !TextUtils.isEmpty(edVar3.e) ? edVar3.e.split("_") : edVar3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    hdVar2.C = edVar3.c;
                                    SharedPreferences.Editor edit = qp.e1().edit();
                                    edit.putString("language", edVar3.b());
                                    edit.commit();
                                    si.a aVar = new si.a();
                                    aVar.a(hashMap4);
                                    hdVar2.Y = new si.b(aVar);
                                    hdVar2.Z = hd.h(hashMap4);
                                    hdVar2.y = locale;
                                    hdVar2.B = edVar3;
                                    if (!TextUtils.isEmpty(edVar3.f)) {
                                        hdVar2.A = (fd) hdVar2.x.get(hdVar2.B.f);
                                    }
                                    if (hdVar2.A == null) {
                                        fd fdVar = (fd) hdVar2.x.get(hdVar2.y.getLanguage());
                                        hdVar2.A = fdVar;
                                        if (fdVar == null) {
                                            hdVar2.A = (fd) hdVar2.x.get("en");
                                        }
                                    }
                                    hdVar2.D = true;
                                    Locale.setDefault(hdVar2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = hdVar2.y;
                                    t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                    hdVar2.D = false;
                                    qy0.s = false;
                                } else {
                                    a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e122) {
                                a8.g(e122, true);
                                hdVar2.D = false;
                            }
                            hdVar2.Y0();
                            qs.e().k(qs.x4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                } finally {
                    fileOutputStream.close();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fc  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(ed edVar, boolean z9, boolean z10, boolean z11, boolean z12, int i7, g60 g60Var) {
        String str;
        int i10;
        File file;
        int f10;
        boolean z13;
        int i11;
        int i12;
        boolean z14;
        boolean z15;
        int i13;
        Locale locale;
        String[] strArr;
        boolean z16;
        ?? r52;
        int i14;
        boolean z17;
        hd hdVar = this;
        ed edVar2 = edVar;
        if (edVar2 == null) {
            return 0;
        }
        boolean g10 = edVar2.g();
        File e10 = edVar2.e();
        File d = edVar2.d();
        if (!z10) {
            ConnectionsManager.setLangCode(edVar2.c());
        }
        if (hdVar.G0(edVar2.b()) == null) {
            if (edVar2.i()) {
                hdVar.L.add(edVar2);
                hdVar.M.put(edVar2.b(), edVar2);
                hdVar.J.add(edVar2);
                hdVar.N.put(edVar2.b(), edVar2);
                hdVar.a1();
            } else if (edVar2.j()) {
                hdVar.K.add(edVar2);
                hdVar.N.put(edVar2.b(), edVar2);
                hdVar.a1();
            }
        }
        if ((edVar2.i() || edVar2.j()) && (z12 || !e10.exists() || (g10 && !d.exists()))) {
            if (r2.a) {
                a8.b("reload locale because one of file doesn't exist " + e10 + " " + d);
            }
            if (z10) {
                str = " ";
                i10 = 0;
                g0.h3(new dg(hdVar, edVar2, i7, g60Var, 6));
                hdVar = this;
                edVar2 = edVar;
                file = d;
                z13 = true;
                f10 = 0;
            } else {
                str = " ";
                i10 = 0;
                hdVar = this;
                edVar2 = edVar;
                file = d;
                f10 = hdVar.f(edVar2, null, true, i7, g60Var);
                z13 = true;
            }
        } else {
            str = " ";
            file = d;
            f10 = 0;
            i10 = 0;
            z13 = false;
        }
        try {
            String[] split = !TextUtils.isEmpty(edVar2.f) ? edVar2.f.split("_") : !TextUtils.isEmpty(edVar2.e) ? edVar2.e.split("_") : edVar2.c.split("_");
            i12 = f10;
            try {
                if (split.length == 1) {
                    locale = new Locale(split[i10]);
                    strArr = split;
                } else {
                    strArr = split;
                    locale = new Locale(split[i10], strArr[1]);
                }
                if (z9) {
                    hdVar.C = edVar2.c;
                    SharedPreferences.Editor edit = qp.e1().edit();
                    z16 = g10;
                    edit.putString("language", edVar2.b());
                    edit.commit();
                } else {
                    z16 = g10;
                }
                if (e10 == null) {
                    try {
                        hdVar.Y = si.b.c;
                        hdVar.Z = i10;
                    } catch (Exception e11) {
                        e = e11;
                        i11 = i7;
                        z14 = true;
                        a8.g(e, true);
                        z15 = false;
                        hdVar.D = false;
                        i13 = i11;
                        hdVar.Y0();
                        if (z12) {
                        }
                        return i12;
                    }
                } else {
                    boolean z18 = i10;
                    if (!z11) {
                        hdVar.E = z18;
                        HashMap H0 = hdVar.H0(z16 ? edVar2.d() : edVar2.e(), z18, z18, true);
                        if (z16) {
                            H0.putAll(hdVar.H0(edVar2.e(), z18, z18, true));
                        }
                        si.a aVar = new si.a();
                        aVar.a(H0);
                        hdVar.Y = new si.b(aVar);
                        hdVar.Z = h(H0);
                    }
                }
                hdVar.y = locale;
                hdVar.B = edVar2;
                a8.b("applyLanguage: currentLocaleInfo is set");
                if (!TextUtils.isEmpty(hdVar.B.f)) {
                    hdVar.A = (fd) hdVar.x.get(hdVar.B.f);
                }
                if (hdVar.A == null) {
                    hdVar.A = (fd) hdVar.x.get(strArr[0]);
                }
                if (hdVar.A == null) {
                    hdVar.A = (fd) hdVar.x.get(hdVar.y.getLanguage());
                }
                if (hdVar.A == null) {
                    hdVar.A = new fd(10);
                }
                hdVar.D = true;
                Locale.setDefault(hdVar.y);
                Configuration configuration = new Configuration();
                configuration.locale = hdVar.y;
                t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                hdVar.D = false;
                ?? sb2 = new StringBuilder("applyLanguage: reloadLastFile=");
                r52 = hdVar.E;
                sb2.append(r52);
                sb2.append(" force=");
                sb2.append(z12);
                sb2.append(" isLoadingRemote=");
                sb2.append(z13);
                a8.b(sb2.toString());
                if (z10 && !z13 && ((edVar2.i() || edVar2.j()) && (T0(e10) || (z16 && T0(file))))) {
                    a8.b("reload locale because it was malformed before " + e10);
                    hdVar.E = true;
                }
                try {
                } catch (Exception e12) {
                    e = e12;
                    i11 = r52;
                    z14 = true;
                    a8.g(e, true);
                    z15 = false;
                    hdVar.D = false;
                    i13 = i11;
                    hdVar.Y0();
                    if (z12) {
                    }
                    return i12;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            i11 = i7;
            i12 = f10;
        }
        if (!hdVar.E && (z13 || z12 || !hdVar.c1(edVar2.c))) {
            r52 = i7;
            if (!z13) {
                if (z10) {
                    g0.h3(new ai.m0(29));
                    z17 = false;
                } else {
                    z17 = false;
                    qs.e().k(qs.x4, new Object[0]);
                }
                qy0.s = z17;
                if (g60Var != null) {
                    g60Var.run();
                }
            }
            z15 = false;
            z14 = true;
            i13 = r52;
            hdVar.Y0();
            if (z12) {
                ui.b0(i13).E0(z15, z14, null);
            }
            return i12;
        }
        if (r2.a) {
            a8.b("reload locale because one of file is corrupted " + e10 + str + file + " reloadLastFile=" + hdVar.E + " isLoadingRemote=" + z13 + " force=" + z12);
        }
        if (z10) {
            int i15 = i7;
            g0.h3(new vc(hdVar, i15 == true ? 1 : 0, 3));
            i14 = i15;
        } else {
            int i16 = i7;
            hdVar.Z0(i16 == true ? 1 : 0, null, true, null);
            i14 = i16;
        }
        hdVar.E = false;
        a8.b("reloadLastFile=false");
        r52 = i14;
        if (!z13) {
        }
        z15 = false;
        z14 = true;
        i13 = r52;
        hdVar.Y0();
        if (z12) {
        }
        return i12;
    }

    public final boolean c1(String str) {
        int i7;
        int i10 = qp.s1(p10.s0).z7;
        if (i10 > 0) {
            if (!qp.e1().getBoolean("lngpack_patched_" + str, false) && (i7 = this.Z) < i10) {
                a8.d("reinstalling " + str + " langpack because of patch (" + i7 + " keys, must be at least " + i10 + ")");
                X0(str);
                return true;
            }
        }
        return false;
    }

    public final void d(ed edVar, boolean z9, boolean z10, int i7) {
        c(edVar, z9, z10, false, false, i7, null);
    }

    public final dd d1(String str, boolean z9, int i7, ng ngVar) {
        HashMap hashMap = this.T;
        dd ddVar = (dd) hashMap.get(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = ddVar != null && elapsedRealtime - ddVar.b >= 300000;
        if (ddVar != null && !z10 && (ddVar.a || !z9)) {
            StringBuilder u10 = a8.p0.u("applyRemoteLanguage ", str, " is already loading");
            u10.append(ddVar.a ? " the whole langpack" : "");
            u10.append(", wait for it");
            a8.b(u10.toString());
            ddVar.e.add(ngVar);
            return null;
        }
        dd ddVar2 = new dd();
        ArrayList arrayList = new ArrayList();
        ddVar2.e = arrayList;
        ddVar2.a = z9;
        ddVar2.b = elapsedRealtime;
        ddVar2.d = i7;
        if (z10) {
            arrayList.addAll(ddVar.e);
            ddVar.e.clear();
        }
        hashMap.put(str, ddVar2);
        return ddVar2;
    }

    public final boolean e(File file, int i7) {
        try {
            HashMap H0 = H0(file, false, false, true);
            String str = (String) H0.get("LanguageName");
            String str2 = (String) H0.get("LanguageNameInEnglish");
            String str3 = (String) H0.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(t0.h(), str3.concat(".xml"));
                if (g0.E(file, file2)) {
                    ed G0 = G0("local_" + str3.toLowerCase());
                    if (G0 == null) {
                        G0 = new ed();
                        G0.a = str;
                        G0.b = str2;
                        String lowerCase = str3.toLowerCase();
                        G0.c = lowerCase;
                        G0.f = lowerCase;
                        G0.d = file2.getAbsolutePath();
                        this.J.add(G0);
                        this.N.put(G0.b(), G0);
                        this.O.add(G0);
                        a1();
                    }
                    ed edVar = G0;
                    si.a aVar = new si.a();
                    aVar.a(H0);
                    this.Y = new si.b(aVar);
                    this.Z = h(H0);
                    c(edVar, true, false, true, false, i7, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(final ed edVar, String str, boolean z9, final int i7, Runnable runnable) {
        ?? r16;
        boolean z10;
        int i10;
        int i11;
        final dd d12;
        final hd hdVar = this;
        final int i12 = i7;
        if (edVar == null || !(edVar.i() || edVar.j())) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder("applyRemoteLanguage ");
        sb2.append(str);
        sb2.append(" force=");
        sb2.append(z9);
        sb2.append(" currentAccount=");
        jg.g.s(i12, sb2);
        int[] iArr = new int[1];
        iArr[0] = 0;
        ng ngVar = new ng(new int[]{0}, iArr, runnable, 27);
        if (z9) {
            X0(edVar.c);
        }
        if (edVar.g() && (str == null || str.equals(edVar.e))) {
            final String str2 = edVar.b() + "_base";
            boolean z11 = edVar.i == 0 || z9;
            iArr[0] = iArr[0] + 1;
            boolean z12 = z11;
            final dd d13 = hdVar.d1(str2, z12, i12, ngVar);
            if (d13 != null) {
                final tc tcVar = new tc(ngVar, d13, 1);
                boolean z13 = false;
                if (z12) {
                    z10 = true;
                    i10 = 8;
                    a8.b("applyRemoteLanguage getLangPack of base");
                    TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack = new TLRPC.TL_langpack_getLangPack();
                    String str3 = edVar.e;
                    tL_langpack_getLangPack.lang_code = str3 == null ? "" : str3.replace("_", "-");
                    final int i13 = 1;
                    hdVar = this;
                    i12 = i7;
                    i11 = ConnectionsManager.getInstance(i7).sendRequest(tL_langpack_getLangPack, new RequestDelegate(hdVar) { // from class: org.telegram.messenger.cd
                        public final /* synthetic */ hd b;

                        {
                            this.b = hdVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    final int i14 = 1;
                                    final hd hdVar2 = this.b;
                                    final String str4 = str2;
                                    final dd ddVar = d13;
                                    final ed edVar2 = edVar;
                                    final int i15 = i12;
                                    final tc tcVar2 = tcVar;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.yc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    hd hdVar3 = hdVar2;
                                                    HashMap hashMap = hdVar3.T;
                                                    String str5 = str4;
                                                    if (hashMap.get(str5) == ddVar) {
                                                        hashMap.remove(str5);
                                                    }
                                                    TLObject tLObject2 = tLObject;
                                                    tc tcVar3 = tcVar2;
                                                    if (tLObject2 == null) {
                                                        tcVar3.run();
                                                        break;
                                                    } else {
                                                        hdVar3.b1(edVar2, (TLRPC.TL_langPackDifference) tLObject2, i15, true, tcVar3);
                                                        break;
                                                    }
                                                default:
                                                    hd hdVar4 = hdVar2;
                                                    HashMap hashMap2 = hdVar4.T;
                                                    String str6 = str4;
                                                    if (hashMap2.get(str6) == ddVar) {
                                                        hashMap2.remove(str6);
                                                    }
                                                    TLObject tLObject3 = tLObject;
                                                    tc tcVar4 = tcVar2;
                                                    if (tLObject3 == null) {
                                                        tcVar4.run();
                                                        break;
                                                    } else {
                                                        hdVar4.b1(edVar2, (TLRPC.TL_langPackDifference) tLObject3, i15, true, tcVar4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i16 = 0;
                                    final hd hdVar3 = this.b;
                                    final String str5 = str2;
                                    final dd ddVar2 = d13;
                                    final ed edVar3 = edVar;
                                    final int i17 = i12;
                                    final tc tcVar3 = tcVar;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.yc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    hd hdVar32 = hdVar3;
                                                    HashMap hashMap = hdVar32.T;
                                                    String str52 = str5;
                                                    if (hashMap.get(str52) == ddVar2) {
                                                        hashMap.remove(str52);
                                                    }
                                                    TLObject tLObject2 = tLObject;
                                                    tc tcVar32 = tcVar3;
                                                    if (tLObject2 == null) {
                                                        tcVar32.run();
                                                        break;
                                                    } else {
                                                        hdVar32.b1(edVar3, (TLRPC.TL_langPackDifference) tLObject2, i17, true, tcVar32);
                                                        break;
                                                    }
                                                default:
                                                    hd hdVar4 = hdVar3;
                                                    HashMap hashMap2 = hdVar4.T;
                                                    String str6 = str5;
                                                    if (hashMap2.get(str6) == ddVar2) {
                                                        hashMap2.remove(str6);
                                                    }
                                                    TLObject tLObject3 = tLObject;
                                                    tc tcVar4 = tcVar3;
                                                    if (tLObject3 == null) {
                                                        tcVar4.run();
                                                        break;
                                                    } else {
                                                        hdVar4.b1(edVar3, (TLRPC.TL_langPackDifference) tLObject3, i17, true, tcVar4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    }, 8);
                    d13.c = i11;
                    r16 = z13;
                } else {
                    a8.b("applyRemoteLanguage getDifference of base");
                    TLRPC.TL_langpack_getDifference tL_langpack_getDifference = new TLRPC.TL_langpack_getDifference();
                    z10 = true;
                    tL_langpack_getDifference.from_version = edVar.i;
                    String str4 = edVar.e;
                    tL_langpack_getDifference.lang_code = str4 == null ? "" : str4.replace("_", "-");
                    tL_langpack_getDifference.lang_pack = "";
                    final int i14 = 0;
                    i10 = 8;
                    i11 = ConnectionsManager.getInstance(i12).sendRequest(tL_langpack_getDifference, new RequestDelegate(hdVar) { // from class: org.telegram.messenger.cd
                        public final /* synthetic */ hd b;

                        {
                            this.b = hdVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final int i142 = 1;
                                    final hd hdVar2 = this.b;
                                    final String str42 = str2;
                                    final dd ddVar = d13;
                                    final ed edVar2 = edVar;
                                    final int i15 = i12;
                                    final tc tcVar2 = tcVar;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.yc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i142) {
                                                case 0:
                                                    hd hdVar32 = hdVar2;
                                                    HashMap hashMap = hdVar32.T;
                                                    String str52 = str42;
                                                    if (hashMap.get(str52) == ddVar) {
                                                        hashMap.remove(str52);
                                                    }
                                                    TLObject tLObject2 = tLObject;
                                                    tc tcVar32 = tcVar2;
                                                    if (tLObject2 == null) {
                                                        tcVar32.run();
                                                        break;
                                                    } else {
                                                        hdVar32.b1(edVar2, (TLRPC.TL_langPackDifference) tLObject2, i15, true, tcVar32);
                                                        break;
                                                    }
                                                default:
                                                    hd hdVar4 = hdVar2;
                                                    HashMap hashMap2 = hdVar4.T;
                                                    String str6 = str42;
                                                    if (hashMap2.get(str6) == ddVar) {
                                                        hashMap2.remove(str6);
                                                    }
                                                    TLObject tLObject3 = tLObject;
                                                    tc tcVar4 = tcVar2;
                                                    if (tLObject3 == null) {
                                                        tcVar4.run();
                                                        break;
                                                    } else {
                                                        hdVar4.b1(edVar2, (TLRPC.TL_langPackDifference) tLObject3, i15, true, tcVar4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i16 = 0;
                                    final hd hdVar3 = this.b;
                                    final String str5 = str2;
                                    final dd ddVar2 = d13;
                                    final ed edVar3 = edVar;
                                    final int i17 = i12;
                                    final tc tcVar3 = tcVar;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.yc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    hd hdVar32 = hdVar3;
                                                    HashMap hashMap = hdVar32.T;
                                                    String str52 = str5;
                                                    if (hashMap.get(str52) == ddVar2) {
                                                        hashMap.remove(str52);
                                                    }
                                                    TLObject tLObject2 = tLObject;
                                                    tc tcVar32 = tcVar3;
                                                    if (tLObject2 == null) {
                                                        tcVar32.run();
                                                        break;
                                                    } else {
                                                        hdVar32.b1(edVar3, (TLRPC.TL_langPackDifference) tLObject2, i17, true, tcVar32);
                                                        break;
                                                    }
                                                default:
                                                    hd hdVar4 = hdVar3;
                                                    HashMap hashMap2 = hdVar4.T;
                                                    String str6 = str5;
                                                    if (hashMap2.get(str6) == ddVar2) {
                                                        hashMap2.remove(str6);
                                                    }
                                                    TLObject tLObject3 = tLObject;
                                                    tc tcVar4 = tcVar3;
                                                    if (tLObject3 == null) {
                                                        tcVar4.run();
                                                        break;
                                                    } else {
                                                        hdVar4.b1(edVar3, (TLRPC.TL_langPackDifference) tLObject3, i17, true, tcVar4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    }, 8);
                    d13.c = i11;
                    hdVar = this;
                    i12 = i7;
                    r16 = z13;
                }
                if (str != null || str.equals(edVar.c)) {
                    final String b10 = edVar.b();
                    boolean z14 = (edVar.h != 0 || z9) ? z10 : r16;
                    iArr[r16] = iArr[r16] + 1;
                    boolean z15 = z14;
                    d12 = hdVar.d1(b10, z15, i12, ngVar);
                    if (d12 != null) {
                        final tc tcVar2 = new tc(ngVar, d12, 0);
                        if (z15) {
                            for (int i15 = r16; i15 < 4; i15++) {
                                ConnectionsManager.setLangCode(edVar.c());
                            }
                            a8.b("applyRemoteLanguage getLangPack");
                            TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack2 = new TLRPC.TL_langpack_getLangPack();
                            tL_langpack_getLangPack2.lang_code = edVar.c();
                            final int i16 = 1;
                            i11 = ConnectionsManager.getInstance(i7).sendRequest(tL_langpack_getLangPack2, new RequestDelegate(this) { // from class: org.telegram.messenger.uc
                                public final /* synthetic */ hd b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i16) {
                                        case 0:
                                            final int i17 = 1;
                                            final hd hdVar2 = this.b;
                                            final String str5 = b10;
                                            final dd ddVar = d12;
                                            final ed edVar2 = edVar;
                                            final int i18 = i7;
                                            final tc tcVar3 = tcVar2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.xc
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i17) {
                                                        case 0:
                                                            hd hdVar3 = hdVar2;
                                                            HashMap hashMap = hdVar3.T;
                                                            String str6 = str5;
                                                            if (hashMap.get(str6) == ddVar) {
                                                                hashMap.remove(str6);
                                                            }
                                                            TLObject tLObject2 = tLObject;
                                                            tc tcVar4 = tcVar3;
                                                            if (tLObject2 == null) {
                                                                tcVar4.run();
                                                                break;
                                                            } else {
                                                                hdVar3.b1(edVar2, (TLRPC.TL_langPackDifference) tLObject2, i18, true, tcVar4);
                                                                break;
                                                            }
                                                        default:
                                                            hd hdVar4 = hdVar2;
                                                            HashMap hashMap2 = hdVar4.T;
                                                            String str7 = str5;
                                                            if (hashMap2.get(str7) == ddVar) {
                                                                hashMap2.remove(str7);
                                                            }
                                                            TLObject tLObject3 = tLObject;
                                                            tc tcVar5 = tcVar3;
                                                            if (tLObject3 == null) {
                                                                tcVar5.run();
                                                                break;
                                                            } else {
                                                                hdVar4.b1(edVar2, (TLRPC.TL_langPackDifference) tLObject3, i18, true, tcVar5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            final int i19 = 0;
                                            final hd hdVar3 = this.b;
                                            final String str6 = b10;
                                            final dd ddVar2 = d12;
                                            final ed edVar3 = edVar;
                                            final int i20 = i7;
                                            final tc tcVar4 = tcVar2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.xc
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i19) {
                                                        case 0:
                                                            hd hdVar32 = hdVar3;
                                                            HashMap hashMap = hdVar32.T;
                                                            String str62 = str6;
                                                            if (hashMap.get(str62) == ddVar2) {
                                                                hashMap.remove(str62);
                                                            }
                                                            TLObject tLObject2 = tLObject;
                                                            tc tcVar42 = tcVar4;
                                                            if (tLObject2 == null) {
                                                                tcVar42.run();
                                                                break;
                                                            } else {
                                                                hdVar32.b1(edVar3, (TLRPC.TL_langPackDifference) tLObject2, i20, true, tcVar42);
                                                                break;
                                                            }
                                                        default:
                                                            hd hdVar4 = hdVar3;
                                                            HashMap hashMap2 = hdVar4.T;
                                                            String str7 = str6;
                                                            if (hashMap2.get(str7) == ddVar2) {
                                                                hashMap2.remove(str7);
                                                            }
                                                            TLObject tLObject3 = tLObject;
                                                            tc tcVar5 = tcVar4;
                                                            if (tLObject3 == null) {
                                                                tcVar5.run();
                                                                break;
                                                            } else {
                                                                hdVar4.b1(edVar3, (TLRPC.TL_langPackDifference) tLObject3, i20, true, tcVar5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                    }
                                }
                            }, i10);
                            d12.c = i11;
                        } else {
                            a8.b("applyRemoteLanguage getDifference");
                            TLRPC.TL_langpack_getDifference tL_langpack_getDifference2 = new TLRPC.TL_langpack_getDifference();
                            tL_langpack_getDifference2.from_version = edVar.h;
                            tL_langpack_getDifference2.lang_code = edVar.c();
                            tL_langpack_getDifference2.lang_pack = "";
                            final int i17 = 0;
                            i11 = ConnectionsManager.getInstance(i12).sendRequest(tL_langpack_getDifference2, new RequestDelegate(hdVar) { // from class: org.telegram.messenger.uc
                                public final /* synthetic */ hd b;

                                {
                                    this.b = hdVar;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i17) {
                                        case 0:
                                            final int i172 = 1;
                                            final hd hdVar2 = this.b;
                                            final String str5 = b10;
                                            final dd ddVar = d12;
                                            final ed edVar2 = edVar;
                                            final int i18 = i12;
                                            final tc tcVar3 = tcVar2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.xc
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i172) {
                                                        case 0:
                                                            hd hdVar32 = hdVar2;
                                                            HashMap hashMap = hdVar32.T;
                                                            String str62 = str5;
                                                            if (hashMap.get(str62) == ddVar) {
                                                                hashMap.remove(str62);
                                                            }
                                                            TLObject tLObject2 = tLObject;
                                                            tc tcVar42 = tcVar3;
                                                            if (tLObject2 == null) {
                                                                tcVar42.run();
                                                                break;
                                                            } else {
                                                                hdVar32.b1(edVar2, (TLRPC.TL_langPackDifference) tLObject2, i18, true, tcVar42);
                                                                break;
                                                            }
                                                        default:
                                                            hd hdVar4 = hdVar2;
                                                            HashMap hashMap2 = hdVar4.T;
                                                            String str7 = str5;
                                                            if (hashMap2.get(str7) == ddVar) {
                                                                hashMap2.remove(str7);
                                                            }
                                                            TLObject tLObject3 = tLObject;
                                                            tc tcVar5 = tcVar3;
                                                            if (tLObject3 == null) {
                                                                tcVar5.run();
                                                                break;
                                                            } else {
                                                                hdVar4.b1(edVar2, (TLRPC.TL_langPackDifference) tLObject3, i18, true, tcVar5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            final int i19 = 0;
                                            final hd hdVar3 = this.b;
                                            final String str6 = b10;
                                            final dd ddVar2 = d12;
                                            final ed edVar3 = edVar;
                                            final int i20 = i12;
                                            final tc tcVar4 = tcVar2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.xc
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i19) {
                                                        case 0:
                                                            hd hdVar32 = hdVar3;
                                                            HashMap hashMap = hdVar32.T;
                                                            String str62 = str6;
                                                            if (hashMap.get(str62) == ddVar2) {
                                                                hashMap.remove(str62);
                                                            }
                                                            TLObject tLObject2 = tLObject;
                                                            tc tcVar42 = tcVar4;
                                                            if (tLObject2 == null) {
                                                                tcVar42.run();
                                                                break;
                                                            } else {
                                                                hdVar32.b1(edVar3, (TLRPC.TL_langPackDifference) tLObject2, i20, true, tcVar42);
                                                                break;
                                                            }
                                                        default:
                                                            hd hdVar4 = hdVar3;
                                                            HashMap hashMap2 = hdVar4.T;
                                                            String str7 = str6;
                                                            if (hashMap2.get(str7) == ddVar2) {
                                                                hashMap2.remove(str7);
                                                            }
                                                            TLObject tLObject3 = tLObject;
                                                            tc tcVar5 = tcVar4;
                                                            if (tLObject3 == null) {
                                                                tcVar5.run();
                                                                break;
                                                            } else {
                                                                hdVar4.b1(edVar3, (TLRPC.TL_langPackDifference) tLObject3, i20, true, tcVar5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                    }
                                }
                            }, i10);
                            d12.c = i11;
                        }
                    }
                }
                if (iArr[r16] == 0 && runnable != null) {
                    runnable.run();
                }
                return i11;
            }
        }
        r16 = 0;
        z10 = true;
        i10 = 8;
        i11 = 0;
        if (str != null) {
        }
        final String b102 = edVar.b();
        if (edVar.h != 0) {
        }
        iArr[r16] = iArr[r16] + 1;
        boolean z152 = z14;
        d12 = hdVar.d1(b102, z152, i12, ngVar);
        if (d12 != null) {
        }
        if (iArr[r16] == 0) {
            runnable.run();
        }
        return i11;
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
                        this.l = k(locale, O0(2131742787, "chatDate", null), "d MMMM");
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
                        this.n = k(locale, O0(2131742785, "chatFullDate", null), "d MMMM yyyy");
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
        si.a aVar;
        if (!Objects.equals(this.V, this.y) || this.W == null || this.X) {
            boolean z9 = true;
            this.X = true;
            synchronized (this) {
                try {
                    Locale locale = this.y;
                    if (Objects.equals(this.V, locale)) {
                        if (this.W == null) {
                        }
                    }
                    if (this.U == null) {
                        si.a aVar2 = new si.a();
                        try {
                            aVar2.a = si.b.a(t0.b, "localization_en.bin", aVar2.a);
                        } catch (Exception unused) {
                        }
                        this.U = new si.b(aVar2);
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
                                            z9 = false;
                                            break;
                                        }
                                        z9 = -1;
                                        break;
                                    case 3201:
                                        break;
                                    case 3241:
                                        if (language.equals("en")) {
                                            z9 = 2;
                                            break;
                                        }
                                        z9 = -1;
                                        break;
                                    case 3246:
                                        if (language.equals("es")) {
                                            z9 = 3;
                                            break;
                                        }
                                        z9 = -1;
                                        break;
                                    case 3371:
                                        if (language.equals("it")) {
                                            z9 = 4;
                                            break;
                                        }
                                        z9 = -1;
                                        break;
                                    case 3428:
                                        if (language.equals("ko")) {
                                            z9 = 5;
                                            break;
                                        }
                                        z9 = -1;
                                        break;
                                    case 3518:
                                        if (language.equals("nl")) {
                                            z9 = 6;
                                            break;
                                        }
                                        z9 = -1;
                                        break;
                                    case 3651:
                                        if (language.equals("ru")) {
                                            z9 = 7;
                                            break;
                                        }
                                        z9 = -1;
                                        break;
                                    case 3734:
                                        if (language.equals("uk")) {
                                            z9 = 8;
                                            break;
                                        }
                                        z9 = -1;
                                        break;
                                    default:
                                        z9 = -1;
                                        break;
                                }
                                switch (z9) {
                                }
                        }
                        if (str != null && !TextUtils.equals(str, "localization_en.bin")) {
                            aVar = new si.a();
                            si.b bVar = this.U;
                            if (aVar.a != null) {
                                aVar.a = bVar.a.clone();
                            } else {
                                SparseArray sparseArray = bVar.a;
                                int size = sparseArray.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    aVar.a.put(sparseArray.keyAt(i7), (String) sparseArray.valueAt(i7));
                                }
                            }
                            try {
                                aVar.a = si.b.a(t0.b, str, aVar.a);
                            } catch (Exception unused2) {
                            }
                            this.W = new si.b(aVar);
                            this.V = locale;
                        }
                        this.W = this.U;
                        this.V = locale;
                    }
                    str = null;
                    if (str != null) {
                        aVar = new si.a();
                        si.b bVar2 = this.U;
                        if (aVar.a != null) {
                        }
                        aVar.a = si.b.a(t0.b, str, aVar.a);
                        this.W = new si.b(aVar);
                        this.V = locale;
                    }
                    this.W = this.U;
                    this.V = locale;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.X = false;
        }
    }

    public final void j(int i7) {
        ed edVar = this.B;
        if (edVar == null || this.P || !c1(edVar.c)) {
            return;
        }
        if (r2.a) {
            a8.b("reload locale because locale file is not enough");
        }
        g0.h3(new vc(this, i7, 2));
    }

    public final Locale k0() {
        return this.y;
    }

    public final FastDateFormat m0() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.j = k(locale, c0 ? O0(2131742780, "formatterBannedUntil24H", null) : O0(2131742781, "formatterBannedUntil12H", null), c0 ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.j;
    }

    public final FastDateFormat n0() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.k = k(locale, c0 ? O0(2131742778, "formatterBannedUntilThisYear24H", null) : O0(2131742779, "formatterBannedUntilThisYear12H", null), c0 ? "MMM dd, HH:mm" : "MMM dd, h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public final FastDateFormat o0() {
        if (this.t == null) {
            synchronized (this) {
                try {
                    if (this.t == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.t = k(locale, O0(2131742777, "formatterBoostExpired", null), "MMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.t;
    }

    public final String p(long j3, String str) {
        return q(j3, true, true, false, str);
    }

    public final FastDateFormat p0() {
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
                        this.a = k(locale, c0 ? O0(2131742775, "formatterDay24H", null) : O0(2131742776, "formatterDay12H", null), c0 ? "HH:mm" : "h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String q(long j3, boolean z9, boolean z10, boolean z11, String str) {
        double d;
        int length;
        String upperCase = str.toUpperCase();
        boolean z12 = j3 < 0;
        long abs = Math.abs(j3);
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
            case qs.T /* 30 */:
                d = abs;
                str2 = " %.0f";
                break;
            case 3:
                d = abs / 10000.0d;
                str2 = " %.4f";
                break;
            case '\t':
                double d2 = abs / 100.0f;
                if (z9 && abs % 100 == 0) {
                    str2 = " %.0f";
                }
                d = d2;
                break;
            case 18:
                d = abs / 10.0d;
                str2 = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                break;
        }
        String str3 = z10 ? str2 : " %.0f";
        if (currency == null) {
            return (z12 ? "-" : "").concat(String.format(Locale.US, upperCase.concat(str3), Double.valueOf(d)));
        }
        Locale locale = this.y;
        if (locale == null) {
            locale = this.z;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        if (z11) {
            currencyInstance.setGroupingUsed(false);
        }
        if (!z10 || (z9 && upperCase.equals("IRR"))) {
            currencyInstance.setMaximumFractionDigits(0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z12 ? "-" : "");
        sb2.append(currencyInstance.format(d));
        String sb3 = sb2.toString();
        int indexOf = sb3.indexOf(upperCase);
        if (indexOf < 0 || (length = upperCase.length() + indexOf) >= sb3.length() || sb3.charAt(length) == ' ') {
            return sb3;
        }
        return sb3.substring(0, length) + " " + sb3.substring(length);
    }

    public final FastDateFormat q0() {
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f = k(locale, O0(2131742769, "formatterMonth", null), "dd MMM");
                    }
                } finally {
                }
            }
        }
        return this.f;
    }

    public final FastDateFormat r0() {
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
                        this.b = k(locale, c0 ? O0(2131742773, "formatterDayWithSeconds24H", null) : O0(2131742774, "formatterDayWithSeconds12H", null), c0 ? "HH:mm:ss" : "h:mm:ss a");
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final FastDateFormat s0() {
        if (this.s == null) {
            synchronized (this) {
                try {
                    if (this.s == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.s = k(locale, O0(2131742772, "formatterGiveawayCard", null), "dd MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.s;
    }

    public final FastDateFormat t0() {
        if (this.u == null) {
            synchronized (this) {
                try {
                    if (this.u == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.u = k(locale, O0(2131742771, "formatterGiveawayMonthDay", null), "MMMM dd");
                    }
                } finally {
                }
            }
        }
        return this.u;
    }

    public final FastDateFormat u0() {
        if (this.v == null) {
            synchronized (this) {
                try {
                    if (this.v == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.v = k(locale, O0(2131742770, "formatterGiveawayMonthDayYear", null), "MMMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.v;
    }

    public final FastDateFormat v0() {
        if (this.q == null) {
            synchronized (this) {
                try {
                    if (this.q == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.q = k(locale, O0(2131742766, "formatterMonthYear", null), "MMM yyyy");
                    }
                } finally {
                }
            }
        }
        return this.q;
    }

    public final FastDateFormat w0() {
        if (this.o == null) {
            synchronized (this) {
                try {
                    if (this.o == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.o = k(locale, O0(2131742783, "formatDateSchedule", null), "MMM d");
                    }
                } finally {
                }
            }
        }
        return this.o;
    }

    public final FastDateFormat x0(int i7) {
        if (i7 >= 0) {
            FastDateFormat[] fastDateFormatArr = this.w;
            if (i7 < fastDateFormatArr.length) {
                if (fastDateFormatArr[i7] == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    switch (i7) {
                        case 0:
                            fastDateFormatArr[i7] = k(locale, O0(2131745588, "SendTodayAt", null), "'Send today at' HH:mm");
                            break;
                        case 1:
                            fastDateFormatArr[i7] = k(locale, O0(2131745630, "SendDayAt", null), "'Send on' MMM d 'at' HH:mm");
                            break;
                        case 2:
                            fastDateFormatArr[i7] = k(locale, O0(2131745629, "SendDayYearAt", null), "'Send on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 3:
                            fastDateFormatArr[i7] = k(locale, O0(2131746322, "RemindTodayAt", null), "'Remind today at' HH:mm");
                            break;
                        case 4:
                            fastDateFormatArr[i7] = k(locale, O0(2131746324, "RemindDayAt", null), "'Remind on' MMM d 'at' HH:mm");
                            break;
                        case 5:
                            fastDateFormatArr[i7] = k(locale, O0(2131746323, "RemindDayYearAt", null), "'Remind on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 6:
                            fastDateFormatArr[i7] = k(locale, O0(2131744906, "StartTodayAt", null), "'Start today at' HH:mm");
                            break;
                        case 7:
                            fastDateFormatArr[i7] = k(locale, O0(2131744915, "StartDayAt", null), "'Start on' MMM d 'at' HH:mm");
                            break;
                        case 8:
                            fastDateFormatArr[i7] = k(locale, O0(2131744914, "StartDayYearAt", null), "'Start on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 9:
                            fastDateFormatArr[i7] = k(locale, O0(2131744909, "StartShortTodayAt", null), "'Today,' HH:mm");
                            break;
                        case 10:
                            fastDateFormatArr[i7] = k(locale, O0(2131744911, "StartShortDayAt", null), "MMM d',' HH:mm");
                            break;
                        case 11:
                            fastDateFormatArr[i7] = k(locale, O0(2131744910, "StartShortDayYearAt", null), "MMM d yyyy, HH:mm");
                            break;
                        case 12:
                            fastDateFormatArr[i7] = k(locale, O0(2131744898, "StartsTodayAt", null), "'Starts today at' HH:mm");
                            break;
                        case 13:
                            fastDateFormatArr[i7] = k(locale, O0(2131744900, "StartsDayAt", null), "'Starts on' MMM d 'at' HH:mm");
                            break;
                        case 14:
                            fastDateFormatArr[i7] = k(locale, O0(2131744899, "StartsDayYearAt", null), "'Starts on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 15:
                            fastDateFormatArr[i7] = k(locale, O0(2131746576, "PublishTodayAt", null), "'Publish today at' HH:mm");
                            break;
                        case 16:
                            fastDateFormatArr[i7] = k(locale, O0(2131746578, "PublishDayAt", null), "'Publish on' MMM d 'at' HH:mm");
                            break;
                        case 17:
                            fastDateFormatArr[i7] = k(locale, O0(2131746577, "PublishDayYearAt", null), "'Publish on' MMM d yyyy 'at' HH:mm");
                            break;
                    }
                }
                return fastDateFormatArr[i7];
            }
        }
        return null;
    }

    public final FastDateFormat y0() {
        if (this.p == null) {
            synchronized (this) {
                try {
                    if (this.p == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.p = k(locale, O0(2131742782, "formatDateScheduleYear", null), "MMM d yyyy");
                    }
                } finally {
                }
            }
        }
        return this.p;
    }

    public final FastDateFormat z0() {
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.i = k(locale, c0 ? O0(2131742763, "formatterStats24H", null) : O0(2131742764, "formatterStats12H", null), c0 ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.i;
    }
}
