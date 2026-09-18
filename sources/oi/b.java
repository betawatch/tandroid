package oi;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class b {
    public static final Pattern g = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_-]*(/[A-Za-z0-9][A-Za-z0-9_-]*)*");
    public static final Pattern h = Pattern.compile("[A-Za-z0-9_-]+");
    public static final b i = a().a();
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public b(a aVar) {
        int i10 = aVar.a;
        this.a = i10;
        this.b = aVar.b;
        if (i10 == 3) {
            this.f = aVar.f;
            this.c = 0;
            this.d = "";
            this.e = "";
            return;
        }
        if (i10 == 2) {
            this.f = aVar.f;
            this.c = aVar.c;
            this.d = "";
            this.e = "";
            return;
        }
        if (i10 != 1) {
            throw new IllegalArgumentException();
        }
        this.f = "";
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    public static a a() {
        a aVar = new a();
        aVar.a = 1;
        aVar.b = "";
        aVar.d = "";
        aVar.e = "";
        aVar.f = "";
        return aVar;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str) && h.matcher(str).matches()) {
            try {
                byte[] decode = Base64.decode(str, 11);
                if (decode.length >= 17 && (decode[0] & 255) == 112) {
                    char[] cArr = new char[(decode.length - 1) * 2];
                    char[] charArray = "0123456789abcdef".toCharArray();
                    for (int i10 = 1; i10 < decode.length; i10++) {
                        byte b10 = decode[i10];
                        int i11 = (i10 - 1) * 2;
                        cArr[i11] = charArray[(b10 & 255) >>> 4];
                        cArr[i11 + 1] = charArray[b10 & 15];
                    }
                    String str2 = new String(cArr);
                    if (!g(str2)) {
                        return null;
                    }
                    if (Base64.encodeToString(decode, 11).equals(str)) {
                        return str2;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static b c(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i10 = sharedPreferences.getInt("proxy_port", 1080);
        int i11 = 2;
        int c10 = m1.j.c(TextUtils.isEmpty(string4) ? 1 : 2);
        if (c10 == 1) {
            i11 = 1;
        } else if (c10 != 2) {
            i11 = 0;
        }
        int e = e(sharedPreferences.getInt("proxy_type", i11));
        a a2 = a();
        if (string == null) {
            string = "";
        }
        a2.b = string;
        if (string2 == null) {
            string2 = "";
        }
        a2.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a2.e = string3;
        a2.f = string4 != null ? string4 : "";
        a2.c = i10;
        a2.a = e != 0 ? e : 1;
        return a2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[Catch: Exception -> 0x015b, TryCatch #0 {Exception -> 0x015b, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002b, B:18:0x0037, B:21:0x0040, B:23:0x0048, B:26:0x0051, B:28:0x0059, B:32:0x0064, B:36:0x006e, B:37:0x00cd, B:39:0x00d5, B:41:0x00dd, B:43:0x00e3, B:44:0x00e7, B:91:0x00f4, B:48:0x00fa, B:51:0x0104, B:55:0x010f, B:59:0x0116, B:63:0x011d, B:66:0x0124, B:70:0x012c, B:73:0x013a, B:76:0x0146, B:79:0x014c, B:81:0x0154, B:96:0x0083, B:100:0x008b, B:102:0x0097, B:104:0x009f, B:108:0x00a9, B:112:0x00b1, B:115:0x00bb, B:118:0x00c4), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5 A[Catch: Exception -> 0x015b, TryCatch #0 {Exception -> 0x015b, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002b, B:18:0x0037, B:21:0x0040, B:23:0x0048, B:26:0x0051, B:28:0x0059, B:32:0x0064, B:36:0x006e, B:37:0x00cd, B:39:0x00d5, B:41:0x00dd, B:43:0x00e3, B:44:0x00e7, B:91:0x00f4, B:48:0x00fa, B:51:0x0104, B:55:0x010f, B:59:0x0116, B:63:0x011d, B:66:0x0124, B:70:0x012c, B:73:0x013a, B:76:0x0146, B:79:0x014c, B:81:0x0154, B:96:0x0083, B:100:0x008b, B:102:0x0097, B:104:0x009f, B:108:0x00a9, B:112:0x00b1, B:115:0x00bb, B:118:0x00c4), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0154 A[Catch: Exception -> 0x015b, TRY_LEAVE, TryCatch #0 {Exception -> 0x015b, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002b, B:18:0x0037, B:21:0x0040, B:23:0x0048, B:26:0x0051, B:28:0x0059, B:32:0x0064, B:36:0x006e, B:37:0x00cd, B:39:0x00d5, B:41:0x00dd, B:43:0x00e3, B:44:0x00e7, B:91:0x00f4, B:48:0x00fa, B:51:0x0104, B:55:0x010f, B:59:0x0116, B:63:0x011d, B:66:0x0124, B:70:0x012c, B:73:0x013a, B:76:0x0146, B:79:0x014c, B:81:0x0154, B:96:0x0083, B:100:0x008b, B:102:0x0097, B:104:0x009f, B:108:0x00a9, B:112:0x00b1, B:115:0x00bb, B:118:0x00c4), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b d(Uri uri) {
        String path;
        String queryParameter;
        String queryParameter2;
        int parseInt;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        int indexOf;
        if (uri == null) {
            return null;
        }
        try {
            String scheme = uri.getScheme();
            if (scheme == null) {
                return null;
            }
            int i10 = 2;
            if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) {
                if (!scheme.equalsIgnoreCase("tg")) {
                    return null;
                }
                String uri2 = uri.toString();
                if (!uri2.startsWith("tg://socks") && !uri2.startsWith("tg:socks")) {
                    if (!uri2.startsWith("tg://proxy") && !uri2.startsWith("tg:proxy")) {
                        if (!uri2.startsWith("tg://webproxy") && !uri2.startsWith("tg:webproxy")) {
                            return null;
                        }
                        i10 = 3;
                    }
                    indexOf = uri2.indexOf(63);
                    if (indexOf >= 0) {
                        return null;
                    }
                    uri = Uri.parse("tg://telegram.org/" + uri2.substring(indexOf));
                    queryParameter = uri.getQueryParameter("server");
                    if (queryParameter == null) {
                        queryParameter = uri.getQueryParameter("host");
                    }
                    if (i10 != 3 && AndroidUtilities.checkHostForPunycode(queryParameter)) {
                        queryParameter = IDN.toASCII(queryParameter, 1);
                    }
                    queryParameter2 = uri.getQueryParameter("port");
                    boolean z10 = false;
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        try {
                            parseInt = Integer.parseInt(queryParameter2);
                        } catch (NumberFormatException unused) {
                        }
                        queryParameter3 = uri.getQueryParameter("secret");
                        if (i10 == 3) {
                            if (queryParameter != null && queryParameter.indexOf(47) >= 0) {
                                z10 = true;
                            }
                            if (z10) {
                                queryParameter3 = b(queryParameter3);
                                if (queryParameter3 == null) {
                                    return null;
                                }
                            } else if (!g(queryParameter3)) {
                                return null;
                            }
                        }
                        a a2 = a();
                        a2.a = i10 != 0 ? i10 : 1;
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        a2.b = queryParameter;
                        a2.c = parseInt;
                        queryParameter4 = uri.getQueryParameter("user");
                        if (queryParameter4 == null) {
                            queryParameter4 = "";
                        }
                        a2.d = queryParameter4;
                        queryParameter5 = uri.getQueryParameter("pass");
                        if (queryParameter5 == null) {
                            queryParameter5 = "";
                        }
                        a2.e = queryParameter5;
                        if (queryParameter3 == null) {
                            queryParameter3 = "";
                        }
                        a2.f = queryParameter3;
                        b a10 = a2.a();
                        if (i10 == 3) {
                            if (!a10.f()) {
                                return null;
                            }
                        }
                        return a10;
                    }
                    parseInt = 0;
                    queryParameter3 = uri.getQueryParameter("secret");
                    if (i10 == 3) {
                    }
                    a a22 = a();
                    a22.a = i10 != 0 ? i10 : 1;
                    if (queryParameter == null) {
                    }
                    a22.b = queryParameter;
                    a22.c = parseInt;
                    queryParameter4 = uri.getQueryParameter("user");
                    if (queryParameter4 == null) {
                    }
                    a22.d = queryParameter4;
                    queryParameter5 = uri.getQueryParameter("pass");
                    if (queryParameter5 == null) {
                    }
                    a22.e = queryParameter5;
                    if (queryParameter3 == null) {
                    }
                    a22.f = queryParameter3;
                    b a102 = a22.a();
                    if (i10 == 3) {
                    }
                    return a102;
                }
                i10 = 1;
                indexOf = uri2.indexOf(63);
                if (indexOf >= 0) {
                }
            }
            String host = uri.getHost();
            if (host == null) {
                return null;
            }
            String lowerCase = host.toLowerCase();
            if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = uri.getPath()) != null) {
                if (path.startsWith("/socks")) {
                    i10 = 1;
                } else if (!path.startsWith("/proxy")) {
                    if (!path.startsWith("/webproxy")) {
                        return null;
                    }
                    i10 = 3;
                }
                queryParameter = uri.getQueryParameter("server");
                if (queryParameter == null) {
                }
                if (i10 != 3) {
                    queryParameter = IDN.toASCII(queryParameter, 1);
                }
                queryParameter2 = uri.getQueryParameter("port");
                boolean z102 = false;
                if (!TextUtils.isEmpty(queryParameter2)) {
                }
                parseInt = 0;
                queryParameter3 = uri.getQueryParameter("secret");
                if (i10 == 3) {
                }
                a a222 = a();
                a222.a = i10 != 0 ? i10 : 1;
                if (queryParameter == null) {
                }
                a222.b = queryParameter;
                a222.c = parseInt;
                queryParameter4 = uri.getQueryParameter("user");
                if (queryParameter4 == null) {
                }
                a222.d = queryParameter4;
                queryParameter5 = uri.getQueryParameter("pass");
                if (queryParameter5 == null) {
                }
                a222.e = queryParameter5;
                if (queryParameter3 == null) {
                }
                a222.f = queryParameter3;
                b a1022 = a222.a();
                if (i10 == 3) {
                }
                return a1022;
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static int e(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public static boolean g(String str) {
        if (str != null) {
            if (str.length() == 32) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    if (Character.digit(str.charAt(i10), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
            if (str.length() == 34 && str.regionMatches(true, 0, "dd", 0, 2)) {
                for (int i11 = 2; i11 < str.length(); i11++) {
                    if (Character.digit(str.charAt(i11), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.c == bVar.c && this.a == bVar.a && Objects.equals(this.b, bVar.b) && Objects.equals(this.d, bVar.d) && Objects.equals(this.e, bVar.e) && Objects.equals(this.f, bVar.f);
    }

    public final boolean f() {
        boolean equals;
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            if (this.a == 3) {
                if (!TextUtils.isEmpty(str)) {
                    int indexOf = str.indexOf(47);
                    String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                    String substring2 = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                    if (!TextUtils.isEmpty(substring) && substring.indexOf(58) < 0 && substring.indexOf(63) < 0 && substring.indexOf(35) < 0 && (substring2 == null || (substring2.length() <= 128 && g.matcher(substring2).matches()))) {
                        try {
                            equals = substring.equals(IDN.toASCII(substring, 3).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                        }
                        return equals && g(this.f);
                    }
                }
                equals = false;
                if (equals) {
                    return false;
                }
            }
            if (this.c > 0) {
                return true;
            }
        }
        return false;
    }

    public final void h(SharedPreferences.Editor editor) {
        int i10 = this.a;
        int c10 = m1.j.c(i10);
        editor.putInt("proxy_type", c10 != 1 ? c10 != 2 ? 0 : 2 : 1);
        editor.putString("proxy_ip", this.b);
        int c11 = m1.j.c(i10);
        int i11 = this.c;
        if (c11 == 0) {
            editor.putInt("proxy_port", i11);
            editor.remove("proxy_secret");
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                editor.remove("proxy_pass");
            } else {
                editor.putString("proxy_pass", str);
            }
            String str2 = this.d;
            if (TextUtils.isEmpty(str2)) {
                editor.remove("proxy_user");
                return;
            } else {
                editor.putString("proxy_user", str2);
                return;
            }
        }
        String str3 = this.f;
        if (c11 == 1) {
            editor.putString("proxy_secret", str3);
            editor.putInt("proxy_port", i11);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        if (c11 != 2) {
            return;
        }
        editor.putString("proxy_secret", str3);
        editor.remove("proxy_port");
        editor.remove("proxy_pass");
        editor.remove("proxy_user");
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f);
    }
}
