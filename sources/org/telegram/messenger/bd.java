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
import org.telegram.ui.Components.o31;
import org.telegram.ui.a60;
import org.telegram.ui.gy0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class bd {
    public static boolean a0 = false;
    public static int b0 = 1;
    public static boolean c0 = false;
    public static volatile bd d0;
    public static final char[] e0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[][] f0 = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    public static Boolean g0;
    public zc A;
    public yc B;
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
    public ti.b U;
    public volatile Locale V;
    public volatile ti.b W;
    public volatile boolean X;
    public ti.b Y;
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

    public bd() {
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
        this.S = new HashMap();
        this.T = new HashMap();
        ti.b bVar = ti.b.c;
        this.W = bVar;
        this.Y = bVar;
        b(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new zc(11));
        b(new String[]{"cs", "sk"}, new zc(3));
        b(new String[]{"ff", "fr", "kab"}, new zc(4));
        b(new String[]{"ru", "uk", "be"}, new zc(1));
        b(new String[]{"sr", "hr", "bs", "sh"}, new zc(14));
        b(new String[]{"lv"}, new zc(6));
        b(new String[]{"lt"}, new zc(7));
        b(new String[]{"pl"}, new zc(12));
        b(new String[]{"ro", "mo"}, new zc(13));
        b(new String[]{"sl"}, new zc(15));
        b(new String[]{"ar"}, new zc(0));
        b(new String[]{"mk"}, new zc(8));
        b(new String[]{"cy"}, new zc(18));
        b(new String[]{"br"}, new zc(2));
        b(new String[]{"lag"}, new zc(5));
        b(new String[]{"shi"}, new zc(16));
        b(new String[]{"mt"}, new zc(9));
        b(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new zc(17));
        b(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new zc(19));
        b(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new zc(10));
        yc ycVar = new yc();
        ycVar.a = "English";
        ycVar.b = "English";
        ycVar.f = "en";
        ycVar.c = "en";
        yc ycVar2 = null;
        ycVar.d = null;
        ycVar.j = true;
        arrayList.add(ycVar);
        hashMap.put(ycVar.c, ycVar);
        yc ycVar3 = new yc();
        ycVar3.a = "Italiano";
        ycVar3.b = "Italian";
        ycVar3.f = "it";
        ycVar3.c = "it";
        ycVar3.d = null;
        ycVar3.j = true;
        arrayList.add(ycVar3);
        hashMap.put(ycVar3.c, ycVar3);
        yc ycVar4 = new yc();
        ycVar4.a = "Español";
        ycVar4.b = "Spanish";
        ycVar4.f = "es";
        ycVar4.c = "es";
        ycVar4.j = true;
        arrayList.add(ycVar4);
        hashMap.put(ycVar4.c, ycVar4);
        yc ycVar5 = new yc();
        ycVar5.a = "Deutsch";
        ycVar5.b = "German";
        ycVar5.f = "de";
        ycVar5.c = "de";
        ycVar5.d = null;
        ycVar5.j = true;
        arrayList.add(ycVar5);
        hashMap.put(ycVar5.c, ycVar5);
        yc ycVar6 = new yc();
        ycVar6.a = "Nederlands";
        ycVar6.b = "Dutch";
        ycVar6.f = "nl";
        ycVar6.c = "nl";
        ycVar6.d = null;
        ycVar6.j = true;
        arrayList.add(ycVar6);
        hashMap.put(ycVar6.c, ycVar6);
        yc ycVar7 = new yc();
        ycVar7.a = "العربية";
        ycVar7.b = "Arabic";
        ycVar7.f = "ar";
        ycVar7.c = "ar";
        ycVar7.d = null;
        ycVar7.j = true;
        ycVar7.g = true;
        arrayList.add(ycVar7);
        hashMap.put(ycVar7.c, ycVar7);
        yc ycVar8 = new yc();
        ycVar8.a = "Português (Brasil)";
        ycVar8.b = "Portuguese (Brazil)";
        ycVar8.f = "pt_br";
        ycVar8.c = "pt_br";
        ycVar8.d = null;
        ycVar8.j = true;
        arrayList.add(ycVar8);
        hashMap.put(ycVar8.c, ycVar8);
        yc ycVar9 = new yc();
        ycVar9.a = "한국어";
        ycVar9.b = "Korean";
        ycVar9.f = "ko";
        ycVar9.c = "ko";
        ycVar9.d = null;
        ycVar9.j = true;
        arrayList.add(ycVar9);
        hashMap.put(ycVar9.c, ycVar9);
        yc ycVar10 = new yc();
        ycVar10.a = "Українська";
        ycVar10.b = "Ukrainian";
        ycVar10.f = "uk";
        ycVar10.c = "uk";
        ycVar10.d = null;
        ycVar10.j = true;
        arrayList.add(ycVar10);
        hashMap.put(ycVar10.c, ycVar10);
        yc ycVar11 = new yc();
        ycVar11.a = "Русский";
        ycVar11.b = "Russian";
        ycVar11.f = "ru";
        ycVar11.c = "ru";
        ycVar11.d = null;
        ycVar11.j = true;
        arrayList.add(ycVar11);
        hashMap.put(ycVar11.c, ycVar11);
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                yc a10 = yc.a(str);
                if (a10 != null) {
                    this.O.add(a10);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                yc a11 = yc.a(str2);
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
                yc a12 = yc.a(str3);
                if (a12 != null) {
                    a12.c = a12.c.replace("-", "_");
                    this.K.add(a12);
                }
            }
        }
        if (this.L.isEmpty()) {
            final int i3 = 0;
            g0.h3(new Runnable(this) { // from class: org.telegram.messenger.mc
                public final /* synthetic */ bd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.b.V0(h10.t0, true);
                            break;
                        default:
                            bd bdVar = this.b;
                            bdVar.getClass();
                            bdVar.F = bd.Q0();
                            break;
                    }
                }
            });
        }
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            yc ycVar12 = (yc) this.O.get(i10);
            this.J.add(ycVar12);
            this.N.put(ycVar12.b(), ycVar12);
        }
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            yc ycVar13 = (yc) this.L.get(i11);
            yc G0 = G0(ycVar13.b());
            if (G0 != null) {
                G0.d = ycVar13.d;
                G0.h = ycVar13.h;
                G0.i = ycVar13.i;
                G0.k = ycVar13.k;
                this.L.set(i11, G0);
            } else {
                this.J.add(ycVar13);
                this.N.put(ycVar13.b(), ycVar13);
            }
        }
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            yc ycVar14 = (yc) this.K.get(i12);
            yc G02 = G0(ycVar14.b());
            if (G02 != null) {
                G02.d = ycVar14.d;
                G02.h = ycVar14.h;
                G02.i = ycVar14.i;
                G02.k = ycVar14.k;
                this.K.set(i12, G02);
            } else {
                this.N.put(ycVar14.b(), ycVar14);
            }
        }
        this.z = Locale.getDefault();
        c0 = DateFormat.is24HourFormat(t0.b);
        try {
            String string4 = hp.e1().getString("language", null);
            if (string4 != null && (ycVar2 = G0(string4)) != null) {
                z10 = true;
            }
            if (ycVar2 == null && this.z.getLanguage() != null) {
                ycVar2 = G0(this.z.getLanguage());
            }
            if (ycVar2 == null && (ycVar2 = G0(I0(this.z))) == null) {
                ycVar2 = G0("en");
            }
            d(ycVar2, z10, true, h10.t0);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                t0.b.registerReceiver(new androidx.mediarouter.app.f(this, 9), intentFilter, 4);
            } else {
                t0.b.registerReceiver(new androidx.mediarouter.app.f(this, 9), intentFilter);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        final int i13 = 1;
        g0.h3(new Runnable(this) { // from class: org.telegram.messenger.mc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.V0(h10.t0, true);
                        break;
                    default:
                        bd bdVar = this.b;
                        bdVar.getClass();
                        bdVar.F = bd.Q0();
                        break;
                }
            }
        });
    }

    public static String A(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, long j10, Locale locale, boolean z10) {
        String str;
        long j11 = tL_messageEntityFormattedDate.date * 1000;
        if (tL_messageEntityFormattedDate.relative && !z10) {
            return Build.VERSION.SDK_INT >= 24 ? ad.a(j11 - j10, locale) : DateUtils.getRelativeTimeSpanString(j11, j10, 1000L, 262144).toString();
        }
        boolean z11 = (tL_messageEntityFormattedDate.flags == 0) | z10;
        String str2 = "";
        String format = tL_messageEntityFormattedDate.day_of_week ? E0().B0().format(j11) : "";
        String format2 = z11 ? E0().s0().format(j11) : tL_messageEntityFormattedDate.long_date ? E0().h0().format(j11) : tL_messageEntityFormattedDate.short_date ? E0().C0().format(j11) : "";
        if (z11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            str2 = calendar.get(13) != 0 ? E0().r0().format(j11) : E0().p0().format(j11);
        } else if (tL_messageEntityFormattedDate.long_time) {
            str2 = E0().r0().format(j11);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str2 = E0().p0().format(j11);
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
            str = a0(null, null, 2131742793, format2, str2);
        }
        return !isEmpty ? a0(null, null, 2131746342, format, str) : str;
    }

    public static String B(long j10) {
        long j11 = j10 * 1000;
        try {
            return a0(null, null, 2131752335, Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11))) : a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11))));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String C(int i3) {
        int i10 = (i3 / 60) / 60;
        int i11 = i3 - (i10 * 3600);
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

    public static String D(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 != i3 || i10 != i12) {
                return (i11 + 1 == i3 && i10 == i12) ? a0(null, null, 2131748754, a0("YesterdayAtFormatted", null, 2131742853, E0().p0().format(new Date(j11)))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131748754, a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11)))) : a0(null, null, 2131748754, a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11))));
            }
            int currentTime = ((int) (ConnectionsManager.getInstance(h10.t0).getCurrentTime() - (j11 / 1000))) / 60;
            return currentTime < 1 ? M0(2131748753, null) : currentTime < 60 ? G(currentTime, "UpdatedMinutes", new Object[0]) : a0(null, null, 2131748754, a0("TodayAtFormatted", null, 2131744121, E0().p0().format(new Date(j11))));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String E(long j10, char c2) {
        if (j10 < 0) {
            return k2.p1.l(-j10, c2, new StringBuilder("-"));
        }
        StringBuilder sb2 = new StringBuilder(String.format("%d", Long.valueOf(j10)));
        for (int length = sb2.length() - 3; length > 0; length -= 3) {
            sb2.insert(length, c2);
        }
        return sb2.toString();
    }

    public static bd E0() {
        bd bdVar;
        bd bdVar2 = d0;
        if (bdVar2 != null) {
            return bdVar2;
        }
        synchronized (bd.class) {
            try {
                bdVar = d0;
                if (bdVar == null) {
                    bdVar = new bd();
                    d0 = bdVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bdVar;
    }

    public static CharSequence F(String str, int i3, CharSequence... charSequenceArr) {
        if (str.length() == 0 || E0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        E0();
        String C = a1.g.C(str, "_", f1(E0().A.a(i3)));
        Object[] objArr = new Object[charSequenceArr.length + 1];
        objArr[0] = Integer.valueOf(i3);
        System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
        return V(C, str.concat("_other"), 0, objArr);
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
        char c2 = (char) 55356;
        return new String(new char[]{c2, (char) (((charArray[0] + 61861) & 1023) + 56320), c2, (char) (((charArray[1] + 61861) & 1023) + 56320)});
    }

    public static String G(int i3, String str, Object... objArr) {
        if (str.length() == 0 || E0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        E0();
        String C = a1.g.C(str, "_", f1(E0().A.a(i3)));
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = Integer.valueOf(i3);
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return a0(C, str.concat("_other"), 0, objArr2);
    }

    public static String H(char c2, String str, int i3) {
        return K(str, i3, c2, new Object[0]);
    }

    public static String I(int i3, String str) {
        return H(',', str, i3);
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

    public static String J(int i3, String str, Object... objArr) {
        return K(str, i3, ',', objArr);
    }

    public static String J0() {
        yc ycVar = E0().B;
        if (ycVar != null) {
            return ycVar.c();
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

    public static String K(String str, int i3, char c2, Object... objArr) {
        try {
            if (str.length() != 0 && E0().A != null) {
                E0();
                String str2 = str + "_" + f1(E0().A.a(i3));
                int i10 = 0;
                StringBuilder sb2 = new StringBuilder(String.format("%d", Integer.valueOf(i3)));
                for (int length = sb2.length() - 3; length > 0; length -= 3) {
                    sb2.insert(length, c2);
                }
                boolean z10 = r2.a;
                String b10 = E0().Y.b(str2);
                if (b10 == null) {
                    b10 = E0().Y.b(str + "_other");
                }
                if (b10 == null) {
                    try {
                        bd E0 = E0();
                        E0.i();
                        b10 = E0.W.b(str2);
                    } catch (Exception unused) {
                    }
                }
                if (b10 == null) {
                    bd E02 = E0();
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

    public static String K0(int i3, String str) {
        if (str.length() == 0 || E0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        E0();
        return E0().O0(0, a1.g.C(str, "_", f1(E0().A.a(i3))), str.concat("_other"));
    }

    public static String L(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i3 && i10 == i12) ? a0(null, null, 2131747210, E0().p0().format(new Date(j11))) : (i11 + 1 == i3 && i10 == i12) ? a0(null, null, 2131747209, E0().p0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131747211, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11))) : a0(null, null, 2131747211, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String L0(int i3) {
        return M0(i3, null);
    }

    public static String M(int i3, boolean z10) {
        return a0(null, null, z10 ? 2131747168 : 2131747180, i3 < 86400 ? R(i3) : G(i3 / 86400, "Days", new Object[0]));
    }

    public static String M0(int i3, String str) {
        return E0().O0(i3, str, null);
    }

    public static String N(long j10) {
        try {
            long j11 = j10 / 60;
            long j12 = j11 / 60;
            long j13 = j12 / 24;
            long j14 = j13 / 30;
            long j15 = j13 / 365;
            return j15 >= 1 ? j15 == 1 ? M0(2131742866, null) : H(',', "YearsAgo", (int) j15) : j14 >= 1 ? j14 == 1 ? M0(2131748353, null) : H(',', "MonthsAgo", (int) j14) : j13 >= 1 ? j13 == 1 ? M0(2131751669, null) : H(',', "DaysAgo", (int) j13) : j12 >= 1 ? j12 == 1 ? M0(2131749297, null) : H(',', "HoursAgo", (int) j12) : j11 >= 1 ? j11 == 1 ? M0(2131748434, null) : H(',', "MinutesAgo", (int) j11) : M0(2131748995, null);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String N0(String str) {
        return TextUtils.isEmpty(str) ? t4.c.f("LOC_ERR:", str) : M0(0, str);
    }

    public static String O(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i3 && i10 == i12) ? a0(null, null, 2131744120, E0().p0().format(new Date(j11))) : (i11 + 1 == i3 && i10 == i12) ? a0(null, null, 2131742853, E0().p0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11))) : a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String P(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            long j12 = timeInMillis - j11;
            return j12 < 60000 ? M0(2131745367, null) : j12 < 3600000 ? G((int) (j12 / 60000), "ShortMinutesAgo", new Object[0]) : (i11 == i3 && i10 == i12) ? j12 < 43200000 ? G((int) (j12 / 3600000), "ShortHoursAgo", new Object[0]) : M0(2131745365, null) : (i11 + 1 == i3 && i10 == i12) ? M0(2131745364, null) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? E0().q0().format(new Date(j11)) : a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String Q(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return E0().w0().format(new Date(j11)) + ", " + E0().p0().format(new Date(j11));
            }
            return E0().y0().format(new Date(j11)) + ", " + E0().p0().format(new Date(j11));
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

    public static String R(int i3) {
        int i10 = i3 / 3600;
        int i11 = (i3 / 60) % 60;
        int i12 = i3 % 60;
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

    public static String S(int[] iArr, int i3) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = i3 / 1000;
            if (i11 <= 0) {
                break;
            }
            sb2.append("K");
            i10 = (i3 % 1000) / 100;
            i3 = i11;
        }
        if (iArr != null) {
            double d = (i10 / 10.0d) + i3;
            for (int i12 = 0; i12 < sb2.length(); i12++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i10 == 0 || sb2.length() <= 0) {
            if (sb2.length() == 2) {
                Locale locale = Locale.US;
                return com.google.android.recaptcha.internal.a.h(i3, "M");
            }
            Locale locale2 = Locale.US;
            return com.google.android.recaptcha.internal.a.h(i3, sb2.toString());
        }
        if (sb2.length() == 2) {
            Locale locale3 = Locale.US;
            return i3 + "." + i10 + "M";
        }
        Locale locale4 = Locale.US;
        return i3 + "." + i10 + sb2.toString();
    }

    public static String T(long j10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i3 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (i3 == calendar.get(1)) {
                return E0().q0().format(j11);
            }
            return E0().q0().format(j11) + ", " + calendar.get(1);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static boolean T0(File file) {
        return file != null && new File(new File(t0.h(), "malformed_locales"), file.getName()).exists();
    }

    public static CharSequence U(int i3, Object... objArr) {
        return V(null, null, i3, objArr);
    }

    public static boolean U0(int i3) {
        if (i3 == 9 || i3 == 10 || i3 == 13) {
            return true;
        }
        if (i3 >= 32 && i3 <= 55295) {
            return true;
        }
        if (i3 < 57344 || i3 > 65533) {
            return i3 >= 65536 && i3 <= 1114111;
        }
        return true;
    }

    public static CharSequence V(String str, String str2, int i3, Object... objArr) {
        String str3;
        try {
            String P0 = E0().P0(i3, str, str2);
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

    public static String W(int i3, long j10, boolean z10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(1);
        int i11 = calendar.get(6);
        calendar.setTimeInMillis(j10 * 1000);
        int i12 = i10 == calendar.get(1) ? (z10 && calendar.get(6) == i11) ? 0 : 1 : 2;
        if (i3 == 1) {
            i12 += 3;
        } else if (i3 == 2) {
            i12 += 6;
        } else if (i3 == 3) {
            i12 += 9;
        } else if (i3 == 4) {
            i12 += 12;
        }
        return E0().x0(i12).format(calendar.getTimeInMillis());
    }

    public static String X(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            long j12 = timeInMillis - j11;
            if (j12 < 60000) {
                return M0(2131746008, null);
            }
            if (j12 >= 3600000) {
                return (i11 == i3 && i10 == i12) ? a0(null, null, 2131744120, E0().p0().format(new Date(j11))) : (i11 + 1 == i3 && i10 == i12) ? a0(null, null, 2131742853, E0().p0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11))) : a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
            int i13 = (int) (j12 / 60000);
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
        hp.e1().edit().putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static String Y(int i3, String str, Object... objArr) {
        return a0(str, null, i3, objArr);
    }

    public static String Z(int i3, Object... objArr) {
        return a0(null, null, i3, objArr);
    }

    public static String a(String str) {
        return str.replace(' ', (char) 160);
    }

    public static String a0(String str, String str2, int i3, Object... objArr) {
        try {
            String P0 = E0().P0(i3, str, str2);
            if (P0 != null) {
                return E0().y != null ? String.format(E0().y, P0, objArr) : String.format(P0, objArr);
            }
            return "LOC_ERR: " + str;
        } catch (Exception e10) {
            a8.g(e10, true);
            if (i3 != 0) {
                try {
                    return String.format(t0.b.getString(i3), objArr);
                } catch (Exception unused) {
                    return t4.c.f("LOC_ERR: ", str);
                }
            }
            return t4.c.f("LOC_ERR: ", str);
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

    public static String c0(int i3) {
        if (i3 < 60) {
            return G(i3, "Seconds", new Object[0]);
        }
        if (i3 < 3600) {
            return G(i3 / 60, "Minutes", new Object[0]);
        }
        if (i3 < 86400) {
            return G((i3 / 60) / 60, "Hours", new Object[0]);
        }
        if (i3 < 604800) {
            return G(((i3 / 60) / 60) / 24, "Days", new Object[0]);
        }
        if (i3 >= 2678400) {
            return (i3 < 31536000 || i3 % 31536000 != 0) ? G((((i3 / 60) / 60) / 24) / 30, "Months", new Object[0]) : G((((i3 / 60) / 60) / 24) / 365, "Years", new Object[0]);
        }
        int i10 = ((i3 / 60) / 60) / 24;
        return i3 % 7 == 0 ? G(i10 / 7, "Weeks", new Object[0]) : a1.g.C(G(i10 / 7, "Weeks", new Object[0]), " ", G(i10 % 7, "Days", new Object[0]));
    }

    public static String d0(int i3, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
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
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && hp.s1(i3).a0.containsKey(Long.valueOf(user.id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return M0(2131747834, "Online");
        }
        if (user == null || (userStatus = user.status) == null || userStatus.expires == 0 || l10.x(user) || (user instanceof TLRPC.TL_userEmpty)) {
            return M0(2131754951, "ALongTimeAgo");
        }
        int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        int i10 = user.status.expires;
        if (i10 <= currentTime) {
            return i10 == -1 ? M0(2131749186, "Invisible") : (i10 == -100 || i10 == -1000) ? M0(2131749019, "Lately") : (i10 == -101 || i10 == -1001) ? M0(2131742872, "WithinAWeek") : (i10 == -102 || i10 == -1002) ? M0(2131742873, "WithinAMonth") : w(i10, zArr2);
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        return M0(2131747834, "Online");
    }

    public static String e0(long j10, boolean z10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            String[] strArr = {M0(2131749094, null), M0(2131750830, null), M0(2131748691, null), M0(2131754173, null), M0(2131748670, null), M0(2131749072, null), M0(2131749074, null), M0(2131753895, null), M0(2131745575, null), M0(2131747838, null), M0(2131747843, null), M0(2131751606, null)};
            if (i3 == i10 && !z10) {
                return strArr[i11];
            }
            return strArr[i11] + " " + i10;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String e1(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return E0().C0().format(new Date(j11));
            }
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            calendar.setTimeInMillis(j11);
            int i10 = calendar.get(6) - i3;
            if (i10 != 0 && (i10 != -1 || System.currentTimeMillis() - j11 >= 28800000)) {
                return (i10 <= -7 || i10 > -1) ? E0().q0().format(new Date(j11)) : E0().A0().format(new Date(j11));
            }
            return E0().p0().format(new Date(j11));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String f0(long j10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i3 = calendar.get(1);
            int i10 = calendar.get(2);
            return new String[]{M0(2131749094, null), M0(2131750830, null), M0(2131748691, null), M0(2131754173, null), M0(2131748670, null), M0(2131749072, null), M0(2131749074, null), M0(2131753895, null), M0(2131745575, null), M0(2131747838, null), M0(2131747843, null), M0(2131751606, null)}[i10] + " " + calendar.get(5) + ", " + i3;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String f1(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? i3 != 16 ? "other" : "many" : "few" : "two" : "one" : "zero";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Spannable g(String str) {
        if (str instanceof Spannable) {
            ((Spannable) str).setSpan(new o31(g0.o()), 0, str.length(), 33);
            return (Spannable) str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new o31(g0.o()), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static int h(HashMap hashMap) {
        HashSet hashSet = new HashSet();
        int i3 = 0;
        for (String str : hashMap.keySet()) {
            if (str != null) {
                String j10 = str.endsWith("_other") ? com.google.android.recaptcha.internal.a.j(str, 6, 0) : (str.endsWith("_zero") || str.endsWith("_many")) ? com.google.android.recaptcha.internal.a.j(str, 5, 0) : (str.endsWith("_one") || str.endsWith("_two") || str.endsWith("_few")) ? com.google.android.recaptcha.internal.a.j(str, 4, 0) : null;
                if (j10 != null) {
                    if (!hashSet.contains(j10)) {
                        hashSet.add(j10);
                    }
                }
                i3++;
            }
        }
        hashSet.clear();
        return i3;
    }

    public static String i0(int i3, String str) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return M0(i3, null);
        }
        try {
            return new Locale("", str).getDisplayCountry(E0().y);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static String j0() {
        yc ycVar = E0().B;
        return (ycVar == null || TextUtils.isEmpty(ycVar.a)) ? M0(2131749057, "LanguageName") : ycVar.a;
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
        int i3 = az.s1;
        if (i3 != 0) {
            g0 = Boolean.valueOf(i3 == 2);
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

    public static int l0(yc ycVar, TLRPC.TL_langPackDifference tL_langPackDifference) {
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        if (lowerCase.equals(ycVar.c)) {
            return 0;
        }
        return lowerCase.equals(ycVar.e) ? 1 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r6 != false) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m(String str, boolean z10) {
        String str2;
        int i3;
        int i10;
        boolean z11;
        String substring;
        int indexOf;
        int length = str.length();
        StringBuilder sb2 = null;
        int i11 = 0;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt == '<') {
                str2 = "&lt;";
                if (z10 && str.startsWith("<![CDATA[", i11) && (indexOf = str.indexOf("]]>", i11 + 9)) >= 0) {
                    i10 = ((indexOf + 3) - i11) - 1;
                    str2 = null;
                }
                i10 = 0;
            } else {
                if (charAt == '>') {
                    str2 = "&gt;";
                } else if (charAt == '&') {
                    if (z10) {
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
                                    z11 = true;
                                    break;
                                default:
                                    if (substring.length() >= 2 && substring.charAt(0) == '#') {
                                        boolean z12 = substring.charAt(1) == 'x';
                                        int i13 = z12 ? 2 : 1;
                                        if (i13 < substring.length()) {
                                            int i14 = 0;
                                            while (i13 < substring.length()) {
                                                int i15 = 16;
                                                int digit = Character.digit(substring.charAt(i13), z12 ? 16 : 10);
                                                if (digit >= 0 && substring.charAt(i13) <= 'f') {
                                                    if (!z12) {
                                                        i15 = 10;
                                                    }
                                                    i14 = (i14 * i15) + digit;
                                                    i13++;
                                                }
                                            }
                                            z11 = U0(i14);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                        z11 = false;
                    }
                    str2 = "&amp;";
                } else if (Character.isHighSurrogate(charAt) && (i3 = i11 + 1) < length && Character.isLowSurrogate(str.charAt(i3))) {
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
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = sb2.charAt(i3);
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
                            sb2.setCharAt(i3, e0[i11]);
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

    public static String o(int i3) {
        if (i3 <= 3600) {
            return i3 > 60 ? G(i3 / 60, "Minutes", new Object[0]) : G(i3, "Seconds", new Object[0]);
        }
        String G = G(i3 / 3600, "Hours", new Object[0]);
        int i10 = (i3 % 3600) / 60;
        if (i10 <= 0) {
            return G;
        }
        StringBuilder h = t4.c.h(G, ", ");
        h.append(G(i10, "Minutes", new Object[0]));
        return h.toString();
    }

    public static String r(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i3 && i10 == i12) ? z10 ? M0(2131745365, null) : E0().p0().format(new Date(j11)) : (i11 + 1 == i3 && i10 == i12) ? M0(2131742855, "Yesterday") : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? E0().q0().format(new Date(j11)) : E0().C0().format(new Date(j11));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDate";
        }
    }

    public static String s(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i3 && i10 == i12) ? z10 ? a0(null, null, 2131744121, E0().p0().format(new Date(j11))) : a0(null, null, 2131744120, E0().p0().format(new Date(j11))) : (i11 + 1 == i3 && i10 == i12) ? a0(null, null, 2131742853, E0().p0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11))) : a0(null, null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String t(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            if (i11 == i3 && i10 == i12) {
                return E0().p0().format(new Date(j11));
            }
            if (i11 + 1 == i3 && i10 == i12) {
                return a0(null, null, 2131742853, E0().p0().format(new Date(j11)));
            }
            if (Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return a0(null, null, 2131742793, E0().h0().format(new Date(j11)), E0().p0().format(new Date(j11)));
            }
            bd E0 = E0();
            if (E0.m == null) {
                synchronized (E0) {
                    try {
                        if (E0.m == null) {
                            Locale locale = E0.y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            E0.m = k(locale, E0.O0(2131742795, "chatDateShort", null), "d MMM");
                        }
                    } finally {
                    }
                }
            }
            return a0(null, null, 2131742793, E0.m.format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String u(long j10, boolean z10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i3 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (z10) {
                if (i3 != calendar.get(1)) {
                }
                return E0().g0().format(j11);
            }
            if (z10 || Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return E0().h0().format(j11);
            }
            return E0().g0().format(j11);
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String v(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            return i3 == calendar.get(1) ? E0().n0().format(new Date(j11)) : E0().m0().format(new Date(j11));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String w(long j10, boolean[] zArr) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            int i11 = calendar.get(11);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            int i14 = calendar.get(11);
            if (i12 == i3 && i10 == i13) {
                return a0(null, null, 2131749025, a0("TodayAtFormatted", null, 2131744121, E0().p0().format(new Date(j11))));
            }
            if (i12 + 1 != i3 || i10 != i13) {
                return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0("LastSeenDateFormatted", null, 2131749028, a0("formatDateAtTime", null, 2131742793, E0().q0().format(new Date(j11)), E0().p0().format(new Date(j11)))) : a0("LastSeenDateFormatted", null, 2131749028, a0("formatDateAtTime", null, 2131742793, E0().C0().format(new Date(j11)), E0().p0().format(new Date(j11))));
            }
            if (zArr == null) {
                return a0(null, null, 2131749025, a0("YesterdayAtFormatted", null, 2131742853, E0().p0().format(new Date(j11))));
            }
            zArr[0] = true;
            return (i11 > 6 || i14 <= 18 || !c0) ? a0(null, null, 2131742853, E0().p0().format(new Date(j11))) : a0(null, null, 2131749025, E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String x(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(6);
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6);
            int i12 = calendar.get(1);
            return (i11 == i3 && i10 == i12 && z10) ? a0(null, null, 2131744120, E0().p0().format(new Date(j11))) : (i11 + 1 == i3 && i10 == i12 && z10) ? a0(null, null, 2131742853, E0().p0().format(new Date(j11))) : Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? a0(null, null, 2131742793, E0().g0().format(new Date(j11)), E0().p0().format(new Date(j11))) : a0(null, null, 2131742793, E0().h0().format(new Date(j11)), E0().p0().format(new Date(j11)));
        } catch (Exception e10) {
            a8.g(e10, true);
            return "LOC_ERR";
        }
    }

    public static String y(float f10, int i3, Boolean bool) {
        l();
        if ((bool == null || !bool.booleanValue()) && !(bool == null && g0.booleanValue())) {
            if (f10 < 1000.0f) {
                return i3 != 0 ? i3 != 1 ? a0("MetersShort", null, 2131748450, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : a0("MetersFromYou2", null, 2131748451, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : a0("MetersAway2", null, 2131748452, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
            }
            String format = f10 % 1000.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f10 / 1000.0f))) : String.format("%.2f", Float.valueOf(f10 / 1000.0f));
            return i3 != 0 ? i3 != 1 ? a0("KMetersShort", null, 2131749069, format) : a0("KMetersFromYou2", null, 2131749070, format) : a0("KMetersAway2", null, 2131749071, format);
        }
        float f11 = f10 * 3.28084f;
        if (f11 < 1000.0f) {
            return i3 != 0 ? i3 != 1 ? a0("FootsShort", null, 2131750602, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11)))) : a0("FootsFromYou", null, 2131750603, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11)))) : a0("FootsAway", null, 2131750604, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11))));
        }
        String format2 = f11 % 5280.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f11 / 5280.0f))) : String.format("%.2f", Float.valueOf(f11 / 5280.0f));
        return i3 != 0 ? i3 != 1 ? a0("MilesShort", null, 2131748435, format2) : a0("MilesFromYou", null, 2131748436, format2) : a0("MilesAway", null, 2131748437, format2);
    }

    public static String z(int i3) {
        if (i3 <= 0) {
            return G(0, "Seconds", new Object[0]);
        }
        int i10 = i3 / 3600;
        int i11 = (i3 / 60) % 60;
        int i12 = i3 % 60;
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
                        this.d = k(locale, O0(2131742771, "formatterWeek", null), "EEE");
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
                        this.e = k(locale, O0(2131742770, "formatterWeekLong", null), "EEEE");
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
                        this.g = k(locale, O0(2131742769, "formatterYear", null), "dd.MM.yy");
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
                        this.h = k(locale, O0(2131742768, "formatterYearMax", null), "dd.MM.yyyy");
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public final yc G0(String str) {
        if (str == null) {
            return null;
        }
        return (yc) this.N.get(str.toLowerCase().replace("-", "_"));
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap H0(File file, boolean z10, boolean z11, boolean z12) {
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
                                        if (z10) {
                                            str3 = m(trim, false);
                                        } else {
                                            String replace = trim.replace("\\n", "\n").replace("\\", "");
                                            str3 = replace.replace("&lt;", "<");
                                            if (z12 && !this.E && !str3.equals(replace)) {
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
                            if (z12) {
                                a8.b("getLocaleFileStrings: error, reloadLastFile = true;");
                                this.E = true;
                            }
                            if (z11) {
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

    public final String O0(int i3, String str, String str2) {
        String P0 = P0(i3, str, str2);
        return P0 == null ? t4.c.f("LOC_ERR:", str) : P0;
    }

    public final String P0(int i3, String str, String str2) {
        Context context = t0.b;
        boolean z10 = r2.a;
        String c2 = this.Y.c(i3, context, str);
        if (c2 != null) {
            return c2;
        }
        String b10 = this.Y.b(str2);
        if (b10 != null) {
            return b10;
        }
        i();
        String c10 = this.W.c(i3, context, str);
        return c10 != null ? c10 : this.W.b(str2);
    }

    public final String R0(String str) {
        return S0(str, true, false);
    }

    public final String S0(String str, boolean z10, boolean z11) {
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
        int i3 = 0;
        boolean z12 = false;
        while (i3 < length) {
            int i10 = i3 + 1;
            String substring = str.substring(i3, i10);
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
            i3 = i10;
        }
        return sb2.toString();
    }

    public final void V0(int i3, boolean z10) {
        if (this.I) {
            return;
        }
        this.I = true;
        ConnectionsManager.getInstance(i3).sendRequest(new TLRPC.TL_langpack_getLanguages(), new vc(this, z10, i3), 8);
    }

    public final void W0(Configuration configuration) {
        if (this.D) {
            return;
        }
        c0 = DateFormat.is24HourFormat(t0.b);
        Locale locale = configuration.locale;
        this.z = locale;
        if (this.C != null) {
            yc ycVar = this.B;
            this.B = null;
            d(ycVar, false, false, h10.t0);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.y.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                Y0();
            }
            this.y = locale;
            yc ycVar2 = this.B;
            if (ycVar2 != null && !TextUtils.isEmpty(ycVar2.f)) {
                this.A = (zc) this.x.get(this.B.f);
            }
            if (this.A == null) {
                zc zcVar = (zc) this.x.get(this.y.getLanguage());
                this.A = zcVar;
                if (zcVar == null) {
                    this.A = (zc) this.x.get("en");
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
        yc ycVar;
        Locale locale = this.y;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i3 = 0;
        a0 = (lowerCase.length() == 2 && (lowerCase.equals("ar") || lowerCase.equals("fa") || lowerCase.equals("he") || lowerCase.equals("iw"))) || lowerCase.startsWith("ar_") || lowerCase.startsWith("fa_") || lowerCase.startsWith("he_") || lowerCase.startsWith("iw_") || ((ycVar = this.B) != null && ycVar.g);
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
            if (i3 >= fastDateFormatArr.length) {
                return;
            }
            fastDateFormatArr[i3] = null;
            i3++;
        }
    }

    public final void Z0(int i3, String str, boolean z10, qc qcVar) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            yc ycVar = this.B;
            if (ycVar == null) {
                return;
            }
            if (!str2.equals(ycVar.c) && !str2.equals(this.B.e)) {
                return;
            }
        }
        f(this.B, str2, z10, i3, qcVar);
    }

    public final void a1() {
        SharedPreferences.Editor edit = t0.b.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < this.O.size(); i3++) {
            String f10 = ((yc) this.O.get(i3)).f();
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
            String f11 = ((yc) this.L.get(i10)).f();
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
            String f12 = ((yc) this.K.get(i11)).f();
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

    public final void b(String[] strArr, zc zcVar) {
        for (String str : strArr) {
            this.x.put(str, zcVar);
        }
    }

    public final void b1(final yc ycVar, final TLRPC.TL_langPackDifference tL_langPackDifference, final int i3, final boolean z10, final Runnable runnable) {
        int i10;
        boolean z11 = true;
        if (tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty() || ycVar == null || ycVar.h()) {
            StringBuilder sb2 = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
            sb2.append(tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty());
            sb2.append("; locale is local or null=");
            if (ycVar != null && !ycVar.h()) {
                z11 = false;
            }
            sb2.append(z11);
            a8.b(sb2.toString());
            if (tL_langPackDifference != null && ycVar != null && !ycVar.h() && tL_langPackDifference.from_version != 0) {
                int l02 = l0(ycVar, tL_langPackDifference);
                int i11 = l02 == 0 ? ycVar.h : ycVar.i;
                if (l02 != -1 && tL_langPackDifference.from_version <= i11 && i11 < (i10 = tL_langPackDifference.version)) {
                    if (l02 == 0) {
                        ycVar.h = i10;
                    } else {
                        ycVar.i = i10;
                    }
                    a1();
                }
            }
            Y0();
            hs.e().k(hs.x4, new Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final int l03 = l0(ycVar, tL_langPackDifference);
        if (l03 == -1) {
            a8.b("saveRemoteLocaleStrings: unknown language " + tL_langPackDifference.lang_code + " (locale short=" + ycVar.c + ", base=" + ycVar.e + ")");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final String str = l03 == 0 ? ycVar.c : ycVar.e;
        final int i12 = l03 == 0 ? ycVar.h : ycVar.i;
        File e10 = l03 == 0 ? ycVar.e() : ycVar.d();
        if (e10 == null) {
            k2.p1.w(tL_langPackDifference.lang_code, new StringBuilder("saveRemoteLocaleStrings: no file for "));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final File d = !ycVar.g() ? null : l03 == 0 ? ycVar.d() : ycVar.e();
        if (this.R == null) {
            this.R = new q5("langpackQueue", true);
        }
        final File file = e10;
        this.R.postRunnable(new Runnable() { // from class: org.telegram.messenger.tc
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
                boolean z12;
                File file2;
                final HashMap hashMap;
                int i14;
                HashMap hashMap2;
                int i15;
                boolean z13;
                FileOutputStream fileOutputStream;
                boolean z14;
                int i16;
                Object[] objArr;
                String str2;
                final TLRPC.TL_langPackDifference tL_langPackDifference2 = tL_langPackDifference;
                boolean z15 = true;
                int[] iArr2 = new int[1];
                int i17 = l03;
                boolean z16 = false;
                Object[] objArr2 = i17 == 1;
                final bd bdVar = bd.this;
                HashMap hashMap3 = bdVar.S;
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
                        z12 = true;
                        file2 = null;
                        a8.g(e, z12);
                        if (file2 != null) {
                        }
                        hashMap = null;
                        final yc ycVar2 = ycVar;
                        final String str3 = str;
                        final boolean z17 = z10;
                        final int i19 = i3;
                        final Runnable runnable2 = runnable;
                        final int[] iArr3 = iArr;
                        final int i20 = i13;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                            @Override // java.lang.Runnable
                            public final void run() {
                                bd bdVar2 = bd.this;
                                HashMap hashMap4 = hashMap;
                                int[] iArr4 = iArr3;
                                yc ycVar3 = ycVar2;
                                String str4 = str3;
                                boolean z18 = z17;
                                int i21 = i19;
                                Runnable runnable3 = runnable2;
                                int i22 = i20;
                                TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                if (hashMap4 == null) {
                                    int i23 = iArr4[0];
                                    if (i23 == 1 || i23 == 2) {
                                        bdVar2.f(ycVar3, str4, i23 == 2 || z18, i21, runnable3);
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
                                    ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                                } else {
                                    ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                                }
                                bdVar2.a1();
                                try {
                                    if (bdVar2.B == ycVar3) {
                                        String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                        Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                        bdVar2.C = ycVar3.c;
                                        SharedPreferences.Editor edit = hp.e1().edit();
                                        edit.putString("language", ycVar3.b());
                                        edit.commit();
                                        ti.a aVar = new ti.a();
                                        aVar.a(hashMap4);
                                        bdVar2.Y = new ti.b(aVar);
                                        bdVar2.Z = bd.h(hashMap4);
                                        bdVar2.y = locale;
                                        bdVar2.B = ycVar3;
                                        if (!TextUtils.isEmpty(ycVar3.f)) {
                                            bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                        }
                                        if (bdVar2.A == null) {
                                            zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                            bdVar2.A = zcVar;
                                            if (zcVar == null) {
                                                bdVar2.A = (zc) bdVar2.x.get("en");
                                            }
                                        }
                                        bdVar2.D = true;
                                        Locale.setDefault(bdVar2.y);
                                        Configuration configuration = new Configuration();
                                        configuration.locale = bdVar2.y;
                                        t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                        bdVar2.D = false;
                                        gy0.s = false;
                                    } else {
                                        a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                    }
                                } catch (Exception e12) {
                                    a8.g(e12, true);
                                    bdVar2.D = false;
                                }
                                bdVar2.Y0();
                                hs.e().k(hs.x4, new Object[0]);
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
                        HashMap H0 = file3.exists() ? bdVar.H0(file3, true, true, false) : null;
                        if (H0 != null) {
                            hashMap2 = H0;
                            i15 = 0;
                            while (i15 < tL_langPackDifference2.strings.size()) {
                            }
                            z13 = z16;
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
                            hashMap = bdVar.H0(file2, z13, true, z13);
                            if (hashMap != null) {
                            }
                            hashMap = null;
                            final yc ycVar22 = ycVar;
                            final String str32 = str;
                            final boolean z172 = z10;
                            final int i192 = i3;
                            final Runnable runnable22 = runnable;
                            final int[] iArr32 = iArr;
                            final int i202 = i13;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bd bdVar2 = bd.this;
                                    HashMap hashMap4 = hashMap;
                                    int[] iArr4 = iArr32;
                                    yc ycVar3 = ycVar22;
                                    String str4 = str32;
                                    boolean z18 = z172;
                                    int i21 = i192;
                                    Runnable runnable3 = runnable22;
                                    int i22 = i202;
                                    TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                    if (hashMap4 == null) {
                                        int i23 = iArr4[0];
                                        if (i23 == 1 || i23 == 2) {
                                            bdVar2.f(ycVar3, str4, i23 == 2 || z18, i21, runnable3);
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
                                        ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                                    } else {
                                        ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                                    }
                                    bdVar2.a1();
                                    try {
                                        if (bdVar2.B == ycVar3) {
                                            String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                            Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                            bdVar2.C = ycVar3.c;
                                            SharedPreferences.Editor edit = hp.e1().edit();
                                            edit.putString("language", ycVar3.b());
                                            edit.commit();
                                            ti.a aVar = new ti.a();
                                            aVar.a(hashMap4);
                                            bdVar2.Y = new ti.b(aVar);
                                            bdVar2.Z = bd.h(hashMap4);
                                            bdVar2.y = locale;
                                            bdVar2.B = ycVar3;
                                            if (!TextUtils.isEmpty(ycVar3.f)) {
                                                bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                            }
                                            if (bdVar2.A == null) {
                                                zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                                bdVar2.A = zcVar;
                                                if (zcVar == null) {
                                                    bdVar2.A = (zc) bdVar2.x.get("en");
                                                }
                                            }
                                            bdVar2.D = true;
                                            Locale.setDefault(bdVar2.y);
                                            Configuration configuration = new Configuration();
                                            configuration.locale = bdVar2.y;
                                            t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                            bdVar2.D = false;
                                            gy0.s = false;
                                        } else {
                                            a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                        }
                                    } catch (Exception e122) {
                                        a8.g(e122, true);
                                        bdVar2.D = false;
                                    }
                                    bdVar2.Y0();
                                    hs.e().k(hs.x4, new Object[0]);
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
                    final yc ycVar222 = ycVar;
                    final String str322 = str;
                    final boolean z1722 = z10;
                    final int i1922 = i3;
                    final Runnable runnable222 = runnable;
                    final int[] iArr322 = iArr;
                    final int i2022 = i13;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                        @Override // java.lang.Runnable
                        public final void run() {
                            bd bdVar2 = bd.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr322;
                            yc ycVar3 = ycVar222;
                            String str4 = str322;
                            boolean z18 = z1722;
                            int i21 = i1922;
                            Runnable runnable3 = runnable222;
                            int i22 = i2022;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i23 = iArr4[0];
                                if (i23 == 1 || i23 == 2) {
                                    bdVar2.f(ycVar3, str4, i23 == 2 || z18, i21, runnable3);
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
                                ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                            } else {
                                ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                            }
                            bdVar2.a1();
                            try {
                                if (bdVar2.B == ycVar3) {
                                    String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    bdVar2.C = ycVar3.c;
                                    SharedPreferences.Editor edit = hp.e1().edit();
                                    edit.putString("language", ycVar3.b());
                                    edit.commit();
                                    ti.a aVar = new ti.a();
                                    aVar.a(hashMap4);
                                    bdVar2.Y = new ti.b(aVar);
                                    bdVar2.Z = bd.h(hashMap4);
                                    bdVar2.y = locale;
                                    bdVar2.B = ycVar3;
                                    if (!TextUtils.isEmpty(ycVar3.f)) {
                                        bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                    }
                                    if (bdVar2.A == null) {
                                        zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                        bdVar2.A = zcVar;
                                        if (zcVar == null) {
                                            bdVar2.A = (zc) bdVar2.x.get("en");
                                        }
                                    }
                                    bdVar2.D = true;
                                    Locale.setDefault(bdVar2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = bdVar2.y;
                                    t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                    bdVar2.D = false;
                                    gy0.s = false;
                                } else {
                                    a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e122) {
                                a8.g(e122, true);
                                bdVar2.D = false;
                            }
                            bdVar2.Y0();
                            hs.e().k(hs.x4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                a8.b("saveRemoteLocaleStrings: difference is straight from the beginning, version " + tL_langPackDifference2.version + " ours " + i18);
                if (tL_langPackDifference2.version < i18 && !bd.T0(file3) && file3.exists() && bdVar.H0(file3, true, true, false) != null) {
                    a8.b("saveRemoteLocaleStrings: whole langpack is older than ours, skip");
                    iArr = iArr2;
                    i13 = i17;
                    hashMap = null;
                    final yc ycVar2222 = ycVar;
                    final String str3222 = str;
                    final boolean z17222 = z10;
                    final int i19222 = i3;
                    final Runnable runnable2222 = runnable;
                    final int[] iArr3222 = iArr;
                    final int i20222 = i13;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                        @Override // java.lang.Runnable
                        public final void run() {
                            bd bdVar2 = bd.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr3222;
                            yc ycVar3 = ycVar2222;
                            String str4 = str3222;
                            boolean z18 = z17222;
                            int i21 = i19222;
                            Runnable runnable3 = runnable2222;
                            int i22 = i20222;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i23 = iArr4[0];
                                if (i23 == 1 || i23 == 2) {
                                    bdVar2.f(ycVar3, str4, i23 == 2 || z18, i21, runnable3);
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
                                ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                            } else {
                                ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                            }
                            bdVar2.a1();
                            try {
                                if (bdVar2.B == ycVar3) {
                                    String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    bdVar2.C = ycVar3.c;
                                    SharedPreferences.Editor edit = hp.e1().edit();
                                    edit.putString("language", ycVar3.b());
                                    edit.commit();
                                    ti.a aVar = new ti.a();
                                    aVar.a(hashMap4);
                                    bdVar2.Y = new ti.b(aVar);
                                    bdVar2.Z = bd.h(hashMap4);
                                    bdVar2.y = locale;
                                    bdVar2.B = ycVar3;
                                    if (!TextUtils.isEmpty(ycVar3.f)) {
                                        bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                    }
                                    if (bdVar2.A == null) {
                                        zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                        bdVar2.A = zcVar;
                                        if (zcVar == null) {
                                            bdVar2.A = (zc) bdVar2.x.get("en");
                                        }
                                    }
                                    bdVar2.D = true;
                                    Locale.setDefault(bdVar2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = bdVar2.y;
                                    t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                    bdVar2.D = false;
                                    gy0.s = false;
                                } else {
                                    a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e122) {
                                a8.g(e122, true);
                                bdVar2.D = false;
                            }
                            bdVar2.Y0();
                            hs.e().k(hs.x4, new Object[0]);
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
                        hashMap2.put(langPackString.key, bd.m(langPackString.value, z15));
                        z14 = z16;
                        iArr = iArr2;
                        i16 = i15;
                        objArr = objArr2;
                        i13 = i17;
                    } else {
                        z14 = z16;
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
                                        str2 = bd.m(str4, true);
                                    } catch (Exception e13) {
                                        e = e13;
                                        file2 = null;
                                        z12 = true;
                                        a8.g(e, z12);
                                        if (file2 != null) {
                                        }
                                        hashMap = null;
                                        final yc ycVar22222 = ycVar;
                                        final String str32222 = str;
                                        final boolean z172222 = z10;
                                        final int i192222 = i3;
                                        final Runnable runnable22222 = runnable;
                                        final int[] iArr32222 = iArr;
                                        final int i202222 = i13;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                bd bdVar2 = bd.this;
                                                HashMap hashMap4 = hashMap;
                                                int[] iArr4 = iArr32222;
                                                yc ycVar3 = ycVar22222;
                                                String str42 = str32222;
                                                boolean z18 = z172222;
                                                int i21 = i192222;
                                                Runnable runnable3 = runnable22222;
                                                int i22 = i202222;
                                                TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                                if (hashMap4 == null) {
                                                    int i23 = iArr4[0];
                                                    if (i23 == 1 || i23 == 2) {
                                                        bdVar2.f(ycVar3, str42, i23 == 2 || z18, i21, runnable3);
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
                                                    ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                                                } else {
                                                    ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                                                }
                                                bdVar2.a1();
                                                try {
                                                    if (bdVar2.B == ycVar3) {
                                                        String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                                        Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                                        bdVar2.C = ycVar3.c;
                                                        SharedPreferences.Editor edit = hp.e1().edit();
                                                        edit.putString("language", ycVar3.b());
                                                        edit.commit();
                                                        ti.a aVar = new ti.a();
                                                        aVar.a(hashMap4);
                                                        bdVar2.Y = new ti.b(aVar);
                                                        bdVar2.Z = bd.h(hashMap4);
                                                        bdVar2.y = locale;
                                                        bdVar2.B = ycVar3;
                                                        if (!TextUtils.isEmpty(ycVar3.f)) {
                                                            bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                                        }
                                                        if (bdVar2.A == null) {
                                                            zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                                            bdVar2.A = zcVar;
                                                            if (zcVar == null) {
                                                                bdVar2.A = (zc) bdVar2.x.get("en");
                                                            }
                                                        }
                                                        bdVar2.D = true;
                                                        Locale.setDefault(bdVar2.y);
                                                        Configuration configuration = new Configuration();
                                                        configuration.locale = bdVar2.y;
                                                        t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                                        bdVar2.D = false;
                                                        gy0.s = false;
                                                    } else {
                                                        a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                                    }
                                                } catch (Exception e122) {
                                                    a8.g(e122, true);
                                                    bdVar2.D = false;
                                                }
                                                bdVar2.Y0();
                                                hs.e().k(hs.x4, new Object[0]);
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
                                hashMap2.put(str5, str6 != null ? bd.m(str6, true) : "");
                                String str7 = langPackString.key + "_two";
                                String str8 = langPackString.two_value;
                                hashMap2.put(str7, str8 != null ? bd.m(str8, true) : "");
                                String str9 = langPackString.key + "_few";
                                String str10 = langPackString.few_value;
                                hashMap2.put(str9, str10 != null ? bd.m(str10, true) : "");
                                String str11 = langPackString.key + "_many";
                                String str12 = langPackString.many_value;
                                hashMap2.put(str11, str12 != null ? bd.m(str12, true) : "");
                                String str13 = langPackString.key + "_other";
                                String str14 = langPackString.other_value;
                                hashMap2.put(str13, str14 != null ? bd.m(str14, true) : "");
                            } catch (Exception e14) {
                                e = e14;
                                i13 = i17;
                                file2 = null;
                                z12 = true;
                                a8.g(e, z12);
                                if (file2 != null) {
                                    file2.delete();
                                }
                                hashMap = null;
                                final yc ycVar222222 = ycVar;
                                final String str322222 = str;
                                final boolean z1722222 = z10;
                                final int i1922222 = i3;
                                final Runnable runnable222222 = runnable;
                                final int[] iArr322222 = iArr;
                                final int i2022222 = i13;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        bd bdVar2 = bd.this;
                                        HashMap hashMap4 = hashMap;
                                        int[] iArr4 = iArr322222;
                                        yc ycVar3 = ycVar222222;
                                        String str42 = str322222;
                                        boolean z18 = z1722222;
                                        int i21 = i1922222;
                                        Runnable runnable3 = runnable222222;
                                        int i22 = i2022222;
                                        TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                        if (hashMap4 == null) {
                                            int i23 = iArr4[0];
                                            if (i23 == 1 || i23 == 2) {
                                                bdVar2.f(ycVar3, str42, i23 == 2 || z18, i21, runnable3);
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
                                            ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                                        } else {
                                            ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                                        }
                                        bdVar2.a1();
                                        try {
                                            if (bdVar2.B == ycVar3) {
                                                String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                                Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                                bdVar2.C = ycVar3.c;
                                                SharedPreferences.Editor edit = hp.e1().edit();
                                                edit.putString("language", ycVar3.b());
                                                edit.commit();
                                                ti.a aVar = new ti.a();
                                                aVar.a(hashMap4);
                                                bdVar2.Y = new ti.b(aVar);
                                                bdVar2.Z = bd.h(hashMap4);
                                                bdVar2.y = locale;
                                                bdVar2.B = ycVar3;
                                                if (!TextUtils.isEmpty(ycVar3.f)) {
                                                    bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                                }
                                                if (bdVar2.A == null) {
                                                    zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                                    bdVar2.A = zcVar;
                                                    if (zcVar == null) {
                                                        bdVar2.A = (zc) bdVar2.x.get("en");
                                                    }
                                                }
                                                bdVar2.D = true;
                                                Locale.setDefault(bdVar2.y);
                                                Configuration configuration = new Configuration();
                                                configuration.locale = bdVar2.y;
                                                t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                                bdVar2.D = false;
                                                gy0.s = false;
                                            } else {
                                                a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                            }
                                        } catch (Exception e122) {
                                            a8.g(e122, true);
                                            bdVar2.D = false;
                                        }
                                        bdVar2.Y0();
                                        hs.e().k(hs.x4, new Object[0]);
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
                    z16 = z14;
                    iArr2 = iArr;
                    objArr2 = objArr;
                    i17 = i13;
                    z15 = true;
                }
                z13 = z16;
                iArr = iArr2;
                Object[] objArr32 = objArr2;
                i13 = i17;
                file2 = new File(file3.getPath() + ".tmp");
                try {
                    a8.b("save locale file to " + file2);
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e15) {
                    e = e15;
                    z12 = true;
                    a8.g(e, z12);
                    if (file2 != null) {
                    }
                    hashMap = null;
                    final yc ycVar2222222 = ycVar;
                    final String str3222222 = str;
                    final boolean z17222222 = z10;
                    final int i19222222 = i3;
                    final Runnable runnable2222222 = runnable;
                    final int[] iArr3222222 = iArr;
                    final int i20222222 = i13;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                        @Override // java.lang.Runnable
                        public final void run() {
                            bd bdVar2 = bd.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr3222222;
                            yc ycVar3 = ycVar2222222;
                            String str42 = str3222222;
                            boolean z18 = z17222222;
                            int i21 = i19222222;
                            Runnable runnable3 = runnable2222222;
                            int i22 = i20222222;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i23 = iArr4[0];
                                if (i23 == 1 || i23 == 2) {
                                    bdVar2.f(ycVar3, str42, i23 == 2 || z18, i21, runnable3);
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
                                ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                            } else {
                                ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                            }
                            bdVar2.a1();
                            try {
                                if (bdVar2.B == ycVar3) {
                                    String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    bdVar2.C = ycVar3.c;
                                    SharedPreferences.Editor edit = hp.e1().edit();
                                    edit.putString("language", ycVar3.b());
                                    edit.commit();
                                    ti.a aVar = new ti.a();
                                    aVar.a(hashMap4);
                                    bdVar2.Y = new ti.b(aVar);
                                    bdVar2.Z = bd.h(hashMap4);
                                    bdVar2.y = locale;
                                    bdVar2.B = ycVar3;
                                    if (!TextUtils.isEmpty(ycVar3.f)) {
                                        bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                    }
                                    if (bdVar2.A == null) {
                                        zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                        bdVar2.A = zcVar;
                                        if (zcVar == null) {
                                            bdVar2.A = (zc) bdVar2.x.get("en");
                                        }
                                    }
                                    bdVar2.D = true;
                                    Locale.setDefault(bdVar2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = bdVar2.y;
                                    t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                    bdVar2.D = false;
                                    gy0.s = false;
                                } else {
                                    a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e122) {
                                a8.g(e122, true);
                                bdVar2.D = false;
                            }
                            bdVar2.Y0();
                            hs.e().k(hs.x4, new Object[0]);
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
                        objArr4[z13 ? 1 : 0] = key;
                        objArr4[1] = value;
                        bufferedWriter2.write(String.format("<string name=\"%1$s\">%2$s</string>\n", objArr4));
                        i14 = i21;
                    }
                    bufferedWriter2.write("</resources>");
                    bufferedWriter2.flush();
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    hashMap = bdVar.H0(file2, z13, true, z13);
                    if (hashMap != null) {
                        a8.d("saveRemoteLocaleStrings: written locale file is unreadable, keep the old one");
                        new File(new File(t0.h(), "malformed_locales"), file2.getName()).delete();
                        file2.delete();
                    } else {
                        File file4 = d;
                        if (file4 != null) {
                            if (objArr32 == true) {
                                hashMap.putAll(bdVar.H0(file4, false, false, false));
                            } else {
                                HashMap H02 = bdVar.H0(file4, false, false, false);
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
                            final yc ycVar22222222 = ycVar;
                            final String str32222222 = str;
                            final boolean z172222222 = z10;
                            final int i192222222 = i3;
                            final Runnable runnable22222222 = runnable;
                            final int[] iArr32222222 = iArr;
                            final int i202222222 = i13;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bd bdVar2 = bd.this;
                                    HashMap hashMap4 = hashMap;
                                    int[] iArr4 = iArr32222222;
                                    yc ycVar3 = ycVar22222222;
                                    String str42 = str32222222;
                                    boolean z18 = z172222222;
                                    int i212 = i192222222;
                                    Runnable runnable3 = runnable22222222;
                                    int i22 = i202222222;
                                    TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                    if (hashMap4 == null) {
                                        int i23 = iArr4[0];
                                        if (i23 == 1 || i23 == 2) {
                                            bdVar2.f(ycVar3, str42, i23 == 2 || z18, i212, runnable3);
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
                                        ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                                    } else {
                                        ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                                    }
                                    bdVar2.a1();
                                    try {
                                        if (bdVar2.B == ycVar3) {
                                            String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                            Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                            bdVar2.C = ycVar3.c;
                                            SharedPreferences.Editor edit = hp.e1().edit();
                                            edit.putString("language", ycVar3.b());
                                            edit.commit();
                                            ti.a aVar = new ti.a();
                                            aVar.a(hashMap4);
                                            bdVar2.Y = new ti.b(aVar);
                                            bdVar2.Z = bd.h(hashMap4);
                                            bdVar2.y = locale;
                                            bdVar2.B = ycVar3;
                                            if (!TextUtils.isEmpty(ycVar3.f)) {
                                                bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                            }
                                            if (bdVar2.A == null) {
                                                zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                                bdVar2.A = zcVar;
                                                if (zcVar == null) {
                                                    bdVar2.A = (zc) bdVar2.x.get("en");
                                                }
                                            }
                                            bdVar2.D = true;
                                            Locale.setDefault(bdVar2.y);
                                            Configuration configuration = new Configuration();
                                            configuration.locale = bdVar2.y;
                                            t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                            bdVar2.D = false;
                                            gy0.s = false;
                                        } else {
                                            a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                        }
                                    } catch (Exception e122) {
                                        a8.g(e122, true);
                                        bdVar2.D = false;
                                    }
                                    bdVar2.Y0();
                                    hs.e().k(hs.x4, new Object[0]);
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
                    final yc ycVar222222222 = ycVar;
                    final String str322222222 = str;
                    final boolean z1722222222 = z10;
                    final int i1922222222 = i3;
                    final Runnable runnable222222222 = runnable;
                    final int[] iArr322222222 = iArr;
                    final int i2022222222 = i13;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.uc
                        @Override // java.lang.Runnable
                        public final void run() {
                            bd bdVar2 = bd.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr322222222;
                            yc ycVar3 = ycVar222222222;
                            String str42 = str322222222;
                            boolean z18 = z1722222222;
                            int i212 = i1922222222;
                            Runnable runnable3 = runnable222222222;
                            int i22 = i2022222222;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i23 = iArr4[0];
                                if (i23 == 1 || i23 == 2) {
                                    bdVar2.f(ycVar3, str42, i23 == 2 || z18, i212, runnable3);
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
                                ycVar3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.h, tL_langPackDifference3.version);
                            } else {
                                ycVar3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(ycVar3.i, tL_langPackDifference3.version);
                            }
                            bdVar2.a1();
                            try {
                                if (bdVar2.B == ycVar3) {
                                    String[] split = !TextUtils.isEmpty(ycVar3.f) ? ycVar3.f.split("_") : !TextUtils.isEmpty(ycVar3.e) ? ycVar3.e.split("_") : ycVar3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    bdVar2.C = ycVar3.c;
                                    SharedPreferences.Editor edit = hp.e1().edit();
                                    edit.putString("language", ycVar3.b());
                                    edit.commit();
                                    ti.a aVar = new ti.a();
                                    aVar.a(hashMap4);
                                    bdVar2.Y = new ti.b(aVar);
                                    bdVar2.Z = bd.h(hashMap4);
                                    bdVar2.y = locale;
                                    bdVar2.B = ycVar3;
                                    if (!TextUtils.isEmpty(ycVar3.f)) {
                                        bdVar2.A = (zc) bdVar2.x.get(bdVar2.B.f);
                                    }
                                    if (bdVar2.A == null) {
                                        zc zcVar = (zc) bdVar2.x.get(bdVar2.y.getLanguage());
                                        bdVar2.A = zcVar;
                                        if (zcVar == null) {
                                            bdVar2.A = (zc) bdVar2.x.get("en");
                                        }
                                    }
                                    bdVar2.D = true;
                                    Locale.setDefault(bdVar2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = bdVar2.y;
                                    t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                                    bdVar2.D = false;
                                    gy0.s = false;
                                } else {
                                    a8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e122) {
                                a8.g(e122, true);
                                bdVar2.D = false;
                            }
                            bdVar2.Y0();
                            hs.e().k(hs.x4, new Object[0]);
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
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fb  */
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
    public final int c(yc ycVar, boolean z10, boolean z11, boolean z12, boolean z13, int i3, a60 a60Var) {
        String str;
        int i10;
        File file;
        int f10;
        boolean z14;
        int i11;
        int i12;
        boolean z15;
        boolean z16;
        int i13;
        Locale locale;
        String[] strArr;
        boolean z17;
        ?? r5;
        int i14;
        boolean z18;
        bd bdVar = this;
        yc ycVar2 = ycVar;
        if (ycVar2 == null) {
            return 0;
        }
        boolean g7 = ycVar2.g();
        File e10 = ycVar2.e();
        File d = ycVar2.d();
        if (!z11) {
            ConnectionsManager.setLangCode(ycVar2.c());
        }
        if (bdVar.G0(ycVar2.b()) == null) {
            if (ycVar2.i()) {
                bdVar.L.add(ycVar2);
                bdVar.M.put(ycVar2.b(), ycVar2);
                bdVar.J.add(ycVar2);
                bdVar.N.put(ycVar2.b(), ycVar2);
                bdVar.a1();
            } else if (ycVar2.j()) {
                bdVar.K.add(ycVar2);
                bdVar.N.put(ycVar2.b(), ycVar2);
                bdVar.a1();
            }
        }
        if ((ycVar2.i() || ycVar2.j()) && (z13 || !e10.exists() || (g7 && !d.exists()))) {
            if (r2.a) {
                a8.b("reload locale because one of file doesn't exist " + e10 + " " + d);
            }
            if (z11) {
                str = " ";
                i10 = 0;
                g0.h3(new vf(bdVar, ycVar2, i3, a60Var, 6));
                bdVar = this;
                ycVar2 = ycVar;
                file = d;
                z14 = true;
                f10 = 0;
            } else {
                str = " ";
                i10 = 0;
                bdVar = this;
                ycVar2 = ycVar;
                file = d;
                f10 = bdVar.f(ycVar2, null, true, i3, a60Var);
                z14 = true;
            }
        } else {
            str = " ";
            file = d;
            f10 = 0;
            i10 = 0;
            z14 = false;
        }
        try {
            String[] split = !TextUtils.isEmpty(ycVar2.f) ? ycVar2.f.split("_") : !TextUtils.isEmpty(ycVar2.e) ? ycVar2.e.split("_") : ycVar2.c.split("_");
            i12 = f10;
            try {
                if (split.length == 1) {
                    locale = new Locale(split[i10]);
                    strArr = split;
                } else {
                    strArr = split;
                    locale = new Locale(split[i10], strArr[1]);
                }
                if (z10) {
                    bdVar.C = ycVar2.c;
                    SharedPreferences.Editor edit = hp.e1().edit();
                    z17 = g7;
                    edit.putString("language", ycVar2.b());
                    edit.commit();
                } else {
                    z17 = g7;
                }
                if (e10 == null) {
                    try {
                        bdVar.Y = ti.b.c;
                        bdVar.Z = i10;
                    } catch (Exception e11) {
                        e = e11;
                        i11 = i3;
                        z15 = true;
                        a8.g(e, true);
                        z16 = false;
                        bdVar.D = false;
                        i13 = i11;
                        bdVar.Y0();
                        if (z13) {
                        }
                        return i12;
                    }
                } else {
                    boolean z19 = i10;
                    if (!z12) {
                        bdVar.E = z19;
                        HashMap H0 = bdVar.H0(z17 ? ycVar2.d() : ycVar2.e(), z19, z19, true);
                        if (z17) {
                            H0.putAll(bdVar.H0(ycVar2.e(), z19, z19, true));
                        }
                        ti.a aVar = new ti.a();
                        aVar.a(H0);
                        bdVar.Y = new ti.b(aVar);
                        bdVar.Z = h(H0);
                    }
                }
                bdVar.y = locale;
                bdVar.B = ycVar2;
                a8.b("applyLanguage: currentLocaleInfo is set");
                if (!TextUtils.isEmpty(bdVar.B.f)) {
                    bdVar.A = (zc) bdVar.x.get(bdVar.B.f);
                }
                if (bdVar.A == null) {
                    bdVar.A = (zc) bdVar.x.get(strArr[0]);
                }
                if (bdVar.A == null) {
                    bdVar.A = (zc) bdVar.x.get(bdVar.y.getLanguage());
                }
                if (bdVar.A == null) {
                    bdVar.A = new zc(10);
                }
                bdVar.D = true;
                Locale.setDefault(bdVar.y);
                Configuration configuration = new Configuration();
                configuration.locale = bdVar.y;
                t0.b.getResources().updateConfiguration(configuration, t0.b.getResources().getDisplayMetrics());
                bdVar.D = false;
                ?? sb2 = new StringBuilder("applyLanguage: reloadLastFile=");
                r5 = bdVar.E;
                sb2.append(r5);
                sb2.append(" force=");
                sb2.append(z13);
                sb2.append(" isLoadingRemote=");
                sb2.append(z14);
                a8.b(sb2.toString());
                if (z11 && !z14 && ((ycVar2.i() || ycVar2.j()) && (T0(e10) || (z17 && T0(file))))) {
                    a8.b("reload locale because it was malformed before " + e10);
                    bdVar.E = true;
                }
                try {
                } catch (Exception e12) {
                    e = e12;
                    i11 = r5;
                    z15 = true;
                    a8.g(e, true);
                    z16 = false;
                    bdVar.D = false;
                    i13 = i11;
                    bdVar.Y0();
                    if (z13) {
                    }
                    return i12;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            i11 = i3;
            i12 = f10;
        }
        if (!bdVar.E && (z14 || z13 || !bdVar.c1(ycVar2.c))) {
            r5 = i3;
            if (!z14) {
                if (z11) {
                    g0.h3(new hc(3));
                    z18 = false;
                } else {
                    z18 = false;
                    hs.e().k(hs.x4, new Object[0]);
                }
                gy0.s = z18;
                if (a60Var != null) {
                    a60Var.run();
                }
            }
            z16 = false;
            z15 = true;
            i13 = r5;
            bdVar.Y0();
            if (z13) {
                li.b0(i13).E0(z16, z15, null);
            }
            return i12;
        }
        if (r2.a) {
            a8.b("reload locale because one of file is corrupted " + e10 + str + file + " reloadLastFile=" + bdVar.E + " isLoadingRemote=" + z14 + " force=" + z13);
        }
        if (z11) {
            int i15 = i3;
            g0.h3(new pc(bdVar, i15 == true ? 1 : 0, 3));
            i14 = i15;
        } else {
            int i16 = i3;
            bdVar.Z0(i16 == true ? 1 : 0, null, true, null);
            i14 = i16;
        }
        bdVar.E = false;
        a8.b("reloadLastFile=false");
        r5 = i14;
        if (!z14) {
        }
        z16 = false;
        z15 = true;
        i13 = r5;
        bdVar.Y0();
        if (z13) {
        }
        return i12;
    }

    public final boolean c1(String str) {
        int i3;
        int i10 = hp.s1(h10.t0).z7;
        if (i10 > 0) {
            if (!hp.e1().getBoolean("lngpack_patched_" + str, false) && (i3 = this.Z) < i10) {
                a8.d("reinstalling " + str + " langpack because of patch (" + i3 + " keys, must be at least " + i10 + ")");
                X0(str);
                return true;
            }
        }
        return false;
    }

    public final void d(yc ycVar, boolean z10, boolean z11, int i3) {
        c(ycVar, z10, z11, false, false, i3, null);
    }

    public final xc d1(String str, boolean z10, int i3, fg fgVar) {
        HashMap hashMap = this.T;
        xc xcVar = (xc) hashMap.get(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = xcVar != null && elapsedRealtime - xcVar.b >= 300000;
        if (xcVar != null && !z11 && (xcVar.a || !z10)) {
            StringBuilder u10 = a1.g.u("applyRemoteLanguage ", str, " is already loading");
            u10.append(xcVar.a ? " the whole langpack" : "");
            u10.append(", wait for it");
            a8.b(u10.toString());
            xcVar.e.add(fgVar);
            return null;
        }
        xc xcVar2 = new xc();
        ArrayList arrayList = new ArrayList();
        xcVar2.e = arrayList;
        xcVar2.a = z10;
        xcVar2.b = elapsedRealtime;
        xcVar2.d = i3;
        if (z11) {
            arrayList.addAll(xcVar.e);
            xcVar.e.clear();
        }
        hashMap.put(str, xcVar2);
        return xcVar2;
    }

    public final boolean e(File file, int i3) {
        try {
            HashMap H0 = H0(file, false, false, true);
            String str = (String) H0.get("LanguageName");
            String str2 = (String) H0.get("LanguageNameInEnglish");
            String str3 = (String) H0.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(t0.h(), str3.concat(".xml"));
                if (g0.E(file, file2)) {
                    yc G0 = G0("local_" + str3.toLowerCase());
                    if (G0 == null) {
                        G0 = new yc();
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
                    yc ycVar = G0;
                    ti.a aVar = new ti.a();
                    aVar.a(H0);
                    this.Y = new ti.b(aVar);
                    this.Z = h(H0);
                    c(ycVar, true, false, true, false, i3, null);
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
    public final int f(final yc ycVar, String str, boolean z10, final int i3, Runnable runnable) {
        ?? r16;
        boolean z11;
        int i10;
        int i11;
        final xc d12;
        final bd bdVar = this;
        final int i12 = i3;
        if (ycVar == null || !(ycVar.i() || ycVar.j())) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder("applyRemoteLanguage ");
        sb2.append(str);
        sb2.append(" force=");
        sb2.append(z10);
        sb2.append(" currentAccount=");
        k2.p1.q(i12, sb2);
        int[] iArr = new int[1];
        iArr[0] = 0;
        fg fgVar = new fg(new int[]{0}, iArr, runnable, 27);
        if (z10) {
            X0(ycVar.c);
        }
        if (ycVar.g() && (str == null || str.equals(ycVar.e))) {
            final String str2 = ycVar.b() + "_base";
            boolean z12 = ycVar.i == 0 || z10;
            iArr[0] = iArr[0] + 1;
            boolean z13 = z12;
            final xc d13 = bdVar.d1(str2, z13, i12, fgVar);
            if (d13 != null) {
                final nc ncVar = new nc(fgVar, d13, 1);
                boolean z14 = false;
                if (z13) {
                    z11 = true;
                    i10 = 8;
                    a8.b("applyRemoteLanguage getLangPack of base");
                    TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack = new TLRPC.TL_langpack_getLangPack();
                    String str3 = ycVar.e;
                    tL_langpack_getLangPack.lang_code = str3 == null ? "" : str3.replace("_", "-");
                    final int i13 = 1;
                    bdVar = this;
                    i12 = i3;
                    i11 = ConnectionsManager.getInstance(i3).sendRequest(tL_langpack_getLangPack, new RequestDelegate(bdVar) { // from class: org.telegram.messenger.wc
                        public final /* synthetic */ bd b;

                        {
                            this.b = bdVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    final int i14 = 1;
                                    final bd bdVar2 = this.b;
                                    final String str4 = str2;
                                    final xc xcVar = d13;
                                    final yc ycVar2 = ycVar;
                                    final int i15 = i12;
                                    final nc ncVar2 = ncVar;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.sc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    bd bdVar3 = bdVar2;
                                                    HashMap hashMap = bdVar3.T;
                                                    String str5 = str4;
                                                    if (hashMap.get(str5) == xcVar) {
                                                        hashMap.remove(str5);
                                                    }
                                                    TLObject tLObject2 = tLObject;
                                                    nc ncVar3 = ncVar2;
                                                    if (tLObject2 == null) {
                                                        ncVar3.run();
                                                        break;
                                                    } else {
                                                        bdVar3.b1(ycVar2, (TLRPC.TL_langPackDifference) tLObject2, i15, true, ncVar3);
                                                        break;
                                                    }
                                                default:
                                                    bd bdVar4 = bdVar2;
                                                    HashMap hashMap2 = bdVar4.T;
                                                    String str6 = str4;
                                                    if (hashMap2.get(str6) == xcVar) {
                                                        hashMap2.remove(str6);
                                                    }
                                                    TLObject tLObject3 = tLObject;
                                                    nc ncVar4 = ncVar2;
                                                    if (tLObject3 == null) {
                                                        ncVar4.run();
                                                        break;
                                                    } else {
                                                        bdVar4.b1(ycVar2, (TLRPC.TL_langPackDifference) tLObject3, i15, true, ncVar4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i16 = 0;
                                    final bd bdVar3 = this.b;
                                    final String str5 = str2;
                                    final xc xcVar2 = d13;
                                    final yc ycVar3 = ycVar;
                                    final int i17 = i12;
                                    final nc ncVar3 = ncVar;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.sc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    bd bdVar32 = bdVar3;
                                                    HashMap hashMap = bdVar32.T;
                                                    String str52 = str5;
                                                    if (hashMap.get(str52) == xcVar2) {
                                                        hashMap.remove(str52);
                                                    }
                                                    TLObject tLObject2 = tLObject;
                                                    nc ncVar32 = ncVar3;
                                                    if (tLObject2 == null) {
                                                        ncVar32.run();
                                                        break;
                                                    } else {
                                                        bdVar32.b1(ycVar3, (TLRPC.TL_langPackDifference) tLObject2, i17, true, ncVar32);
                                                        break;
                                                    }
                                                default:
                                                    bd bdVar4 = bdVar3;
                                                    HashMap hashMap2 = bdVar4.T;
                                                    String str6 = str5;
                                                    if (hashMap2.get(str6) == xcVar2) {
                                                        hashMap2.remove(str6);
                                                    }
                                                    TLObject tLObject3 = tLObject;
                                                    nc ncVar4 = ncVar3;
                                                    if (tLObject3 == null) {
                                                        ncVar4.run();
                                                        break;
                                                    } else {
                                                        bdVar4.b1(ycVar3, (TLRPC.TL_langPackDifference) tLObject3, i17, true, ncVar4);
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
                    r16 = z14;
                } else {
                    a8.b("applyRemoteLanguage getDifference of base");
                    TLRPC.TL_langpack_getDifference tL_langpack_getDifference = new TLRPC.TL_langpack_getDifference();
                    z11 = true;
                    tL_langpack_getDifference.from_version = ycVar.i;
                    String str4 = ycVar.e;
                    tL_langpack_getDifference.lang_code = str4 == null ? "" : str4.replace("_", "-");
                    tL_langpack_getDifference.lang_pack = "";
                    final int i14 = 0;
                    i10 = 8;
                    i11 = ConnectionsManager.getInstance(i12).sendRequest(tL_langpack_getDifference, new RequestDelegate(bdVar) { // from class: org.telegram.messenger.wc
                        public final /* synthetic */ bd b;

                        {
                            this.b = bdVar;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    final int i142 = 1;
                                    final bd bdVar2 = this.b;
                                    final String str42 = str2;
                                    final xc xcVar = d13;
                                    final yc ycVar2 = ycVar;
                                    final int i15 = i12;
                                    final nc ncVar2 = ncVar;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.sc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i142) {
                                                case 0:
                                                    bd bdVar32 = bdVar2;
                                                    HashMap hashMap = bdVar32.T;
                                                    String str52 = str42;
                                                    if (hashMap.get(str52) == xcVar) {
                                                        hashMap.remove(str52);
                                                    }
                                                    TLObject tLObject2 = tLObject;
                                                    nc ncVar32 = ncVar2;
                                                    if (tLObject2 == null) {
                                                        ncVar32.run();
                                                        break;
                                                    } else {
                                                        bdVar32.b1(ycVar2, (TLRPC.TL_langPackDifference) tLObject2, i15, true, ncVar32);
                                                        break;
                                                    }
                                                default:
                                                    bd bdVar4 = bdVar2;
                                                    HashMap hashMap2 = bdVar4.T;
                                                    String str6 = str42;
                                                    if (hashMap2.get(str6) == xcVar) {
                                                        hashMap2.remove(str6);
                                                    }
                                                    TLObject tLObject3 = tLObject;
                                                    nc ncVar4 = ncVar2;
                                                    if (tLObject3 == null) {
                                                        ncVar4.run();
                                                        break;
                                                    } else {
                                                        bdVar4.b1(ycVar2, (TLRPC.TL_langPackDifference) tLObject3, i15, true, ncVar4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i16 = 0;
                                    final bd bdVar3 = this.b;
                                    final String str5 = str2;
                                    final xc xcVar2 = d13;
                                    final yc ycVar3 = ycVar;
                                    final int i17 = i12;
                                    final nc ncVar3 = ncVar;
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.sc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    bd bdVar32 = bdVar3;
                                                    HashMap hashMap = bdVar32.T;
                                                    String str52 = str5;
                                                    if (hashMap.get(str52) == xcVar2) {
                                                        hashMap.remove(str52);
                                                    }
                                                    TLObject tLObject2 = tLObject;
                                                    nc ncVar32 = ncVar3;
                                                    if (tLObject2 == null) {
                                                        ncVar32.run();
                                                        break;
                                                    } else {
                                                        bdVar32.b1(ycVar3, (TLRPC.TL_langPackDifference) tLObject2, i17, true, ncVar32);
                                                        break;
                                                    }
                                                default:
                                                    bd bdVar4 = bdVar3;
                                                    HashMap hashMap2 = bdVar4.T;
                                                    String str6 = str5;
                                                    if (hashMap2.get(str6) == xcVar2) {
                                                        hashMap2.remove(str6);
                                                    }
                                                    TLObject tLObject3 = tLObject;
                                                    nc ncVar4 = ncVar3;
                                                    if (tLObject3 == null) {
                                                        ncVar4.run();
                                                        break;
                                                    } else {
                                                        bdVar4.b1(ycVar3, (TLRPC.TL_langPackDifference) tLObject3, i17, true, ncVar4);
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
                    bdVar = this;
                    i12 = i3;
                    r16 = z14;
                }
                if (str != null || str.equals(ycVar.c)) {
                    final String b10 = ycVar.b();
                    boolean z15 = (ycVar.h != 0 || z10) ? z11 : r16;
                    iArr[r16] = iArr[r16] + 1;
                    boolean z16 = z15;
                    d12 = bdVar.d1(b10, z16, i12, fgVar);
                    if (d12 != null) {
                        final nc ncVar2 = new nc(fgVar, d12, 0);
                        if (z16) {
                            for (int i15 = r16; i15 < 4; i15++) {
                                ConnectionsManager.setLangCode(ycVar.c());
                            }
                            a8.b("applyRemoteLanguage getLangPack");
                            TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack2 = new TLRPC.TL_langpack_getLangPack();
                            tL_langpack_getLangPack2.lang_code = ycVar.c();
                            final int i16 = 1;
                            i11 = ConnectionsManager.getInstance(i3).sendRequest(tL_langpack_getLangPack2, new RequestDelegate(this) { // from class: org.telegram.messenger.oc
                                public final /* synthetic */ bd b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i16) {
                                        case 0:
                                            final int i17 = 1;
                                            final bd bdVar2 = this.b;
                                            final String str5 = b10;
                                            final xc xcVar = d12;
                                            final yc ycVar2 = ycVar;
                                            final int i18 = i3;
                                            final nc ncVar3 = ncVar2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.rc
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i17) {
                                                        case 0:
                                                            bd bdVar3 = bdVar2;
                                                            HashMap hashMap = bdVar3.T;
                                                            String str6 = str5;
                                                            if (hashMap.get(str6) == xcVar) {
                                                                hashMap.remove(str6);
                                                            }
                                                            TLObject tLObject2 = tLObject;
                                                            nc ncVar4 = ncVar3;
                                                            if (tLObject2 == null) {
                                                                ncVar4.run();
                                                                break;
                                                            } else {
                                                                bdVar3.b1(ycVar2, (TLRPC.TL_langPackDifference) tLObject2, i18, true, ncVar4);
                                                                break;
                                                            }
                                                        default:
                                                            bd bdVar4 = bdVar2;
                                                            HashMap hashMap2 = bdVar4.T;
                                                            String str7 = str5;
                                                            if (hashMap2.get(str7) == xcVar) {
                                                                hashMap2.remove(str7);
                                                            }
                                                            TLObject tLObject3 = tLObject;
                                                            nc ncVar5 = ncVar3;
                                                            if (tLObject3 == null) {
                                                                ncVar5.run();
                                                                break;
                                                            } else {
                                                                bdVar4.b1(ycVar2, (TLRPC.TL_langPackDifference) tLObject3, i18, true, ncVar5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            final int i19 = 0;
                                            final bd bdVar3 = this.b;
                                            final String str6 = b10;
                                            final xc xcVar2 = d12;
                                            final yc ycVar3 = ycVar;
                                            final int i20 = i3;
                                            final nc ncVar4 = ncVar2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.rc
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i19) {
                                                        case 0:
                                                            bd bdVar32 = bdVar3;
                                                            HashMap hashMap = bdVar32.T;
                                                            String str62 = str6;
                                                            if (hashMap.get(str62) == xcVar2) {
                                                                hashMap.remove(str62);
                                                            }
                                                            TLObject tLObject2 = tLObject;
                                                            nc ncVar42 = ncVar4;
                                                            if (tLObject2 == null) {
                                                                ncVar42.run();
                                                                break;
                                                            } else {
                                                                bdVar32.b1(ycVar3, (TLRPC.TL_langPackDifference) tLObject2, i20, true, ncVar42);
                                                                break;
                                                            }
                                                        default:
                                                            bd bdVar4 = bdVar3;
                                                            HashMap hashMap2 = bdVar4.T;
                                                            String str7 = str6;
                                                            if (hashMap2.get(str7) == xcVar2) {
                                                                hashMap2.remove(str7);
                                                            }
                                                            TLObject tLObject3 = tLObject;
                                                            nc ncVar5 = ncVar4;
                                                            if (tLObject3 == null) {
                                                                ncVar5.run();
                                                                break;
                                                            } else {
                                                                bdVar4.b1(ycVar3, (TLRPC.TL_langPackDifference) tLObject3, i20, true, ncVar5);
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
                            tL_langpack_getDifference2.from_version = ycVar.h;
                            tL_langpack_getDifference2.lang_code = ycVar.c();
                            tL_langpack_getDifference2.lang_pack = "";
                            final int i17 = 0;
                            i11 = ConnectionsManager.getInstance(i12).sendRequest(tL_langpack_getDifference2, new RequestDelegate(bdVar) { // from class: org.telegram.messenger.oc
                                public final /* synthetic */ bd b;

                                {
                                    this.b = bdVar;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (i17) {
                                        case 0:
                                            final int i172 = 1;
                                            final bd bdVar2 = this.b;
                                            final String str5 = b10;
                                            final xc xcVar = d12;
                                            final yc ycVar2 = ycVar;
                                            final int i18 = i12;
                                            final nc ncVar3 = ncVar2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.rc
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i172) {
                                                        case 0:
                                                            bd bdVar32 = bdVar2;
                                                            HashMap hashMap = bdVar32.T;
                                                            String str62 = str5;
                                                            if (hashMap.get(str62) == xcVar) {
                                                                hashMap.remove(str62);
                                                            }
                                                            TLObject tLObject2 = tLObject;
                                                            nc ncVar42 = ncVar3;
                                                            if (tLObject2 == null) {
                                                                ncVar42.run();
                                                                break;
                                                            } else {
                                                                bdVar32.b1(ycVar2, (TLRPC.TL_langPackDifference) tLObject2, i18, true, ncVar42);
                                                                break;
                                                            }
                                                        default:
                                                            bd bdVar4 = bdVar2;
                                                            HashMap hashMap2 = bdVar4.T;
                                                            String str7 = str5;
                                                            if (hashMap2.get(str7) == xcVar) {
                                                                hashMap2.remove(str7);
                                                            }
                                                            TLObject tLObject3 = tLObject;
                                                            nc ncVar5 = ncVar3;
                                                            if (tLObject3 == null) {
                                                                ncVar5.run();
                                                                break;
                                                            } else {
                                                                bdVar4.b1(ycVar2, (TLRPC.TL_langPackDifference) tLObject3, i18, true, ncVar5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            final int i19 = 0;
                                            final bd bdVar3 = this.b;
                                            final String str6 = b10;
                                            final xc xcVar2 = d12;
                                            final yc ycVar3 = ycVar;
                                            final int i20 = i12;
                                            final nc ncVar4 = ncVar2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.rc
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i19) {
                                                        case 0:
                                                            bd bdVar32 = bdVar3;
                                                            HashMap hashMap = bdVar32.T;
                                                            String str62 = str6;
                                                            if (hashMap.get(str62) == xcVar2) {
                                                                hashMap.remove(str62);
                                                            }
                                                            TLObject tLObject2 = tLObject;
                                                            nc ncVar42 = ncVar4;
                                                            if (tLObject2 == null) {
                                                                ncVar42.run();
                                                                break;
                                                            } else {
                                                                bdVar32.b1(ycVar3, (TLRPC.TL_langPackDifference) tLObject2, i20, true, ncVar42);
                                                                break;
                                                            }
                                                        default:
                                                            bd bdVar4 = bdVar3;
                                                            HashMap hashMap2 = bdVar4.T;
                                                            String str7 = str6;
                                                            if (hashMap2.get(str7) == xcVar2) {
                                                                hashMap2.remove(str7);
                                                            }
                                                            TLObject tLObject3 = tLObject;
                                                            nc ncVar5 = ncVar4;
                                                            if (tLObject3 == null) {
                                                                ncVar5.run();
                                                                break;
                                                            } else {
                                                                bdVar4.b1(ycVar3, (TLRPC.TL_langPackDifference) tLObject3, i20, true, ncVar5);
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
        z11 = true;
        i10 = 8;
        i11 = 0;
        if (str != null) {
        }
        final String b102 = ycVar.b();
        if (ycVar.h != 0) {
        }
        iArr[r16] = iArr[r16] + 1;
        boolean z162 = z15;
        d12 = bdVar.d1(b102, z162, i12, fgVar);
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
                        this.l = k(locale, O0(2131742796, "chatDate", null), "d MMMM");
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
                        this.n = k(locale, O0(2131742794, "chatFullDate", null), "d MMMM yyyy");
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
        char c2;
        ti.a aVar;
        if (!Objects.equals(this.V, this.y) || this.W == null || this.X) {
            boolean z10 = true;
            this.X = true;
            synchronized (this) {
                try {
                    Locale locale = this.y;
                    if (Objects.equals(this.V, locale)) {
                        if (this.W == null) {
                        }
                    }
                    if (this.U == null) {
                        ti.a aVar2 = new ti.a();
                        try {
                            aVar2.a = ti.b.a(t0.b, "localization_en.bin", aVar2.a);
                        } catch (Exception unused) {
                        }
                        this.U = new ti.b(aVar2);
                    }
                    String str = "localization_ar.bin";
                    if (locale != null) {
                        String languageTag = locale.toLanguageTag();
                        languageTag.getClass();
                        switch (languageTag.hashCode()) {
                            case 3121:
                                if (languageTag.equals("ar")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3201:
                                if (languageTag.equals("de")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3241:
                                if (languageTag.equals("en")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3246:
                                if (languageTag.equals("es")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3371:
                                if (languageTag.equals("it")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3428:
                                if (languageTag.equals("ko")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3518:
                                if (languageTag.equals("nl")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3651:
                                if (languageTag.equals("ru")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3734:
                                if (languageTag.equals("uk")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 106935481:
                                if (languageTag.equals("pt-BR")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
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
                            aVar = new ti.a();
                            ti.b bVar = this.U;
                            if (aVar.a != null) {
                                aVar.a = bVar.a.clone();
                            } else {
                                SparseArray sparseArray = bVar.a;
                                int size = sparseArray.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    aVar.a.put(sparseArray.keyAt(i3), (String) sparseArray.valueAt(i3));
                                }
                            }
                            try {
                                aVar.a = ti.b.a(t0.b, str, aVar.a);
                            } catch (Exception unused2) {
                            }
                            this.W = new ti.b(aVar);
                            this.V = locale;
                        }
                        this.W = this.U;
                        this.V = locale;
                    }
                    str = null;
                    if (str != null) {
                        aVar = new ti.a();
                        ti.b bVar2 = this.U;
                        if (aVar.a != null) {
                        }
                        aVar.a = ti.b.a(t0.b, str, aVar.a);
                        this.W = new ti.b(aVar);
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

    public final void j(int i3) {
        yc ycVar = this.B;
        if (ycVar == null || this.P || !c1(ycVar.c)) {
            return;
        }
        if (r2.a) {
            a8.b("reload locale because locale file is not enough");
        }
        g0.h3(new pc(this, i3, 2));
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
                        this.j = k(locale, c0 ? O0(2131742789, "formatterBannedUntil24H", null) : O0(2131742790, "formatterBannedUntil12H", null), c0 ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
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
                        this.k = k(locale, c0 ? O0(2131742787, "formatterBannedUntilThisYear24H", null) : O0(2131742788, "formatterBannedUntilThisYear12H", null), c0 ? "MMM dd, HH:mm" : "MMM dd, h:mm a");
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
                        this.t = k(locale, O0(2131742786, "formatterBoostExpired", null), "MMM dd, yyyy");
                    }
                } finally {
                }
            }
        }
        return this.t;
    }

    public final String p(long j10, String str) {
        return q(j10, true, true, false, str);
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
                        this.a = k(locale, c0 ? O0(2131742784, "formatterDay24H", null) : O0(2131742785, "formatterDay12H", null), c0 ? "HH:mm" : "h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.a;
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
        char c2 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c2 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c2 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c2 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c2 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c2 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c2 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c2 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c2 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c2 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c2 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c2 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c2 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c2 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c2 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c2 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c2 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c2 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c2 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c2 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c2 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c2 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c2 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c2 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c2 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c2 = 29;
                    break;
                }
                break;
            case 87254:
                if (upperCase.equals("XTR")) {
                    c2 = 30;
                    break;
                }
                break;
        }
        String str2 = " %.2f";
        switch (c2) {
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
            case hs.T /* 30 */:
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
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        Locale locale = this.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.f = k(locale, O0(2131742778, "formatterMonth", null), "dd MMM");
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
                        this.b = k(locale, c0 ? O0(2131742782, "formatterDayWithSeconds24H", null) : O0(2131742783, "formatterDayWithSeconds12H", null), c0 ? "HH:mm:ss" : "h:mm:ss a");
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
                        this.s = k(locale, O0(2131742781, "formatterGiveawayCard", null), "dd MMM yyyy");
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
                        this.u = k(locale, O0(2131742780, "formatterGiveawayMonthDay", null), "MMMM dd");
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
                        this.v = k(locale, O0(2131742779, "formatterGiveawayMonthDayYear", null), "MMMM dd, yyyy");
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
                        this.q = k(locale, O0(2131742775, "formatterMonthYear", null), "MMM yyyy");
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
                        this.o = k(locale, O0(2131742792, "formatDateSchedule", null), "MMM d");
                    }
                } finally {
                }
            }
        }
        return this.o;
    }

    public final FastDateFormat x0(int i3) {
        if (i3 >= 0) {
            FastDateFormat[] fastDateFormatArr = this.w;
            if (i3 < fastDateFormatArr.length) {
                if (fastDateFormatArr[i3] == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    switch (i3) {
                        case 0:
                            fastDateFormatArr[i3] = k(locale, O0(2131745597, "SendTodayAt", null), "'Send today at' HH:mm");
                            break;
                        case 1:
                            fastDateFormatArr[i3] = k(locale, O0(2131745639, "SendDayAt", null), "'Send on' MMM d 'at' HH:mm");
                            break;
                        case 2:
                            fastDateFormatArr[i3] = k(locale, O0(2131745638, "SendDayYearAt", null), "'Send on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 3:
                            fastDateFormatArr[i3] = k(locale, O0(2131746331, "RemindTodayAt", null), "'Remind today at' HH:mm");
                            break;
                        case 4:
                            fastDateFormatArr[i3] = k(locale, O0(2131746333, "RemindDayAt", null), "'Remind on' MMM d 'at' HH:mm");
                            break;
                        case 5:
                            fastDateFormatArr[i3] = k(locale, O0(2131746332, "RemindDayYearAt", null), "'Remind on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 6:
                            fastDateFormatArr[i3] = k(locale, O0(2131744915, "StartTodayAt", null), "'Start today at' HH:mm");
                            break;
                        case 7:
                            fastDateFormatArr[i3] = k(locale, O0(2131744924, "StartDayAt", null), "'Start on' MMM d 'at' HH:mm");
                            break;
                        case 8:
                            fastDateFormatArr[i3] = k(locale, O0(2131744923, "StartDayYearAt", null), "'Start on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 9:
                            fastDateFormatArr[i3] = k(locale, O0(2131744918, "StartShortTodayAt", null), "'Today,' HH:mm");
                            break;
                        case 10:
                            fastDateFormatArr[i3] = k(locale, O0(2131744920, "StartShortDayAt", null), "MMM d',' HH:mm");
                            break;
                        case 11:
                            fastDateFormatArr[i3] = k(locale, O0(2131744919, "StartShortDayYearAt", null), "MMM d yyyy, HH:mm");
                            break;
                        case 12:
                            fastDateFormatArr[i3] = k(locale, O0(2131744907, "StartsTodayAt", null), "'Starts today at' HH:mm");
                            break;
                        case 13:
                            fastDateFormatArr[i3] = k(locale, O0(2131744909, "StartsDayAt", null), "'Starts on' MMM d 'at' HH:mm");
                            break;
                        case 14:
                            fastDateFormatArr[i3] = k(locale, O0(2131744908, "StartsDayYearAt", null), "'Starts on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 15:
                            fastDateFormatArr[i3] = k(locale, O0(2131746585, "PublishTodayAt", null), "'Publish today at' HH:mm");
                            break;
                        case 16:
                            fastDateFormatArr[i3] = k(locale, O0(2131746587, "PublishDayAt", null), "'Publish on' MMM d 'at' HH:mm");
                            break;
                        case 17:
                            fastDateFormatArr[i3] = k(locale, O0(2131746586, "PublishDayYearAt", null), "'Publish on' MMM d yyyy 'at' HH:mm");
                            break;
                    }
                }
                return fastDateFormatArr[i3];
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
                        this.p = k(locale, O0(2131742791, "formatDateScheduleYear", null), "MMM d yyyy");
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
                        this.i = k(locale, c0 ? O0(2131742772, "formatterStats24H", null) : O0(2131742773, "formatterStats12H", null), c0 ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                    }
                } finally {
                }
            }
        }
        return this.i;
    }
}
