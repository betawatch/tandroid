// default package

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jx8 {
    public static final Pattern g = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_-]*(/[A-Za-z0-9][A-Za-z0-9_-]*)*");
    public static final Pattern h = Pattern.compile("[A-Za-z0-9_-]+");
    public static final jx8 i = a().c();
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public jx8(m66 m66Var) {
        int i2 = m66Var.a;
        this.a = i2;
        this.b = (String) m66Var.c;
        if (i2 == 3) {
            this.f = (String) m66Var.f;
            this.c = 0;
            this.d = "";
            this.e = "";
            return;
        }
        if (i2 == 2) {
            this.f = (String) m66Var.f;
            this.c = m66Var.b;
            this.d = "";
            this.e = "";
            return;
        }
        if (i2 != 1) {
            iy8.d();
            throw null;
        }
        this.f = "";
        this.c = m66Var.b;
        this.d = (String) m66Var.d;
        this.e = (String) m66Var.e;
    }

    public static m66 a() {
        m66 m66Var = new m66();
        m66Var.a = 1;
        m66Var.c = "";
        m66Var.d = "";
        m66Var.e = "";
        m66Var.f = "";
        return m66Var;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str) && h.matcher(str).matches()) {
            try {
                byte[] decode = Base64.decode(str, 11);
                if (decode.length >= 17 && (decode[0] & 255) == 112) {
                    char[] cArr = new char[(decode.length - 1) << 1];
                    char[] cArr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                    for (int i2 = 1; i2 < decode.length; i2++) {
                        byte b = decode[i2];
                        int i3 = (i2 - 1) << 1;
                        cArr[i3] = cArr2[(b & 255) >>> 4];
                        cArr[i3 + 1] = cArr2[b & 15];
                    }
                    String str2 = new String(cArr);
                    if (!h(str2)) {
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

    public static jx8 c(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i2 = sharedPreferences.getInt("proxy_port", 1080);
        int i3 = 2;
        int F = ik8.F(TextUtils.isEmpty(string4) ? 1 : 2);
        if (F == 1) {
            i3 = 1;
        } else if (F != 2) {
            i3 = 0;
        }
        int f = f(sharedPreferences.getInt("proxy_type", i3));
        m66 a = a();
        if (string == null) {
            string = "";
        }
        a.c = string;
        if (string2 == null) {
            string2 = "";
        }
        a.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a.e = string3;
        a.f = string4 != null ? string4 : "";
        a.b = i2;
        a.o(f);
        return a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135 A[Catch: Exception -> 0x013c, TRY_LEAVE, TryCatch #1 {Exception -> 0x013c, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0016, B:10:0x001e, B:12:0x0026, B:14:0x0032, B:16:0x003a, B:18:0x0042, B:20:0x004a, B:22:0x0052, B:27:0x005d, B:29:0x0065, B:30:0x00b5, B:32:0x00bd, B:34:0x00c5, B:36:0x00cb, B:37:0x00cf, B:77:0x00dc, B:41:0x00e2, B:44:0x00ec, B:47:0x00f7, B:51:0x00fe, B:55:0x0104, B:59:0x0110, B:62:0x011d, B:65:0x0128, B:68:0x012d, B:70:0x0135, B:83:0x0072, B:85:0x0078, B:87:0x0084, B:89:0x008c, B:92:0x0094, B:94:0x009a, B:97:0x00a4, B:99:0x00ac), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jx8 d(Uri uri) {
        String path;
        int parseInt;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        if (uri == null) {
            return null;
        }
        try {
            String scheme = uri.getScheme();
            if (scheme == null) {
                return null;
            }
            int i2 = 2;
            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https")) {
                String host = uri.getHost();
                if (host == null) {
                    return null;
                }
                String lowerCase = host.toLowerCase();
                if ((!lowerCase.equals("telegram.me") && !lowerCase.equals("t.me") && !lowerCase.equals("telegram.dog")) || (path = uri.getPath()) == null) {
                    return null;
                }
                if (path.startsWith("/socks")) {
                    i2 = 1;
                } else if (!path.startsWith("/proxy")) {
                    if (!path.startsWith("/webproxy")) {
                        return null;
                    }
                    i2 = 3;
                }
            } else {
                if (!scheme.equalsIgnoreCase("tg")) {
                    return null;
                }
                String uri2 = uri.toString();
                if (uri2.startsWith("tg://socks") || uri2.startsWith("tg:socks")) {
                    i2 = 1;
                } else if (!uri2.startsWith("tg://proxy") && !uri2.startsWith("tg:proxy")) {
                    if (!uri2.startsWith("tg://webproxy") && !uri2.startsWith("tg:webproxy")) {
                        return null;
                    }
                    i2 = 3;
                }
                int indexOf = uri2.indexOf(63);
                if (indexOf < 0) {
                    return null;
                }
                uri = Uri.parse("tg://telegram.org/".concat(uri2.substring(indexOf)));
            }
            String queryParameter4 = uri.getQueryParameter("server");
            if (queryParameter4 == null) {
                queryParameter4 = uri.getQueryParameter("host");
            }
            if (i2 != 3 && hl.w(queryParameter4)) {
                queryParameter4 = IDN.toASCII(queryParameter4, 1);
            }
            String queryParameter5 = uri.getQueryParameter("port");
            if (!TextUtils.isEmpty(queryParameter5)) {
                try {
                    parseInt = Integer.parseInt(queryParameter5);
                } catch (NumberFormatException unused) {
                }
                queryParameter = uri.getQueryParameter("secret");
                if (i2 == 3) {
                    if (queryParameter4 != null && queryParameter4.indexOf(47) >= 0) {
                        queryParameter = b(queryParameter);
                        if (queryParameter == null) {
                            return null;
                        }
                    } else if (!h(queryParameter)) {
                        return null;
                    }
                }
                m66 a = a();
                a.o(i2);
                if (queryParameter4 == null) {
                    queryParameter4 = "";
                }
                a.c = queryParameter4;
                a.b = parseInt;
                queryParameter2 = uri.getQueryParameter("user");
                if (queryParameter2 == null) {
                    queryParameter2 = "";
                }
                a.d = queryParameter2;
                queryParameter3 = uri.getQueryParameter("pass");
                if (queryParameter3 == null) {
                    queryParameter3 = "";
                }
                a.e = queryParameter3;
                if (queryParameter == null) {
                    queryParameter = "";
                }
                a.f = queryParameter;
                jx8 c = a.c();
                if (i2 == 3) {
                    if (!c.g()) {
                        return null;
                    }
                }
                return c;
            }
            parseInt = 0;
            queryParameter = uri.getQueryParameter("secret");
            if (i2 == 3) {
            }
            m66 a2 = a();
            a2.o(i2);
            if (queryParameter4 == null) {
            }
            a2.c = queryParameter4;
            a2.b = parseInt;
            queryParameter2 = uri.getQueryParameter("user");
            if (queryParameter2 == null) {
            }
            a2.d = queryParameter2;
            queryParameter3 = uri.getQueryParameter("pass");
            if (queryParameter3 == null) {
            }
            a2.e = queryParameter3;
            if (queryParameter == null) {
            }
            a2.f = queryParameter;
            jx8 c2 = a2.c();
            if (i2 == 3) {
            }
            return c2;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static int f(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return 2;
            }
            if (i2 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public static boolean h(String str) {
        if (str != null) {
            if (str.length() == 32) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (Character.digit(str.charAt(i2), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
            if (str.length() == 34 && str.regionMatches(true, 0, "dd", 0, 2)) {
                for (int i3 = 2; i3 < str.length(); i3++) {
                    if (Character.digit(str.charAt(i3), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String e() {
        String str = this.e;
        String str2 = this.d;
        String str3 = this.b;
        String str4 = this.f;
        int i2 = this.a;
        int F = ik8.F(i2);
        StringBuilder sb = F != 1 ? F != 2 ? new StringBuilder("https://t.me/socks?") : new StringBuilder("https://t.me/webproxy?") : new StringBuilder("https://t.me/proxy?");
        try {
            sb.append("server=");
            sb.append(URLEncoder.encode(str3, "UTF-8"));
            if (i2 != 3) {
                sb.append("&port=");
                sb.append(this.c);
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&user=");
                sb.append(URLEncoder.encode(str2, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&pass=");
                sb.append(URLEncoder.encode(str, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str4)) {
                if (i2 == 3) {
                    if ((str3 != null && str3.indexOf(47) >= 0) && h(str4)) {
                        int length = str4.length() / 2;
                        byte[] bArr = new byte[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            int i4 = i3 << 1;
                            bArr[i3] = (byte) ((Character.digit(str4.charAt(i4), 16) << 4) | Character.digit(str4.charAt(i4 + 1), 16));
                        }
                        byte[] bArr2 = new byte[length + 1];
                        bArr2[0] = 112;
                        System.arraycopy(bArr, 0, bArr2, 1, length);
                        str4 = Base64.encodeToString(bArr2, 11);
                    }
                }
                sb.append("&secret=");
                sb.append(URLEncoder.encode(str4, "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx8)) {
            return false;
        }
        jx8 jx8Var = (jx8) obj;
        return this.c == jx8Var.c && this.a == jx8Var.a && Objects.equals(this.b, jx8Var.b) && Objects.equals(this.d, jx8Var.d) && Objects.equals(this.e, jx8Var.e) && Objects.equals(this.f, jx8Var.f);
    }

    public final boolean g() {
        boolean z;
        String str;
        String str2;
        String str3 = this.b;
        if (!TextUtils.isEmpty(str3)) {
            if (this.a == 3) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = str3.indexOf(47);
                    if (indexOf >= 0) {
                        str = str3.substring(0, indexOf);
                        str2 = str3.substring(indexOf + 1);
                    } else {
                        str = str3;
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && g.matcher(str2).matches()))) {
                        try {
                            z = str.equals(IDN.toASCII(str, 3).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                        }
                        return z && h(this.f);
                    }
                }
                z = false;
                if (z) {
                    return false;
                }
            }
            if (this.c > 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ik8.b(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f);
    }

    public final void i(SharedPreferences.Editor editor) {
        int i2 = this.a;
        int F = ik8.F(i2);
        editor.putInt("proxy_type", F != 1 ? F != 2 ? 0 : 2 : 1);
        editor.putString("proxy_ip", this.b);
        int F2 = ik8.F(i2);
        int i3 = this.c;
        if (F2 == 0) {
            editor.putInt("proxy_port", i3);
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
        if (F2 == 1) {
            editor.putString("proxy_secret", str3);
            editor.putInt("proxy_port", i3);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        if (F2 != 2) {
            return;
        }
        editor.putString("proxy_secret", str3);
        editor.remove("proxy_port");
        editor.remove("proxy_pass");
        editor.remove("proxy_user");
    }
}
