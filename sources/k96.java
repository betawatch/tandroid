// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k96 {
    public static boolean a0 = false;
    public static byte b0 = 1;
    public static boolean c0 = false;
    public static volatile k96 d0;
    public static final char[] e0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[][] f0 = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    public static Boolean g0;
    public j96 A;
    public i96 B;
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
    public do3 R;
    public final HashMap S;
    public final HashMap T;
    public r96 U;
    public volatile Locale V;
    public volatile r96 W;
    public volatile boolean X;
    public r96 Y;
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

    public k96() {
        boolean z = false;
        z = false;
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
        r96 r96Var = r96.c;
        this.W = r96Var;
        this.Y = r96Var;
        b(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new j96((byte) 11));
        b(new String[]{"cs", "sk"}, new j96((byte) 3));
        b(new String[]{"ff", "fr", "kab"}, new j96((byte) 4));
        final byte b = 1;
        b(new String[]{"ru", "uk", "be"}, new j96((byte) 1));
        b(new String[]{"sr", "hr", "bs", "sh"}, new j96((byte) 14));
        b(new String[]{"lv"}, new j96((byte) 6));
        byte b2 = 7;
        b(new String[]{"lt"}, new j96((byte) 7));
        b(new String[]{"pl"}, new j96((byte) 12));
        b(new String[]{"ro", "mo"}, new j96((byte) 13));
        b(new String[]{"sl"}, new j96((byte) 15));
        b(new String[]{"ar"}, new j96((byte) 0));
        b(new String[]{"mk"}, new j96((byte) 8));
        b(new String[]{"cy"}, new j96((byte) 18));
        b(new String[]{"br"}, new j96((byte) 2));
        b(new String[]{"lag"}, new j96((byte) 5));
        b(new String[]{"shi"}, new j96((byte) 16));
        b(new String[]{"mt"}, new j96((byte) 9));
        b(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new j96((byte) 17));
        b(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new j96((byte) 19));
        b(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new j96((byte) 10));
        i96 i96Var = new i96();
        i96Var.a = "English";
        i96Var.b = "English";
        i96Var.f = "en";
        i96Var.c = "en";
        i96 i96Var2 = null;
        i96Var.d = null;
        i96Var.j = true;
        arrayList.add(i96Var);
        hashMap.put(i96Var.c, i96Var);
        i96 i96Var3 = new i96();
        i96Var3.a = "Italiano";
        i96Var3.b = "Italian";
        i96Var3.f = "it";
        i96Var3.c = "it";
        i96Var3.d = null;
        i96Var3.j = true;
        arrayList.add(i96Var3);
        hashMap.put(i96Var3.c, i96Var3);
        i96 i96Var4 = new i96();
        i96Var4.a = "Español";
        i96Var4.b = "Spanish";
        i96Var4.f = "es";
        i96Var4.c = "es";
        i96Var4.j = true;
        arrayList.add(i96Var4);
        hashMap.put(i96Var4.c, i96Var4);
        i96 i96Var5 = new i96();
        i96Var5.a = "Deutsch";
        i96Var5.b = "German";
        i96Var5.f = "de";
        i96Var5.c = "de";
        i96Var5.d = null;
        i96Var5.j = true;
        arrayList.add(i96Var5);
        hashMap.put(i96Var5.c, i96Var5);
        i96 i96Var6 = new i96();
        i96Var6.a = "Nederlands";
        i96Var6.b = "Dutch";
        i96Var6.f = "nl";
        i96Var6.c = "nl";
        i96Var6.d = null;
        i96Var6.j = true;
        arrayList.add(i96Var6);
        hashMap.put(i96Var6.c, i96Var6);
        i96 i96Var7 = new i96();
        i96Var7.a = "العربية";
        i96Var7.b = "Arabic";
        i96Var7.f = "ar";
        i96Var7.c = "ar";
        i96Var7.d = null;
        i96Var7.j = true;
        i96Var7.g = true;
        arrayList.add(i96Var7);
        hashMap.put(i96Var7.c, i96Var7);
        i96 i96Var8 = new i96();
        i96Var8.a = "Português (Brasil)";
        i96Var8.b = "Portuguese (Brazil)";
        i96Var8.f = "pt_br";
        i96Var8.c = "pt_br";
        i96Var8.d = null;
        i96Var8.j = true;
        arrayList.add(i96Var8);
        hashMap.put(i96Var8.c, i96Var8);
        i96 i96Var9 = new i96();
        i96Var9.a = "한국어";
        i96Var9.b = "Korean";
        i96Var9.f = "ko";
        i96Var9.c = "ko";
        i96Var9.d = null;
        i96Var9.j = true;
        arrayList.add(i96Var9);
        hashMap.put(i96Var9.c, i96Var9);
        i96 i96Var10 = new i96();
        i96Var10.a = "Українська";
        i96Var10.b = "Ukrainian";
        i96Var10.f = "uk";
        i96Var10.c = "uk";
        i96Var10.d = null;
        i96Var10.j = true;
        arrayList.add(i96Var10);
        hashMap.put(i96Var10.c, i96Var10);
        i96 i96Var11 = new i96();
        i96Var11.a = "Русский";
        i96Var11.b = "Russian";
        i96Var11.f = "ru";
        i96Var11.c = "ru";
        i96Var11.d = null;
        i96Var11.j = true;
        arrayList.add(i96Var11);
        hashMap.put(i96Var11.c, i96Var11);
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                i96 a = i96.a(str);
                if (a != null) {
                    this.O.add(a);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                i96 a2 = i96.a(str2);
                a2.c = a2.c.replace("-", "_");
                if (!this.M.containsKey(a2.b())) {
                    this.L.add(a2);
                    this.M.put(a2.b(), a2);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (!TextUtils.isEmpty(string3)) {
            for (String str3 : string3.split("&")) {
                i96 a3 = i96.a(str3);
                if (a3 != null) {
                    a3.c = a3.c.replace("-", "_");
                    this.K.add(a3);
                }
            }
        }
        if (this.L.isEmpty()) {
            final byte b3 = z ? (byte) 1 : (byte) 0;
            gl.c3(new Runnable(this) { // from class: x86
                public final /* synthetic */ k96 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b3;
                    k96 k96Var = this.b;
                    switch (b4) {
                        case 0:
                            k96Var.V0(y6c.t0, true);
                            break;
                        default:
                            k96Var.F = k96.Q0();
                            break;
                    }
                }
            });
        }
        for (int i = 0; i < this.O.size(); i++) {
            i96 i96Var12 = (i96) this.O.get(i);
            this.J.add(i96Var12);
            this.N.put(i96Var12.b(), i96Var12);
        }
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            i96 i96Var13 = (i96) this.L.get(i2);
            i96 F0 = F0(i96Var13.b());
            if (F0 != null) {
                F0.d = i96Var13.d;
                F0.h = i96Var13.h;
                F0.i = i96Var13.i;
                F0.k = i96Var13.k;
                this.L.set(i2, F0);
            } else {
                this.J.add(i96Var13);
                this.N.put(i96Var13.b(), i96Var13);
            }
        }
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            i96 i96Var14 = (i96) this.K.get(i3);
            i96 F02 = F0(i96Var14.b());
            if (F02 != null) {
                F02.d = i96Var14.d;
                F02.h = i96Var14.h;
                F02.i = i96Var14.i;
                F02.k = i96Var14.k;
                this.K.set(i3, F02);
            } else {
                this.N.put(i96Var14.b(), i96Var14);
            }
        }
        this.z = Locale.getDefault();
        c0 = DateFormat.is24HourFormat(a.b);
        try {
            String string4 = na7.c1().getString("language", null);
            if (string4 != null && (i96Var2 = F0(string4)) != null) {
                z = true;
            }
            if (i96Var2 == null && this.z.getLanguage() != null) {
                i96Var2 = F0(this.z.getLanguage());
            }
            if (i96Var2 == null && (i96Var2 = F0(H0(this.z))) == null) {
                i96Var2 = F0("en");
            }
            d(i96Var2, z, true, y6c.t0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                a.b.registerReceiver(new zj(this, b2), intentFilter, 4);
            } else {
                a.b.registerReceiver(new zj(this, b2), intentFilter);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        gl.c3(new Runnable(this) { // from class: x86
            public final /* synthetic */ k96 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b4 = b;
                k96 k96Var = this.b;
                switch (b4) {
                    case 0:
                        k96Var.V0(y6c.t0, true);
                        break;
                    default:
                        k96Var.F = k96.Q0();
                        break;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, long j, Locale locale, boolean z) {
        String a02;
        long j2 = tL_messageEntityFormattedDate.date * 1000;
        if (tL_messageEntityFormattedDate.relative && !z) {
            return Build.VERSION.SDK_INT >= 24 ? kh0.f(j2 - j, locale) : DateUtils.getRelativeTimeSpanString(j2, j, 1000L, 262144).toString();
        }
        boolean z2 = z | (tL_messageEntityFormattedDate.flags == 0);
        String str = "";
        String format = tL_messageEntityFormattedDate.day_of_week ? D0().A0().format(j2) : "";
        String format2 = z2 ? D0().r0().format(j2) : tL_messageEntityFormattedDate.long_date ? D0().h0().format(j2) : tL_messageEntityFormattedDate.short_date ? D0().B0().format(j2) : "";
        if (z2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            str = calendar.get(13) != 0 ? D0().q0().format(j2) : D0().o0().format(j2);
        } else if (tL_messageEntityFormattedDate.long_time) {
            str = D0().q0().format(j2);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str = D0().o0().format(j2);
        }
        boolean isEmpty = TextUtils.isEmpty(format);
        boolean isEmpty2 = TextUtils.isEmpty(format2);
        boolean isEmpty3 = TextUtils.isEmpty(str);
        if (isEmpty2) {
            if (isEmpty3) {
                return format;
            }
            format2 = str;
        } else if (!isEmpty3) {
            a02 = a0(null, null, 2131742520, format2, str);
            return isEmpty ? a0(null, null, 2131746141, format, a02) : a02;
        }
        a02 = format2;
        if (isEmpty) {
        }
    }

    public static String B(long j) {
        long j2 = j * 1000;
        try {
            return a0(null, null, 2131752323, Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2))) : a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2))));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String C(int i) {
        int i2 = (i / 60) / 60;
        int i3 = i - (i2 * 3600);
        int i4 = i3 / 60;
        int i5 = i3 - (i4 * 60);
        if (i2 != 0) {
            return String.format("%dh", Integer.valueOf(i2 + (i4 > 30 ? 1 : 0)));
        }
        if (i4 != 0) {
            return String.format("%d", Integer.valueOf(i4 + (i5 > 30 ? 1 : 0)));
        }
        return String.format("%d", Integer.valueOf(i5));
    }

    public static String D(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 != i || i2 != i4) {
                return (i3 + 1 == i && i2 == i4) ? a0(null, null, 2131748554, a0("YesterdayAtFormatted", null, 2131742580, D0().o0().format(new Date(j2)))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? a0(null, null, 2131748554, a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2)))) : a0(null, null, 2131748554, a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2))));
            }
            int currentTime = ((int) (ConnectionsManager.getInstance(y6c.t0).getCurrentTime() - (j2 / 1000))) / 60;
            return currentTime < 1 ? M0(2131748553, null) : currentTime < 60 ? G(currentTime, "UpdatedMinutes", new Object[0]) : a0(null, null, 2131748554, a0("TodayAtFormatted", null, 2131743870, D0().o0().format(new Date(j2))));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static k96 D0() {
        k96 k96Var;
        k96 k96Var2 = d0;
        if (k96Var2 != null) {
            return k96Var2;
        }
        synchronized (k96.class) {
            k96Var = d0;
            if (k96Var == null) {
                k96Var = new k96();
                d0 = k96Var;
            }
        }
        return k96Var;
    }

    public static String E(long j, char c) {
        if (j < 0) {
            return "-".concat(E(-j, c));
        }
        StringBuilder sb = new StringBuilder(String.format("%d", Long.valueOf(j)));
        for (int length = sb.length() - 3; length > 0; length -= 3) {
            sb.insert(length, c);
        }
        return sb.toString();
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
        return new String(new char[]{55356, (char) (((charArray[0] + 61861) & 1023) + 56320), 55356, (char) (((charArray[1] + 61861) & 1023) + 56320)});
    }

    public static CharSequence F(String str, int i, CharSequence... charSequenceArr) {
        if (str.length() == 0 || D0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        D0();
        String y = tb4.y(str, "_", f1(D0().A.a(i)));
        Object[] objArr = new Object[charSequenceArr.length + 1];
        objArr[0] = Integer.valueOf(i);
        System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
        return V(y, str.concat("_other"), 0, objArr);
    }

    public static String G(int i, String str, Object... objArr) {
        if (str.length() == 0 || D0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        D0();
        String y = tb4.y(str, "_", f1(D0().A.a(i)));
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = Integer.valueOf(i);
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return a0(y, str.concat("_other"), 0, objArr2);
    }

    public static String H(char c, String str, int i) {
        return K(str, i, c, new Object[0]);
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
        StringBuilder sb = new StringBuilder(11);
        sb.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb.append('_');
        }
        sb.append(country);
        if (variant.length() > 0) {
            sb.append('_');
        }
        sb.append(variant);
        return sb.toString();
    }

    public static String I(int i, String str) {
        return H(',', str, i);
    }

    public static String I0() {
        i96 i96Var = D0().B;
        if (i96Var != null) {
            return i96Var.c();
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
        StringBuilder sb = new StringBuilder(11);
        sb.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb.append('-');
        }
        sb.append(country);
        if (variant.length() > 0) {
            sb.append('_');
        }
        sb.append(variant);
        return sb.toString();
    }

    public static String J(int i, String str, Object... objArr) {
        return K(str, i, ',', objArr);
    }

    public static String J0(int i, String str) {
        if (str.length() == 0 || D0().A == null) {
            return "LOC_ERR:".concat(str);
        }
        D0();
        return D0().O0(0, tb4.y(str, "_", f1(D0().A.a(i))), str.concat("_other"));
    }

    public static String K(String str, int i, char c, Object... objArr) {
        try {
            if (str.length() == 0 || D0().A == null) {
                return "LOC_ERR:".concat(str);
            }
            D0();
            String str2 = str + "_" + f1(D0().A.a(i));
            int i2 = 0;
            StringBuilder sb = new StringBuilder(String.format("%d", Integer.valueOf(i)));
            for (int length = sb.length() - 3; length > 0; length -= 3) {
                sb.insert(length, c);
            }
            boolean z = w01.a;
            String a = D0().Y.a(str2);
            if (a == null) {
                a = D0().Y.a(str + "_other");
            }
            if (a == null) {
                try {
                    k96 D0 = D0();
                    D0.i();
                    a = D0.W.a(str2);
                } catch (Exception unused) {
                }
            }
            if (a == null) {
                k96 D02 = D0();
                D02.i();
                a = D02.W.a(str + "_other");
            }
            String replace = a.replace("%d", "%1$s").replace("%1$d", "%1$s");
            int length2 = objArr.length + 1;
            Object[] objArr2 = new Object[length2];
            while (i2 < length2) {
                objArr2[i2] = i2 == 0 ? sb : objArr[i2 - 1];
                i2++;
            }
            return D0().y != null ? String.format(D0().y, replace, objArr2) : String.format(replace, objArr2);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: ".concat(str);
        }
    }

    public static String K0(String str) {
        String a = D0().Y.a(str);
        if (a != null) {
            return a;
        }
        k96 D0 = D0();
        D0.i();
        return D0.W.a(str);
    }

    public static String L(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            return (i3 == i && i2 == i4) ? a0(null, null, 2131747009, D0().o0().format(new Date(j2))) : (i3 + 1 == i && i2 == i4) ? a0(null, null, 2131747008, D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? a0(null, null, 2131747010, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2))) : a0(null, null, 2131747010, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String L0(int i) {
        return M0(i, null);
    }

    public static String M(int i, boolean z) {
        return a0(null, null, z ? 2131746967 : 2131746979, i < 86400 ? R(i) : G(i / 86400, "Days", new Object[0]));
    }

    public static String M0(int i, String str) {
        return D0().O0(i, str, null);
    }

    public static String N(long j) {
        try {
            long j2 = j / 60;
            long j3 = j2 / 60;
            long j4 = j3 / 24;
            long j5 = j4 / 30;
            long j6 = j4 / 365;
            return j6 >= 1 ? j6 == 1 ? M0(2131742593, null) : H(',', "YearsAgo", (int) j6) : j5 >= 1 ? j5 == 1 ? M0(2131748153, null) : H(',', "MonthsAgo", (int) j5) : j4 >= 1 ? j4 == 1 ? M0(2131751656, null) : H(',', "DaysAgo", (int) j4) : j3 >= 1 ? j3 == 1 ? M0(2131749097, null) : H(',', "HoursAgo", (int) j3) : j2 >= 1 ? j2 == 1 ? M0(2131748234, null) : H(',', "MinutesAgo", (int) j2) : M0(2131748795, null);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String N0(String str) {
        return TextUtils.isEmpty(str) ? b00.h("LOC_ERR:", str) : M0(0, str);
    }

    public static String O(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            return (i3 == i && i2 == i4) ? a0(null, null, 2131743869, D0().o0().format(new Date(j2))) : (i3 + 1 == i && i2 == i4) ? a0(null, null, 2131742580, D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2))) : a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String P(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            long j3 = timeInMillis - j2;
            return j3 < 60000 ? M0(2131745165, null) : j3 < 3600000 ? G((int) (j3 / 60000), "ShortMinutesAgo", new Object[0]) : (i3 == i && i2 == i4) ? j3 < 43200000 ? G((int) (j3 / 3600000), "ShortHoursAgo", new Object[0]) : M0(2131745163, null) : (i3 + 1 == i && i2 == i4) ? M0(2131745162, null) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? D0().p0().format(new Date(j2)) : a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String Q(long j) {
        long j2 = j * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j2) < 31536000000L) {
                return D0().v0().format(new Date(j2)) + ", " + D0().o0().format(new Date(j2));
            }
            return D0().x0().format(new Date(j2)) + ", " + D0().o0().format(new Date(j2));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String Q0() {
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
        StringBuilder sb = new StringBuilder(11);
        sb.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb.append('-');
        }
        sb.append(country);
        if (variant.length() > 0) {
            sb.append('_');
        }
        sb.append(variant);
        return sb.toString();
    }

    public static String R(int i) {
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        StringBuilder sb = new StringBuilder();
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(i2 >= 10 ? "" : "0");
            sb.append(i2);
        }
        if (sb.length() > 0) {
            sb.append(":");
        }
        sb.append(i3 >= 10 ? "" : "0");
        sb.append(i3);
        if (sb.length() > 0) {
            sb.append(":");
        }
        sb.append(i4 >= 10 ? "" : "0");
        sb.append(i4);
        return sb.toString();
    }

    public static String S(int[] iArr, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = i / 1000;
            if (i3 <= 0) {
                break;
            }
            sb.append("K");
            i2 = (i % 1000) / 100;
            i = i3;
        }
        if (iArr != null) {
            double d = (i2 / 10.0d) + i;
            for (int i4 = 0; i4 < sb.length(); i4++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i2 == 0 || sb.length() <= 0) {
            if (sb.length() == 2) {
                Locale locale = Locale.US;
                return oo1.n(i, "M");
            }
            Locale locale2 = Locale.US;
            return oo1.n(i, sb.toString());
        }
        if (sb.length() == 2) {
            Locale locale3 = Locale.US;
            return i + "." + i2 + "M";
        }
        Locale locale4 = Locale.US;
        return i + "." + i2 + sb.toString();
    }

    public static String T(long j) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i = calendar.get(1);
            long j2 = j * 1000;
            calendar.setTimeInMillis(j2);
            if (i == calendar.get(1)) {
                return D0().p0().format(j2);
            }
            return D0().p0().format(j2) + ", " + calendar.get(1);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static boolean T0(File file) {
        return file != null && new File(new File(a.h(), "malformed_locales"), file.getName()).exists();
    }

    public static CharSequence U(int i, Object... objArr) {
        return V(null, null, i, objArr);
    }

    public static boolean U0(int i) {
        if (i == 9 || i == 10 || i == 13) {
            return true;
        }
        if (i >= 32 && i <= 55295) {
            return true;
        }
        if (i < 57344 || i > 65533) {
            return i >= 65536 && i <= 1114111;
        }
        return true;
    }

    public static CharSequence V(String str, String str2, int i, Object... objArr) {
        String str3;
        try {
            String P0 = D0().P0(i, str, str2);
            if (P0 == null) {
                return "LOC_ERR: " + str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P0);
            int i2 = 0;
            while (i2 < objArr.length) {
                String str4 = "s";
                Object obj = objArr[i2];
                if (obj instanceof CharSequence) {
                    str3 = (CharSequence) obj;
                } else {
                    if (obj instanceof Integer) {
                        str3 = "" + ((Integer) objArr[i2]);
                    } else if (obj instanceof Long) {
                        str3 = "" + ((Long) objArr[i2]);
                    } else {
                        str3 = obj == null ? "null" : "";
                    }
                    str4 = "d";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("%");
                i2++;
                sb.append(i2);
                sb.append("$");
                sb.append(str4);
                String sb2 = sb.toString();
                int indexOf = spannableStringBuilder.toString().indexOf(sb2);
                if (indexOf != -1) {
                    spannableStringBuilder.replace(indexOf, sb2.length() + indexOf, str3);
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
            fa4.g(e, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String W(int i, long j, boolean z) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i2 = calendar.get(1);
        int i3 = calendar.get(6);
        calendar.setTimeInMillis(j * 1000);
        int i4 = i2 == calendar.get(1) ? (z && calendar.get(6) == i3) ? 0 : 1 : 2;
        if (i == 1) {
            i4 += 3;
        } else if (i == 2) {
            i4 += 6;
        } else if (i == 3) {
            i4 += 9;
        } else if (i == 4) {
            i4 += 12;
        }
        return D0().w0(i4).format(calendar.getTimeInMillis());
    }

    public static String X(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            long j3 = timeInMillis - j2;
            if (j3 < 60000) {
                return M0(2131745805, null);
            }
            if (j3 >= 3600000) {
                return (i3 == i && i2 == i4) ? a0(null, null, 2131743869, D0().o0().format(new Date(j2))) : (i3 + 1 == i && i2 == i4) ? a0(null, null, 2131742580, D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2))) : a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
            int i5 = (int) (j3 / 60000);
            return G(i5, "MinutesAgo", Integer.valueOf(i5));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static void X0(String str) {
        if (w01.a) {
            fa4.b("set as patched " + str + " langpack");
        }
        na7.c1().edit().putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static String Y(int i, String str, Object... objArr) {
        return a0(str, null, i, objArr);
    }

    public static String Z(int i, Object... objArr) {
        return a0(null, null, i, objArr);
    }

    public static String a(String str) {
        return str.replace(' ', (char) 160);
    }

    public static String a0(String str, String str2, int i, Object... objArr) {
        try {
            String P0 = D0().P0(i, str, str2);
            if (P0 != null) {
                return D0().y != null ? String.format(D0().y, P0, objArr) : String.format(P0, objArr);
            }
            return "LOC_ERR: " + str;
        } catch (Exception e) {
            fa4.g(e, true);
            if (i != 0) {
                try {
                    return String.format(a.b.getString(i), objArr);
                } catch (Exception unused) {
                    return b00.h("LOC_ERR: ", str);
                }
            }
            return b00.h("LOC_ERR: ", str);
        }
    }

    public static String b0(String str, Object... objArr) {
        try {
            return D0().y != null ? String.format(D0().y, str, objArr) : String.format(str, objArr);
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: " + str;
        }
    }

    public static String c0(int i) {
        if (i < 60) {
            return G(i, "Seconds", new Object[0]);
        }
        if (i < 3600) {
            return G(i / 60, "Minutes", new Object[0]);
        }
        if (i < 86400) {
            return G((i / 60) / 60, "Hours", new Object[0]);
        }
        if (i < 604800) {
            return G(((i / 60) / 60) / 24, "Days", new Object[0]);
        }
        if (i >= 2678400) {
            return (i < 31536000 || i % 31536000 != 0) ? G((((i / 60) / 60) / 24) / 30, "Months", new Object[0]) : G((((i / 60) / 60) / 24) / 365, "Years", new Object[0]);
        }
        int i2 = ((i / 60) / 60) / 24;
        return i % 7 == 0 ? G(i2 / 7, "Weeks", new Object[0]) : tb4.y(G(i2 / 7, "Weeks", new Object[0]), " ", G(i2 % 7, "Days", new Object[0]));
    }

    public static String d0(int i, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
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
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && na7.q1(i).a0.containsKey(Long.valueOf(user.id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return M0(2131747633, "Online");
        }
        if (user == null || (userStatus = user.status) == null || userStatus.expires == 0 || l7c.z(user) || (user instanceof TLRPC.TL_userEmpty)) {
            return M0(2131754951, "ALongTimeAgo");
        }
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        int i2 = user.status.expires;
        if (i2 <= currentTime) {
            return i2 == -1 ? M0(2131748986, "Invisible") : (i2 == -100 || i2 == -1000) ? M0(2131748819, "Lately") : (i2 == -101 || i2 == -1001) ? M0(2131742599, "WithinAWeek") : (i2 == -102 || i2 == -1002) ? M0(2131742600, "WithinAMonth") : w(i2, zArr2);
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        return M0(2131747633, "Online");
    }

    public static String e0(long j, boolean z) {
        long j2 = 1000 * j;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i2 = calendar.get(1);
            int i3 = calendar.get(2);
            String[] strArr = {M0(2131748894, null), M0(2131750817, null), M0(2131748491, null), M0(2131754170, null), M0(2131748470, null), M0(2131748872, null), M0(2131748874, null), M0(2131753892, null), M0(2131745373, null), M0(2131747637, null), M0(2131747642, null), M0(2131751593, null)};
            if (i == i2 && !z) {
                return strArr[i3];
            }
            return strArr[i3] + " " + i2;
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String e1(long j) {
        long j2 = j * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j2) >= 31536000000L) {
                return D0().B0().format(new Date(j2));
            }
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            calendar.setTimeInMillis(j2);
            int i2 = calendar.get(6) - i;
            return (i2 == 0 || (i2 == -1 && System.currentTimeMillis() - j2 < 28800000)) ? D0().o0().format(new Date(j2)) : (i2 <= -7 || i2 > -1) ? D0().p0().format(new Date(j2)) : D0().z0().format(new Date(j2));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String f0(long j) {
        long j2 = 1000 * j;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            return new String[]{M0(2131748894, null), M0(2131750817, null), M0(2131748491, null), M0(2131754170, null), M0(2131748470, null), M0(2131748872, null), M0(2131748874, null), M0(2131753892, null), M0(2131745373, null), M0(2131747637, null), M0(2131747642, null), M0(2131751593, null)}[i2] + " " + calendar.get(5) + ", " + i;
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String f1(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? "other" : "many" : "few" : "two" : "one" : "zero";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Spannable g(String str) {
        if (str instanceof Spannable) {
            Spannable spannable = (Spannable) str;
            spannable.setSpan(new z3c(gl.o()), 0, str.length(), 33);
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(HashMap hashMap) {
        int i;
        String str;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (String str2 : hashMap.keySet()) {
            if (str2 != null) {
                if (str2.endsWith("_other")) {
                    i = 6;
                } else if (str2.endsWith("_zero") || str2.endsWith("_many")) {
                    i = 5;
                } else if (str2.endsWith("_one") || str2.endsWith("_two") || str2.endsWith("_few")) {
                    i = 4;
                } else {
                    str = null;
                    if (str != null) {
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    i2++;
                }
                str = ir2.n(i, 0, str2);
                if (str != null) {
                }
                i2++;
            }
        }
        hashSet.clear();
        return i2;
    }

    public static String i0(int i, String str) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return M0(i, null);
        }
        try {
            return new Locale("", str).getDisplayCountry(D0().y);
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static String j0() {
        i96 i96Var = D0().B;
        return (i96Var == null || TextUtils.isEmpty(i96Var.a)) ? M0(2131748857, "LanguageName") : i96Var.a;
    }

    public static FastDateFormat k(Locale locale, String str, String str2) {
        if (str.length() == 0) {
            str = str2;
        }
        try {
            return FastDateFormat.getInstance(str, locale);
        } catch (Exception unused) {
            return FastDateFormat.getInstance(str2, locale);
        }
    }

    public static int k0(i96 i96Var, TLRPC.TL_langPackDifference tL_langPackDifference) {
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        if (lowerCase.equals(i96Var.c)) {
            return 0;
        }
        return lowerCase.equals(i96Var.e) ? 1 : -1;
    }

    public static void l() {
        if (g0 == null) {
            int i = gba.o1;
            if (i != 0) {
                g0 = Boolean.valueOf(i == 2);
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
                if (telephonyManager != null) {
                    String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                    g0 = Boolean.valueOf("US".equals(upperCase) || "GB".equals(upperCase) || "MM".equals(upperCase) || "LR".equals(upperCase));
                }
            } catch (Exception e) {
                g0 = Boolean.FALSE;
                fa4.g(e, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e8, code lost:
    
        if (r6 != false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m(String str, boolean z) {
        String str2;
        int i;
        int i2;
        boolean z2;
        String substring;
        int indexOf;
        int length = str.length();
        StringBuilder sb = null;
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                str2 = "&lt;";
                if (z && str.startsWith("<![CDATA[", i3) && (indexOf = str.indexOf("]]>", i3 + 9)) >= 0) {
                    i2 = ((indexOf + 3) - i3) - 1;
                    str2 = null;
                }
                i2 = 0;
            } else {
                if (charAt == '>') {
                    str2 = "&gt;";
                } else if (charAt == '&') {
                    if (z) {
                        int i4 = i3 + 1;
                        int indexOf2 = str.indexOf(59, i4);
                        if (indexOf2 >= 0 && indexOf2 - i3 <= 9) {
                            substring = str.substring(i4, indexOf2);
                            switch (substring) {
                                case "gt":
                                case "lt":
                                case "amp":
                                case "apos":
                                case "quot":
                                    z2 = true;
                                    break;
                                default:
                                    if (substring.length() >= 2 && substring.charAt(0) == '#') {
                                        boolean z3 = substring.charAt(1) == 'x';
                                        int i5 = z3 ? 2 : 1;
                                        if (i5 < substring.length()) {
                                            int i6 = 0;
                                            while (i5 < substring.length()) {
                                                int i7 = 16;
                                                int digit = Character.digit(substring.charAt(i5), z3 ? 16 : 10);
                                                if (digit >= 0 && substring.charAt(i5) <= 'f') {
                                                    if (!z3) {
                                                        i7 = 10;
                                                    }
                                                    i6 = (i6 * i7) + digit;
                                                    i5++;
                                                }
                                            }
                                            z2 = U0(i6);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                        z2 = false;
                    }
                    str2 = "&amp;";
                } else if (Character.isHighSurrogate(charAt) && (i = i3 + 1) < length && Character.isLowSurrogate(str.charAt(i))) {
                    str2 = null;
                    i2 = 1;
                } else {
                    if (!U0(charAt)) {
                        str2 = "";
                    }
                    str2 = null;
                }
                i2 = 0;
            }
            if (str2 != null && sb == null) {
                sb = new StringBuilder(length + 16);
                sb.append((CharSequence) str, 0, i3);
            }
            if (sb != null) {
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append((CharSequence) str, i3, i3 + i2 + 1);
                }
            }
            i3 = i3 + i2 + 1;
        }
        return sb != null ? sb.toString() : str;
    }

    public static String n(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        int length = sb.length();
        for (int i = 0; i < length; i++) {
            char charAt = sb.charAt(i);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != ',') {
                int i2 = 0;
                while (i2 < 18) {
                    int i3 = 0;
                    while (true) {
                        char[] cArr = f0[i2];
                        if (i3 >= cArr.length) {
                            break;
                        }
                        if (charAt == cArr[i3]) {
                            sb.setCharAt(i, e0[i3]);
                            i2 = 18;
                            break;
                        }
                        i3++;
                    }
                    i2++;
                }
            }
        }
        return sb.toString();
    }

    public static String o(int i) {
        if (i <= 3600) {
            return i > 60 ? G(i / 60, "Minutes", new Object[0]) : G(i, "Seconds", new Object[0]);
        }
        String G = G(i / 3600, "Hours", new Object[0]);
        int i2 = (i % 3600) / 60;
        if (i2 <= 0) {
            return G;
        }
        StringBuilder k = b00.k(G, ", ");
        k.append(G(i2, "Minutes", new Object[0]));
        return k.toString();
    }

    public static String r(long j, boolean z) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            return (i3 == i && i2 == i4) ? z ? M0(2131745163, null) : D0().o0().format(new Date(j2)) : (i3 + 1 == i && i2 == i4) ? M0(2131742582, "Yesterday") : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? D0().p0().format(new Date(j2)) : D0().B0().format(new Date(j2));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: formatDate";
        }
    }

    public static String s(long j, boolean z) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            return (i3 == i && i2 == i4) ? z ? a0(null, null, 2131743870, D0().o0().format(new Date(j2))) : a0(null, null, 2131743869, D0().o0().format(new Date(j2))) : (i3 + 1 == i && i2 == i4) ? a0(null, null, 2131742580, D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? a0(null, null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2))) : a0(null, null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String t(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            if (i3 == i && i2 == i4) {
                return D0().o0().format(new Date(j2));
            }
            if (i3 + 1 == i && i2 == i4) {
                return a0(null, null, 2131742580, D0().o0().format(new Date(j2)));
            }
            if (Math.abs(System.currentTimeMillis() - j2) >= 31536000000L) {
                return a0(null, null, 2131742520, D0().h0().format(new Date(j2)), D0().o0().format(new Date(j2)));
            }
            k96 D0 = D0();
            if (D0.m == null) {
                synchronized (D0) {
                    try {
                        if (D0.m == null) {
                            Locale locale = D0.y;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            D0.m = k(locale, D0.O0(2131742522, "chatDateShort", null), "d MMM");
                        }
                    } finally {
                    }
                }
            }
            return a0(null, null, 2131742520, D0.m.format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r5) < 31536000000L) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String u(long j, boolean z) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i = calendar.get(1);
            long j2 = j * 1000;
            calendar.setTimeInMillis(j2);
            if (z) {
                if (i != calendar.get(1)) {
                    return D0().h0().format(j2);
                }
                return D0().g0().format(j2);
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String v(long j) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(1);
            calendar.setTimeInMillis(j2);
            return i == calendar.get(1) ? D0().m0().format(new Date(j2)) : D0().l0().format(new Date(j2));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String w(long j, boolean[] zArr) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            int i3 = calendar.get(11);
            calendar.setTimeInMillis(j2);
            int i4 = calendar.get(6);
            int i5 = calendar.get(1);
            int i6 = calendar.get(11);
            if (i4 == i && i2 == i5) {
                return a0(null, null, 2131748825, a0("TodayAtFormatted", null, 2131743870, D0().o0().format(new Date(j2))));
            }
            if (i4 + 1 != i || i2 != i5) {
                return Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? a0("LastSeenDateFormatted", null, 2131748828, a0("formatDateAtTime", null, 2131742520, D0().p0().format(new Date(j2)), D0().o0().format(new Date(j2)))) : a0("LastSeenDateFormatted", null, 2131748828, a0("formatDateAtTime", null, 2131742520, D0().B0().format(new Date(j2)), D0().o0().format(new Date(j2))));
            }
            if (zArr == null) {
                return a0(null, null, 2131748825, a0("YesterdayAtFormatted", null, 2131742580, D0().o0().format(new Date(j2))));
            }
            zArr[0] = true;
            return (i3 > 6 || i6 <= 18 || !c0) ? a0(null, null, 2131742580, D0().o0().format(new Date(j2))) : a0(null, null, 2131748825, D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String x(long j, boolean z) {
        long j2 = j * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(6);
            int i2 = calendar.get(1);
            calendar.setTimeInMillis(j2);
            int i3 = calendar.get(6);
            int i4 = calendar.get(1);
            return (i3 == i && i2 == i4 && z) ? a0(null, null, 2131743869, D0().o0().format(new Date(j2))) : (i3 + 1 == i && i2 == i4 && z) ? a0(null, null, 2131742580, D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? a0(null, null, 2131742520, D0().g0().format(new Date(j2)), D0().o0().format(new Date(j2))) : a0(null, null, 2131742520, D0().h0().format(new Date(j2)), D0().o0().format(new Date(j2)));
        } catch (Exception e) {
            fa4.g(e, true);
            return "LOC_ERR";
        }
    }

    public static String y(float f, int i, Boolean bool) {
        l();
        if (bool == null ? !g0.booleanValue() : !bool.booleanValue()) {
            if (f < 1000.0f) {
                return i != 0 ? i != 1 ? a0("MetersShort", null, 2131748250, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f)))) : a0("MetersFromYou2", null, 2131748251, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f)))) : a0("MetersAway2", null, 2131748252, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f))));
            }
            float f2 = f % 1000.0f;
            float f3 = f / 1000.0f;
            String format = f2 == 0.0f ? String.format("%d", Integer.valueOf((int) f3)) : String.format("%.2f", Float.valueOf(f3));
            return i != 0 ? i != 1 ? a0("KMetersShort", null, 2131748869, format) : a0("KMetersFromYou2", null, 2131748870, format) : a0("KMetersAway2", null, 2131748871, format);
        }
        float f4 = f * 3.28084f;
        if (f4 < 1000.0f) {
            return i != 0 ? i != 1 ? a0("FootsShort", null, 2131750584, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f4)))) : a0("FootsFromYou", null, 2131750585, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f4)))) : a0("FootsAway", null, 2131750586, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f4))));
        }
        float f5 = f4 % 5280.0f;
        float f6 = f4 / 5280.0f;
        String format2 = f5 == 0.0f ? String.format("%d", Integer.valueOf((int) f6)) : String.format("%.2f", Float.valueOf(f6));
        return i != 0 ? i != 1 ? a0("MilesShort", null, 2131748235, format2) : a0("MilesFromYou", null, 2131748236, format2) : a0("MilesAway", null, 2131748237, format2);
    }

    public static String z(int i) {
        if (i <= 0) {
            return G(0, "Seconds", new Object[0]);
        }
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        StringBuilder sb = new StringBuilder();
        if (i2 > 0) {
            sb.append(G(i2, "Hours", new Object[0]));
        }
        if (i3 > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(G(i3, "Minutes", new Object[0]));
        }
        if (i4 > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(G(i4, "Seconds", new Object[0]));
        }
        return sb.toString();
    }

    public final FastDateFormat A0() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.e = k(locale, O0(2131742497, "formatterWeekLong", null), "EEEE");
                }
            }
        }
        return this.e;
    }

    public final FastDateFormat B0() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.g = k(locale, O0(2131742496, "formatterYear", null), "dd.MM.yy");
                }
            }
        }
        return this.g;
    }

    public final FastDateFormat C0() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.h = k(locale, O0(2131742495, "formatterYearMax", null), "dd.MM.yyyy");
                }
            }
        }
        return this.h;
    }

    public final i96 F0(String str) {
        if (str == null) {
            return null;
        }
        return (i96) this.N.get(str.toLowerCase().replace("-", "_"));
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0106: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:263), block:B:104:0x0106 */
    public final HashMap G0(File file, boolean z, boolean z2, boolean z3) {
        FileInputStream fileInputStream;
        HashMap hashMap;
        FileInputStream fileInputStream2;
        XmlPullParser newPullParser;
        FileInputStream fileInputStream3 = null;
        try {
        } catch (Throwable th) {
            th = th;
            fileInputStream3 = fileInputStream;
        }
        try {
            try {
                if (!file.exists()) {
                    return new HashMap();
                }
                hashMap = new HashMap(10000);
                try {
                    newPullParser = Xml.newPullParser();
                    fileInputStream2 = new FileInputStream(file);
                } catch (Exception e) {
                    e = e;
                    fileInputStream2 = null;
                }
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
                                if (z) {
                                    str3 = m(trim, false);
                                } else {
                                    String replace = trim.replace("\\n", "\n").replace("\\", "");
                                    str3 = replace.replace("&lt;", "<");
                                    if (z3 && !this.E && !str3.equals(replace)) {
                                        this.E = true;
                                        fa4.b("getLocaleFileStrings: value != old, reloadLastFile = true;");
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
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return hashMap;
                    }
                } catch (Exception e3) {
                    e = e3;
                    try {
                        File file2 = new File(a.h(), "malformed_locales/");
                        file2.mkdirs();
                        gl.E(file, new File(file2, file.getName()));
                    } catch (Exception unused) {
                    }
                    fa4.g(e, true);
                    if (z3) {
                        fa4.b("getLocaleFileStrings: error, reloadLastFile = true;");
                        this.E = true;
                    }
                    if (z2) {
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e4) {
                                fa4.g(e4, true);
                            }
                        }
                        return null;
                    }
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e5) {
                            fa4.g(e5, true);
                        }
                    }
                    return hashMap == null ? new HashMap() : hashMap;
                }
            } catch (Exception e6) {
                e = e6;
                hashMap = null;
                fileInputStream2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream3 != null) {
                try {
                    fileInputStream3.close();
                } catch (Exception e7) {
                    fa4.g(e7, true);
                }
            }
            throw th;
        }
    }

    public final String O0(int i, String str, String str2) {
        String P0 = P0(i, str, str2);
        return P0 == null ? b00.h("LOC_ERR:", str) : P0;
    }

    public final String P0(int i, String str, String str2) {
        Context context = a.b;
        boolean z = w01.a;
        String b = this.Y.b(i, context, str);
        if (b != null) {
            return b;
        }
        String a = this.Y.a(str2);
        if (a != null) {
            return a;
        }
        i();
        String b2 = this.W.b(i, context, str);
        return b2 != null ? b2 : this.W.a(str2);
    }

    public final String R0(String str) {
        return S0(str, true, false);
    }

    public final String S0(String str, boolean z, boolean z2) {
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
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        boolean z3 = false;
        while (i < length) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            if (z2) {
                String lowerCase = substring.toLowerCase();
                z3 = !substring.equals(lowerCase);
                substring = lowerCase;
            }
            String str2 = (String) this.G.get(substring);
            if (str2 == null && z) {
                str2 = (String) this.H.get(substring);
            }
            if (str2 != null) {
                if (z2 && z3) {
                    if (str2.length() > 1) {
                        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                    } else {
                        str2 = str2.toUpperCase();
                    }
                }
                sb.append(str2);
            } else {
                if (z2) {
                    char charAt = substring.charAt(0);
                    if ((charAt < 'a' || charAt > 'z' || charAt < '0' || charAt > '9') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/') {
                        return null;
                    }
                    if (z3) {
                        substring = substring.toUpperCase();
                    }
                }
                sb.append(substring);
            }
            i = i2;
        }
        return sb.toString();
    }

    public final void V0(int i, boolean z) {
        if (this.I) {
            return;
        }
        this.I = true;
        ConnectionsManager.getInstance(i).sendRequest(new TLRPC.TL_langpack_getLanguages(), new c45(this, z, i), 8);
    }

    public final void W0(Configuration configuration) {
        if (this.D) {
            return;
        }
        c0 = DateFormat.is24HourFormat(a.b);
        Locale locale = configuration.locale;
        this.z = locale;
        if (this.C != null) {
            i96 i96Var = this.B;
            this.B = null;
            d(i96Var, false, false, y6c.t0);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.y.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                Y0();
            }
            this.y = locale;
            i96 i96Var2 = this.B;
            if (i96Var2 != null && !TextUtils.isEmpty(i96Var2.f)) {
                this.A = (j96) this.x.get(this.B.f);
            }
            if (this.A == null) {
                j96 j96Var = (j96) this.x.get(this.y.getLanguage());
                this.A = j96Var;
                if (j96Var == null) {
                    this.A = (j96) this.x.get("en");
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
        i96 i96Var;
        Locale locale = this.y;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i = 0;
        a0 = (lowerCase.length() == 2 && (lowerCase.equals("ar") || lowerCase.equals("fa") || lowerCase.equals("he") || lowerCase.equals("iw"))) || lowerCase.startsWith("ar_") || lowerCase.startsWith("fa_") || lowerCase.startsWith("he_") || lowerCase.startsWith("iw_") || ((i96Var = this.B) != null && i96Var.g);
        b0 = lowerCase.equals("ko") ? (byte) 2 : (byte) 1;
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
            if (i >= fastDateFormatArr.length) {
                return;
            }
            fastDateFormatArr[i] = null;
            i++;
        }
    }

    public final void Z0(int i, String str, boolean z, b96 b96Var) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            i96 i96Var = this.B;
            if (i96Var == null) {
                return;
            }
            if (!str2.equals(i96Var.c) && !str2.equals(this.B.e)) {
                return;
            }
        }
        f(this.B, str2, z, i, b96Var);
    }

    public final void a1() {
        SharedPreferences.Editor edit = a.b.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.O.size(); i++) {
            String f = ((i96) this.O.get(i)).f();
            if (sb.length() != 0) {
                sb.append("&");
            }
            sb.append(f);
        }
        edit.putString("locales", sb.toString());
        sb.setLength(0);
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            String f2 = ((i96) this.L.get(i2)).f();
            if (sb.length() != 0) {
                sb.append("&");
            }
            sb.append(f2);
        }
        edit.putString("remote", sb.toString());
        sb.setLength(0);
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            String f3 = ((i96) this.K.get(i3)).f();
            if (sb.length() != 0) {
                sb.append("&");
            }
            sb.append(f3);
        }
        edit.putString("unofficial", sb.toString());
        edit.commit();
    }

    public final void b(String[] strArr, j96 j96Var) {
        for (String str : strArr) {
            this.x.put(str, j96Var);
        }
    }

    public final void b1(final i96 i96Var, final TLRPC.TL_langPackDifference tL_langPackDifference, final int i, final boolean z, final Runnable runnable) {
        int i2;
        String str;
        int i3;
        File d;
        boolean z2 = true;
        if (tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty() || i96Var == null || i96Var.h()) {
            StringBuilder sb = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
            sb.append(tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty());
            sb.append("; locale is local or null=");
            if (i96Var != null && !i96Var.h()) {
                z2 = false;
            }
            sb.append(z2);
            fa4.b(sb.toString());
            if (tL_langPackDifference != null && i96Var != null && !i96Var.h() && tL_langPackDifference.from_version != 0) {
                int k0 = k0(i96Var, tL_langPackDifference);
                int i4 = k0 == 0 ? i96Var.h : i96Var.i;
                if (k0 != -1 && tL_langPackDifference.from_version <= i4 && i4 < (i2 = tL_langPackDifference.version)) {
                    if (k0 == 0) {
                        i96Var.h = i2;
                    } else {
                        i96Var.i = i2;
                    }
                    a1();
                }
            }
            Y0();
            kk7.e().k(kk7.z4, new Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final int k02 = k0(i96Var, tL_langPackDifference);
        if (k02 == -1) {
            fa4.b("saveRemoteLocaleStrings: unknown language " + tL_langPackDifference.lang_code + " (locale short=" + i96Var.c + ", base=" + i96Var.e + ")");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (k02 == 0) {
            str = i96Var.c;
            i3 = i96Var.h;
            d = i96Var.e();
        } else {
            str = i96Var.e;
            i3 = i96Var.i;
            d = i96Var.d();
        }
        final String str2 = str;
        final File file = d;
        final int i5 = i3;
        if (file == null) {
            de9.s(tL_langPackDifference.lang_code, new StringBuilder("saveRemoteLocaleStrings: no file for "));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final File d2 = !i96Var.g() ? null : k02 == 0 ? i96Var.d() : i96Var.e();
        do3 do3Var = this.R;
        if (do3Var == null) {
            do3Var = new do3("langpackQueue", true);
            this.R = do3Var;
        }
        do3Var.postRunnable(new Runnable() { // from class: e96
            /* JADX WARN: Removed duplicated region for block: B:100:0x033e  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00e2 A[Catch: Exception -> 0x03bb, TRY_LEAVE, TryCatch #1 {Exception -> 0x03bb, blocks: (B:11:0x0035, B:31:0x00da, B:33:0x00e2, B:39:0x010e, B:121:0x0076, B:124:0x00a1, B:127:0x00ad), top: B:10:0x0035 }] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x03c5  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x02de A[Catch: all -> 0x03b0, LOOP:1: B:91:0x02d8->B:93:0x02de, LOOP_END, TryCatch #0 {all -> 0x03b0, blocks: (B:90:0x02ba, B:91:0x02d8, B:93:0x02de, B:95:0x0302), top: B:89:0x02ba, outer: #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:99:0x031f A[Catch: Exception -> 0x03b5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x03b5, blocks: (B:88:0x02a1, B:96:0x0311, B:99:0x031f, B:104:0x0345, B:105:0x034d, B:106:0x0355, B:108:0x035b, B:117:0x03b1, B:118:0x03b4, B:90:0x02ba, B:91:0x02d8, B:93:0x02de, B:95:0x0302), top: B:87:0x02a1, inners: #0 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int[] iArr;
                int i6;
                boolean z3;
                File file2;
                final HashMap hashMap;
                int i7;
                HashMap hashMap2;
                int i8;
                boolean z4;
                FileOutputStream fileOutputStream;
                HashMap G0;
                boolean z5;
                boolean z6;
                int i9;
                String str3;
                final TLRPC.TL_langPackDifference tL_langPackDifference2 = tL_langPackDifference;
                boolean z7 = true;
                int[] iArr2 = new int[1];
                int i10 = k02;
                boolean z8 = false;
                boolean z9 = i10 == 1;
                final k96 k96Var = k96.this;
                HashMap hashMap3 = k96Var.S;
                File file3 = file;
                Integer num = (Integer) hashMap3.get(file3.getPath());
                int i11 = i5;
                if (num != null && num.intValue() > i11) {
                    i11 = num.intValue();
                }
                iArr2[0] = 0;
                try {
                    i7 = 2;
                } catch (Exception e) {
                    e = e;
                    iArr = iArr2;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    iArr = iArr2;
                    i6 = i10;
                    z3 = true;
                    file2 = null;
                    fa4.g(e, z3);
                    if (file2 != null) {
                    }
                    hashMap = null;
                    final i96 i96Var2 = i96Var;
                    final String str4 = str2;
                    final boolean z10 = z;
                    final int i12 = i;
                    final Runnable runnable2 = runnable;
                    final int[] iArr3 = iArr;
                    final int i13 = i6;
                    gl.c3(new Runnable() { // from class: f96
                        @Override // java.lang.Runnable
                        public final void run() {
                            k96 k96Var2 = k96.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr3;
                            i96 i96Var3 = i96Var2;
                            String str5 = str4;
                            boolean z11 = z10;
                            int i14 = i12;
                            Runnable runnable3 = runnable2;
                            int i15 = i13;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i16 = iArr4[0];
                                if (i16 == 1 || i16 == 2) {
                                    k96Var2.f(i96Var3, str5, i16 == 2 || z11, i14, runnable3);
                                    return;
                                } else {
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i15 == 0) {
                                i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                            } else {
                                i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                            }
                            k96Var2.a1();
                            try {
                                if (k96Var2.B == i96Var3) {
                                    String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    k96Var2.C = i96Var3.c;
                                    SharedPreferences.Editor edit = na7.c1().edit();
                                    edit.putString("language", i96Var3.b());
                                    edit.commit();
                                    q96 q96Var = new q96();
                                    q96Var.a(hashMap4);
                                    k96Var2.Y = new r96(q96Var);
                                    k96Var2.Z = k96.h(hashMap4);
                                    k96Var2.y = locale;
                                    k96Var2.B = i96Var3;
                                    if (!TextUtils.isEmpty(i96Var3.f)) {
                                        k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                    }
                                    if (k96Var2.A == null) {
                                        j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                        k96Var2.A = j96Var;
                                        if (j96Var == null) {
                                            k96Var2.A = (j96) k96Var2.x.get("en");
                                        }
                                    }
                                    k96Var2.D = true;
                                    Locale.setDefault(k96Var2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = k96Var2.y;
                                    a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                    k96Var2.D = false;
                                    qa9.s = false;
                                } else {
                                    fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                                k96Var2.D = false;
                            }
                            k96Var2.Y0();
                            kk7.e().k(kk7.z4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                if (tL_langPackDifference2.from_version != 0) {
                    fa4.b("saveRemoteLocaleStrings: difference is from version " + tL_langPackDifference2.from_version + " to " + tL_langPackDifference2.version + " ours " + i11);
                    if (tL_langPackDifference2.version <= i11) {
                        fa4.b("saveRemoteLocaleStrings: difference is not newer than ours, skip");
                    } else if (tL_langPackDifference2.from_version > i11) {
                        fa4.b("saveRemoteLocaleStrings: difference starts after ours, request the missing part");
                        iArr2[0] = 1;
                    } else {
                        HashMap G02 = file3.exists() ? k96Var.G0(file3, true, true, false) : null;
                        if (G02 != null) {
                            hashMap2 = G02;
                            i8 = 0;
                            boolean z11 = z9;
                            while (i8 < tL_langPackDifference2.strings.size()) {
                            }
                            z4 = z8;
                            iArr = iArr2;
                            boolean z12 = z11;
                            i6 = i10;
                            file2 = new File(file3.getPath() + ".tmp");
                            fa4.b("save locale file to " + file2);
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
                            G0 = k96Var.G0(file2, z4, true, z4);
                            if (G0 != null) {
                            }
                            hashMap = null;
                            final i96 i96Var22 = i96Var;
                            final String str42 = str2;
                            final boolean z102 = z;
                            final int i122 = i;
                            final Runnable runnable22 = runnable;
                            final int[] iArr32 = iArr;
                            final int i132 = i6;
                            gl.c3(new Runnable() { // from class: f96
                                @Override // java.lang.Runnable
                                public final void run() {
                                    k96 k96Var2 = k96.this;
                                    HashMap hashMap4 = hashMap;
                                    int[] iArr4 = iArr32;
                                    i96 i96Var3 = i96Var22;
                                    String str5 = str42;
                                    boolean z112 = z102;
                                    int i14 = i122;
                                    Runnable runnable3 = runnable22;
                                    int i15 = i132;
                                    TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                    if (hashMap4 == null) {
                                        int i16 = iArr4[0];
                                        if (i16 == 1 || i16 == 2) {
                                            k96Var2.f(i96Var3, str5, i16 == 2 || z112, i14, runnable3);
                                            return;
                                        } else {
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (i15 == 0) {
                                        i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                                    } else {
                                        i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                                    }
                                    k96Var2.a1();
                                    try {
                                        if (k96Var2.B == i96Var3) {
                                            String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                            Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                            k96Var2.C = i96Var3.c;
                                            SharedPreferences.Editor edit = na7.c1().edit();
                                            edit.putString("language", i96Var3.b());
                                            edit.commit();
                                            q96 q96Var = new q96();
                                            q96Var.a(hashMap4);
                                            k96Var2.Y = new r96(q96Var);
                                            k96Var2.Z = k96.h(hashMap4);
                                            k96Var2.y = locale;
                                            k96Var2.B = i96Var3;
                                            if (!TextUtils.isEmpty(i96Var3.f)) {
                                                k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                            }
                                            if (k96Var2.A == null) {
                                                j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                                k96Var2.A = j96Var;
                                                if (j96Var == null) {
                                                    k96Var2.A = (j96) k96Var2.x.get("en");
                                                }
                                            }
                                            k96Var2.D = true;
                                            Locale.setDefault(k96Var2.y);
                                            Configuration configuration = new Configuration();
                                            configuration.locale = k96Var2.y;
                                            a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                            k96Var2.D = false;
                                            qa9.s = false;
                                        } else {
                                            fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                        }
                                    } catch (Exception e3) {
                                        fa4.g(e3, true);
                                        k96Var2.D = false;
                                    }
                                    k96Var2.Y0();
                                    kk7.e().k(kk7.z4, new Object[0]);
                                    if (runnable3 != null) {
                                        runnable3.run();
                                    }
                                }
                            });
                        }
                        fa4.b("saveRemoteLocaleStrings: can't read " + file3 + ", reload the whole langpack");
                        iArr2[0] = 2;
                    }
                    iArr = iArr2;
                    i6 = i10;
                    hashMap = null;
                    final i96 i96Var222 = i96Var;
                    final String str422 = str2;
                    final boolean z1022 = z;
                    final int i1222 = i;
                    final Runnable runnable222 = runnable;
                    final int[] iArr322 = iArr;
                    final int i1322 = i6;
                    gl.c3(new Runnable() { // from class: f96
                        @Override // java.lang.Runnable
                        public final void run() {
                            k96 k96Var2 = k96.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr322;
                            i96 i96Var3 = i96Var222;
                            String str5 = str422;
                            boolean z112 = z1022;
                            int i14 = i1222;
                            Runnable runnable3 = runnable222;
                            int i15 = i1322;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i16 = iArr4[0];
                                if (i16 == 1 || i16 == 2) {
                                    k96Var2.f(i96Var3, str5, i16 == 2 || z112, i14, runnable3);
                                    return;
                                } else {
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i15 == 0) {
                                i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                            } else {
                                i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                            }
                            k96Var2.a1();
                            try {
                                if (k96Var2.B == i96Var3) {
                                    String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    k96Var2.C = i96Var3.c;
                                    SharedPreferences.Editor edit = na7.c1().edit();
                                    edit.putString("language", i96Var3.b());
                                    edit.commit();
                                    q96 q96Var = new q96();
                                    q96Var.a(hashMap4);
                                    k96Var2.Y = new r96(q96Var);
                                    k96Var2.Z = k96.h(hashMap4);
                                    k96Var2.y = locale;
                                    k96Var2.B = i96Var3;
                                    if (!TextUtils.isEmpty(i96Var3.f)) {
                                        k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                    }
                                    if (k96Var2.A == null) {
                                        j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                        k96Var2.A = j96Var;
                                        if (j96Var == null) {
                                            k96Var2.A = (j96) k96Var2.x.get("en");
                                        }
                                    }
                                    k96Var2.D = true;
                                    Locale.setDefault(k96Var2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = k96Var2.y;
                                    a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                    k96Var2.D = false;
                                    qa9.s = false;
                                } else {
                                    fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                                k96Var2.D = false;
                            }
                            k96Var2.Y0();
                            kk7.e().k(kk7.z4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                fa4.b("saveRemoteLocaleStrings: difference is straight from the beginning, version " + tL_langPackDifference2.version + " ours " + i11);
                if (tL_langPackDifference2.version < i11 && !k96.T0(file3) && file3.exists() && k96Var.G0(file3, true, true, false) != null) {
                    fa4.b("saveRemoteLocaleStrings: whole langpack is older than ours, skip");
                    iArr = iArr2;
                    i6 = i10;
                    hashMap = null;
                    final i96 i96Var2222 = i96Var;
                    final String str4222 = str2;
                    final boolean z10222 = z;
                    final int i12222 = i;
                    final Runnable runnable2222 = runnable;
                    final int[] iArr3222 = iArr;
                    final int i13222 = i6;
                    gl.c3(new Runnable() { // from class: f96
                        @Override // java.lang.Runnable
                        public final void run() {
                            k96 k96Var2 = k96.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr3222;
                            i96 i96Var3 = i96Var2222;
                            String str5 = str4222;
                            boolean z112 = z10222;
                            int i14 = i12222;
                            Runnable runnable3 = runnable2222;
                            int i15 = i13222;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i16 = iArr4[0];
                                if (i16 == 1 || i16 == 2) {
                                    k96Var2.f(i96Var3, str5, i16 == 2 || z112, i14, runnable3);
                                    return;
                                } else {
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i15 == 0) {
                                i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                            } else {
                                i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                            }
                            k96Var2.a1();
                            try {
                                if (k96Var2.B == i96Var3) {
                                    String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    k96Var2.C = i96Var3.c;
                                    SharedPreferences.Editor edit = na7.c1().edit();
                                    edit.putString("language", i96Var3.b());
                                    edit.commit();
                                    q96 q96Var = new q96();
                                    q96Var.a(hashMap4);
                                    k96Var2.Y = new r96(q96Var);
                                    k96Var2.Z = k96.h(hashMap4);
                                    k96Var2.y = locale;
                                    k96Var2.B = i96Var3;
                                    if (!TextUtils.isEmpty(i96Var3.f)) {
                                        k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                    }
                                    if (k96Var2.A == null) {
                                        j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                        k96Var2.A = j96Var;
                                        if (j96Var == null) {
                                            k96Var2.A = (j96) k96Var2.x.get("en");
                                        }
                                    }
                                    k96Var2.D = true;
                                    Locale.setDefault(k96Var2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = k96Var2.y;
                                    a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                    k96Var2.D = false;
                                    qa9.s = false;
                                } else {
                                    fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                                k96Var2.D = false;
                            }
                            k96Var2.Y0();
                            kk7.e().k(kk7.z4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                hashMap2 = new HashMap();
                i8 = 0;
                boolean z112 = z9;
                while (i8 < tL_langPackDifference2.strings.size()) {
                    TLRPC.LangPackString langPackString = tL_langPackDifference2.strings.get(i8);
                    if (langPackString instanceof TLRPC.TL_langPackString) {
                        hashMap2.put(langPackString.key, k96.m(langPackString.value, z7));
                        z5 = z8;
                        iArr = iArr2;
                        z6 = z112;
                        i9 = i8;
                        i6 = i10;
                    } else {
                        z5 = z8;
                        iArr = iArr2;
                        z6 = z112;
                        if (langPackString instanceof TLRPC.TL_langPackStringPluralized) {
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                i9 = i8;
                                sb2.append(langPackString.key);
                                sb2.append("_zero");
                                String sb3 = sb2.toString();
                                String str5 = langPackString.zero_value;
                                if (str5 != null) {
                                    i6 = i10;
                                    try {
                                        str3 = k96.m(str5, true);
                                    } catch (Exception e3) {
                                        e = e3;
                                        file2 = null;
                                        z3 = true;
                                        fa4.g(e, z3);
                                        if (file2 != null) {
                                            file2.delete();
                                        }
                                        hashMap = null;
                                        final i96 i96Var22222 = i96Var;
                                        final String str42222 = str2;
                                        final boolean z102222 = z;
                                        final int i122222 = i;
                                        final Runnable runnable22222 = runnable;
                                        final int[] iArr32222 = iArr;
                                        final int i132222 = i6;
                                        gl.c3(new Runnable() { // from class: f96
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                k96 k96Var2 = k96.this;
                                                HashMap hashMap4 = hashMap;
                                                int[] iArr4 = iArr32222;
                                                i96 i96Var3 = i96Var22222;
                                                String str52 = str42222;
                                                boolean z1122 = z102222;
                                                int i14 = i122222;
                                                Runnable runnable3 = runnable22222;
                                                int i15 = i132222;
                                                TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                                if (hashMap4 == null) {
                                                    int i16 = iArr4[0];
                                                    if (i16 == 1 || i16 == 2) {
                                                        k96Var2.f(i96Var3, str52, i16 == 2 || z1122, i14, runnable3);
                                                        return;
                                                    } else {
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                if (i15 == 0) {
                                                    i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                                                } else {
                                                    i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                                                }
                                                k96Var2.a1();
                                                try {
                                                    if (k96Var2.B == i96Var3) {
                                                        String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                                        Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                                        k96Var2.C = i96Var3.c;
                                                        SharedPreferences.Editor edit = na7.c1().edit();
                                                        edit.putString("language", i96Var3.b());
                                                        edit.commit();
                                                        q96 q96Var = new q96();
                                                        q96Var.a(hashMap4);
                                                        k96Var2.Y = new r96(q96Var);
                                                        k96Var2.Z = k96.h(hashMap4);
                                                        k96Var2.y = locale;
                                                        k96Var2.B = i96Var3;
                                                        if (!TextUtils.isEmpty(i96Var3.f)) {
                                                            k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                                        }
                                                        if (k96Var2.A == null) {
                                                            j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                                            k96Var2.A = j96Var;
                                                            if (j96Var == null) {
                                                                k96Var2.A = (j96) k96Var2.x.get("en");
                                                            }
                                                        }
                                                        k96Var2.D = true;
                                                        Locale.setDefault(k96Var2.y);
                                                        Configuration configuration = new Configuration();
                                                        configuration.locale = k96Var2.y;
                                                        a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                                        k96Var2.D = false;
                                                        qa9.s = false;
                                                    } else {
                                                        fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                                    }
                                                } catch (Exception e32) {
                                                    fa4.g(e32, true);
                                                    k96Var2.D = false;
                                                }
                                                k96Var2.Y0();
                                                kk7.e().k(kk7.z4, new Object[0]);
                                                if (runnable3 != null) {
                                                    runnable3.run();
                                                }
                                            }
                                        });
                                    }
                                } else {
                                    i6 = i10;
                                    str3 = "";
                                }
                                hashMap2.put(sb3, str3);
                                String str6 = langPackString.key + "_one";
                                String str7 = langPackString.one_value;
                                hashMap2.put(str6, str7 != null ? k96.m(str7, true) : "");
                                String str8 = langPackString.key + "_two";
                                String str9 = langPackString.two_value;
                                hashMap2.put(str8, str9 != null ? k96.m(str9, true) : "");
                                String str10 = langPackString.key + "_few";
                                String str11 = langPackString.few_value;
                                hashMap2.put(str10, str11 != null ? k96.m(str11, true) : "");
                                String str12 = langPackString.key + "_many";
                                String str13 = langPackString.many_value;
                                hashMap2.put(str12, str13 != null ? k96.m(str13, true) : "");
                                String str14 = langPackString.key + "_other";
                                String str15 = langPackString.other_value;
                                hashMap2.put(str14, str15 != null ? k96.m(str15, true) : "");
                            } catch (Exception e4) {
                                e = e4;
                                i6 = i10;
                                file2 = null;
                                z3 = true;
                                fa4.g(e, z3);
                                if (file2 != null) {
                                }
                                hashMap = null;
                                final i96 i96Var222222 = i96Var;
                                final String str422222 = str2;
                                final boolean z1022222 = z;
                                final int i1222222 = i;
                                final Runnable runnable222222 = runnable;
                                final int[] iArr322222 = iArr;
                                final int i1322222 = i6;
                                gl.c3(new Runnable() { // from class: f96
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        k96 k96Var2 = k96.this;
                                        HashMap hashMap4 = hashMap;
                                        int[] iArr4 = iArr322222;
                                        i96 i96Var3 = i96Var222222;
                                        String str52 = str422222;
                                        boolean z1122 = z1022222;
                                        int i14 = i1222222;
                                        Runnable runnable3 = runnable222222;
                                        int i15 = i1322222;
                                        TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                        if (hashMap4 == null) {
                                            int i16 = iArr4[0];
                                            if (i16 == 1 || i16 == 2) {
                                                k96Var2.f(i96Var3, str52, i16 == 2 || z1122, i14, runnable3);
                                                return;
                                            } else {
                                                if (runnable3 != null) {
                                                    runnable3.run();
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        if (i15 == 0) {
                                            i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                                        } else {
                                            i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                                        }
                                        k96Var2.a1();
                                        try {
                                            if (k96Var2.B == i96Var3) {
                                                String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                                Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                                k96Var2.C = i96Var3.c;
                                                SharedPreferences.Editor edit = na7.c1().edit();
                                                edit.putString("language", i96Var3.b());
                                                edit.commit();
                                                q96 q96Var = new q96();
                                                q96Var.a(hashMap4);
                                                k96Var2.Y = new r96(q96Var);
                                                k96Var2.Z = k96.h(hashMap4);
                                                k96Var2.y = locale;
                                                k96Var2.B = i96Var3;
                                                if (!TextUtils.isEmpty(i96Var3.f)) {
                                                    k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                                }
                                                if (k96Var2.A == null) {
                                                    j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                                    k96Var2.A = j96Var;
                                                    if (j96Var == null) {
                                                        k96Var2.A = (j96) k96Var2.x.get("en");
                                                    }
                                                }
                                                k96Var2.D = true;
                                                Locale.setDefault(k96Var2.y);
                                                Configuration configuration = new Configuration();
                                                configuration.locale = k96Var2.y;
                                                a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                                k96Var2.D = false;
                                                qa9.s = false;
                                            } else {
                                                fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                            }
                                        } catch (Exception e32) {
                                            fa4.g(e32, true);
                                            k96Var2.D = false;
                                        }
                                        k96Var2.Y0();
                                        kk7.e().k(kk7.z4, new Object[0]);
                                        if (runnable3 != null) {
                                            runnable3.run();
                                        }
                                    }
                                });
                            }
                        } else {
                            i9 = i8;
                            i6 = i10;
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
                    i8 = i9 + 1;
                    z8 = z5;
                    iArr2 = iArr;
                    z112 = z6;
                    i10 = i6;
                    z7 = true;
                }
                z4 = z8;
                iArr = iArr2;
                boolean z122 = z112;
                i6 = i10;
                file2 = new File(file3.getPath() + ".tmp");
                try {
                    fa4.b("save locale file to " + file2);
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8));
                        bufferedWriter2.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                        bufferedWriter2.write("<resources>\n");
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i14 = i7;
                            Object[] objArr = new Object[i14];
                            objArr[z4 ? 1 : 0] = key;
                            objArr[1] = value;
                            bufferedWriter2.write(String.format("<string name=\"%1$s\">%2$s</string>\n", objArr));
                            i7 = i14;
                        }
                        bufferedWriter2.write("</resources>");
                        bufferedWriter2.flush();
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        G0 = k96Var.G0(file2, z4, true, z4);
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    z3 = true;
                    fa4.g(e, z3);
                    if (file2 != null) {
                    }
                    hashMap = null;
                    final i96 i96Var2222222 = i96Var;
                    final String str4222222 = str2;
                    final boolean z10222222 = z;
                    final int i12222222 = i;
                    final Runnable runnable2222222 = runnable;
                    final int[] iArr3222222 = iArr;
                    final int i13222222 = i6;
                    gl.c3(new Runnable() { // from class: f96
                        @Override // java.lang.Runnable
                        public final void run() {
                            k96 k96Var2 = k96.this;
                            HashMap hashMap4 = hashMap;
                            int[] iArr4 = iArr3222222;
                            i96 i96Var3 = i96Var2222222;
                            String str52 = str4222222;
                            boolean z1122 = z10222222;
                            int i142 = i12222222;
                            Runnable runnable3 = runnable2222222;
                            int i15 = i13222222;
                            TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                            if (hashMap4 == null) {
                                int i16 = iArr4[0];
                                if (i16 == 1 || i16 == 2) {
                                    k96Var2.f(i96Var3, str52, i16 == 2 || z1122, i142, runnable3);
                                    return;
                                } else {
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i15 == 0) {
                                i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                            } else {
                                i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                            }
                            k96Var2.a1();
                            try {
                                if (k96Var2.B == i96Var3) {
                                    String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                    Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                    k96Var2.C = i96Var3.c;
                                    SharedPreferences.Editor edit = na7.c1().edit();
                                    edit.putString("language", i96Var3.b());
                                    edit.commit();
                                    q96 q96Var = new q96();
                                    q96Var.a(hashMap4);
                                    k96Var2.Y = new r96(q96Var);
                                    k96Var2.Z = k96.h(hashMap4);
                                    k96Var2.y = locale;
                                    k96Var2.B = i96Var3;
                                    if (!TextUtils.isEmpty(i96Var3.f)) {
                                        k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                    }
                                    if (k96Var2.A == null) {
                                        j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                        k96Var2.A = j96Var;
                                        if (j96Var == null) {
                                            k96Var2.A = (j96) k96Var2.x.get("en");
                                        }
                                    }
                                    k96Var2.D = true;
                                    Locale.setDefault(k96Var2.y);
                                    Configuration configuration = new Configuration();
                                    configuration.locale = k96Var2.y;
                                    a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                    k96Var2.D = false;
                                    qa9.s = false;
                                } else {
                                    fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                }
                            } catch (Exception e32) {
                                fa4.g(e32, true);
                                k96Var2.D = false;
                            }
                            k96Var2.Y0();
                            kk7.e().k(kk7.z4, new Object[0]);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                }
                if (G0 != null) {
                    fa4.d("saveRemoteLocaleStrings: written locale file is unreadable, keep the old one");
                    new File(new File(a.h(), "malformed_locales"), file2.getName()).delete();
                    file2.delete();
                } else {
                    File file4 = d2;
                    if (file4 != null) {
                        if (z122) {
                            G0.putAll(k96Var.G0(file4, false, false, false));
                        } else {
                            HashMap G03 = k96Var.G0(file4, false, false, false);
                            G03.putAll(G0);
                            G0 = G03;
                        }
                    }
                    if (file2.renameTo(file3)) {
                        hashMap3.put(file3.getPath(), Integer.valueOf(tL_langPackDifference2.version));
                        if (tL_langPackDifference2.from_version == 0) {
                            new File(new File(a.h(), "malformed_locales"), file3.getName()).delete();
                        }
                        fa4.b("saved locale file to " + file3);
                        hashMap = G0;
                        final i96 i96Var22222222 = i96Var;
                        final String str42222222 = str2;
                        final boolean z102222222 = z;
                        final int i122222222 = i;
                        final Runnable runnable22222222 = runnable;
                        final int[] iArr32222222 = iArr;
                        final int i132222222 = i6;
                        gl.c3(new Runnable() { // from class: f96
                            @Override // java.lang.Runnable
                            public final void run() {
                                k96 k96Var2 = k96.this;
                                HashMap hashMap4 = hashMap;
                                int[] iArr4 = iArr32222222;
                                i96 i96Var3 = i96Var22222222;
                                String str52 = str42222222;
                                boolean z1122 = z102222222;
                                int i142 = i122222222;
                                Runnable runnable3 = runnable22222222;
                                int i15 = i132222222;
                                TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                                if (hashMap4 == null) {
                                    int i16 = iArr4[0];
                                    if (i16 == 1 || i16 == 2) {
                                        k96Var2.f(i96Var3, str52, i16 == 2 || z1122, i142, runnable3);
                                        return;
                                    } else {
                                        if (runnable3 != null) {
                                            runnable3.run();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if (i15 == 0) {
                                    i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                                } else {
                                    i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                                }
                                k96Var2.a1();
                                try {
                                    if (k96Var2.B == i96Var3) {
                                        String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                        Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                        k96Var2.C = i96Var3.c;
                                        SharedPreferences.Editor edit = na7.c1().edit();
                                        edit.putString("language", i96Var3.b());
                                        edit.commit();
                                        q96 q96Var = new q96();
                                        q96Var.a(hashMap4);
                                        k96Var2.Y = new r96(q96Var);
                                        k96Var2.Z = k96.h(hashMap4);
                                        k96Var2.y = locale;
                                        k96Var2.B = i96Var3;
                                        if (!TextUtils.isEmpty(i96Var3.f)) {
                                            k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                        }
                                        if (k96Var2.A == null) {
                                            j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                            k96Var2.A = j96Var;
                                            if (j96Var == null) {
                                                k96Var2.A = (j96) k96Var2.x.get("en");
                                            }
                                        }
                                        k96Var2.D = true;
                                        Locale.setDefault(k96Var2.y);
                                        Configuration configuration = new Configuration();
                                        configuration.locale = k96Var2.y;
                                        a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                        k96Var2.D = false;
                                        qa9.s = false;
                                    } else {
                                        fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                                    }
                                } catch (Exception e32) {
                                    fa4.g(e32, true);
                                    k96Var2.D = false;
                                }
                                k96Var2.Y0();
                                kk7.e().k(kk7.z4, new Object[0]);
                                if (runnable3 != null) {
                                    runnable3.run();
                                }
                            }
                        });
                    }
                    fa4.d("saveRemoteLocaleStrings: can't replace " + file3);
                    file2.delete();
                }
                hashMap = null;
                final i96 i96Var222222222 = i96Var;
                final String str422222222 = str2;
                final boolean z1022222222 = z;
                final int i1222222222 = i;
                final Runnable runnable222222222 = runnable;
                final int[] iArr322222222 = iArr;
                final int i1322222222 = i6;
                gl.c3(new Runnable() { // from class: f96
                    @Override // java.lang.Runnable
                    public final void run() {
                        k96 k96Var2 = k96.this;
                        HashMap hashMap4 = hashMap;
                        int[] iArr4 = iArr322222222;
                        i96 i96Var3 = i96Var222222222;
                        String str52 = str422222222;
                        boolean z1122 = z1022222222;
                        int i142 = i1222222222;
                        Runnable runnable3 = runnable222222222;
                        int i15 = i1322222222;
                        TLRPC.TL_langPackDifference tL_langPackDifference3 = tL_langPackDifference2;
                        if (hashMap4 == null) {
                            int i16 = iArr4[0];
                            if (i16 == 1 || i16 == 2) {
                                k96Var2.f(i96Var3, str52, i16 == 2 || z1122, i142, runnable3);
                                return;
                            } else {
                                if (runnable3 != null) {
                                    runnable3.run();
                                    return;
                                }
                                return;
                            }
                        }
                        if (i15 == 0) {
                            i96Var3.h = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.h, tL_langPackDifference3.version);
                        } else {
                            i96Var3.i = tL_langPackDifference3.from_version == 0 ? tL_langPackDifference3.version : Math.max(i96Var3.i, tL_langPackDifference3.version);
                        }
                        k96Var2.a1();
                        try {
                            if (k96Var2.B == i96Var3) {
                                String[] split = !TextUtils.isEmpty(i96Var3.f) ? i96Var3.f.split("_") : !TextUtils.isEmpty(i96Var3.e) ? i96Var3.e.split("_") : i96Var3.c.split("_");
                                Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                                k96Var2.C = i96Var3.c;
                                SharedPreferences.Editor edit = na7.c1().edit();
                                edit.putString("language", i96Var3.b());
                                edit.commit();
                                q96 q96Var = new q96();
                                q96Var.a(hashMap4);
                                k96Var2.Y = new r96(q96Var);
                                k96Var2.Z = k96.h(hashMap4);
                                k96Var2.y = locale;
                                k96Var2.B = i96Var3;
                                if (!TextUtils.isEmpty(i96Var3.f)) {
                                    k96Var2.A = (j96) k96Var2.x.get(k96Var2.B.f);
                                }
                                if (k96Var2.A == null) {
                                    j96 j96Var = (j96) k96Var2.x.get(k96Var2.y.getLanguage());
                                    k96Var2.A = j96Var;
                                    if (j96Var == null) {
                                        k96Var2.A = (j96) k96Var2.x.get("en");
                                    }
                                }
                                k96Var2.D = true;
                                Locale.setDefault(k96Var2.y);
                                Configuration configuration = new Configuration();
                                configuration.locale = k96Var2.y;
                                a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                                k96Var2.D = false;
                                qa9.s = false;
                            } else {
                                fa4.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                            }
                        } catch (Exception e32) {
                            fa4.g(e32, true);
                            k96Var2.D = false;
                        }
                        k96Var2.Y0();
                        kk7.e().k(kk7.z4, new Object[0]);
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f3  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(i96 i96Var, boolean z, boolean z2, boolean z3, boolean z4, int i, mn6 mn6Var) {
        String str;
        int i2;
        File file;
        int f;
        boolean z5;
        ?? r5;
        int i3;
        boolean z6;
        boolean z7;
        int i4;
        Locale locale;
        String[] strArr;
        boolean z8;
        int i5;
        boolean z9;
        k96 k96Var = this;
        i96 i96Var2 = i96Var;
        if (i96Var2 == null) {
            return 0;
        }
        boolean g = i96Var2.g();
        File e = i96Var2.e();
        File d = i96Var2.d();
        if (!z2) {
            ConnectionsManager.setLangCode(i96Var2.c());
        }
        if (k96Var.F0(i96Var2.b()) == null) {
            if (i96Var2.i()) {
                k96Var.L.add(i96Var2);
                k96Var.M.put(i96Var2.b(), i96Var2);
                k96Var.J.add(i96Var2);
                k96Var.N.put(i96Var2.b(), i96Var2);
                k96Var.a1();
            } else if (i96Var2.j()) {
                k96Var.K.add(i96Var2);
                k96Var.N.put(i96Var2.b(), i96Var2);
                k96Var.a1();
            }
        }
        if ((i96Var2.i() || i96Var2.j()) && (z4 || !e.exists() || (g && !d.exists()))) {
            if (w01.a) {
                fa4.b("reload locale because one of file doesn't exist " + e + " " + d);
            }
            if (z2) {
                str = " ";
                i2 = 0;
                gl.c3(new q76((Object) k96Var, (Object) i96Var2, i, (Object) mn6Var, (byte) 1));
                k96Var = this;
                i96Var2 = i96Var;
                file = d;
                z5 = true;
                f = 0;
            } else {
                str = " ";
                i2 = 0;
                k96Var = this;
                i96Var2 = i96Var;
                file = d;
                f = k96Var.f(i96Var2, null, true, i, mn6Var);
                z5 = true;
            }
        } else {
            str = " ";
            file = d;
            f = 0;
            i2 = 0;
            z5 = false;
        }
        try {
            String[] split = !TextUtils.isEmpty(i96Var2.f) ? i96Var2.f.split("_") : !TextUtils.isEmpty(i96Var2.e) ? i96Var2.e.split("_") : i96Var2.c.split("_");
            i3 = f;
            try {
                if (split.length == 1) {
                    locale = new Locale(split[i2]);
                    strArr = split;
                } else {
                    strArr = split;
                    locale = new Locale(split[i2], strArr[1]);
                }
                if (z) {
                    k96Var.C = i96Var2.c;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    z8 = g;
                    edit.putString("language", i96Var2.b());
                    edit.commit();
                } else {
                    z8 = g;
                }
                if (e == null) {
                    k96Var.Y = r96.c;
                    k96Var.Z = i2;
                } else {
                    boolean z10 = i2;
                    if (!z3) {
                        k96Var.E = z10;
                        HashMap G0 = k96Var.G0(z8 ? i96Var2.d() : i96Var2.e(), z10, z10, true);
                        if (z8) {
                            G0.putAll(k96Var.G0(i96Var2.e(), z10, z10, true));
                        }
                        q96 q96Var = new q96();
                        q96Var.a(G0);
                        k96Var.Y = new r96(q96Var);
                        k96Var.Z = h(G0);
                    }
                }
                k96Var.y = locale;
                k96Var.B = i96Var2;
                fa4.b("applyLanguage: currentLocaleInfo is set");
                if (!TextUtils.isEmpty(k96Var.B.f)) {
                    k96Var.A = (j96) k96Var.x.get(k96Var.B.f);
                }
                j96 j96Var = k96Var.A;
                if (j96Var == null) {
                    j96Var = (j96) k96Var.x.get(strArr[0]);
                    k96Var.A = j96Var;
                }
                if (j96Var == null) {
                    j96Var = (j96) k96Var.x.get(k96Var.y.getLanguage());
                    k96Var.A = j96Var;
                }
                if (j96Var == null) {
                    k96Var.A = new j96((byte) 10);
                }
                k96Var.D = true;
                Locale.setDefault(k96Var.y);
                Configuration configuration = new Configuration();
                configuration.locale = k96Var.y;
                a.b.getResources().updateConfiguration(configuration, a.b.getResources().getDisplayMetrics());
                k96Var.D = false;
                ?? sb = new StringBuilder("applyLanguage: reloadLastFile=");
                r5 = k96Var.E;
                sb.append(r5);
                sb.append(" force=");
                sb.append(z4);
                sb.append(" isLoadingRemote=");
                sb.append(z5);
                fa4.b(sb.toString());
                if (z2 && !z5 && ((i96Var2.i() || i96Var2.j()) && (T0(e) || (z8 && T0(file))))) {
                    fa4.b("reload locale because it was malformed before " + e);
                    k96Var.E = true;
                }
            } catch (Exception e2) {
                e = e2;
                r5 = i;
            }
            try {
                if (k96Var.E || !(z5 || z4 || !k96Var.c1(i96Var2.c))) {
                    if (w01.a) {
                        fa4.b("reload locale because one of file is corrupted " + e + str + file + " reloadLastFile=" + k96Var.E + " isLoadingRemote=" + z5 + " force=" + z4);
                    }
                    if (z2) {
                        int i6 = i;
                        gl.c3(new a96(k96Var, i6 == true ? 1 : 0, (byte) 3));
                        i5 = i6;
                    } else {
                        int i7 = i;
                        k96Var.Z0(i7 == true ? 1 : 0, null, true, null);
                        i5 = i7;
                    }
                    k96Var.E = false;
                    fa4.b("reloadLastFile=false");
                    r5 = i5;
                } else {
                    r5 = i;
                }
                if (!z5) {
                    if (z2) {
                        gl.c3(new ql3((byte) 23));
                        z9 = false;
                    } else {
                        z9 = false;
                        kk7.e().k(kk7.z4, new Object[0]);
                    }
                    qa9.s = z9;
                    if (mn6Var != null) {
                        mn6Var.run();
                    }
                }
                z7 = false;
                z6 = true;
                i4 = r5;
            } catch (Exception e3) {
                e = e3;
                z6 = true;
                fa4.g(e, true);
                z7 = false;
                k96Var.D = false;
                i4 = r5;
                k96Var.Y0();
                if (z4) {
                }
                return i3;
            }
        } catch (Exception e4) {
            e = e4;
            r5 = i;
            i3 = f;
        }
        k96Var.Y0();
        if (z4) {
            hq6.d0(i4).G0(z7, z6, null);
        }
        return i3;
    }

    public final boolean c1(String str) {
        int i;
        int f = na7.q1(y6c.t0).k4.t1.f();
        if (f > 0) {
            if (!na7.c1().getBoolean("lngpack_patched_" + str, false) && (i = this.Z) < f) {
                fa4.d("reinstalling " + str + " langpack because of patch (" + i + " keys, must be at least " + f + ")");
                X0(str);
                return true;
            }
        }
        return false;
    }

    public final void d(i96 i96Var, boolean z, boolean z2, int i) {
        c(i96Var, z, z2, false, false, i, null);
    }

    public final h96 d1(String str, boolean z, int i, sx5 sx5Var) {
        HashMap hashMap = this.T;
        h96 h96Var = (h96) hashMap.get(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = h96Var != null && elapsedRealtime - h96Var.b >= 300000;
        if (h96Var != null && !z2 && (h96Var.a || !z)) {
            StringBuilder p = ug8.p("applyRemoteLanguage ", str, " is already loading");
            p.append(h96Var.a ? " the whole langpack" : "");
            p.append(", wait for it");
            fa4.b(p.toString());
            h96Var.e.add(sx5Var);
            return null;
        }
        h96 h96Var2 = new h96();
        ArrayList arrayList = new ArrayList();
        h96Var2.e = arrayList;
        h96Var2.a = z;
        h96Var2.b = elapsedRealtime;
        h96Var2.d = i;
        if (z2) {
            arrayList.addAll(h96Var.e);
            h96Var.e.clear();
        }
        hashMap.put(str, h96Var2);
        return h96Var2;
    }

    public final boolean e(File file, int i) {
        try {
            HashMap G0 = G0(file, false, false, true);
            String str = (String) G0.get("LanguageName");
            String str2 = (String) G0.get("LanguageNameInEnglish");
            String str3 = (String) G0.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(a.h(), str3.concat(".xml"));
                if (gl.E(file, file2)) {
                    i96 F0 = F0("local_" + str3.toLowerCase());
                    if (F0 == null) {
                        F0 = new i96();
                        F0.a = str;
                        F0.b = str2;
                        String lowerCase = str3.toLowerCase();
                        F0.c = lowerCase;
                        F0.f = lowerCase;
                        F0.d = file2.getAbsolutePath();
                        this.J.add(F0);
                        this.N.put(F0.b(), F0);
                        this.O.add(F0);
                        a1();
                    }
                    q96 q96Var = new q96();
                    q96Var.a(G0);
                    this.Y = new r96(q96Var);
                    this.Z = h(G0);
                    c(F0, true, false, true, false, i, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(final i96 i96Var, String str, boolean z, final int i, Runnable runnable) {
        byte b;
        boolean z2;
        int i2;
        int i3;
        final h96 d1;
        final k96 k96Var = this;
        final int i4 = i;
        if (i96Var == null || !(i96Var.i() || i96Var.j())) {
            return 0;
        }
        StringBuilder sb = new StringBuilder("applyRemoteLanguage ");
        sb.append(str);
        sb.append(" force=");
        sb.append(z);
        sb.append(" currentAccount=");
        b00.p(i4, sb);
        byte b2 = 1;
        int[] iArr = new int[1];
        iArr[0] = 0;
        sx5 sx5Var = new sx5((Object) new int[]{0}, (Object) iArr, (Object) runnable, (byte) 11);
        if (z) {
            X0(i96Var.c);
        }
        if (i96Var.g() && (str == null || str.equals(i96Var.e))) {
            final String str2 = i96Var.b() + "_base";
            boolean z3 = i96Var.i == 0 || z;
            iArr[0] = iArr[0] + 1;
            boolean z4 = z3;
            final h96 d12 = k96Var.d1(str2, z4, i4, sx5Var);
            if (d12 != null) {
                final y86 y86Var = new y86(sx5Var, d12, b2);
                z2 = true;
                if (z4) {
                    b = 0;
                    i2 = 8;
                    fa4.b("applyRemoteLanguage getLangPack of base");
                    TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack = new TLRPC.TL_langpack_getLangPack();
                    String str3 = i96Var.e;
                    tL_langpack_getLangPack.lang_code = str3 == null ? "" : str3.replace("_", "-");
                    final byte b3 = 1;
                    k96Var = this;
                    i4 = i;
                    i3 = ConnectionsManager.getInstance(i).sendRequest(tL_langpack_getLangPack, new RequestDelegate(k96Var) { // from class: g96
                        public final /* synthetic */ k96 b;

                        {
                            this.b = k96Var;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (b3) {
                                case 0:
                                    final byte b4 = 1;
                                    final k96 k96Var2 = this.b;
                                    final String str4 = str2;
                                    final h96 h96Var = d12;
                                    final i96 i96Var2 = i96Var;
                                    final int i5 = i4;
                                    final y86 y86Var2 = y86Var;
                                    gl.c3(new Runnable() { // from class: d96
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b5 = b4;
                                            TLObject tLObject2 = tLObject;
                                            h96 h96Var2 = h96Var;
                                            String str5 = str4;
                                            switch (b5) {
                                                case 0:
                                                    k96 k96Var3 = k96Var2;
                                                    HashMap hashMap = k96Var3.T;
                                                    if (hashMap.get(str5) == h96Var2) {
                                                        hashMap.remove(str5);
                                                    }
                                                    y86 y86Var3 = y86Var2;
                                                    if (tLObject2 == null) {
                                                        y86Var3.run();
                                                        break;
                                                    } else {
                                                        k96Var3.b1(i96Var2, (TLRPC.TL_langPackDifference) tLObject2, i5, true, y86Var3);
                                                        break;
                                                    }
                                                default:
                                                    k96 k96Var4 = k96Var2;
                                                    HashMap hashMap2 = k96Var4.T;
                                                    if (hashMap2.get(str5) == h96Var2) {
                                                        hashMap2.remove(str5);
                                                    }
                                                    y86 y86Var4 = y86Var2;
                                                    if (tLObject2 == null) {
                                                        y86Var4.run();
                                                        break;
                                                    } else {
                                                        k96Var4.b1(i96Var2, (TLRPC.TL_langPackDifference) tLObject2, i5, true, y86Var4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b5 = 0;
                                    final k96 k96Var3 = this.b;
                                    final String str5 = str2;
                                    final h96 h96Var2 = d12;
                                    final i96 i96Var3 = i96Var;
                                    final int i6 = i4;
                                    final y86 y86Var3 = y86Var;
                                    gl.c3(new Runnable() { // from class: d96
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b52 = b5;
                                            TLObject tLObject2 = tLObject;
                                            h96 h96Var22 = h96Var2;
                                            String str52 = str5;
                                            switch (b52) {
                                                case 0:
                                                    k96 k96Var32 = k96Var3;
                                                    HashMap hashMap = k96Var32.T;
                                                    if (hashMap.get(str52) == h96Var22) {
                                                        hashMap.remove(str52);
                                                    }
                                                    y86 y86Var32 = y86Var3;
                                                    if (tLObject2 == null) {
                                                        y86Var32.run();
                                                        break;
                                                    } else {
                                                        k96Var32.b1(i96Var3, (TLRPC.TL_langPackDifference) tLObject2, i6, true, y86Var32);
                                                        break;
                                                    }
                                                default:
                                                    k96 k96Var4 = k96Var3;
                                                    HashMap hashMap2 = k96Var4.T;
                                                    if (hashMap2.get(str52) == h96Var22) {
                                                        hashMap2.remove(str52);
                                                    }
                                                    y86 y86Var4 = y86Var3;
                                                    if (tLObject2 == null) {
                                                        y86Var4.run();
                                                        break;
                                                    } else {
                                                        k96Var4.b1(i96Var3, (TLRPC.TL_langPackDifference) tLObject2, i6, true, y86Var4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    }, 8);
                    d12.c = i3;
                } else {
                    fa4.b("applyRemoteLanguage getDifference of base");
                    TLRPC.TL_langpack_getDifference tL_langpack_getDifference = new TLRPC.TL_langpack_getDifference();
                    b = 0;
                    tL_langpack_getDifference.from_version = i96Var.i;
                    String str4 = i96Var.e;
                    tL_langpack_getDifference.lang_code = str4 == null ? "" : str4.replace("_", "-");
                    tL_langpack_getDifference.lang_pack = "";
                    final byte b4 = 0;
                    i2 = 8;
                    i3 = ConnectionsManager.getInstance(i4).sendRequest(tL_langpack_getDifference, new RequestDelegate(k96Var) { // from class: g96
                        public final /* synthetic */ k96 b;

                        {
                            this.b = k96Var;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (b4) {
                                case 0:
                                    final byte b42 = 1;
                                    final k96 k96Var2 = this.b;
                                    final String str42 = str2;
                                    final h96 h96Var = d12;
                                    final i96 i96Var2 = i96Var;
                                    final int i5 = i4;
                                    final y86 y86Var2 = y86Var;
                                    gl.c3(new Runnable() { // from class: d96
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b52 = b42;
                                            TLObject tLObject2 = tLObject;
                                            h96 h96Var22 = h96Var;
                                            String str52 = str42;
                                            switch (b52) {
                                                case 0:
                                                    k96 k96Var32 = k96Var2;
                                                    HashMap hashMap = k96Var32.T;
                                                    if (hashMap.get(str52) == h96Var22) {
                                                        hashMap.remove(str52);
                                                    }
                                                    y86 y86Var32 = y86Var2;
                                                    if (tLObject2 == null) {
                                                        y86Var32.run();
                                                        break;
                                                    } else {
                                                        k96Var32.b1(i96Var2, (TLRPC.TL_langPackDifference) tLObject2, i5, true, y86Var32);
                                                        break;
                                                    }
                                                default:
                                                    k96 k96Var4 = k96Var2;
                                                    HashMap hashMap2 = k96Var4.T;
                                                    if (hashMap2.get(str52) == h96Var22) {
                                                        hashMap2.remove(str52);
                                                    }
                                                    y86 y86Var4 = y86Var2;
                                                    if (tLObject2 == null) {
                                                        y86Var4.run();
                                                        break;
                                                    } else {
                                                        k96Var4.b1(i96Var2, (TLRPC.TL_langPackDifference) tLObject2, i5, true, y86Var4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b5 = 0;
                                    final k96 k96Var3 = this.b;
                                    final String str5 = str2;
                                    final h96 h96Var2 = d12;
                                    final i96 i96Var3 = i96Var;
                                    final int i6 = i4;
                                    final y86 y86Var3 = y86Var;
                                    gl.c3(new Runnable() { // from class: d96
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b52 = b5;
                                            TLObject tLObject2 = tLObject;
                                            h96 h96Var22 = h96Var2;
                                            String str52 = str5;
                                            switch (b52) {
                                                case 0:
                                                    k96 k96Var32 = k96Var3;
                                                    HashMap hashMap = k96Var32.T;
                                                    if (hashMap.get(str52) == h96Var22) {
                                                        hashMap.remove(str52);
                                                    }
                                                    y86 y86Var32 = y86Var3;
                                                    if (tLObject2 == null) {
                                                        y86Var32.run();
                                                        break;
                                                    } else {
                                                        k96Var32.b1(i96Var3, (TLRPC.TL_langPackDifference) tLObject2, i6, true, y86Var32);
                                                        break;
                                                    }
                                                default:
                                                    k96 k96Var4 = k96Var3;
                                                    HashMap hashMap2 = k96Var4.T;
                                                    if (hashMap2.get(str52) == h96Var22) {
                                                        hashMap2.remove(str52);
                                                    }
                                                    y86 y86Var4 = y86Var3;
                                                    if (tLObject2 == null) {
                                                        y86Var4.run();
                                                        break;
                                                    } else {
                                                        k96Var4.b1(i96Var3, (TLRPC.TL_langPackDifference) tLObject2, i6, true, y86Var4);
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    }, 8);
                    d12.c = i3;
                    k96Var = this;
                    i4 = i;
                }
                if (str != null || str.equals(i96Var.c)) {
                    final String b5 = i96Var.b();
                    boolean z5 = (i96Var.h != 0 || z) ? z2 : b;
                    iArr[b] = iArr[b] + 1;
                    boolean z6 = z5;
                    d1 = k96Var.d1(b5, z6, i4, sx5Var);
                    if (d1 != null) {
                        final y86 y86Var2 = new y86(sx5Var, d1, b);
                        if (z6) {
                            for (int i5 = 0; i5 < 4; i5++) {
                                ConnectionsManager.setLangCode(i96Var.c());
                            }
                            fa4.b("applyRemoteLanguage getLangPack");
                            TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack2 = new TLRPC.TL_langpack_getLangPack();
                            tL_langpack_getLangPack2.lang_code = i96Var.c();
                            final byte b6 = 1;
                            i3 = ConnectionsManager.getInstance(i).sendRequest(tL_langpack_getLangPack2, new RequestDelegate(this) { // from class: z86
                                public final /* synthetic */ k96 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (b6) {
                                        case 0:
                                            final byte b7 = 1;
                                            final k96 k96Var2 = this.b;
                                            final String str5 = b5;
                                            final h96 h96Var = d1;
                                            final i96 i96Var2 = i96Var;
                                            final int i6 = i;
                                            final y86 y86Var3 = y86Var2;
                                            gl.c3(new Runnable() { // from class: c96
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b8 = b7;
                                                    TLObject tLObject2 = tLObject;
                                                    h96 h96Var2 = h96Var;
                                                    String str6 = str5;
                                                    switch (b8) {
                                                        case 0:
                                                            k96 k96Var3 = k96Var2;
                                                            HashMap hashMap = k96Var3.T;
                                                            if (hashMap.get(str6) == h96Var2) {
                                                                hashMap.remove(str6);
                                                            }
                                                            y86 y86Var4 = y86Var3;
                                                            if (tLObject2 == null) {
                                                                y86Var4.run();
                                                                break;
                                                            } else {
                                                                k96Var3.b1(i96Var2, (TLRPC.TL_langPackDifference) tLObject2, i6, true, y86Var4);
                                                                break;
                                                            }
                                                        default:
                                                            k96 k96Var4 = k96Var2;
                                                            HashMap hashMap2 = k96Var4.T;
                                                            if (hashMap2.get(str6) == h96Var2) {
                                                                hashMap2.remove(str6);
                                                            }
                                                            y86 y86Var5 = y86Var3;
                                                            if (tLObject2 == null) {
                                                                y86Var5.run();
                                                                break;
                                                            } else {
                                                                k96Var4.b1(i96Var2, (TLRPC.TL_langPackDifference) tLObject2, i6, true, y86Var5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            final byte b8 = 0;
                                            final k96 k96Var3 = this.b;
                                            final String str6 = b5;
                                            final h96 h96Var2 = d1;
                                            final i96 i96Var3 = i96Var;
                                            final int i7 = i;
                                            final y86 y86Var4 = y86Var2;
                                            gl.c3(new Runnable() { // from class: c96
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b82 = b8;
                                                    TLObject tLObject2 = tLObject;
                                                    h96 h96Var22 = h96Var2;
                                                    String str62 = str6;
                                                    switch (b82) {
                                                        case 0:
                                                            k96 k96Var32 = k96Var3;
                                                            HashMap hashMap = k96Var32.T;
                                                            if (hashMap.get(str62) == h96Var22) {
                                                                hashMap.remove(str62);
                                                            }
                                                            y86 y86Var42 = y86Var4;
                                                            if (tLObject2 == null) {
                                                                y86Var42.run();
                                                                break;
                                                            } else {
                                                                k96Var32.b1(i96Var3, (TLRPC.TL_langPackDifference) tLObject2, i7, true, y86Var42);
                                                                break;
                                                            }
                                                        default:
                                                            k96 k96Var4 = k96Var3;
                                                            HashMap hashMap2 = k96Var4.T;
                                                            if (hashMap2.get(str62) == h96Var22) {
                                                                hashMap2.remove(str62);
                                                            }
                                                            y86 y86Var5 = y86Var4;
                                                            if (tLObject2 == null) {
                                                                y86Var5.run();
                                                                break;
                                                            } else {
                                                                k96Var4.b1(i96Var3, (TLRPC.TL_langPackDifference) tLObject2, i7, true, y86Var5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                    }
                                }
                            }, i2);
                            d1.c = i3;
                        } else {
                            fa4.b("applyRemoteLanguage getDifference");
                            TLRPC.TL_langpack_getDifference tL_langpack_getDifference2 = new TLRPC.TL_langpack_getDifference();
                            tL_langpack_getDifference2.from_version = i96Var.h;
                            tL_langpack_getDifference2.lang_code = i96Var.c();
                            tL_langpack_getDifference2.lang_pack = "";
                            final byte b7 = 0;
                            i3 = ConnectionsManager.getInstance(i4).sendRequest(tL_langpack_getDifference2, new RequestDelegate(k96Var) { // from class: z86
                                public final /* synthetic */ k96 b;

                                {
                                    this.b = k96Var;
                                }

                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    switch (b7) {
                                        case 0:
                                            final byte b72 = 1;
                                            final k96 k96Var2 = this.b;
                                            final String str5 = b5;
                                            final h96 h96Var = d1;
                                            final i96 i96Var2 = i96Var;
                                            final int i6 = i4;
                                            final y86 y86Var3 = y86Var2;
                                            gl.c3(new Runnable() { // from class: c96
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b82 = b72;
                                                    TLObject tLObject2 = tLObject;
                                                    h96 h96Var22 = h96Var;
                                                    String str62 = str5;
                                                    switch (b82) {
                                                        case 0:
                                                            k96 k96Var32 = k96Var2;
                                                            HashMap hashMap = k96Var32.T;
                                                            if (hashMap.get(str62) == h96Var22) {
                                                                hashMap.remove(str62);
                                                            }
                                                            y86 y86Var42 = y86Var3;
                                                            if (tLObject2 == null) {
                                                                y86Var42.run();
                                                                break;
                                                            } else {
                                                                k96Var32.b1(i96Var2, (TLRPC.TL_langPackDifference) tLObject2, i6, true, y86Var42);
                                                                break;
                                                            }
                                                        default:
                                                            k96 k96Var4 = k96Var2;
                                                            HashMap hashMap2 = k96Var4.T;
                                                            if (hashMap2.get(str62) == h96Var22) {
                                                                hashMap2.remove(str62);
                                                            }
                                                            y86 y86Var5 = y86Var3;
                                                            if (tLObject2 == null) {
                                                                y86Var5.run();
                                                                break;
                                                            } else {
                                                                k96Var4.b1(i96Var2, (TLRPC.TL_langPackDifference) tLObject2, i6, true, y86Var5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                        default:
                                            final byte b8 = 0;
                                            final k96 k96Var3 = this.b;
                                            final String str6 = b5;
                                            final h96 h96Var2 = d1;
                                            final i96 i96Var3 = i96Var;
                                            final int i7 = i4;
                                            final y86 y86Var4 = y86Var2;
                                            gl.c3(new Runnable() { // from class: c96
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b82 = b8;
                                                    TLObject tLObject2 = tLObject;
                                                    h96 h96Var22 = h96Var2;
                                                    String str62 = str6;
                                                    switch (b82) {
                                                        case 0:
                                                            k96 k96Var32 = k96Var3;
                                                            HashMap hashMap = k96Var32.T;
                                                            if (hashMap.get(str62) == h96Var22) {
                                                                hashMap.remove(str62);
                                                            }
                                                            y86 y86Var42 = y86Var4;
                                                            if (tLObject2 == null) {
                                                                y86Var42.run();
                                                                break;
                                                            } else {
                                                                k96Var32.b1(i96Var3, (TLRPC.TL_langPackDifference) tLObject2, i7, true, y86Var42);
                                                                break;
                                                            }
                                                        default:
                                                            k96 k96Var4 = k96Var3;
                                                            HashMap hashMap2 = k96Var4.T;
                                                            if (hashMap2.get(str62) == h96Var22) {
                                                                hashMap2.remove(str62);
                                                            }
                                                            y86 y86Var5 = y86Var4;
                                                            if (tLObject2 == null) {
                                                                y86Var5.run();
                                                                break;
                                                            } else {
                                                                k96Var4.b1(i96Var3, (TLRPC.TL_langPackDifference) tLObject2, i7, true, y86Var5);
                                                                break;
                                                            }
                                                    }
                                                }
                                            });
                                            break;
                                    }
                                }
                            }, i2);
                            d1.c = i3;
                        }
                    }
                }
                if (iArr[0] == 0 && runnable != null) {
                    runnable.run();
                }
                return i3;
            }
        }
        b = 0;
        z2 = true;
        i2 = 8;
        i3 = 0;
        if (str != null) {
        }
        final String b52 = i96Var.b();
        if (i96Var.h != 0) {
        }
        iArr[b] = iArr[b] + 1;
        boolean z62 = z5;
        d1 = k96Var.d1(b52, z62, i4, sx5Var);
        if (d1 != null) {
        }
        if (iArr[0] == 0) {
            runnable.run();
        }
        return i3;
    }

    public final FastDateFormat g0() {
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.l = k(locale, O0(2131742523, "chatDate", null), "d MMMM");
                }
            }
        }
        return this.l;
    }

    public final FastDateFormat h0() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.n = k(locale, O0(2131742521, "chatFullDate", null), "d MMMM yyyy");
                }
            }
        }
        return this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        if (r14.equals("de") == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        char c;
        if (!Objects.equals(this.V, this.y) || this.W == null || this.X) {
            boolean z = true;
            this.X = true;
            synchronized (this) {
                Locale locale = this.y;
                if (!Objects.equals(this.V, locale) || this.W == null) {
                    if (this.U == null) {
                        q96 q96Var = new q96();
                        try {
                            q96Var.a = r96.c(a.b, "localization_en.bin", q96Var.a);
                        } catch (Exception unused) {
                        }
                        this.U = new r96(q96Var);
                    }
                    String str = "localization_ar.bin";
                    if (locale != null) {
                        String languageTag = locale.toLanguageTag();
                        languageTag.getClass();
                        switch (languageTag.hashCode()) {
                            case 3121:
                                if (languageTag.equals("ar")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3201:
                                if (languageTag.equals("de")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3241:
                                if (languageTag.equals("en")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3246:
                                if (languageTag.equals("es")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3371:
                                if (languageTag.equals("it")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3428:
                                if (languageTag.equals("ko")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3518:
                                if (languageTag.equals("nl")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3651:
                                if (languageTag.equals("ru")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3734:
                                if (languageTag.equals("uk")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 106935481:
                                if (languageTag.equals("pt-BR")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
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
                                            z = false;
                                            break;
                                        }
                                        z = -1;
                                        break;
                                    case 3201:
                                        break;
                                    case 3241:
                                        if (language.equals("en")) {
                                            z = 2;
                                            break;
                                        }
                                        z = -1;
                                        break;
                                    case 3246:
                                        if (language.equals("es")) {
                                            z = 3;
                                            break;
                                        }
                                        z = -1;
                                        break;
                                    case 3371:
                                        if (language.equals("it")) {
                                            z = 4;
                                            break;
                                        }
                                        z = -1;
                                        break;
                                    case 3428:
                                        if (language.equals("ko")) {
                                            z = 5;
                                            break;
                                        }
                                        z = -1;
                                        break;
                                    case 3518:
                                        if (language.equals("nl")) {
                                            z = 6;
                                            break;
                                        }
                                        z = -1;
                                        break;
                                    case 3651:
                                        if (language.equals("ru")) {
                                            z = 7;
                                            break;
                                        }
                                        z = -1;
                                        break;
                                    case 3734:
                                        if (language.equals("uk")) {
                                            z = 8;
                                            break;
                                        }
                                        z = -1;
                                        break;
                                    default:
                                        z = -1;
                                        break;
                                }
                                switch (z) {
                                }
                        }
                        if (str != null || TextUtils.equals(str, "localization_en.bin")) {
                            this.W = this.U;
                        } else {
                            q96 q96Var2 = new q96();
                            r96 r96Var = this.U;
                            if (q96Var2.a == null) {
                                q96Var2.a = r96Var.a.clone();
                            } else {
                                SparseArray sparseArray = r96Var.a;
                                int size = sparseArray.size();
                                for (int i = 0; i < size; i++) {
                                    q96Var2.a.put(sparseArray.keyAt(i), (String) sparseArray.valueAt(i));
                                }
                            }
                            try {
                                q96Var2.a = r96.c(a.b, str, q96Var2.a);
                            } catch (Exception unused2) {
                            }
                            this.W = new r96(q96Var2);
                        }
                        this.V = locale;
                    }
                    str = null;
                    if (str != null) {
                    }
                    this.W = this.U;
                    this.V = locale;
                }
            }
            this.X = false;
        }
    }

    public final void j(int i) {
        i96 i96Var = this.B;
        if (i96Var == null || this.P || !c1(i96Var.c)) {
            return;
        }
        if (w01.a) {
            fa4.b("reload locale because locale file is not enough");
        }
        gl.c3(new a96(this, i, (byte) 2));
    }

    public final FastDateFormat l0() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.j = k(locale, c0 ? O0(2131742516, "formatterBannedUntil24H", null) : O0(2131742517, "formatterBannedUntil12H", null), c0 ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                }
            }
        }
        return this.j;
    }

    public final FastDateFormat m0() {
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.k = k(locale, c0 ? O0(2131742514, "formatterBannedUntilThisYear24H", null) : O0(2131742515, "formatterBannedUntilThisYear12H", null), c0 ? "MMM dd, HH:mm" : "MMM dd, h:mm a");
                }
            }
        }
        return this.k;
    }

    public final FastDateFormat n0() {
        if (this.t == null) {
            synchronized (this) {
                if (this.t == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.t = k(locale, O0(2131742513, "formatterBoostExpired", null), "MMM dd, yyyy");
                }
            }
        }
        return this.t;
    }

    public final FastDateFormat o0() {
        if (this.a == null) {
            synchronized (this) {
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
                    this.a = k(locale, c0 ? O0(2131742511, "formatterDay24H", null) : O0(2131742512, "formatterDay12H", null), c0 ? "HH:mm" : "h:mm a");
                }
            }
        }
        return this.a;
    }

    public final String p(long j, String str) {
        return q(j, true, true, false, str);
    }

    public final FastDateFormat p0() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.f = k(locale, O0(2131742505, "formatterMonth", null), "dd MMM");
                }
            }
        }
        return this.f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String q(long j, boolean z, boolean z2, boolean z3, String str) {
        double d;
        int length;
        String upperCase = str.toUpperCase();
        boolean z4 = j < 0;
        long abs = Math.abs(j);
        Currency currency = Currency.getInstance(upperCase);
        upperCase.getClass();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c = 29;
                    break;
                }
                break;
            case 87254:
                if (upperCase.equals("XTR")) {
                    c = 30;
                    break;
                }
                break;
        }
        String str2 = " %.2f";
        switch (c) {
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
            case kk7.S /* 30 */:
                d = abs;
                str2 = " %.0f";
                break;
            case 3:
                d = abs / 10000.0d;
                str2 = " %.4f";
                break;
            case '\t':
                double d2 = abs / 100.0f;
                if (z && abs % 100 == 0) {
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
        String str3 = z2 ? str2 : " %.0f";
        if (currency == null) {
            return (z4 ? "-" : "").concat(String.format(Locale.US, upperCase.concat(str3), Double.valueOf(d)));
        }
        Locale locale = this.y;
        if (locale == null) {
            locale = this.z;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        if (z3) {
            currencyInstance.setGroupingUsed(false);
        }
        if (!z2 || (z && upperCase.equals("IRR"))) {
            currencyInstance.setMaximumFractionDigits(0);
        }
        String str4 = (z4 ? "-" : "") + currencyInstance.format(d);
        int indexOf = str4.indexOf(upperCase);
        if (indexOf < 0 || (length = upperCase.length() + indexOf) >= str4.length() || str4.charAt(length) == ' ') {
            return str4;
        }
        return str4.substring(0, length) + " " + str4.substring(length);
    }

    public final FastDateFormat q0() {
        if (this.b == null) {
            synchronized (this) {
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
                    this.b = k(locale, c0 ? O0(2131742509, "formatterDayWithSeconds24H", null) : O0(2131742510, "formatterDayWithSeconds12H", null), c0 ? "HH:mm:ss" : "h:mm:ss a");
                }
            }
        }
        return this.b;
    }

    public final FastDateFormat r0() {
        if (this.s == null) {
            synchronized (this) {
                if (this.s == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.s = k(locale, O0(2131742508, "formatterGiveawayCard", null), "dd MMM yyyy");
                }
            }
        }
        return this.s;
    }

    public final FastDateFormat s0() {
        if (this.u == null) {
            synchronized (this) {
                if (this.u == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.u = k(locale, O0(2131742507, "formatterGiveawayMonthDay", null), "MMMM dd");
                }
            }
        }
        return this.u;
    }

    public final FastDateFormat t0() {
        if (this.v == null) {
            synchronized (this) {
                if (this.v == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.v = k(locale, O0(2131742506, "formatterGiveawayMonthDayYear", null), "MMMM dd, yyyy");
                }
            }
        }
        return this.v;
    }

    public final FastDateFormat u0() {
        if (this.q == null) {
            synchronized (this) {
                if (this.q == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.q = k(locale, O0(2131742502, "formatterMonthYear", null), "MMM yyyy");
                }
            }
        }
        return this.q;
    }

    public final FastDateFormat v0() {
        if (this.o == null) {
            synchronized (this) {
                if (this.o == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.o = k(locale, O0(2131742519, "formatDateSchedule", null), "MMM d");
                }
            }
        }
        return this.o;
    }

    public final FastDateFormat w0(int i) {
        if (i >= 0) {
            FastDateFormat[] fastDateFormatArr = this.w;
            if (i < fastDateFormatArr.length) {
                if (fastDateFormatArr[i] == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    switch (i) {
                        case 0:
                            fastDateFormatArr[i] = k(locale, O0(2131745395, "SendTodayAt", null), "'Send today at' HH:mm");
                            break;
                        case 1:
                            fastDateFormatArr[i] = k(locale, O0(2131745437, "SendDayAt", null), "'Send on' MMM d 'at' HH:mm");
                            break;
                        case 2:
                            fastDateFormatArr[i] = k(locale, O0(2131745436, "SendDayYearAt", null), "'Send on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 3:
                            fastDateFormatArr[i] = k(locale, O0(2131746130, "RemindTodayAt", null), "'Remind today at' HH:mm");
                            break;
                        case 4:
                            fastDateFormatArr[i] = k(locale, O0(2131746132, "RemindDayAt", null), "'Remind on' MMM d 'at' HH:mm");
                            break;
                        case 5:
                            fastDateFormatArr[i] = k(locale, O0(2131746131, "RemindDayYearAt", null), "'Remind on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 6:
                            fastDateFormatArr[i] = k(locale, O0(2131744668, "StartTodayAt", null), "'Start today at' HH:mm");
                            break;
                        case 7:
                            fastDateFormatArr[i] = k(locale, O0(2131744677, "StartDayAt", null), "'Start on' MMM d 'at' HH:mm");
                            break;
                        case 8:
                            fastDateFormatArr[i] = k(locale, O0(2131744676, "StartDayYearAt", null), "'Start on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 9:
                            fastDateFormatArr[i] = k(locale, O0(2131744671, "StartShortTodayAt", null), "'Today,' HH:mm");
                            break;
                        case 10:
                            fastDateFormatArr[i] = k(locale, O0(2131744673, "StartShortDayAt", null), "MMM d',' HH:mm");
                            break;
                        case 11:
                            fastDateFormatArr[i] = k(locale, O0(2131744672, "StartShortDayYearAt", null), "MMM d yyyy, HH:mm");
                            break;
                        case 12:
                            fastDateFormatArr[i] = k(locale, O0(2131744660, "StartsTodayAt", null), "'Starts today at' HH:mm");
                            break;
                        case 13:
                            fastDateFormatArr[i] = k(locale, O0(2131744662, "StartsDayAt", null), "'Starts on' MMM d 'at' HH:mm");
                            break;
                        case 14:
                            fastDateFormatArr[i] = k(locale, O0(2131744661, "StartsDayYearAt", null), "'Starts on' MMM d yyyy 'at' HH:mm");
                            break;
                        case 15:
                            fastDateFormatArr[i] = k(locale, O0(2131746384, "PublishTodayAt", null), "'Publish today at' HH:mm");
                            break;
                        case 16:
                            fastDateFormatArr[i] = k(locale, O0(2131746386, "PublishDayAt", null), "'Publish on' MMM d 'at' HH:mm");
                            break;
                        case 17:
                            fastDateFormatArr[i] = k(locale, O0(2131746385, "PublishDayYearAt", null), "'Publish on' MMM d yyyy 'at' HH:mm");
                            break;
                    }
                }
                return fastDateFormatArr[i];
            }
        }
        return null;
    }

    public final FastDateFormat x0() {
        if (this.p == null) {
            synchronized (this) {
                if (this.p == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.p = k(locale, O0(2131742518, "formatDateScheduleYear", null), "MMM d yyyy");
                }
            }
        }
        return this.p;
    }

    public final FastDateFormat y0() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.i = k(locale, c0 ? O0(2131742499, "formatterStats24H", null) : O0(2131742500, "formatterStats12H", null), c0 ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                }
            }
        }
        return this.i;
    }

    public final FastDateFormat z0() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    Locale locale = this.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    this.d = k(locale, O0(2131742498, "formatterWeek", null), "EEE");
                }
            }
        }
        return this.d;
    }
}
